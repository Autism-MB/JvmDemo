package com.autism.java;

/**
 * github：<a href="https://github.com/Autism-sow">小肖coding</a><br>
 *
 * @author 小肖coding
 * 创建时间：2023/3/5 09:13
 * @version v1.0.0
 * @description:
 */
public class ClinitTest1 {
    static class Father {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        /*
            加载Father类,其次加载Son类
            2
         */
        System.out.println(Son.B);
    }
}
