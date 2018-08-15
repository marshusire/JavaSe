package day19.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    /**
     * TreeSet
     *   1.��������null
     *   2.���������ظ���ֵ
     *   3.��ӵ�˳���������
     *   4.���ݿ�������
     */
	  public static void main(String[] args) {
		 //1.��ʼ��һ��TreeSet ����
		  TreeSet<Integer> set=new TreeSet<Integer>();
		 //���Ԫ�� 
		  set.add(1);
		  set.add(3);
		  set.add(5);
		  set.add(4);
		  set.add(2);
		 // set.add(null);
		 //�鿴
		  System.out.println(set.contains(2));//�Ƿ����ָ���Ķ���
		  System.out.println(set.isEmpty());  //�Ƿ��ǿյ��б�
		  System.out.println(set.size());
		  System.out.println(set.first());//������С��Ԫ��
		  System.out.println(set.last()); //��������Ԫ��
		  System.out.println(set.lower(3));//����С�ڵ���3�����Ԫ��
		  System.out.println(set.higher(5));//���ش��ڵ���3����СԪ��
		 //ɾ��
		  set.remove(3);
		  System.out.println(set.pollFirst());//��ȡɾ����СԪ��
		  System.out.println(set.pollLast()); //��ȡɾ�����Ԫ��
		  System.out.println(set.toString());
		  
		  //��ȡ���е�Ԫ��
		    //1.foreach
		    for (Integer integer : set) {
				System.out.println(integer);
			}
		    //2.������
		       for (Iterator iterator = set.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				  System.out.println(integer);
				  //ɾ��Ԫ��  ����ͨ����������remove����
				  
			   }
		  
	  }
	
	
	
}
