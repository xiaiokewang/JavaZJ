package t1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//读取stu.txt文件内容，以=切割封装成Student对象，添加到集合中，按照学生成绩降序排序以后，以一定格式追加写回stu.txt文件中
public class Test {
    private static String path = "E:\\JavaZJ\\java阶段考试\\src\\t1\\stu.txt";
    private static BufferedReader br = null;
    private static BufferedWriter bw = null;
    private static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new FileReader(path));
        bw = new BufferedWriter(new FileWriter(path, true));
        String line = null;
//读取stu.txt文件内容，以=切割封装成Student对象，添加到集合中
        while ((line = br.readLine()) != null) {
            String[] split = line.split("=");
            String s1 = split[0];
            int s2 = Integer.parseInt(split[1]);
            Student st = new Student(s1, s2);
            list.add(st);
        }
        br.close();
//        按照学生成绩降序排序
        Collections.sort(list, (a, b) -> b.getScore() - a.getScore());

//      以一定格式追加写回stu.txt
//      先换一行
        bw.newLine();
        bw.write("-------排序后的结果------------");
        bw.newLine();
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i).getName());
            bw.write("=");
            bw.write(list.get(i).getScore() + "");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
