package io.高效字节流4;

import org.junit.Test;

import java.io.*;

public class BufferedByteTest {
    private final static String INPATH = "E:\\JavaZJ\\IO\\src\\io\\高效字节流\\file.avi";
    private final static String OUTPATH = "E:\\JavaZJ\\IO\\src\\io\\高效字节流\\file_copy.avi";
    private static FileInputStream fis = null;
    private static FileOutputStream fos = null;
    private static BufferedInputStream bis = null;
    private static BufferedOutputStream bos = null;
    private int len = -1;
    private byte[] buf = new byte[1024];

    @Test
    public void Test() throws IOException {
        fis = new FileInputStream(INPATH);
        fos = new FileOutputStream(OUTPATH);

//1.通过普通的字节流一次读写一个字节的形式实现. 非常慢
        genOneByteInPut();
//2. 通过普通的字节流一次读写一个字节数组的形式实现.
//        genOneByteArryInPut();
//3. 通过高效的字节流一次读写一个字节的形式实现.
//        buffOneByteInPut();
//4. 通过高效的字节流一次读写一个字节数组的形式实现.
//        buffOneByteArryInPut();

    }

    //1.通过普通的字节流一次读写一个字节的形式实现.
    public void genOneByteInPut() throws IOException {
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        System.out.println("复制完成");
        close();
    }

    //2. 通过普通的字节流一次读写一个字节数组的形式实现.
    public void genOneByteArryInPut() throws IOException {
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        System.out.println("复制完成");
        close();
    }

    //3. 通过高效的字节流一次读写一个字节的形式实现.
    public void buffOneByteInPut() throws IOException {
//        开启高效流
        newBuff();
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        System.out.println("复制完成");
        close();
    }

    //4. 通过高效的字节流一次读写一个字节数组的形式实现.
    public void buffOneByteArryInPut() throws IOException {
//        开启高效流
        newBuff();
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }
        System.out.println("复制完成");
        close();
    }

    //   关流 先关高效流再关普通流
    public void close() throws IOException {
//        判断是否开启了高效流
        if (bis != null && bos != null) {
            bis.close();
            bos.close();
        }
        if (fis != null && fos != null) {
            fis.close();
            fos.close();
        }
    }

    //   new高效流
    public void newBuff() {
        bis = new BufferedInputStream(fis);
        bos = new BufferedOutputStream(fos);
    }
}
