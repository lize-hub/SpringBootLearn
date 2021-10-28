package cn.zut.controller;

import cn.zut.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class More {
    public static void main(String[] args) {
        int p=0;
        List<User> list=new ArrayList<>();
        for (int i=0;i<=1000000000;i++){
            for (int o=0;o<=100000000;o++){
                User user=new User();
                user.setAge("1");
                user.setId("1");
                user.setName("1");
                list.add(user);
                p++;
            }
        }
        System.out.println(p);
    }
}
