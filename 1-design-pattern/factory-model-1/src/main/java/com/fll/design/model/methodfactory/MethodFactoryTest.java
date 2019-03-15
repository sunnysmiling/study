package com.fll.design.model.methodfactory;

import com.fll.design.model.methodfactory.factory.BirdFactory;
import com.fll.design.model.methodfactory.factory.DogFactory;

/**
 *
 * 工厂方法测试
 *
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class MethodFactoryTest {
    public static void main(String[] arg){
        ZooAbstractFactory dogFactory = new DogFactory();
        Zoo dog = dogFactory.createZoo();
        dog.say();

        ZooAbstractFactory birdFactory = new BirdFactory();
        Zoo bird = birdFactory.createZoo();
        bird.say();

    }
}
