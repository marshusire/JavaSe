package day12.test;

class Demo04{
   //�����Ķ���
	public static void  test(Demo03 demo){
		//�����Խ��и�ֵ
		demo.setName("mars");
		demo.setAge(12);
	}
	
}


public class Demo03 {
  /***
   * this �ؼ��ִ�����ǵ�ǰ���� 
   *      thisֻ���ڷ�����ʹ�� ֻ����ʵ��������ʹ��  
   *      this�������־ֲ������ͳ�Ա����
   *      this���Ե��õ�ǰ��Ĺ��췽��
   *      this������Ϊ�����ķ���ֵ(��ʽ�﷨���)
   *      this������Ϊ������ʵ�ν��д�ֵ
   */
	
    private String  name;
    private int     age;
    public String getName() {
       return name;
	}
	public void setName(String name) {
		//���־ֲ������ͳ�Ա����
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public void methodB(){
     	
    }
    //this ��Ϊ������ʵ�ν��д���
	public void methodA(){
		this.methodB();//�ȼ��� ����.methodB();
      //�����Ĵ��� this  this����ľ��ǵ�ǰ����
		Demo04.test(this);
	}
	
	//this������Ϊ�����ķ���ֵ ���е���
	public Demo03 getSum(){
		System.out.println("���");
		return this;
	}
	
	public static void method(){
	}
   
	public static void main(String[] args) {
		//1.��ʼ��һ������
		  Demo03 demo=new Demo03(1);
		//2.���÷���  ��ʽ�﷨���
		  demo.getSum().methodA();
		  System.out.println(demo.getName()+"  "+demo.getAge());
		  
		  
	}
	
	/**
	 * 
	 *  ���췽���� ʹ��this�ؼ��� ���Ե��ù��췽��
	 *     this �����ڵ�һ��
	 *  
	 *
	 * 
	 * */
	
	  public Demo03(){
		 this(1);
	  }
	  public Demo03(int num,int age){
		  
	  }
	  public Demo03(int num){
		  this(2,3);
		  
	  }
	
	
}
