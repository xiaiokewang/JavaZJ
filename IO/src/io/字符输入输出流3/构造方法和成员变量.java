package io.字符输入输出流3;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 构造方法和成员变量 {
    private final String INPATH = "E:\\JavaZJ\\IO\\src\\io\\字符输入输出流3\\io知识点";
    private final String OUTPATH = "E:\\JavaZJ\\IO\\src\\io\\字符输入输出流3\\fileWrite.txt";
    private static FileWriter fw = null;
    private static FileReader fr = null;
    private static char[] cbuf = new char[1024];
    private static int len = -1;

    //    读
    @Test
    public void fileWrite() throws IOException {
//      追加写入
        fw = new FileWriter(OUTPATH, true);
//      一次写一个字符
        fw.write('a');
        fw.write('a');
        fw.write('a');
//      在用字符流的时候要注意，写入操作可以写int类型，但是底层会强转为char，所以会出现和想要的结果不一样的结果
//      通常如果写入的是int类型的数据，直接在后面连接双引号即可
        fw.write(9 + "");
        char[] ch = {'s', 's', 'f', '2'};
//      写入一个字符数组
        fw.write(ch);
//      写入字符数组的一部分
        fw.write(ch, 2, 2);
//      直接写入字符串
        fw.write("asfasf");
        fw.close();
    }

    //    读和写
    @Test
    public void fileReader() throws IOException {
        fr = new FileReader(INPATH);
        fw = new FileWriter(OUTPATH);
        while ((len = fr.read(cbuf)) != -1) {
            fw.write(cbuf, 0, len);
        }
        fw.close();
        fr.close();
    }
}
