package file.创建功能2;

import java.io.File;

public class 创建目录2 {
    public static void main(String[] args) {
//2  public boolean mkdirs() 创建的目录，父目录可以不存在，即可创建多级目录
        File f2 = new File("E:\\JavaZJ\\IO\\src\\file\\创建功能\\Sql\\books");
        boolean mkdirIsOr2 = f2.mkdirs();
        if (mkdirIsOr2) System.out.println("E:\\JavaZJ\\IO\\src\\file\\创建功能\\Sql\\books 多级目录创建成功");
        if (!mkdirIsOr2) System.out.println("E:\\JavaZJ\\IO\\src\\file\\创建功能\\Sql\\books 多级目录创建不成功");
    }
}
