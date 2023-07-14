package com.chryl.controller;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.chryl.config.ChrylConfigProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
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

    @GetMapping("chryl")
    public void chryl(HttpServletResponse response) throws InterruptedException, IOException {
        String loadYml = JSON.toJSONString(chrylConfigProperty, JSONWriter.Feature.PrettyFormat);
        log.info("loadYml : {}", loadYml);
        response.getWriter().write(loadYml);
        response.flushBuffer();
        response.getWriter().flush();
        response.getWriter().close();
    }

    @GetMapping("show")
    public Object show() {

        SerializeConfig config = new SerializeConfig();
        /*
        有四种序列化方式。
        CamelCase策略，Java对象属性：personId，序列化后属性：persionId – 实际只改了首字母 大写变小写
        PascalCase策略，Java对象属性：personId，序列化后属性：PersonId – 实际只改了首字母 小写变大写
        SnakeCase策略，Java对象属性：personId，序列化后属性：person_id --大写字母前加下划线
        KebabCase策略，Java对象属性：personId，序列化后属性：person-id -大写字母前加减号
         */
//        config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        config.propertyNamingStrategy = PropertyNamingStrategy.KebabCase;
//        String loadYml = com.alibaba.fastjson.JSON.toJSONString(new IVREvent("asksaklf"), config);
        String loadYml = com.alibaba.fastjson.JSON.toJSONString(chrylConfigProperty, config);
//        String loadYml = JSON.toJSONString(IVRInit.CHRYL_CONFIG_PROPERTY, JSONWriter.Feature.PrettyFormat);
        return loadYml;

    }

    @GetMapping("log")
    public void log() {
        log.info("----------------------");
    }
}
