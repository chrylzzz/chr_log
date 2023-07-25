package com.chryl.controller;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.chryl.boot.IVRInit;
import com.chryl.config.ChrylConfigProperty;
import com.chryl.po.ChrGoods;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

/**
 * 驼峰转下划线
 * Created by Chr.yl on 2021/3/15.
 *
 * @author Chr.yl
 */
@Slf4j
@RestController
@RequestMapping("xcc")
public class XccLogPlusController {
    @Autowired
    private ChrylConfigProperty chrylConfigProperty;

    /**
     * fastjson
     * 驼峰转下划线
     *
     * @param response
     * @throws InterruptedException
     * @throws IOException
     */
    @GetMapping("fastjson")
    public void fastjson(HttpServletResponse response) throws InterruptedException, IOException {
        /*
        有四种序列化方式。
        CamelCase策略，Java对象属性：personId，序列化后属性：persionId – 实际只改了首字母 大写变小写
        PascalCase策略，Java对象属性：personId，序列化后属性：PersonId – 实际只改了首字母 小写变大写
        SnakeCase策略，Java对象属性：personId，序列化后属性：person_id --大写字母前加下划线
        KebabCase策略，Java对象属性：personId，序列化后属性：person-id -大写字母前加减号
         */

        //fastjson
        SerializeConfig config = new SerializeConfig();
//        config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        config.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;
        //fastjson驼峰转下划线
        String chrGood = com.alibaba.fastjson.JSON.toJSONString(
                new ChrGoods(1, "cmmc", "223",
                        LocalDate.now(), "ads", "",
                        "", 23, ""), config);
        //error
//        String chrGood2 = com.alibaba.fastjson.JSON.toJSONString(IVRInit.CHRYL_CONFIG_PROPERTY, config);


        //fastjson2
        String loadYml = JSON.toJSONString(chrylConfigProperty, JSONWriter.Feature.PrettyFormat);
        log.info("loadYml : {}", loadYml);
        response.getWriter().write(loadYml);
        response.flushBuffer();
        response.getWriter().flush();
        response.getWriter().close();
    }

    /**
     * jackson
     * 驼峰转下划线
     *
     * @param response
     * @throws IOException
     */
    @GetMapping("jackson")
    public void jackson(HttpServletResponse response) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        //jackson
        String writeValueAsString = mapper.writeValueAsString(chrylConfigProperty);
        //jackson 驼峰转下划线
        String writeValueAsString1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(chrylConfigProperty);
        //jackson 驼峰转下划线
//        String writeValueAsString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(IVRInit.CHRYL_CONFIG_PROPERTY);

//        response.getWriter().write(chrGood);
//        response.getWriter().write(chrGood2);
//        response.getWriter().write(writeValueAsString);
        response.getWriter().write(writeValueAsString1);
//        response.getWriter().write(writeValueAsString2);
        response.flushBuffer();
        response.getWriter().flush();
        response.getWriter().close();


    }

    @GetMapping("log")
    public void log() {
        log.info("----------------------");
    }
}
