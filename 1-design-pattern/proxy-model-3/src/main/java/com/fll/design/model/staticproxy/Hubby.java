package com.fll.design.model.staticproxy;

/**
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/17
 */
public class Hubby implements Money {

    public void spendMoney(int money) {
        //还需校验钱的合法性
        System.out.println(String.format("花了老婆%s元钱",money));
    }

}
