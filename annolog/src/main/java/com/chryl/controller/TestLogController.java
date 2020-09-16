package com.chryl.controller;

import com.chryl.anno.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2020/9/16.
 *
 * @author Chr.yl
 */
@RestController
public class TestLogController {


    @SysLog("测试日志")
    @GetMapping("/show")
    public void show() {

    }

}
