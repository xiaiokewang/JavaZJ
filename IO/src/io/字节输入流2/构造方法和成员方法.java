package io.字节输入流2;

import org.junit.Test;

import java.io.*;

public class 构造方法和成员方法 {
    private final static String PATH = "E:\\JavaZJ\\IO\\src\\io\\字节输入流2\\tw.png";
    private final static String OUTPATH = "E:\\JavaZJ\\IO\\src\\io\\字节输入流2\\tw_copy.png";
    private static InputStream fis = null;
    private static OutputStream fos = null;
    private static File file = new File(PATH);
    private int len = -1;
    private byte[] cbuf = new byte[1024];

    /**
     * 构造方法 •public FileInputStream(String name)
     * 创建普通的字节输入流对象，关联数据源文件
     *
     * 成员变量 •public int read()
     * 从指定的数据源文件中，一次读取一个字节，并返回该字节对应的整数，读不到则返回 -1
     * Reads the next byte of data from the input stream. The value byte is returned as an int in the range 0 to 255.
     * 1个字节8位 2的8次方可以表示的数的范围 0~255
     *
     * @throws IOException
     */
    @Test
    public void oneByte() throws IOException {
        fis = new FileInputStream(PATH);
        fos = new FileOutputStream(OUTPATH);
        while ((len = fis.read()) != -1) {
//            这里打印的时候，就是字节对应的数字
//            System.out.println(byt);
//            开始通过普通的字节输出流往关联的文件输出
            fos.write(len);
        }
        fis.close();
        fos.close();
    }

    /**
     * 构造方法 •public FileInputStream(File file)
     * 创建普通的字节输入流对象，关联数据源文件(File 对象形式)
     *
     * 成员变量 •public int read(byte[] bys)
     * 从指定的数据源文件中，一次读取一个字节数组，要读的文件是在new 的字节输入流对象时 传入的文件
     * 并将读取到的字节数组存入我们自己创建的字节数组中
     * 返回的是每次读取到的字节数，如果读不到则返回-1
     *
     * @throws IOException
     */
    @Test
    public void arrayByte() throws IOException {
//      创建普通字节输入流和字节输出流
//      传入的参数 file、OUTPATH 都是在之前定义的 静态File对象 和 final的输出关联文件
        fis = new FileInputStream(file);
        fos = new FileOutputStream(OUTPATH);
//      开始读取和写入
//       fis.read()
//          the total number of bytes read into the buffer,
//          or -1 if there is no more data because the end of the stream has been reached.
//        现在是普通字节输入流开始依次读取一个字节数组，返回值是读到的个数，如果没有了会返回 -1
        while ((len = fis.read(cbuf)) != -1) {
//            根据每次读取到的个数写入，避免出现重复
            fos.write(cbuf, 0, len);
        }
    }
}