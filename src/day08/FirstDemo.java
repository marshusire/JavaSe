package day08;

public class FirstDemo {
  //private  �ֶ�  ���� 
  //��ͬ���п��Է���  test dd
   private String name;//����
   
   private void study(){
	  System.out.println(name+"Hello");
   }
   public static void main(String[] args) {
		FirstDemo demo=new FirstDemo();
		demo.name="333";
    	demo.study();
   }
}

class FirstDemo01{
	
	public void method(){
		//��ʼ��һ����
		 FirstDemo first=new FirstDemo();
		//��������
		// first.study();
	}
	
}
