package day20.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    /**
     * TreeMap���ص���
     * 1.����keyֵ�Զ���������
     * 2.key������Ϊnull
     * @param args
     */
	
	
	public static void main(String[] args) {
		//1.��ʼ��һ��TreeMap����
		 TreeMap<Integer,String>map=new TreeMap<Integer, String>();
		 
		//2.��map���и�ֵ����
		 map.put(3, "mars");
		 map.put(6,"����");
		 map.put(5,"����");
		 map.put(1,"����");
		 
		 System.out.println(map.toString());
		//3.ȡ��Ԫ��
	    Entry<Integer,String>en=map.firstEntry();
		System.out.println("key="+en.getKey()+"value "+en.getValue()); 
		//4.��ȡ���е�Ԫ��
		  Set<Entry<Integer,String>> sets=map.entrySet();
	//��������set��Ա
		for (Entry<Integer, String> entry : sets) {
		     System.out.println(entry.getKey());//��ȡ��ǰkey
		     System.out.println(entry.getValue());//��ȡ��ǰ��Ӧvalue
		 }
		 
	   en=map.floorEntry(4);
	   System.out.println(en.getKey());

	}

}
