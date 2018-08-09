package day18.data;

//�����ڵ���
class Noder{
  //�ڵ�	
    Noder pre;//�ϸ��ڵ������
	Noder next;//�¸��ڵ������
	
  //����	
	String name;
  //���췽��
	public Noder(){
		
	}
	public Noder(String name){
		this.name=name;
	}
   //��дtoString	
	@Override
	public String toString() {
			System.out.println("name"+this.name);
			return super.toString();
	}	
}


public class QueueDemo {
   /**
    * ����  �Ƚ� �ȳ� FIFO
    *   ���������� ɾ����� �ײ����ݴ洢�����������
    */
	
	//����һ��ͷ���ڵ�
	Noder head;//ͷ���ڵ�
	Noder foot;//β���ڵ�
	
	//�ڶ��е�β�� ���һ���ڵ�
	public void pushLast(Noder node){
		//�ж�β���ڵ��Ƿ�Ϊnull
		if(foot==null){
		   foot=node;
		   head=node;
		   //ͷβ��ָ���� node
		   return;
		}
		//��β����ӽڵ�
		   foot.next=node;  //β���Ľڵ���¸��ڵ� ָ���� node
		   node.pre=foot;   //node����һ���ڵ� ָ���� foot;
		   //β��ָ���� ����
		   foot=node;
	}
	
	//��ͷ�����
	public void addFirst(Noder node){
		//1�ж�ͷ���Ƿ�Ϊnull
		if(head==null){
			head=node;
			foot=node;
			return;
		}
	   //��node����Ϊhead
		  node.next=head;
		  head.pre=node;
		//node ����Ϊͷ
		  head=node;	
	}
	
	
	//�ڶ��е��ײ� ɾ��һ���ڵ�
	public void popFirst(){
		//ɾ��ͷ���ڵ�
		head=head.next;
		head.pre=null;
	}
	
	//��β��ɾ��
	public void popLast(){
		//�ҵ��ϸ��ڵ�
		Noder node=foot.pre;
		node.next=null;
		foot=node;
	}
	
	
	//�鿴���б������е�Ԫ��
	public void list(){
		//���������ϵ����нڵ� ��ͷ������β��
		    Noder node=head;
		  //�ж�node�Ƿ�Ϊnull
		    while(node!=null){
		    	node.toString();//��ӡ����
		    	node=node.next;//��node�¸��ڵ㸳ֵ��node
		    }
	}
		
	public static void main(String[] args) {
		//1.��ʼ��һ������
		QueueDemo demo=new QueueDemo();
		
		//1.׷������
		demo.pushLast(new Noder("mars1"));
		demo.pushLast(new Noder("mars2"));
		demo.pushLast(new Noder("mars3"));
		demo.pushLast(new Noder("mars4"));
		demo.pushLast(new Noder("mars5"));

		demo.addFirst(new Noder("lucy"));
		
		//2.��ȡ���г�Ա
		demo.list();
		//3.ɾ����Ա
		//demo.popFirst();
		//demo.popFirst();
		
		demo.popLast();
		demo.popLast();
		System.out.println("--------");
		demo.list();
		
	}
	
	
}
