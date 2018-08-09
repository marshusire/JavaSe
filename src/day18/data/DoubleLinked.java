package day18.data;

class Nodes{
  //节点
   Nodes pre;//上个节点
   Nodes next;//下个节点	
  //数据部分
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
	//操作双向链表
	//头部节点
	 Nodes head;
	//尾部节点
	 Nodes foot;
	
	 //添加一个节点 尾部
	 public void addLast(Nodes node){
		 //找到尾部
		 if(foot==null){//当前是第一个节点
			head=node;
			foot=node;
			return;
		 }
		 //赋值
		 foot.next=node;
		 node.pre=foot;
		 //foot指向最新的节点
		 foot=node;
	 }

	 //添加在头部添加
	 public void addFirst(Nodes node){
		 //判断head是否为null
		 if(head==null){
			 head=node;
			 foot=node;
			 return;
		 }
		 //赋值
		 node.next=head;
		 head.pre=node;
		 //将头部指向于node
		 head=node; 
	 }
	 
	 //列出所有成员
	 public void list(){
		 //从头遍历到尾部
		 Nodes node=head;
		 while(node!=null){
			 node.toString();
			 node=node.next;
		 }		 
	 }
	 
	 
	 
	 public static void main(String[] args) {
	    //初始化化一个对象
		 DoubleLinked demo=new DoubleLinked();
		//添加数据
		 demo.addFirst(new Nodes("mars", 21));
		 demo.addFirst(new Nodes("mars2", 22));
		 demo.addFirst(new Nodes("mars3", 23));
		 demo.addFirst(new Nodes("mars4", 24));
		 demo.addLast(new Nodes("李四", 25));
		 
		//list
		 demo.list();
		 
		 
	}

}
