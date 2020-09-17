package io.字节输出流1;

import org.junit.Test;

import java.io.*;

public class 构造方法 {

    /**
     * public FileOutputStream(String name)
     * 创建普通的字节输出流对象,关联目的地文件（字符串形式）
     * 如果文件中有数据，则会被覆盖
     *
     * @throws FileNotFoundException
     */
    @Test
    public void Demo1() throws FileNotFoundException {
        OutputStream os1 = new FileOutputStream("E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\demo.txt");
    }

    /**
     * public FileOutputStream(File file)
     * 创建普通的字节输出流对象,关联目的地文件（File对象方式）
     * 如果文件中有数据，则会被覆盖
     *
     * @throws FileNotFoundException
     */
    @Test
    public void Demo2() throws FileNotFoundException {
        File file = new File("E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\demo.txt");
        OutputStream os2 = new FileOutputStream(file);
    }

    /**
     * public FileOutputStream(String name, boolean append)
     * 创建普通的字节输出流对象，关联目的地文件（字符串形式）
     *
     * @throws FileNotFoundException
     */
    @Test
    public void Demo3() throws FileNotFoundException {
        OutputStream os3 = new FileOutputStream("E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\demo.txt", true);
    }

    @Test
    public void Demo4() throws FileNotFoundException {
        File file = new File("E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\demo.txt");
        OutputStream os4 = new FileOutputStream(file, true);
    }
}
