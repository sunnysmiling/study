package com.fll.design.model.simplefactory;

/**
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class ZooFactory {

    public Zoo proZoo(String name){
        if ("dog".equals(name)){
            return new Dog();
        } else if ("bird".equals(name)) {
            return new Bird();
        }
        return null;
    }

}
