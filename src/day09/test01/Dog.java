package day09.test01;
//����̳и���
public class Dog extends Animal{
  //������������
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
  //����һ������һ����Ϊ
	 public void swiming(){
		 System.out.println("����Ӿ"); 
	 }
	
	 //���췽��
	  public Dog(){
		  
	  }
	  public Dog(String name,int age){
		 //���ø���Ĺ��췽�� �����Խ��и�ֵ
		  super(name,age);
	  }
	 
	  //��д toEat
	   @Override
		public void doEat() {
		   //���¶�������������Ϊ
		    System.out.println("������ ����");
		    //��������������Ϊ ����ʹ��super���ø���ķ���
		     super.doEat(); 
		}
	    
	   public void methodA(){
		   super.doEat(); 
	   }
	  
	  
	  
}