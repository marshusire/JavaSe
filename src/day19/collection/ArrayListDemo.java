package day19.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class Student{
	String name;
	Student(){
	}
	Student(String name){
		this.name=name;
	}
}
public class ArrayListDemo {
   /**
    * ArrayList
    *   1.�ײ�ʵ��������ʵ��
    *   2.�����
    *   3.���������ظ�Ԫ��
    *   4.������null
    *   5.��֧��ͬ��
    */
	public static void main(String[] args) {
		 //1.��ʼ��һ��ArrayList����
		  ArrayList<String>list=new ArrayList<String>();//����һ���յ�ArrayList����
		 //���Ԫ��
		  list.add("����");//��β�����һ��Ԫ��
		  list.add("����");
		  list.add("����");
		  list.add("����");
		  list.add("����");
		  System.out.println(list.toString());
		  //ָ��λ�����Ԫ��
		  list.add(2,"槼�");
		  list.add(null);
		  System.out.println(list.toString());
		 //�޸� 
		  list.set(0,"����");//�޸�ָ��λ�õ�Ԫ��
		  
		  
		  System.out.println(list.toString());
		 //ɾ��
		 //list.remove(0);//ɾ��ָ���±�λ�õ�Ԫ��
		  //list.remove("����");  //ɾ���б���ָ���״γ��ֵ�ָ��Ԫ��
		     Vector<String>v=new Vector<String>();
		     v.add("����");
		     v.add("����");
		     
		 // list.removeAll(v);//ɾ��������������ȵ�Ԫ�� ɾ������
		  //list.clear();
		   System.out.println(list.toString());

		 //��ѯ 
		   System.out.println("ͨ���±��ȡԪ�� ==="+list.get(0));
		   System.out.println("ͨ��Ԫ�ػ�ȡ�״�����=="+list.indexOf("����"));
		   System.out.println("ͨ��Ԫ�ػ�ȡ���һ�γ��ֵ�����="+list.lastIndexOf("����"));
		   System.out.println("�ж��Ƿ����ָ����Ԫ��"+list.contains("����"));
		   System.out.println("�ж��Ƿ�Ϊ���б�"+list.isEmpty());
		 
		  //��ȡ���е�Ԫ��
		    //��ʽһ
		    for (String string : list) {
			   System.out.print(string+"  ");
			}
		    
		    System.out.println();
		    //��ʽ�� 
		    for (int i = 0; i < list.size(); i++) {
				 String string =list.get(i);
				 System.out.print(string+" ");
			}
		    
		    //�޸�ָ�����ݵ�Ԫ��
		      for (int i = 0; i < list.size(); i++) {
				 String string = list.get(i);
				 //������ �޸�Ϊ ����
				 if(string==null)continue;
				 if(string.equals("����")){
					 //�޸�
					 list.set(i, "����");
				 }	
			}
		    System.out.println(list.toString());
		    //ɾ��ָ��Ԫ��
		   // list.remove("����");
		   
		   
		   ArrayList<Student>list1=new ArrayList<Student>();
		   Student stu=new Student("mars");
		   list1.add(stu);
		   list1.add(new Student("���"));
		   list1.add(new Student("ʤ��"));
		   list1.add(new Student("ʯͷ"));
		   //�������г�Ա
		   for (Student student : list1) {
			    System.out.println(student.name);
		   }
		   //ɾ��һ��ָ�����ݵĳ�Ա
		   //list1.remove();
		  // for (Student student : list1) {
		   for (int i = 0; i < list1.size(); i++) {
			   Student student =list1.get(i);
			   //�ж������Ƿ����
			   if(student==null)continue;
			   if(student.name.equals("mars")){
				   //��һ��ֱ���Ƴ�
				    // list1.remove(student);
				   //�ڶ��ֻ�ȡ�±�
				    // list1.remove(i);
			 //    }
		   }
		 }  
		   
		   
		   //ͨ��for����ɾ��
		    for (Student student : list1) {
				//�ж������Ƿ����
		    	if(student==null)continue;
		    	//�ж�name�Ƿ���mars
		    	if(student.name.equals("mars")){
		    		//ɾ����ǰ����
		    	//list1.remove(student);
		    	}
			}
		    
		    //ͨ��������  
		       //1.��ȡ����������  ��������һ������
		       Iterator<Student>it=list1.iterator();
		      /* //�ж��ǵ��������и���Ԫ��
		       boolean result=it.hasNext();
		       //ȡ����һ��Ԫ��  ÿ����nextһ�� ��ȡ��һ��Ԫ��
		       Student stu1=it.next();
		       System.out.println("====="+stu1.name);*/
		       //ȡ�����е�Ԫ��
		        for (;it.hasNext();) {
				   //ȡ���¸�Ԫ��
		        	Student stu1=it.next();
		        	System.out.println("==========>"+stu1.name);
		        	//ɾ��Ԫ��
		        	//list1.remove(stu1);
		        	//��������remove  ɾ����ǰָ��ָ�����
		        	if(stu1!=null){
		        	    if(stu1.name.equals("mars"))
		        		it.remove();
		        	}
				}
		       
		   //�������г�Ա
		   for (Student student : list1) {
			    System.out.println(student.name);
		   }
		   
		   
		   
		   
		   
		
				
	}
	
	
	
	
	
}
