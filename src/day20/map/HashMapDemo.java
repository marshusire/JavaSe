package day20.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
     /**
      * HashMap
      * 1.无序的的
      * 2.数据以键值对的方式进行存储
      * 3.可以允许有一个key为null 的成员
      * 
      */
	
	//入口方法
	 public static void main(String []args){
		 //1.初始化一个HashMap对象
		    HashMap<String,String>map=new HashMap<String, String>();
		 //2.map 添加数据
		    map.put("name", "mars");
		    map.put("like","跳舞");
		    map.put("age","17");
		    map.put(null, "张三");
		 
		  System.out.println(map.toString());
		 
		 //3.修改元素
		    map.put(null, "李四");
		 //4删除元素 通过key 删除value
		    map.remove(null);
		 //5.查看成员
		    //1.通过key 获取value值
		   String value=map.get("name");
		   System.out.println(value);
		   //2.判断是否包含指定的key ,value值
		     System.out.println( map.containsKey("name"));
		    //判断是否包含某个value值
		     System.out.println(map.containsValue("李四"));
		    //判断兼职对的个数
		     System.out.println(map.size());
		  //获取所有的key值
		     Set<String >keys=map.keySet();
		  //获取所有的value值
		     Collection<String>values=map.values();
		    
		  //获取所有的映射关系 进行遍历map
		       Set<Entry<String, String>>en  =map.entrySet();
		       for (Entry<String, String> entry : en) {
			     System.out.println(entry.getKey());//获取当前的key
			     System.out.println(entry.getValue());//获取当前的value
			}	     
		     
	 }
	
	
}
