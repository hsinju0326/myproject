package com.kate;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person();
        p.hello();
        int age = 19;
        Integer age2 =19; //表示19是放在物件當中，即可以使用其功能 (八種資料型態皆有對應類別，第一個字母為大寫)
        char c = '我';
        byte b =120;
        float weight = 66.5f; //大小寫f都可以
        double height =1.7;
        boolean adult = true; //儲存真假使用布林值
        boolean enroll = false;
    }
}
