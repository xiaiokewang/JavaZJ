package t4;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

    public static void main(String[] args) throws IOException {
//加载配置文件
//创建Properties对象
        Properties pro = new Properties();
        InputStream inputStream = new FileInputStream("E:\\JavaZJ\\java阶段考试\\src\\t4\\Student.txt");
//        利用Properties对象load方法来加载配置文件信息，即类的信息
        pro.load(new InputStreamReader(inputStream));
//遍历配置文件，判断刘方是否存在
        Set<String> strings = pro.stringPropertyNames();
        for (String key : strings) {
            if (key.equals("刘方")) {
//                如果存在则修改年龄
                pro.setProperty(key, "18");
            }
        }
        System.out.println(pro);
//        将修改后的最新数据写入到newstu.txt文件
//        ------------方法1
        pro.list(new PrintStream("E:\\JavaZJ\\java阶段考试\\src\\t4\\newstu1.txt"));
//        ------------方法2
        pro.store(new FileWriter("E:\\JavaZJ\\java阶段考试\\src\\t4\\newstu2.txt"), "It is ok");
//        ------------方法3
        pro.store(new FileOutputStream("E:\\JavaZJ\\java阶段考试\\src\\t4\\newstu3.txt"), "It is ok");

        System.out.println("修改并打印完成");
    }
}