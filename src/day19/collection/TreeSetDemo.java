package day19.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    /**
     * TreeSet
     *   1.不允许有null
     *   2.不允许有重复的值
     *   3.添加的顺序是无序的
     *   4.内容可以排序
     */
	  public static void main(String[] args) {
		 //1.初始化一个TreeSet 对象
		  TreeSet<Integer> set=new TreeSet<Integer>();
		 //添加元素 
		  set.add(1);
		  set.add(3);
		  set.add(5);
		  set.add(4);
		  set.add(2);
		 // set.add(null);
		 //查看
		  System.out.println(set.contains(2));//是否包含指定的对象
		  System.out.println(set.isEmpty());  //是否是空的列表
		  System.out.println(set.size());
		  System.out.println(set.first());//返回最小的元素
		  System.out.println(set.last()); //返回最大的元素
		  System.out.println(set.lower(3));//返回小于等于3的最大元素
		  System.out.println(set.higher(5));//返回大于等于3的最小元素
		 //删除
		  set.remove(3);
		  System.out.println(set.pollFirst());//获取删除最小元素
		  System.out.println(set.pollLast()); //获取删除最大元素
		  System.out.println(set.toString());
		  
		  //获取所有的元素
		    //1.foreach
		    for (Integer integer : set) {
				System.out.println(integer);
			}
		    //2.迭代器
		       for (Iterator iterator = set.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				  System.out.println(integer);
				  //删除元素  必须通过迭代器的remove方法
				  
			   }
		  
	  }
	
	
	
}
