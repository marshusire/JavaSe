package day20.map;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		
	   //1.��ָ�����б������Ԫ��
		 ArrayList<String>list=new ArrayList<String>();
		 Collections.addAll(list,"name","1","dd","app");
		 System.out.println(list.toString());
		//ʹ�ö��ֲ��ҷ�����ָ��Ԫ������
		System.out.println( Collections.binarySearch(list,"age"));
		//���б��е�Ԫ�أ���ֵ��һ���б���
		ArrayList<String>dest=new ArrayList<String>();
		Collections.addAll(dest,"name1","age2","dd3","app4","5");
		Collections.copy(dest, list);
        System.out.println(dest.toString());
        //��ת˳��
        Collections.reverse(dest);
        System.out.println(dest.toString());
        //��ȡ���ֵ��Сֵ
        System.out.println(Collections.max(dest));
        System.out.println(Collections.min(dest));
        //���ָ��Ԫ��
        Collections.fill(dest, "666");
        System.out.println(dest.toString());
        
        
	}

}
