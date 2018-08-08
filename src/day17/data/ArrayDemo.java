package day17.data;

import java.util.Arrays;

public class ArrayDemo {

	//����һ��ѧԱ����Ϣ����ѧԱ
	 public static void addStudent(Student stu,Student[]arr){
		 //��������
		 //1.��������
		 for (int i = 0; i < arr.length; i++) {
			  Student student = arr[i];
			  //�ж�stu�Ƿ�Ϊ��
			  if(student==null){
				  arr[i]=stu;
				  break;
			  } 
		}
	 }
	  //�޸�ѧԱ��Ϣ 
	 public static void eidtStudent(int index,Student[]arr,String name){
		 //ͨ���±�ȡ����Ҫ�޸ĵ�ѧԱ����
		   Student stu=arr[index];
		 //�ж�stu�Ƿ�null
		   if(stu!=null){
			   //�޸�����
			   stu.setName(name);
		   }   
	 }
	 
	 //��ѯѧԱһ��ѧԱ ͨ��index
	 public static Student searchByIndex(int index,Student[]arr){
		return arr[index];
	 }
	 //ͨ��ѧԱ���������в���
	 public static Student searchByName(String name,Student[]arr){
		 //�������� �����ж���
		 for (Student student : arr) {
		    if(student!=null){
		    	if(student.getName().equals(name)){
		    		return student;
		    	}
		    }	
		 }
		 //û���ҵ�
		 return null; 
	 }
	 
	 //ͨ���±�ɾ��ָ��ѧԱ��Ϣ
	 public static Student[] deleteByIndex(int index,Student[]arr){
		 
		 for (int i = 0; i < arr.length; i++) {
			//�ж�i>=index
		     if(i>=index&&i<arr.length-1){
		      arr[i]=arr[i+1];	 
		     }
		 }
		 return Arrays.copyOf(arr,arr.length-1);
	 }
	 
	 public static void list(Student[]arr){
		 for (int i = 0; i < arr.length; i++) {
			Student student = arr[i];
			if(student!=null)
			System.out.println(student.getName()+" "+student.getAge());
		}
	 }
	 
	 public static void main(String[] args) {
	   //1.����һ������
		 Student []arr=new Student[10];
	   //2.�������
		addStudent(new Student("����", 12),arr);
		addStudent(new Student("����", 11),arr);
		addStudent(new Student("lucy", 13),arr);
		addStudent(new Student("meimei",14),arr); 
       //�޸�һ��ѧԱ
	     eidtStudent(0, arr, "mars");
 		//
		
	    //ͨ���±��ѯѧԱ
	    Student stu=searchByIndex(1, arr);
	    System.out.println(stu.getName());
	    //ͨ����������ѧԱ
	     stu=searchByName("lucy", arr);
	     System.out.println(stu.getName()+" "+stu.getAge());
	     
	     System.out.println("-----------ǰ");
	   //3.�鿴���г�Ա
			list(arr);
	     System.out.println("-----------��");
	   //ɾ��ѧԱ //�µ�����
	    arr=deleteByIndex(0, arr);
	     
	    
	     
      //3.�鿴���г�Ա
		list(arr);
				
		 
		 
	 
	 
	 }
	
	
	
}
