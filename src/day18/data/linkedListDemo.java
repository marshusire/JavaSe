package day18.data;
//�ڵ���

class Node{
  //ָ���¸��ڵ������
   Node next;
  //���ݲ���	
   String name;
   int    age;
   //���췽��
   public Node(){
	   
   }
   public Node(String name,int age){
	  this.name=name;
	  this.age=age;
   } 
   @Override
	public String toString() {
		System.out.println("����"+this.name+"  ����"+this.age);
		return super.toString();
	}
   
}

public class linkedListDemo {
  //��������  �� ɾ �� ��
	//���� 
	Node head=null;//ͷ���ڵ�
	
  //��ӽڵ�
	public void addNode(Node node){
	   //1.�ж�ͷ���ڵ��Ƿ�Ϊnull
		if(head==null){
		   //ͷ�� ָ��node            0x123   0x1234   0x12345
			head=node;              
			return;
		}
	   //2.�ڵ���¸��ڵ��Ƿ�Ϊ��	
		   Node tmp=head;//��head��ֵ����ʱһ������
		   Node pre=null;//��¼�ϸ��ڵ�
		   while(tmp!=null){
			   pre=tmp;
			   //�������¸��ڵ�
			   tmp=tmp.next;
		   }
	   //3.���Ϊnull ,�����µĽڵ� ��ֵ����ǰ�Ľڵ��¸��ڵ�	
		      pre.next=node;
	}
	
	public void deleteNode(String name){
		//1.��ͷ���ڵ㸳ֵ��tmp
		   Node tmp=head;
		   //�����ϸ��ڵ�
		   Node pre=null;
		//2.�жϵ�ǰ�ڵ��Ƿ�Ϊ��
		   while(tmp!=null){
			 //��ǰ�ڵ��Ƿ���Ҫɾ���Ľڵ�
			   if(tmp.name.equals(name)){
				  //ɾ���ڵ�
				  //�ж��Ƿ�ɾ���ǵ�һ���ڵ�
				   if(tmp==head){
					   head=head.next;
					   break;
				   } 
				   //����ͷ���ڵ�ʹ�����
				   pre.next=tmp.next;   
			   }
			 //����Ҫɾ���Ľڵ�
			   pre=tmp;//��¼��ǰ�ڵ�
			   tmp=tmp.next;//�¸��ڵ㸳ֵ��tmp 
		   }
		
		
	}
	
	
	//�鿴���нڵ�
	public void list(){
	     //�������нڵ�  ��ͷ��ʼ
		  //1.��ͷ���ڵ㸳ֵ��tmp
		    Node tmp=head;
		  //2.�жϽڵ��Ƿ�Ϊ��
		    while(tmp!=null){
		      tmp.toString();//��ӡ�ڵ������
		      //��tmpִ�е��¸��ڵ㸳ֵ�� tmp
		      tmp=tmp.next;	
		    }
	 }
	
	
	//��ѯ ͨ������ ��ѯ����
	
	//��ѯ ͨ�����ݲ�ѯ
	
	//��ָ����λ�ò��� һ��node
	
	
	public static void main(String[] args) {
	   //1.��ʼ��һ������
		linkedListDemo demo=new linkedListDemo();
	   //2.��� �ڵ����
		 demo.addNode(new Node("mars", 12));
		 demo.addNode(new Node("lucy", 15));
		 demo.addNode(new Node("meimei",16));
		 demo.addNode(new Node("��ΰ",78));
		//3.������нڵ������
		 demo.list();
		 System.out.println("-----------------");
		 //ɾ���ڵ�
		 demo.deleteNode("mars");
		 demo.list();
		 	 
	}
	
	
	

}
