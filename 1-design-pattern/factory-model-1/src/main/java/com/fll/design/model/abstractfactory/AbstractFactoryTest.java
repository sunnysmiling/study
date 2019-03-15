package com.fll.design.model.abstractfactory;

import com.fll.design.model.abstractfactory.factory.BigFactory;
import com.fll.design.model.abstractfactory.factory.SmallFactory;

/**
 *
 * 抽象工厂（具有产品树<同一个产品的不同特性>和产品族<不同产品的同一个类似特性>的场景下）
 *
 * 产品族：位于不同产品等级结构中，功能相关联的产品组成的家族。
 *
 * 狗的大和小是产品树，鸟的大和小也是两个产品树，狗的大和鸟的大是两个产品族
 * 奥迪的超跑和轿车是产品树，奔驰的超跑和轿车也是两个产品树；奥迪的超跑和奔驰的超跑就是两个产品族。
 *
 * 狗：金毛(大)、泰迪(小)
 *
 * 鸟：信天翁(大)、麻雀(小)
 *
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class AbstractFactoryTest {
    public static void main(String[] arg){
        AbstractFactory factory = new BigFactory();
        Dog dog = factory.createDog();
        dog.say();

        Bird bird = factory.createBird();
        bird.say();

        AbstractFactory factory1 = new SmallFactory();
        Dog dog1 = factory1.createDog();
        dog1.say();

        Bird bird1 = factory1.createBird();
        bird1.say();


    }
}
