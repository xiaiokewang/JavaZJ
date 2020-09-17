package file.创建功能2;

import java.io.File;
import java.io.IOException;

public class 创建文件 {
    public static void main(String[] args) throws IOException {
//     需求1 我要在E:\javaZJ目录下创建一个文件java.txt
//     public boolean createNewFile()
//        E:\JavaZJ\IO\src\file\创建功能
        File f1 = new File("E:\\JavaZJ\\IO\\src\\file\\创建功能\\java.txt");
        boolean newFile = f1.createNewFile();
        if (newFile) {
            System.out.println("E:\\JavaZJ\\IO\\src\\file\\创建功能\\java.txt 创建成功");
        }
//      看一下相对路径创建的文件在哪？ 与项目文件同级
//      如果文件已经存在 则  public boolean createNewFile() 返回false 没有动作执行
        File f2 = new File("java2.txt");
        boolean newFile2 = f2.createNewFile();
        if (newFile2) {
            System.out.println("java2.txt的绝对路径-->" + f2.getAbsolutePath());
        }
    }
}
