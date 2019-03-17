package com.fll.design.model.staticproxy;

/**
 * 静态代理
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/17
 */
public class StaticProxyTest {
    public static void main(String[] arg){
        WifeProxy wife = new WifeProxy(new Hubby());
        wife.spendMoney("买电脑");

    }
}
