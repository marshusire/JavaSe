package day18.data;

class Nodes{
  //�ڵ�
   Nodes pre;//�ϸ��ڵ�
   Nodes next;//�¸��ڵ�	
  //���ݲ���
   String name;
   int    age;
   public Nodes(){}
   public Nodes(String name,int age){
	   this.name=name;
	   this.age=age;
   }
   @Override
	public String toString() {
		System.out.println("name "+this.name+" age "+this.age);
		return super.toString();
	}
}


public class DoubleLinked {
	//����˫������
	//ͷ���ڵ�
	 Nodes head;
	//β���ڵ�
	 Nodes foot;
	
	 //���һ���ڵ� β��
	 public void addLast(Nodes node){
		 //�ҵ�β��
		 if(foot==null){//��ǰ�ǵ�һ���ڵ�
			head=node;
			foot=node;
			return;
		 }
		 //��ֵ
		 foot.next=node;
		 node.pre=foot;
		 //footָ�����µĽڵ�
		 foot=node;
	 }

	 //�����ͷ�����
	 public void addFirst(Nodes node){
		 //�ж�head�Ƿ�Ϊnull
		 if(head==null){
			 head=node;
			 foot=node;
			 return;
		 }
		 //��ֵ
		 node.next=head;
		 head.pre=node;
		 //��ͷ��ָ����node
		 head=node; 
	 }
	 
	 //�г����г�Ա
	 public void list(){
		 //��ͷ������β��
		 Nodes node=head;
		 while(node!=null){
			 node.toString();
			 node=node.next;
		 }		 
	 }
	 
	 
	 
	 public static void main(String[] args) {
	    //��ʼ����һ������
		 DoubleLinked demo=new DoubleLinked();
		//�������
		 demo.addFirst(new Nodes("mars", 21));
		 demo.addFirst(new Nodes("mars2", 22));
		 demo.addFirst(new Nodes("mars3", 23));
		 demo.addFirst(new Nodes("mars4", 24));
		 demo.addLast(new Nodes("����", 25));
		 
		//list
		 demo.list();
		 
		 
	}

}
