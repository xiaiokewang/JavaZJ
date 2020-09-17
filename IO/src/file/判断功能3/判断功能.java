package file.判断功能3;

import java.io.File;

public class 判断功能 {
    public static void main(String[] args) {
//        1判断此抽象路径名表示的File是否为目录
//        public boolean isDirectory()
        File f1 = new File("E:\\JavaZJ\\IO\\src\\file\\判断功能3\\判断功能.java");
        boolean f1File = f1.isFile();
        if (f1File) System.out.println("E:\\JavaZJ\\IO\\src\\file\\判断功能3\\判断功能.java 是个文件");
        boolean f1Absolute = f1.isAbsolute();
        if (f1Absolute) System.out.println("E:\\JavaZJ\\IO\\src\\file\\判断功能3\\判断功能.java 是绝对路径");
//        2判断此抽象路径名表示的File是否为文件
//        public boolean isFile()
        File f2 = new File("E:\\JavaZJ\\IO\\src\\file\\判断功能3");
        boolean f2Directory = f2.isDirectory();
        if (f2Directory) System.out.println("E:\\JavaZJ\\IO\\src\\file\\判断功能3 是个目录");
//        3判断此抽象路径名表示的File是否存在
        boolean exists = f2.exists();
        if (exists) System.out.println("E:\\JavaZJ\\IO\\src\\file\\判断功能3 存在");
    }
}
