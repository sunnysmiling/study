package com.fll.esign.model.inner;

/**
 *
 * 静态内部类
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class Singleton {

    static {
        System.out.println("dsfa");
    }

    private static class SingletonHolder {

        private static final Singleton INSTANCE = new Singleton();

        static {
            System.out.println(INSTANCE.toString());
        }
    }

    private Singleton (){
        if (SingletonHolder.INSTANCE != null){
            throw new RuntimeException("不允许实例多个对象");
        }
    }

    //static 使单例的空间共享
    //final 保证这个方法不会被重写，重载
    public static final Singleton getInstance() {
        //在返回结果以前，一定会先加载内部类
        return SingletonHolder.INSTANCE;
    }



}
