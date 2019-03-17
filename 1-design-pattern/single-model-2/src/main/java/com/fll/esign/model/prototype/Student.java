package com.fll.esign.model.prototype;

import java.io.*;
import java.util.List;

/**
 * @author 1014699046@qq.com
 * @Vserion 1.0
 * @Date 2019/3/17
 */
public class Student implements Serializable{
    private String name;
    private String sex;
    private List<String> likes;

    /**
     * 深克隆（如果时单列，会破坏单列结构，补救措施，看单例教程）
     * @return
     */
    public Object deepClone(){
        try {
            //内存输出流
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(outputStream);
            oo.writeObject(this);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream io = new ObjectInputStream(inputStream);

            return io.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 浅客隆
     * @return
     */
    public Object shallowclone(){
        Student s = new Student();
        s.setName(this.getName());
        s.setSex(this.getSex());
        s.setLikes(this.getLikes());
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }
}
