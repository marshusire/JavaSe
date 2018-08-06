package day15.randoms;

import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {
		//UUID 是128位的随机数 保证在同一时空中 产生的随机数都是唯一的  随机数是用16进制表示
		  //1.获取一个UUID对象
		  UUID uid=UUID.randomUUID();
		  //2.将对象转换String
		  String str=uid.toString();
		  System.out.println(str);
		  //3.去掉-
		  String newStr=str.replace("-","");
          System.out.println(newStr);
	}

}
