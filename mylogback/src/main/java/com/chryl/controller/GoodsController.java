package com.chryl.controller;

import com.chryl.controller.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2020/8/8.
 *
 * @author Chr.yl
 */
@RestController
public class GoodsController {

    @Autowired
    GoodsDao goodsDao;

    @GetMapping("list")
    public Object show() {
        return goodsDao.findAll();
    }

}
