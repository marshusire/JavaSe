package day12.test;


class Father{
   //1.����	
     String name;  	
   //2.����
     //���췽��
     public Father(){
    	 System.out.println("����Ĭ�ϵĹ��췽��");
     }
     public Father(String name){
    	 this.name=name;
     }
}


public class Demo05 extends Father{
	
	//String name;//�����name
	
  /**
   * super�ؼ��� ������
   *      super��������� 
   *      ֻ��������ķ�����ʹ��
   *      super������Ĺ��췽����ʹ�ã��������ø���Ĺ��췽�� ������ڵ�һ��
   *      super ���Է��ʸ���ĳ�Ա
   *      
   *      ��һ�����췽���� this()��super()�ؼ��� ���ù��췽�� ��ѡһ  
   *      
   * */
	
	public Demo05(){
		
	  //super���ø���Ĺ��췽��	
	    super("22");
	    this.name="33";   //
	    super.name="44";  //���ø���ĳ�Ա
	
	}	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
}
