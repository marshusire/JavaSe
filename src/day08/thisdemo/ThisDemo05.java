package day08.thisdemo;

public class ThisDemo05 {
 /**
  * ���췽��֮�以��ʱ�� ����ʹ��
  * this([����])
  * this �����ڹ��췽����һ��
  * 
  * ���췽�� ֻ���ڳ�ʼ�������ʱ�� �Żᱻ����һ�Ρ�
  * ���췽�����أ����췽��Ҳ��ÿ��ֻ����ʾֱ�ӵ���һ��
  * 
  * */
	//���췽������
	 public ThisDemo05(){
		 this("dd",33);
		 System.out.println("Ĭ�Ϲ��췽��");
	 }
	 
	 public ThisDemo05(String name){
	    // this();//����Ĭ��
        System.out.println("1�������Ĺ��췽��");
	 }	
	 
	 public ThisDemo05(String name,int age){
		//���췽������ʱ this() ���ұ����ڹ��췽����һ�� 
		this(name);//һ������
		System.out.println("�����������췽��");
	 }
	 
	 public static void main(String[] args) {
	    //1.��ʼ��һ������
		  //ThisDemo05 demo=new ThisDemo05();//�����Ĭ�Ϲ��췽��
	      //  ThisDemo05 demo=new ThisDemo05("mars"); ����һ�������Ĺ��췽��
	       ThisDemo05 demo=new ThisDemo05("mars",28);
	 }
	 
	 
}
