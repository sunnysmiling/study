package com.fll.esign.model.hungry;

import java.io.Serializable;

/**
 *
 * 饿汉式
 *
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class Singleton  implements Serializable {

    private static final Singleton instance = new Singleton();

//    static {
//        instance = new Singleton()
//    }

    private Singleton (){}

    public static Singleton getInstance() {
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
