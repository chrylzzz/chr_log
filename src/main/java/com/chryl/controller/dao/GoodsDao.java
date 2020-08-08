package com.chryl.controller.dao;


import com.chryl.controller.po.ChrGoods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Chr.yl on 2020/6/20.
 *
 * @author Chr.yl
 */
public interface GoodsDao extends JpaRepository<ChrGoods, Integer> {
}
