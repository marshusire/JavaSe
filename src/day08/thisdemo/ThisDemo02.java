package day08.thisdemo;

public class ThisDemo02 {
   //ͬһ�����У�ʵ������ ֱ�ӻ�����õ�ʱ�򣬿���ʡ��this ,һ�㲻Ҫʡ��this
   public void methodA(){
	   System.out.println("����� Ħ���ֵ�");
	   this.methodB();//���÷���
   }
   public void methodB(){
	    System.out.println("������ ��������");
	   this.methodC();//���÷���
   }
   public void methodC(){
	    System.out.println("������ ̽ˮ���");
	   // methodA();
   }	
	
	public static void main(String[] args) {
		//1.��ʼ��һ������
		 ThisDemo02 demo=new ThisDemo02();
		//���õ��÷���
		 demo.methodA();
		
		
	}
	
	
}
