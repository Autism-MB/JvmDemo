package com.autism.java;

/**
 * github：<a href="https://github.com/Autism-sow">小肖coding</a><br>
 *
 * @author 小肖coding
 * 创建时间：2023/3/5 08:53
 * @version v1.0.0
 * @description:
 */
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;
    }

    /**
     * linking的prepare:number = 0 --> init:20 --> 10
     */
    private static int number = 10;

    public static void main(String[] args) {
        //2
        System.out.println(ClassInitTest.num);
        //10
        System.out.println(ClassInitTest.number);
    }
}
