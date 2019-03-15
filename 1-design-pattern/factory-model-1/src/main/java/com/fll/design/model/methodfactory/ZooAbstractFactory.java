package com.fll.design.model.methodfactory;

/**
 *
 * 抽象工厂（相当于一个领导，领导下面是具体的工厂<狗、鸟的工厂>）
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public abstract class ZooAbstractFactory {
    public  abstract Zoo createZoo();
}
