package day08;

/**
 * JavaBean �����õ����
 *  1.����˽�л�
 *  2.�������������úͻ�ȡ����
 *  3.������һ���޲����Ĺ��췽��,������в����Ĺ��췽��,��Ҫдһ���޲������췽��
 * */

public class UserBean{
   //�ֶ�
  private  String name; //����
  private  int   age;   //����
  private  boolean sex; //�Ա�
  
  //����setter���� 	set����ĵ��ʣ��������Եĵ��� ������ĸһ��Ҫ��д
  public void setName(String name){
	  //��ֵ
	  //name=name; ���������ֲ������ֲ������ͳ�Ա��������ʶ��ɾֲ������� ���Գ�Ա����û�и���ֵ��
	  //this ����ǰ����,�Ǹ�������ø÷���,this�ʹ���˭,this.name �����������ԡ�
	    this.name=name;
  }
  public void setAge(int age){
	    this.age=age;
  }
  public void setSex(boolean sex){
	    this.sex=sex;
  }
  
  //����getter����  get��������Եĵ���,���ʵ�����ĸҪ��д�������boolean���� ����ʹ�� get �� is
  public String getName(){
	  return name;
  }
  public int getAge(){
	  return age;
  }
  public boolean isSex(){
	  return sex;
  }
  //���췽�����ص�ʱ�򣬱���д��Ĭ�Ϲ��췽��
    
}
