package day14.innerclass;

//����һ���ӿ�
interface MyInterface{
   public void  sendMsg(String msg);
}


public class OutDemo04 {
   
	public static void methodC(MyInterface face){
		face.sendMsg("��õĵ��ε�");
	}
	
	
	/**
    * �����ڲ���: ��ǰ�������û������
    * �����λ�ã� ������
    */
      public static void main(String[] args) {
		     //������һ���������� ������ֲ�֪�����϶������ʵ�ֽӿ�
    	   MyInterface face=new MyInterface(){
				//����
    	    	 
    	    	//����  
    	    	 void MethodB(){
    	    		 System.out.println("���");
    	    	 }
				@Override
				public void sendMsg(String msg) {
					// TODO Auto-generated method stub
					System.out.println(msg);
				}
			};
    	  
		   //��̬	
           methodC(face);
	  }
	
	
	
}
