package file.获取内容4;

import org.junit.Test;

import java.io.File;


public class 获取内容 {

    /**
     * 1返回此抽象路径名的绝对路径名字符串
     * public String getAbsolutePath()
     */
    @Test
    public void Test1() {
        File f1 = new File("src\\file\\构造方法1");
        String f1AbsolutePath = f1.getAbsolutePath();
        System.out.println("src\\file\\构造方法1 的绝对路径字符串-->" + f1AbsolutePath);
    }

    /**
     * 2将此抽象路径名转换为路径名字符串
     * public String getPath()
     */
    @Test
    public void Test2() {
        File f2 = new File("src\\file\\构造方法1");
        String f2Path = f2.getPath();
        System.out.println("src\\file\\构造方法1 的路径字符串 -->" + f2Path);
    }

    /**
     * 3返回由此抽象路径名表示的文件或目录的名称
     * public String getName()
     */
    @Test
    public void Test3() {
        File f3 = new File("src\\file\\构造方法1");
        String f3Name = f3.getName();
        System.out.println("src\\file\\构造方法1 目录名称-->" + f3Name);
    }

    /**
     * 4 返回此抽象路径名表示的目录中的文件和目录的 名称 字符串数组
     * public String[] list()
     */
    @Test
    public void Test4() {
        File f4 = new File("E:\\JavaZJ\\IO");
        String[] nameListArray = f4.list();
        for (String s : nameListArray) {
            System.out.println(s);
        }
    }

    /**
     * 5 返回此抽象路径名表示的目录中的 文件和目录的 File对象 数组
     * public File[] listFiles()
     */
    @Test
    public void Test5() {
        File f5 = new File("E:\\JavaZJ\\IO");
        File[] listFiles = f5.listFiles();
        for (File listFile : listFiles) {
            if (listFile.isFile()) System.out.println(listFile + " 是文件");
            if (listFile.isDirectory()) System.out.println(listFile + " 是文件目录");
        }
    }
}
