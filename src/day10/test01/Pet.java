package day10.test01;

/**
 * 1.������һ����һ�� ����ӵ������  ����  ���췽��
 * 2.�����಻��ֱ��ʵ������ֻ��������̳�ʵ����
 * 3.��������Զ�����󷽷�,���һ�������г��󷽷�����ô��������ǳ�����
 * ���������ඨ���ʱ�����ʹ��abstract �ؼ���
 * 
 * 
 * 
 * */



//������ 
public abstract class Pet {
	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
  

	/**
	 * 
	 *  ��ǰ����û�б��������� ��������������д
	 *  ����ʹ�ó��󷽷����� ���¶��巽��
	 *  ���󷽷��ص�
	 *     1.����ʹ��abstract��������  
	 *     2.�����з�����
	 *     3.���������д�÷���,���������һ�������࣬���Բ�����д
	 *     4.���󷽷� ���� final static private ��������
	 *  
	 * */
	
	//��������Ϊ����
	   public abstract void toHospital();
	
}
