package day19.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class Student{
	String name;
	Student(){
	}
	Student(String name){
		this.name=name;
	}
}
public class ArrayListDemo {
   /**
    * ArrayList
    *   1.底层实现用数组实现
    *   2.有序的
    *   3.可以允许重复元素
    *   4.允许有null
    *   5.不支持同步
    */
	public static void main(String[] args) {
		 //1.初始化一个ArrayList对象
		  ArrayList<String>list=new ArrayList<String>();//创建一个空的ArrayList对象
		 //添加元素
		  list.add("李敏");//在尾部添加一个元素
		  list.add("张三");
		  list.add("六六");
		  list.add("王五");
		  list.add("六六");
		  System.out.println(list.toString());
		  //指定位置添加元素
		  list.add(2,"妲己");
		  list.add(null);
		  System.out.println(list.toString());
		 //修改 
		  list.set(0,"商纣");//修改指定位置的元素
		  
		  
		  System.out.println(list.toString());
		 //删除
		 //list.remove(0);//删除指定下标位置的元素
		  //list.remove("六六");  //删除列表中指定首次出现的指定元素
		     Vector<String>v=new Vector<String>();
		     v.add("张三");
		     v.add("六六");
		     
		 // list.removeAll(v);//删除集合中所有相等的元素 删除交集
		  //list.clear();
		   System.out.println(list.toString());

		 //查询 
		   System.out.println("通过下标获取元素 ==="+list.get(0));
		   System.out.println("通过元素获取首次索引=="+list.indexOf("六六"));
		   System.out.println("通过元素获取最后一次出现的索引="+list.lastIndexOf("六六"));
		   System.out.println("判断是否包含指定的元素"+list.contains("六六"));
		   System.out.println("判断是否为空列表"+list.isEmpty());
		 
		  //获取所有的元素
		    //放式一
		    for (String string : list) {
			   System.out.print(string+"  ");
			}
		    
		    System.out.println();
		    //方式二 
		    for (int i = 0; i < list.size(); i++) {
				 String string =list.get(i);
				 System.out.print(string+" ");
			}
		    
		    //修改指定内容的元素
		      for (int i = 0; i < list.size(); i++) {
				 String string = list.get(i);
				 //把六六 修改为 琪琪
				 if(string==null)continue;
				 if(string.equals("六六")){
					 //修改
					 list.set(i, "琪琪");
				 }	
			}
		    System.out.println(list.toString());
		    //删除指定元素
		   // list.remove("六六");
		   
		   
		   ArrayList<Student>list1=new ArrayList<Student>();
		   Student stu=new Student("mars");
		   list1.add(stu);
		   list1.add(new Student("虎妞"));
		   list1.add(new Student("胜子"));
		   list1.add(new Student("石头"));
		   //遍历所有成员
		   for (Student student : list1) {
			    System.out.println(student.name);
		   }
		   //删除一个指定内容的成员
		   //list1.remove();
		  // for (Student student : list1) {
		   for (int i = 0; i < list1.size(); i++) {
			   Student student =list1.get(i);
			   //判断内容是否相等
			   if(student==null)continue;
			   if(student.name.equals("mars")){
				   //第一种直接移除
				    // list1.remove(student);
				   //第二种获取下标
				    // list1.remove(i);
			 //    }
		   }
		 }  
		   
		   
		   //通过for遍历删除
		    for (Student student : list1) {
				//判断内容是否相等
		    	if(student==null)continue;
		    	//判断name是否是mars
		    	if(student.name.equals("mars")){
		    		//删除当前对象
		    	//list1.remove(student);
		    	}
			}
		    
		    //通过迭代器  
		       //1.获取迭代器对象  迭代器是一个副本
		       Iterator<Student>it=list1.iterator();
		      /* //判断是迭代器否还有更多元素
		       boolean result=it.hasNext();
		       //取出下一个元素  每调用next一次 就取出一个元素
		       Student stu1=it.next();
		       System.out.println("====="+stu1.name);*/
		       //取出所有的元素
		        for (;it.hasNext();) {
				   //取出下个元素
		        	Student stu1=it.next();
		        	System.out.println("==========>"+stu1.name);
		        	//删除元素
		        	//list1.remove(stu1);
		        	//迭代器的remove  删除当前指针指向对象
		        	if(stu1!=null){
		        	    if(stu1.name.equals("mars"))
		        		it.remove();
		        	}
				}
		       
		   //遍历所有成员
		   for (Student student : list1) {
			    System.out.println(student.name);
		   }
		   
		   
		   
		   
		   
		
				
	}
	
	
	
	
	
}
