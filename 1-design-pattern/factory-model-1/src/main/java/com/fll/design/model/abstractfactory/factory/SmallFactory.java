package com.fll.design.model.abstractfactory.factory;

import com.fll.design.model.abstractfactory.*;
import com.fll.design.model.abstractfactory.product.SmallMaQueBird;
import com.fll.design.model.abstractfactory.product.SmallTaiDiDog;

/**
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class SmallFactory implements AbstractFactory {
    public Dog createDog() {
        return new SmallTaiDiDog();
    }

    public Bird createBird() {
        return new SmallMaQueBird();
    }
}
