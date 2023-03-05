package com.autism.java1;

/**
 * github：<a href="https://github.com/Autism-sow">小肖coding</a><br>
 *
 * @author 小肖coding
 * 创建时间：2023/3/5 10:27
 * @version v1.0.0
 * @description:
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            //1.null
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2.sun.misc.Launcher$AppClassLoader@18b4aac2
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            //3.sun.misc.Launcher$AppClassLoader@18b4aac2
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
            System.out.println(classLoader2);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
