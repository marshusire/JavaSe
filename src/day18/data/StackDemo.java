package day18.data;
//������ ʵ��ջ

class Noders{
  //�ڵ�����	
    Noders next;//�¸��ڵ�
  //����	 
	String name;//����
   //���췽��
	public Noders(){
	}
	public Noders(String name){
		this.name=name;
	}
	@Override
		public String toString() {
			System.out.println(this.name);
			return super.toString();
		}
	
}


public class StackDemo {
  /**
   * ջ���ص�  �Ƚ���� FILO
   * �����ݣ�ѹջ
   * ȡ����   ��ջ 
   */
	Noders head;//ͷ
	
	
   //ѹջ	
   public void push(Noders node){
	   //ÿ�ν���������Ϊͷ�ڵ�
	      //��node���¸��ڵ�next ָ���� head
	        node.next=head;
	      //��node�����ø�ֵ��head
	        head=node; 
   }
   //��ջ
   public void pop(){
	   //ɾ��ͷ�ڵ�
	    //ͷ�����¸��ڵ㸳ֵ�� Node
	    // Noders node=head.next;
	    //  head=node;
	        head=head.next;  
   }
   //�������е�Ԫ��
   public void list(){
	   //ͷ�� ������β��
	     //��ͷ����ֵ��һ����ʱ����
	      Noders node=head;
	      while(node!=null){
	    	    node.toString();
	    	  //��node���¸��ڵ㸳ֵ��node
	    	  node=node.next;
	      }
   }
    
   //��ڷ���
   public static void main(String[] args) {
	  //1.��ʼ��һ������
	   StackDemo demo=new StackDemo();
	  //2.ѹջ
	   demo.push(new Noders("��ľ��"));
	   demo.push(new Noders("����"));
	   demo.push(new Noders("����"));
	   demo.push(new Noders("����"));
	   
	  //3.�г����г�Ա
	   demo.list();
	  
	  //��ջ
	   System.out.println("---------------");
	   demo.pop();
	   demo.list();
	   
	   
	   
}
	
}
