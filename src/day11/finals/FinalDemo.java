package day11.finals;

/**
 *  final ��һ�����η� �������� ��  ����  ������
 * 
 *  final ������������η�һ��ʹ�� ����û���Ⱥ�˳��
 *  ���磺
 *  public final  static
 *  final  public static 
 *  static final  public
 *  
 * 
 * 
 * @author Administrator
 *
 */

/**
 * 
 * final ���ε��� ����������  ���ܱ��̳�
 * 
 * final ���η� �������� ������ 
 *       ������ ���뱻�̳в���ʹ�á�
 * 
 * */
//��final���ε��಻�ܱ��̳�
final class Demo{
		
}
//�����಻����final����
//final abstract class Demo01{
//	
//}

/**
 * ��final���εķ��� ���������շ�����ֻ��ʹ��, ������д
 * 
 * ����Ǿ�̬���� ��������final������Ϻ����಻�������¶��巽��
 * 
 * final �������γ��󷽷������󷽷�����Ҫ����д��
 * 
 * 
 * */

abstract class Demo02{
  //����	һ������
   public final void methodA(){
	   System.out.println("Ŭ��Ŭ��");
   }
	
   //final �������γ��󷽷������󷽷�����Ҫ���̳���д��
  // public final abstract methodc();
   
   public final static void methodB(){
	   
   }
}



public class FinalDemo extends Demo02{
	
	//�������ķ�����final�����ˣ����಻����дfinal���εķ���
	/*@Override  //��д����
	public  void methodA() {
		super.methodA();
		//�����ڶ��巽��
		System.out.println("�ú�ѧϰ");	
	}*/
	
	//����ʹ�ø���final���εķ���
//	   public static int  methodB(){
//		return 0;
//	   }

	
	/**
	 * final ���ε��ֶ� ����������ֻ�ܱ���һ��ֵ�������ڴθı�
	 * final���ε��ֶα�������ϳ�ʼֵ
	 * */
	 //final���� ������������
	 final static int age=0;
	 //final���������������� 
	 final static int[]arr=new int[10];//0x1234
	 
	 //final���εı��� ���Խ������� ���ɸı��� 
	 //����һ������ �� public final static ���� �������� ȫ���ô�д���������֮��Ҫ�и��»��߽�������
	 public final static int MAX_VALUE=123456;
	 
	 
	 //����һ��������
	 public static void main(String[] args) {
		//ʹ��final���εı���
		 System.out.println(age);
		//final���εı��������ٴθ�ֵ
		   //age=1;
		   final int sex=111;
		   //sex=123;
		 
		  //����arr���û�������
		   //arr=new int[9]; �����������Ͳ��ܸ������õ��ڴ�  0x3333
		   arr[0]=12;
		   arr[2]=999;  //�����������͵����ݿ��Ը��õģ������ڴ��е������ǲ����Ը��á�
	 } 
	
}
