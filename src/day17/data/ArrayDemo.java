package day17.data;

import java.util.Arrays;

public class ArrayDemo {

	//保存一个学员的信息新增学员
	 public static void addStudent(Student stu,Student[]arr){
		 //保存数据
		 //1.遍历数组
		 for (int i = 0; i < arr.length; i++) {
			  Student student = arr[i];
			  //判断stu是否为空
			  if(student==null){
				  arr[i]=stu;
				  break;
			  } 
		}
	 }
	  //修改学员信息 
	 public static void eidtStudent(int index,Student[]arr,String name){
		 //通过下标取出需要修改的学员对象
		   Student stu=arr[index];
		 //判断stu是否null
		   if(stu!=null){
			   //修改名称
			   stu.setName(name);
		   }   
	 }
	 
	 //查询学员一个学员 通过index
	 public static Student searchByIndex(int index,Student[]arr){
		return arr[index];
	 }
	 //通过学员的姓名进行查找
	 public static Student searchByName(String name,Student[]arr){
		 //遍历数组 中所有对象
		 for (Student student : arr) {
		    if(student!=null){
		    	if(student.getName().equals(name)){
		    		return student;
		    	}
		    }	
		 }
		 //没有找到
		 return null; 
	 }
	 
	 //通过下标删除指定学员信息
	 public static Student[] deleteByIndex(int index,Student[]arr){
		 
		 for (int i = 0; i < arr.length; i++) {
			//判断i>=index
		     if(i>=index&&i<arr.length-1){
		      arr[i]=arr[i+1];	 
		     }
		 }
		 return Arrays.copyOf(arr,arr.length-1);
	 }
	 
	 public static void list(Student[]arr){
		 for (int i = 0; i < arr.length; i++) {
			Student student = arr[i];
			if(student!=null)
			System.out.println(student.getName()+" "+student.getAge());
		}
	 }
	 
	 public static void main(String[] args) {
	   //1.声明一个数组
		 Student []arr=new Student[10];
	   //2.添加数据
		addStudent(new Student("张三", 12),arr);
		addStudent(new Student("李四", 11),arr);
		addStudent(new Student("lucy", 13),arr);
		addStudent(new Student("meimei",14),arr); 
       //修改一个学员
	     eidtStudent(0, arr, "mars");
 		//
		
	    //通过下标查询学员
	    Student stu=searchByIndex(1, arr);
	    System.out.println(stu.getName());
	    //通过姓名查找学员
	     stu=searchByName("lucy", arr);
	     System.out.println(stu.getName()+" "+stu.getAge());
	     
	     System.out.println("-----------前");
	   //3.查看所有成员
			list(arr);
	     System.out.println("-----------后");
	   //删除学员 //新的数组
	    arr=deleteByIndex(0, arr);
	     
	    
	     
      //3.查看所有成员
		list(arr);
				
		 
		 
	 
	 
	 }
	
	
	
}
