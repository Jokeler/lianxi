package 练习01;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Test {
   
	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName("练习01.Student");
			Student p = (Student)c.newInstance();
			while(true) {
			File file =new File("D:\\Student.txt");
			Writer out =new FileWriter(file,true);
			out.append("姓名为"+p.getName()+"\r\n");
			out.append("年龄为"+p.getAge()+"\r\n");
			out.append("分数为"+p.getScore()+"\r\n");
			out.close();
			}
	} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
