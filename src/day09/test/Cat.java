package day09.test;
//����̳и���  ����ӵ�и��๫�����Ժͷ���
public class Cat extends Animal{
   //������������
	 private String sex;

	 public String getSex() {
		return sex;
	 }
	 public void setSex(String sex) {
		this.sex = sex;
	 }

	//è������Ϊ
	 public void upATree(){
		 System.out.println("è��������"); 
	 } 
	 
	 //���췽��
	  public Cat(){
	  
	  }
	  //�������Ĺ��췽��
	  public Cat(String name,int age){
		  //���ø�����������췽�� ֱ�Ӹ��������Ը�ֵ
		    super(name,age);
		  
	  }
	 
}
