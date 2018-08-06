package day13.interface01;

/**
 * 实现类  
 * 
 * 
 */
public class SecurityDoor01 extends Door implements FirstInterface,SecondInterface{
     @Override
     public void lock() {
	// TODO Auto-generated method stub
	  System.out.println("通过指纹进行上锁");
     }   
     @Override
	 public void unlock() {
		// TODO Auto-generated method stub
	  System.out.println("通过指纹进行解锁");
	 }
     @Override
    public void fireProof() {
    	// TODO Auto-generated method stub
    	System.out.println("喷泡沫 喷干粉  自动报警 ");
    }
}
