package file.创建功能2;

import java.io.File;

public class 文件目录方法创建文件能吗 {
    public static void main(String[] args) {
        File f1 = new File("E:\\JavaZJ\\IO\\src\\file\\创建功能\\file.txt");
        boolean mkdirFile = f1.mkdir();
        if (mkdirFile) System.out.println("文件创建成功");
        if (!mkdirFile) System.out.println("文件创建成功");
    }
}
