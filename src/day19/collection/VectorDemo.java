package day19.collection;


import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
     /***
      *  Vector ����
      *     1.�ײ�ʵ����������
      *     2.ʵ����list�ӿ�
      *     3.list�ӿ�  �����,�����ظ���������nullֵ
      *     4.��ͬ����
      * @param args
      */

	public static void main(String[] args) {
		//1.��ʼ��һ��Vector����
		  Vector<String> v=new Vector<String>();
		//2.�������
		  v.add("����");
		  v.add("����");
		  v.add("����");
		  v.add("����");
		  v.add("��è");
		  //��ָ��λ���������
		  v.add(1,"����");
		  v.add("����");
		  v.add(null);
		  v.add(null);
		  
		  //��������Ԫ����ӵ���ǰ������
          Vector<String> v1=new Vector<String>();
          v1.add("mars");
          v1.addAll(v);
          v1.addElement("β�����");
          
       //�޸�Ԫ��
          v1.set(0, "�޸����");//�޸�ָ��λ�õ�Ԫ��
          v1.setElementAt("����", 2);//
          
       //��ѯ
          System.out.println("�±��ѯָ����Ԫ��    	 "+v1.get(0));
          System.out.println("�������ݷ��ص�һ�γ��ֵ�����	  "+v1.indexOf("����"));
          System.out.println("�������ݷ������һ�ε�����  	 "+v1.lastIndexOf("����",4));//index �����ѯ
          System.out.println("�ж��Ƿ����ָ����Ԫ��   	"+v1.contains("����"));
          System.out.println("���ص�һ��λ�õ�Ԫ�� 	  "+v1.firstElement());
          System.out.println("���һ��Ԫ��    		"+v1.lastElement());
		  
	   //ɾ��Ԫ��
         v1.remove(0);//��������ɾ��Ԫ��
         v1.remove("����");//����Ԫ��ɾ�� ��ֻɾ��ָ����һ�γ��ֵ�Ԫ��
		  
         //��������
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
	//ö�ٵ�����
          //������ת����Enumeration����
            Enumeration<String> enums=v1.elements();
            while(enums.hasMoreElements()){//�ж�ö�ٶ������Ƿ��и����Ԫ��
            	String str=enums.nextElement();//������һ��Ԫ��
            	System.out.println(str);
            }
        //��ȡ������
            java.util.List<String> list=v1.subList(1, 6);
            System.out.println(list.toString());         

	}

}
