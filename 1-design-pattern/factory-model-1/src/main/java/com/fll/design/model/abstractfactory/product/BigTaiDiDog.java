package com.fll.design.model.abstractfactory.product;

import com.fll.design.model.abstractfactory.Dog;

/**
 * 大泰迪产品
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class BigTaiDiDog extends Dog {
    @Override
    public void say() {
        System.out.println("Big tai di");
    }
}
