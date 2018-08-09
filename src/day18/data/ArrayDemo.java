package day18.data;

import java.util.Arrays;

public class ArrayDemo {
/**
 *         1):��ʼ����Ϊ5�������б�,׼�������洢���ϵ�5�����º���.
           2):����5����Ա�ϳ�:[11,22,33,44,55].
           3):��ѯָ��λ�õ���Ա�����º����Ƕ���.��ѯ����λ��Ϊ2�����º�����:33.
           4):�������º����ѯ����Ա�ڳ��ϵ�����λ��. 44���ºŵ���Ա�ڳ��ϵ�����λ����:3.
           5):�滻��������λ��Ϊ2����Ա,�滻֮���λ�õ����±��Ϊ333. 333��33�滻��.
           6):�滻���º���Ϊ22����Ա,�滻֮��Ϊ222.
           7):�ѳ�������λ��Ϊ2�����·��³�(ע��:����,û�в�λ.).
           8):������Ա�ڳ��ϵ�λ��,��ӡ�����º���,��ӡ���:[11,22,33,44,55].
 */
  //����
	private Integer[]player=new Integer[5];
	
  //1.���Ԫ��
	public void addPlayerNum(int num){
	    //1.��������
		  for (int i = 0; i <player.length; i++) {
			   Integer j = player[i];
			   //�ж�Ԫ���Ƿ�Ϊnull
			   if(j==null){
				 player[i]=num;
				 break;
			   }else if(i==player.length-1){
				  //�������������
				    player= Arrays.copyOf(player,player.length+5);
			   }
		 }
	 }
	
	//2.������������ֵ
	 public Integer searchByIndex(int index){
		 //������������ֵ
		 return player[index];
	 }
	
	//3.�������ݲ�����
	 public int searchByNum(Integer num){
		 for (int i = 0; i < player.length; i++) {
			 Integer integer = player[i];
			 if(integer==num)return i;
		 }
		 //û�в鵽
		 return -1;
	 }
	//4.�滻���� ĳ��λ�õ�����
	 public void replaceFromIndex(int index,Integer num){
		   player[index]=num;
	 }
    //5.ͨ���������滻��������
	 public void replaceFromNum(Integer oriNum,Integer desNum){
		 for (int i = 0; i < player.length; i++) {
			Integer integer = player[i];
			//�ж��Ƿ����
			if(oriNum==integer){
				player[i]=desNum;
			}
		} 
	 }
	//6.ɾ������Ԫ��ͨ���±�
	 public void deleteById(int index){
		//1.���б��� ɾ��
		 for (int i =index; i < player.length; i++) {
			 if(index<=i&&i<player.length-1){
				//����ߵ�Ԫ����ǰ������
				 player[i]=player[i+1]; 
			 }
		 }
	   //4.���¼���
		  player=Arrays.copyOf(player,player.length-1);
	 }
	 //7.�鿴����Ԫ�ش�ӡ����
	 public void list(){
		 System.out.print("[");	
		for (int i = 0; i < player.length; i++) {
			Integer integer = player[i];
			if(integer!=null){
			 System.out.print(integer+" ");	
			}
		}
		 System.out.println("]");	
	 }
	 
	 public static void main(String[] args) {
		//1.��ʼ��һ������ 
		 ArrayDemo demo=new ArrayDemo();
		//2.��Ա�����ϳ�
		 demo.addPlayerNum(11);
		 demo.addPlayerNum(22);
		 demo.addPlayerNum(33);
		 demo.addPlayerNum(44);
		 demo.addPlayerNum(55);
		 demo.addPlayerNum(66);
	    //3.��ѯ������Ա
		 System.out.println(demo.searchByIndex(2));
		 System.out.println(demo.searchByNum(22));
		 
		 
	   //list
		 demo.list();
		//�滻����3λ�õ�����
		 demo.replaceFromIndex(2, 333);
		 //���������滻����
		 demo.replaceFromNum(22, 222);
		 demo.list();
		 
		//ɾ��ָ��λ�õ���Ա
		 demo.deleteById(2);
		//
		 demo.list();
		 
		 
	}
	 
	 
	
	
}
