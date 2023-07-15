package com.chryl.boot;

import com.chryl.config.ChrylConfigProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Chr.yl on 2023/7/15.
 *
 * @author Chr.yl
 */
@Component
@Slf4j
public class IVRInit {
    public static ChrylConfigProperty CHRYL_CONFIG_PROPERTY;

    @Autowired
    private ChrylConfigProperty chrylConfigProperty;


    /**
     * 延迟初始化
     * 将初始化变量转为静态
     */
    @PostConstruct
    public void initialize() {
        CHRYL_CONFIG_PROPERTY = this.chrylConfigProperty;
        log.info("初始化 CHRYL_CONFIG_PROPERTY 完成");
    }
}
