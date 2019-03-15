package com.fll.design.model.methodfactory.factory;

import com.fll.design.model.methodfactory.product.Bird;
import com.fll.design.model.methodfactory.Zoo;
import com.fll.design.model.methodfactory.ZooAbstractFactory;

/**
 *
 * 具体的工厂
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class BirdFactory extends ZooAbstractFactory {

    @Override
    public Zoo createZoo() {
        //实现其它逻辑
        return new Bird();
    }

}
