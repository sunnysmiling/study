package com.fll.esign.model.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/17
 */
public class PrototyoeTest {

    public static void main(String[] arg){
        Student student = new Student();
        student.setName("李四");
        student.setSex("男");
        List<String> likes = new ArrayList<>();
        likes.add("吃");
        likes.add("打游戏");
        student.setLikes(likes);

        Student o = (Student)student.deepClone();

        System.out.println("deep-clone对象地址是否相等" + (o == student));
        System.out.println("deep-clone对象的值的地址是否相等" + (o.getLikes() == student.getLikes()) + o.getLikes() + "---" + student.getLikes());

        Student shallowclone = (Student)student.shallowclone();

        System.out.println("shallow-clone对象地址是否相等" + (student == shallowclone));
        System.out.println("shallow-clone的值地址是否相等" + (student.getLikes() == shallowclone.getLikes()));

    }

}
