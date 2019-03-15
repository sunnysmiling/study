package com.fll.design.model.abstractfactory.product;

import com.fll.design.model.abstractfactory.Bird;

/**
 * 小麻雀产品
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class SmallMaQueBird extends Bird {
    @Override
    public void say() {
        System.out.println("Small ma que");
    }
}
