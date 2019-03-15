package com.fll.design.model.methodfactory.product;

import com.fll.design.model.methodfactory.Zoo;

/**
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/15
 */
public class Bird implements Zoo {
    public void say() {
        System.out.println("this is bird from method factory");
    }
}
