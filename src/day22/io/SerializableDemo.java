package day22.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//如果该类要支持序列化技术 必须实现接口 Serializable
class Student implements Serializable{
   String name;
   int  age;
}



public class SerializableDemo {
   
	//序列化：对象  通过编码技术 转换成 二进制数据  存储起来
	 public static void writeObj() throws FileNotFoundException, IOException{
		 //1.创建一个ObjectOutputStream对象
		  ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("data"));
		 //2.写数据
		   //写入基本数据类型
		    out.writeChar('A');;
		    out.writeBoolean(true);
		   //自定义对象类型
		    Student stu=new Student();
		    stu.name="mars1";
		    stu.age=12;
		   //写入对象 ，要对对象进行对象序列化技术
		    out.writeObject(stu);
		   //刷入
		    out.flush();
		 //3.关闭流
		    out.close();
	 } 
	
	
	
	//反序列化：将二进制数据 通过解码技术 ，构建还原成原来的对象	
	 public static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException{
		//1.创建一个objectInputstream对象
		   ObjectInputStream input=new ObjectInputStream(new FileInputStream("data"));
		 
		//2.读取数据 按照存的顺序进行读取
		    //读取char
		     System.out.println(input.readChar());
		    //读取boolean类型
		     System.out.println(input.readBoolean());
		    //读取student  对象反序列化技术
		     Student stu=(Student)input.readObject();
		     System.out.println(stu.name +"  "+stu.age);
		//3.关闭流  
		     input.close();
	 }
	
	
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
          writeObj();//对象序列化
          readObj(); //对象反序列化
	}

}
