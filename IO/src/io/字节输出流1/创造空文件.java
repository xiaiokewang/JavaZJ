package io.字节输出流1;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 创造空文件 {
    private static final String str = "E:\\JavaZJ\\IO\\src\\io\\字节输出流1\\null.txt";
    private OutputStream os = null;

    @Test
    public void Demo1() {
        try {
//  1创建字节数组1KB
            byte[] buf = new byte[1024];
//  2创建字节输出流，关联目的地文件
            os = new FileOutputStream(str);
                for (int j = 0; j < 1024; j++) {
                    os.write(buf);
                }
            System.out.println("创建完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
