package day08.thisdemo;

public class ThisDemo01 {
	// this �ؼ��ֿ��Խ�� ��Ա�����;ֲ�����(�β�)������
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//�ֲ������ͳ�Ա�����Ķ�����
		this.name = name;
	}

	public static void main(String[] args) {
        //��ʼ��һ������
		 ThisDemo01 demo=new ThisDemo01();
		//�����Ը�ֵ
		  demo.setName("mars");
		//��ȡ���Ե�ֵ
		  System.out.println(demo.getName());
		 
		 
		
		
	}

}
