package com.fll.design.model.staticproxy;

/**
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/17
 */
public class WifeProxy {

    private Money obj;

    public WifeProxy(Money hubby){
        this.obj = hubby;
    }

    public void spendMoney(String reason){
        System.out.println(String.format("%s啊！行吧，同意！",reason));
        obj.spendMoney(20);
        System.out.println(String.format("高兴不？买了电脑多敲点代码挣钱，给我花。"));
    }


}
