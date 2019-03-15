package com.fll.esign.model.lazy;

/**
 * 懒汉式
 *
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class Singleton {

    private static Singleton instance;

    private Singleton (){}
    //线程不安全
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
    //99% 情况下不需要同步
    public static synchronized  Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
