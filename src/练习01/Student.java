package 练习01;

import java.util.Scanner;

public class Student {
	private String name ;
	private int age;
	private double score;
public Student() {
	
}
public String getName() {
	System.out.println("名字") ;
	Scanner str = new Scanner(System.in);
	String name = str.nextLine();
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	System.out.println("输入年龄") ;
	Scanner str = new Scanner(System.in);
	int age = str.nextInt();
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getScore() {
	System.out.println("输入分数") ;
	Scanner str = new Scanner(System.in);
	int score = str.nextInt();
	return score;
}
public void setScore(double score) {
	this.score = score;
}

}
