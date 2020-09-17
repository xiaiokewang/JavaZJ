package file.题目;

import org.junit.Test;

import java.io.File;

public class 题目1 {
    //    遍历当前目录下的文件和目录，打印输出
    @Test
    public void Test1() {
        File f6 = new File("E:\\JavaZJ\\IO");
        File f7 = new File("E:\\JavaZJ\\IO\\src\\file\\获取内容4\\获取内容.java");
        bLFile(f6);

    }

    /**
     * 遍历当前目录下的文件及目录 并打印
     *
     * @param file
     */
    public boolean bLFile(File file) {
//        如果是文件对象，则直接返回名称
        if (file.isFile() == true) {
            System.out.println("  " + file.getName() + " ---文件");
            return true;
        }
//      如果是目录则开始依次遍历
        if (file.isDirectory() == true) {
            System.out.println(file.getName() + " -- 目录");
//            获取当前目录下的File对象数组，递归调用本方法
            File[] listFiles = file.listFiles();
            for (File listFile : listFiles) {
                bLFile(listFile);
            }
            return true;
        }
        return false;
    }
}
