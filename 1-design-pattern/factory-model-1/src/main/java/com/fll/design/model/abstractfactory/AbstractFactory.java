package com.fll.design.model.abstractfactory;

/**
 *
 * 抽象工厂（接口抽象方法都可以）
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public interface AbstractFactory {
    Dog createDog();
    Bird createBird();
}
