package ��ϰ01;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Test {
   
	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName("��ϰ01.Student");
			Student p = (Student)c.newInstance();
			while(true) {
			File file =new File("D:\\Student.txt");
			Writer out =new FileWriter(file,true);
			out.append("����Ϊ"+p.getName()+"\r\n");
			out.append("����Ϊ"+p.getAge()+"\r\n");
			out.append("����Ϊ"+p.getScore()+"\r\n");
			out.close();
			}
	} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
