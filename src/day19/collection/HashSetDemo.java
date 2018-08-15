package day19.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
     /***
      * HashSet �ص�
      *  1.Ԫ���������
      *  2.���������ظ�ֵ
      *  3.ֻ����һ��null
      *  4.��֧��ͬ��
      *  
      * @param args
      */
	
	
	
	public static void main(String[] args) {
	      //1.����һ��HashSet����
		    HashSet<String> set=new HashSet<String>();
		  //���Ԫ��  
		    set.add("����");
		    String str="��";
		    set.add(str+"��");
		    set.add("�����");
		    set.add("�ݼ�");
		    set.add(null);
		    System.out.println(set.toString());
		 // ɾ��Ԫ��
		    set.remove(null);
		    System.out.println(set.toString());
		   // set.clear();//����б������е�Ԫ��
		 //�鿴
		    System.out.println(set.contains("�����"));
		    System.out.println(set.size());//�鿴Ԫ�ظ���
		    System.out.println(set.isEmpty());//�ж��Ƿ���б�
		    //�鿴�б������е�Ԫ��
		    for (String string : set) {
				System.out.println(string);
			}
		    //ͨ��������Ҳ���Բ鿴
		       //��ȡ���������� 
		        Iterator<String> it=set.iterator();
                while(it.hasNext()){
                	//ȡ��Ԫ��
                	System.out.println(it.next());
                   	//���Ҫ����ɾ�� ����ʹ�õ�����remove()����
                	it.remove();
                }
                System.out.println(set.isEmpty());//  
                
	}

}
