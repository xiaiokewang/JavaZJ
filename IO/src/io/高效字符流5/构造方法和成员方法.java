package io.高效字符流5;

import org.junit.Test;

import java.io.*;

public class 构造方法和成员方法 {
    private final String INPATH = "E:\\JavaZJ\\IO\\src\\io\\高效字符流5\\io知识点";
    private final String OUTPATH = "E:\\JavaZJ\\IO\\src\\io\\高效字符流5\\copy";
    private static FileReader fr = null;
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private int len = -1;
    private String line = null;
    private char[] cbuf = new char[1024];

    @Test
    public void buffWriterLine() throws IOException {
        newWR();
        newBWR();
//  只有FileReader readLine返回值会为空
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
//          每次读一行都要刷新一下，或者最后关闭流也可以
            bw.flush();
        }
        bw.close();
        br.close();
        fw.close();
        fr.close();
    }

    @Test
    public void buffWriter() throws IOException {
        newWR();
        newBWR();
//
        while ((len = br.read(cbuf)) != -1) {
            bw.write(cbuf, 0, len);
        }
        bw.close();
        br.close();
        fw.close();
        fr.close();
    }

    //创建普通字符流
    public void newWR() throws IOException {
        fr = new FileReader(INPATH);
        fw = new FileWriter(OUTPATH);
    }

    //创建高效字符流
    public void newBWR() {
        br = new BufferedReader(fr);
        bw = new BufferedWriter(fw);
    }

}
