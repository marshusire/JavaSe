package day13.interface01;

public class TestDemo {
	
	//ʵ�� ���� FirstInterFace ����
	public static void methodA(FirstInterface face){
		//��������
		face.lock();
		face.unlock();
		
		
		
	}
	
	//secondinterface
	public static void methodB(SecondInterface face){
		 //���÷���
		face.fireProof();
	}
	public static void methodC(ThirdMyInterFace face){
		//����������
		face.guardWang();
		
	}
	
	

	public static void main(String[] args) {
	   //1.��ʼ��һ����ȫ��
	/*	  SecurityDoor door=new SecurityDoor();
	   //2.���÷���
		  door.openDoor();
		  door.closeDoor();
		  door.lock();
		  door.unlock();
		  door.fireProof();
		  door.guardWang();
		  
	    //��ʼ����һ����ȫ��
		  SecurityDoor01 door01=new SecurityDoor01();
		  //���÷���
		  door01.openDoor();
		  door01.closeDoor();
		  door01.lock();
		  door01.unlock();
		  door01.fireProof();
		  
		//��ʼ��һ����������
		  Window win=new Window();
		  win.guardWang();
		 */
		/**
		 * ��̬�ķ�ʽ ��ʼ��һ������
		 * */
		  //1.��ʼ��һ������ ������ֵ����������
		   SecurityDoor face1=new SecurityDoor();//�ӿ�Ҳ���Կ�����һ������ĸ���
		   //2.���÷���
		  /* face1.lock();
		   face1.unlock();
		   Door door=(Door)face1;
		   door.openDoor();
		   door.closeDoor();
		   */
		   //����� �������� ֻҪ��ǰ��ʵ���� FirstInterface�ӿ�
		   methodA(face1);
		   methodB(face1); 
		   methodC(face1);
		    
		  //��ʼ��һ��Window����
		   Window w=new Window();
		   methodC(w);
		   methodA(w);
		   
		
		  
	}

}
