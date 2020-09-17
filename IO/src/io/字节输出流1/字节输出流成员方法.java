package io.字节输出流1;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 字节输出流成员方法 {
    private static final String str = "E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\demo.txt";
    // 字节数组
    private byte[] length = null;
    // 标志位
    private int len;

    @Test
    public void Demo() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(str);
        try {
            method1(fos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 一次写入一个字节，到指定的目的地文件
     * public abstract void write(int b)
     *
     * @param os 字节输出流
     * @throws IOException
     */
    public void method1(OutputStream os) throws IOException {
        os.write('a');
        os.write('b');
        os.write('c');
        os.write('\n');
        os.write(97);
        os.write(98);
        os.write(99);
        os.close();
    }

    /**
     * 一次写入一个字节数组，到指定的目的地文件
     *
     * @param str 目标文件
     * @param os  字节输出流
     */
    public void method2(String str, OutputStream os) {

    }

    /**
     * 一次写入一个字节数组的一部分，到指定的目的地文件
     *
     * @param str 目标文件
     * @param os  字节输出流
     */
    public void method3(String str, OutputStream os) {

    }
}
