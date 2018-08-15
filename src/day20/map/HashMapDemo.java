package day20.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
     /**
      * HashMap
      * 1.����ĵ�
      * 2.�����Լ�ֵ�Եķ�ʽ���д洢
      * 3.����������һ��keyΪnull �ĳ�Ա
      * 
      */
	
	//��ڷ���
	 public static void main(String []args){
		 //1.��ʼ��һ��HashMap����
		    HashMap<String,String>map=new HashMap<String, String>();
		 //2.map �������
		    map.put("name", "mars");
		    map.put("like","����");
		    map.put("age","17");
		    map.put(null, "����");
		 
		  System.out.println(map.toString());
		 
		 //3.�޸�Ԫ��
		    map.put(null, "����");
		 //4ɾ��Ԫ�� ͨ��key ɾ��value
		    map.remove(null);
		 //5.�鿴��Ա
		    //1.ͨ��key ��ȡvalueֵ
		   String value=map.get("name");
		   System.out.println(value);
		   //2.�ж��Ƿ����ָ����key ,valueֵ
		     System.out.println( map.containsKey("name"));
		    //�ж��Ƿ����ĳ��valueֵ
		     System.out.println(map.containsValue("����"));
		    //�жϼ�ְ�Եĸ���
		     System.out.println(map.size());
		  //��ȡ���е�keyֵ
		     Set<String >keys=map.keySet();
		  //��ȡ���е�valueֵ
		     Collection<String>values=map.values();
		    
		  //��ȡ���е�ӳ���ϵ ���б���map
		       Set<Entry<String, String>>en  =map.entrySet();
		       for (Entry<String, String> entry : en) {
			     System.out.println(entry.getKey());//��ȡ��ǰ��key
			     System.out.println(entry.getValue());//��ȡ��ǰ��value
			}	     
		     
	 }
	
	
}
