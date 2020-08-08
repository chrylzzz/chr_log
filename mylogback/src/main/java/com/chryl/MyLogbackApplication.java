package com.chryl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Chr.yl on 2020/8/8.
 *
 * @author Chr.yl
 */
@Slf4j
@SpringBootApplication
public class MyLogbackApplication {
    public static void main(String[] args) {
        log.info("zZZZZZZZZZZZ");
        log.warn("mmmmmm");
        log.warn("mmmmmm");
        log.warn("mmmmmm");
        log.warn("mmmmmm");
        log.warn("mmmmmm");
        log.warn("mmmmmm");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.debug("zZZsdasdasZZZZZZZZZ");
        log.debug("zZZZZZZZZfdfsdZZZ");
        log.debug("zZZZZZZZZZgggggggZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.info("zZZZZZZZZZZZ");
        log.error("asdasdasdffsff");
        log.error("asdasdasdffsff");
        log.error("asdasdasdffsff");
        log.error("asdasdasdffsff");
        log.error("asdasdasdffsff");
        SpringApplication.run(MyLogbackApplication.class, args);
    }
}
