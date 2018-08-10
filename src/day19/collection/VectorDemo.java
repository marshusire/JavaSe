package day19.collection;


import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
     /***
      *  Vector 向量
      *     1.底层实现是用数组
      *     2.实现了list接口
      *     3.list接口  有序的,可以重复，可以有null值
      *     4.是同步的
      * @param args
      */

	public static void main(String[] args) {
		//1.初始化一个Vector对象
		  Vector<String> v=new Vector<String>();
		//2.添加数据
		  v.add("佩琪");
		  v.add("乔治");
		  v.add("苏西");
		  v.add("丹妮");
		  v.add("蓝猫");
		  //在指定位置添加数据
		  v.add(1,"淘气");
		  v.add("淘气");
		  v.add(null);
		  v.add(null);
		  
		  //将集合中元素添加到当前集合中
          Vector<String> v1=new Vector<String>();
          v1.add("mars");
          v1.addAll(v);
          v1.addElement("尾部添加");
          
       //修改元素
          v1.set(0, "修改完毕");//修改指定位置的元素
          v1.setElementAt("李四", 2);//
          
       //查询
          System.out.println("下标查询指定的元素    	 "+v1.get(0));
          System.out.println("根据内容返回第一次出现的索引	  "+v1.indexOf("李四"));
          System.out.println("根据内容返回最后一次的索引  	 "+v1.lastIndexOf("佩琪",4));//index 逆向查询
          System.out.println("判断是否包含指定的元素   	"+v1.contains("佩琪"));
          System.out.println("返回第一个位置的元素 	  "+v1.firstElement());
          System.out.println("最后一个元素    		"+v1.lastElement());
		  
	   //删除元素
         v1.remove(0);//根据索引删除元素
         v1.remove("李四");//根据元素删除 ，只删除指定第一次出现的元素
		  
         //遍历向量
         System.out.print("[");
         for (String string : v1) {
			System.out.print(string+"  ");
		 }
         System.out.println("]");
         //for(int i)
         for (int i = 0; i < v1.size(); i++) {
			String string = v1.get(i);
			System.out.println(string);	
		}
         System.out.println("-----------------------");
	//枚举迭代器
          //将向量转换成Enumeration对象
            Enumeration<String> enums=v1.elements();
            while(enums.hasMoreElements()){//判断枚举对象中是否有更多的元素
            	String str=enums.nextElement();//返回下一个元素
            	System.out.println(str);
            }
        //截取字序列
            java.util.List<String> list=v1.subList(1, 6);
            System.out.println(list.toString());         

	}

}
