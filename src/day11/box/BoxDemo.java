package day11.box;

public class BoxDemo {	
  /**
   *  ��װ�ࣺ��Ҫ���� �������������� ת���������������͡�
   *  ÿ�������������� ��Ӧ һ����װ������
   *  ������������                    ��װ������
   *    byte  			   Byte
   *    short              Short
   *    int                Integer
   *    long               Long
   *    float              Float
   *    double             Double
   *    char               Character
   *    boolean            Boolean
   * */
	
	public static void main(String[] args) {
		//1.��ʼ��һ������ ������ֻ�ܴ������������  object����
		   Object[]arr=new Object[10];
		   arr[1]="";
		   arr[0]=1;
		//װ�� �ѻ����������� ת���ɶ�Ӧ�İ�װ������  
		   //1.�ֶ�װ�� ��ʽ������
		      //ͨ�����췽��
		        Integer i=new Integer(12);//��һ������ת��Integer����
		      //ͨ����̬����  
		        Integer i1=Integer.valueOf(11);//ͨ����̬����
		        
		      //���Խ�String����ת����Integer����
		        Integer i2=new Integer("223");
		      //ͨ����̬����
		         Integer i3=Integer.valueOf("333");
		        
		//����    �Ѱ�װ����ת���ɻ�����������
	          //�ֶ����в���
		         int j=i.intValue();
		         System.out.println(j);
		       //��String����ת����int����
	   	        int j1=Integer.parseInt("456");
		        System.out.println(j1);
		            
		
		     //�Զ�����װ��
		        Object []obj={12,4,4,5};
		        Integer a=10;//�������������Զ�װ��
		        System.out.println(a);
		        //�Զ�����
		        int b=a;//���������� ��ֵ��int���� �Զ�����
		        System.out.println(b);
		      
		      //ʮ����ת������������
		        //ת���ɶ�����
		         System.out.println( Integer.toBinaryString(4));
		        
		        //ת����16����
		         System.out.println(Integer.toHexString(17));
		        
		        //ת����8����
		         System.out.println(Integer.toOctalString(10));
		
	}
	
	
	
	
	
}
