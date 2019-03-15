package com.fll.design.model.simplefactory;

/**
 * 简单工厂测试类
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class SimpleFactoryTest {
    public static void main(String[] arg){
        ZooFactory zooFactory = new ZooFactory();
        Zoo dog = zooFactory.proZoo("dog");
        Zoo bird = zooFactory.proZoo("bird");
        dog.say();
        bird.say();
    }
}
