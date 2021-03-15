package com.chryl.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Chr.yl on 2021/3/15.
 *
 * @author Chr.yl
 */
@RestController
public class WebLogController {

    @GetMapping("/weblog")
    public String show(@PathVariable(required = false) String opa) {
        return "weblog success:->" + opa;

    }
}
