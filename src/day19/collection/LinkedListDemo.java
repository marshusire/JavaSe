package day19.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
     /**
      *  Linked特点 实现了 Deque list 接口的特性
      *  1.元素有序
      *  2.元素可以有null
      *  3.元素可以重复
      *  4.底层是链表 双向链表
      *  5.具有队列的特点和栈的特点
      *  6.不支持同步
      * @param args
      */
	
	
	public static void main(String[] args) {
		//1.初始化一个LinkedList 对象 空列表
		   LinkedList<String>list=new LinkedList<String>();
        //2.增加数据
		   list.add("佩琪");
		   list.add("乔治");
		   list.addFirst("猪妈妈");//在列表头部添加
		   list.addLast("猪爸爸");//在尾部添加
		   list.push("猪爷爷");//压栈从一个口放的 头是栈顶
		  //list.pop();//出栈
		   System.out.println(list.toString());
		//3.修改数据  
		   list.set(0,"猪奶奶");
		   System.out.println(list.toString());
		//4.查询 
		   String element=list.poll();//取出head元素 ，同时从列表删除
		   System.out.println(element);
		   System.out.println(list.pollFirst());//取出head元素 同时删除
		   System.out.println(list.getLast());//取出最后一个元素
		   System.out.println(list.getFirst());//取出第一个元素
		   System.out.println(list.element()); //取出第一个元素
		   
		   System.out.println(list.offer("小狗丹妮"));//在尾部添加一个元素
		   System.out.println(list.offerFirst("小羊苏西"));//在头部添加一个元素
		   System.out.println(list.offerLast("瑞贝卡"));//在添加一条数据
		   
		   System.out.println(list.get(0));//返回指定索引的元素
		   System.out.println(list.indexOf("苏西"));//首次出现元素的索引
		   
		   for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			   String string = ( String) iterator.next();
			   System.out.println(string +"  ");
		     }
		   for (String string : list) {
			
		   }
		   
		   System.out.println(list.toString());
		     
		//5删除数据  
		  list.remove();//删除头
		  //list.remove(1);//删除指定索引的元素
		  //list.remove("小羊苏西");//删除首次出现的指定的元素
		  System.out.println(list.toString());
		  //遍历删除 必须使用迭代器进行操作 
		  
		  
	}

}
