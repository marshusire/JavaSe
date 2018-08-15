package day20.map;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		
	   //1.向指定的列表中添加元素
		 ArrayList<String>list=new ArrayList<String>();
		 Collections.addAll(list,"name","1","dd","app");
		 System.out.println(list.toString());
		//使用二分查找法查找指定元素索引
		System.out.println( Collections.binarySearch(list,"age"));
		//将列表中的元素，赋值另一个列表中
		ArrayList<String>dest=new ArrayList<String>();
		Collections.addAll(dest,"name1","age2","dd3","app4","5");
		Collections.copy(dest, list);
        System.out.println(dest.toString());
        //反转顺序
        Collections.reverse(dest);
        System.out.println(dest.toString());
        //获取最大值最小值
        System.out.println(Collections.max(dest));
        System.out.println(Collections.min(dest));
        //填充指定元素
        Collections.fill(dest, "666");
        System.out.println(dest.toString());
        
        
	}

}
