package day19.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
     /**
      *  Linked�ص� ʵ���� Deque list �ӿڵ�����
      *  1.Ԫ������
      *  2.Ԫ�ؿ�����null
      *  3.Ԫ�ؿ����ظ�
      *  4.�ײ������� ˫������
      *  5.���ж��е��ص��ջ���ص�
      *  6.��֧��ͬ��
      * @param args
      */
	
	
	public static void main(String[] args) {
		//1.��ʼ��һ��LinkedList ���� ���б�
		   LinkedList<String>list=new LinkedList<String>();
        //2.��������
		   list.add("����");
		   list.add("����");
		   list.addFirst("������");//���б�ͷ�����
		   list.addLast("��ְ�");//��β�����
		   list.push("��үү");//ѹջ��һ���ڷŵ� ͷ��ջ��
		  //list.pop();//��ջ
		   System.out.println(list.toString());
		//3.�޸�����  
		   list.set(0,"������");
		   System.out.println(list.toString());
		//4.��ѯ 
		   String element=list.poll();//ȡ��headԪ�� ��ͬʱ���б�ɾ��
		   System.out.println(element);
		   System.out.println(list.pollFirst());//ȡ��headԪ�� ͬʱɾ��
		   System.out.println(list.getLast());//ȡ�����һ��Ԫ��
		   System.out.println(list.getFirst());//ȡ����һ��Ԫ��
		   System.out.println(list.element()); //ȡ����һ��Ԫ��
		   
		   System.out.println(list.offer("С������"));//��β�����һ��Ԫ��
		   System.out.println(list.offerFirst("С������"));//��ͷ�����һ��Ԫ��
		   System.out.println(list.offerLast("�𱴿�"));//�����һ������
		   
		   System.out.println(list.get(0));//����ָ��������Ԫ��
		   System.out.println(list.indexOf("����"));//�״γ���Ԫ�ص�����
		   
		   for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			   String string = ( String) iterator.next();
			   System.out.println(string +"  ");
		     }
		   for (String string : list) {
			
		   }
		   
		   System.out.println(list.toString());
		     
		//5ɾ������  
		  list.remove();//ɾ��ͷ
		  //list.remove(1);//ɾ��ָ��������Ԫ��
		  //list.remove("С������");//ɾ���״γ��ֵ�ָ����Ԫ��
		  System.out.println(list.toString());
		  //����ɾ�� ����ʹ�õ��������в��� 
		  
		  
	}

}
