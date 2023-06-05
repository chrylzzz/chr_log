package com.chryl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chr.yl on 2021/3/15.
 *
 * @author Chr.yl
 */
@Slf4j
@RestController
@RequestMapping("xcc")
public class XccLogPlusController {

    @GetMapping("log")
    public void show() {
        log.info("----------------------");
    }
}
