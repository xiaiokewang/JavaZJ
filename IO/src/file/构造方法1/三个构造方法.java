package file.构造方法1;

import java.io.File;

public class 三个构造方法 {
    public static void main(String[] args) {
//      1通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        File f1 = new File("E:\\javaZJ\\demo1.txt");
        System.out.println(f1);
//      2从父路径名字符串和子路径名字符串创建新的File实例
        File f2 = new File("E:\\javaZJ", "demo2.txt");
        System.out.println(f2);
//      3从父抽象路径名和子路径名字符串创建新的File实例
        File f3 = new File("E:\\javaZJ");
        File f4 = new File(f3, "demo3.txt");
        System.out.println(f4);

    }
}
