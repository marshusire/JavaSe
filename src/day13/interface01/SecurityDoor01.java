package day13.interface01;

/**
 * ʵ����  
 * 
 * 
 */
public class SecurityDoor01 extends Door implements FirstInterface,SecondInterface{
     @Override
     public void lock() {
	// TODO Auto-generated method stub
	  System.out.println("ͨ��ָ�ƽ�������");
     }   
     @Override
	 public void unlock() {
		// TODO Auto-generated method stub
	  System.out.println("ͨ��ָ�ƽ��н���");
	 }
     @Override
    public void fireProof() {
    	// TODO Auto-generated method stub
    	System.out.println("����ĭ ��ɷ�  �Զ����� ");
    }
}
