package day09.test01;
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
	  
	  /**
	   * ��д ֻ���Ƿ��� ֻ����д����ķ���
	   * �����๦����Ϊ ���㲻���������� ,������Ҫ�Ը���ķ�������
	   * ���¶��� 
	   * 
	   * 1.��������������д
	   * 2.������ �����б����һ��
	   * 3.���η�Ҫô�͸���һ�£�Ҫô�ȸ�������Ȩ�޴�
	   * 4.����ֵ���� Ҫôһ�� Ҫô������������
	   * 5.�������������쳣 Ҫôһ�� ��ȡ��������
	   * 
	   * */
	    //��д
	    @Override     //ע��
		public void doEat() {//���¶��常��ķ���
			//super.doEat();//���ø���ķ���
	       System.out.println("è����   ����");
		}
	  
	  
	  
	 
}
