package day14.enums;

public class Employee {
	// ����    7 ��Ϣ��
	private int restday; // ĳһ����Ϣ

	public int getRestday() {
		return restday;
	}
    /**
     * 
     * @param restday
     *   ��������   1-7
     *    1 ����һ
     *    2 ���ڶ�
     *    3 ������
     *    4 ������
     *    5 ������
     *    6 ������
     *    7 ������
     */
	public void setRestday(int restday) {
		this.restday = restday;
	}

	//�ж�ĳһ���Ƿ�����Ϣ��
	public void dayOfRestDay(){
		switch(this.restday){
		  case 1:
		  case 2:
		  case 3:
		  case 4:
		  case 5:
		  case 6:
			System.out.println("��Ҫ��ש");
		  break;
		  case 7:
			System.out.println("�ú���Ϣ��");
		  break;
		  default:
			 System.out.println("������1-7");
		}
	}
	
	//��ڷ���
	public static void main(String[] args) {
		//1.��ʼ��һ��Ա������
		  Employee em=new Employee();
		//2.�����ϰ������
		  em.setRestday(1);
		//3.�ж�s
		  em.dayOfRestDay();
	}
	
	
}
