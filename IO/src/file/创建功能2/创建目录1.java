package file.创建功能2;

import java.io.File;

public class 创建目录1 {
    public static void main(String[] args) {
//1  public boolean mkdir()
        File f1 = new File("E:\\JavaZJ\\IO\\src\\file\\创建功能\\JavaSE");
        boolean mkdirIsOr = f1.mkdir();
        if (mkdirIsOr) System.out.println("E:\\JavaZJ\\IO\\src\\file\\创建功能\\JavaSE 目录创建成功");
//2  public boolean mkdir() 创建的目录，父目录必须存在
        File f2 = new File("E:\\JavaZJ\\IO\\src\\file\\创建功能\\Sql\\books");
        boolean mkdirIsOr2 = f2.mkdir();
        if (mkdirIsOr2) System.out.println("E:\\JavaZJ\\IO\\src\\file\\创建功能\\Sql\\books 多级目录创建成功");
        if (!mkdirIsOr2) System.out.println("E:\\JavaZJ\\IO\\src\\file\\创建功能\\Sql\\books 多级目录创建不成功");

    }
}
