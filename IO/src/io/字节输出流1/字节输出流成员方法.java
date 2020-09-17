package io.字节输出流1;

import org.junit.Test;

import java.io.*;

public class 字节输出流成员方法 {
    private static final String instr = "E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\demo.txt";
    private static final String outstr = "E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\demo_out.txt";
    // 字节数组
    private byte[] buf = new byte[1024]; //1kb
    // 标志位
    private int len = -1;
    // 输入输出流
    private static InputStream is;
    private static OutputStream os;

    /**
     * 1 一次写一字节
     *
     * @throws FileNotFoundException
     */
    @Test
    public void Demo1() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(outstr);
        try {
            method1(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2 一次写一个字节数组
     */
    @Test
    public void Demo2() {
//        创建一个字节输入流实例
        try {
            os = new FileOutputStream(outstr);
            method2(os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 3 一次写一个字节数组的一部分
     * 借助字节输入流
     */
    @Test
    public void Demo3() {
//        创建一个字节输入流实例
        try {
            is = new FileInputStream(instr);
            os = new FileOutputStream(outstr);
            method3(is, os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * method1
     * 一次写入一个字节，到指定的目的地文件
     * public abstract void write(int b)
     *
     * @param os 字节输出流
     * @throws IOException
     */
    public void method1(OutputStream os) throws IOException {
//        The byte to be written is the eight low-order bits of the argument b.
//        The 24 high-order bits of b are ignored.
//       FF FF FF FF FF FF FF 【FF(只有这一个字节会被保留)】
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
     * method2
     * 一次写入一个字节数组，到指定的目的地文件
     *
     * @param os 字节输出流
     */
    public void method2(OutputStream os) throws IOException {
//        String类中的getBytes()方法，可以把字符串转为其对应的字节数组形式
        byte[] buf = "sdgfgwe".getBytes();
        os.write(buf);
        os.close();
    }

    /**
     * method3
     * 一次写入一个字节数组的一部分，到指定的目的地文件
     *
     * @param is 字节输入流
     * @param os 字节输出流
     */
    public void method3(InputStream is, OutputStream os) throws IOException {
//      the total number of bytes read into the buffer or -1 if there is no more data
//      byte[] buf = {'a', 'b', 'c'};
        while ((len = is.read(buf)) != -1) {
            os.write(buf, 0, len);
        }
        os.close();
    }
}