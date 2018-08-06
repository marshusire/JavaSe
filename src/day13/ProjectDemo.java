package day13;

import java.util.Scanner;


public class ProjectDemo {

	public static void main(String[] args) {
      //1.初始化一个数组 存放课程名称
		String[]arr={"语文","数学","音乐"};
	  //2.初始化一个键盘录入对象，
		Scanner input=new Scanner(System.in);
	  //3.通过键盘录入的信息获取数组元素的值
		System.out.println("请输入 1 2 3 选择课程");
		int num=input.nextInt();
		try{
		String tmp=arr[num-1]; //数组下标越界 选择错误 抛出异常
		System.out.println("选择的学科是"+tmp);
		}catch (Exception e) {
		System.out.println("请输入正确的下标");
		}finally {
		System.out.println("欢迎提出建议");	
		}
		
	}

}
