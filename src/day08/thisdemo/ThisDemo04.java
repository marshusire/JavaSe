package day08.thisdemo;

class Operation{
//����һ������ �������name��ֵ��ֵ "����A��";	
   public static void  setVales(ThisDemo04 demo){
	    demo.setName("����A��");//�����Խ��и�ֵ
   }	
}



public class ThisDemo04 {
   //����
	private String name;//����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
   //�Զ���һ������
	public void methodA(){
		//��ȡ��this ��this ��Ϊ���� ���ݸ���һ������
		Operation.setVales(this);	
	}

	public static void main(String[] args) {
		//1.��ʼ��һ������
		   ThisDemo04 demo=new ThisDemo04();
		//2.����methodA
		    demo.methodA();
		//3.ȡֵ
		    System.out.println(demo.getName());
		    

	}

}
