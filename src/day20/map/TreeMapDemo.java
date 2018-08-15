package day20.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    /**
     * TreeMap的特点是
     * 1.根据key值自动进行排序
     * 2.key不允许为null
     * @param args
     */
	
	
	public static void main(String[] args) {
		//1.初始化一个TreeMap对象
		 TreeMap<Integer,String>map=new TreeMap<Integer, String>();
		 
		//2.给map进行赋值操作
		 map.put(3, "mars");
		 map.put(6,"张三");
		 map.put(5,"李四");
		 map.put(1,"王五");
		 
		 System.out.println(map.toString());
		//3.取出元素
	    Entry<Integer,String>en=map.firstEntry();
		System.out.println("key="+en.getKey()+"value "+en.getValue()); 
		//4.获取所有的元素
		  Set<Entry<Integer,String>> sets=map.entrySet();
	//遍历所有set成员
		for (Entry<Integer, String> entry : sets) {
		     System.out.println(entry.getKey());//获取当前key
		     System.out.println(entry.getValue());//获取当前对应value
		 }
		 
	   en=map.floorEntry(4);
	   System.out.println(en.getKey());

	}

}
