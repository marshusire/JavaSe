package day19.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
     /***
      * HashSet 特点
      *  1.元素是无序的
      *  2.不允许有重复值
      *  3.只允许一个null
      *  4.不支持同步
      *  
      * @param args
      */
	
	
	
	public static void main(String[] args) {
	      //1.创建一个HashSet对象
		    HashSet<String> set=new HashSet<String>();
		  //添加元素  
		    set.add("佩琪");
		    String str="佩";
		    set.add(str+"琪");
		    set.add("公孙策");
		    set.add("虞姬");
		    set.add(null);
		    System.out.println(set.toString());
		 // 删除元素
		    set.remove(null);
		    System.out.println(set.toString());
		   // set.clear();//清空列表中所有的元素
		 //查看
		    System.out.println(set.contains("公孙策"));
		    System.out.println(set.size());//查看元素个数
		    System.out.println(set.isEmpty());//判断是否空列表
		    //查看列表中所有的元素
		    for (String string : set) {
				System.out.println(string);
			}
		    //通过迭代器也可以查看
		       //获取迭代器对象 
		        Iterator<String> it=set.iterator();
                while(it.hasNext()){
                	//取出元素
                	System.out.println(it.next());
                   	//如果要遍历删除 必须使用迭代器remove()方法
                	it.remove();
                }
                System.out.println(set.isEmpty());//  
                
	}

}
