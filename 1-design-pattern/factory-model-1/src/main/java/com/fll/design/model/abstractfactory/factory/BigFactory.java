package com.fll.design.model.abstractfactory.factory;

import com.fll.design.model.abstractfactory.*;
import com.fll.design.model.abstractfactory.product.BigMaQueBird;
import com.fll.design.model.abstractfactory.product.BigTaiDiDog;

/**
 *
 * 实现抽象工厂
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class BigFactory implements AbstractFactory {
    public Dog createDog() {
        return new BigTaiDiDog();
    }

    public Bird createBird() {
        return new BigMaQueBird();
    }
}
