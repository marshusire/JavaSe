package day18.data;
//节点类

class Node{
  //指向下个节点的引用
   Node next;
  //数据部分	
   String name;
   int    age;
   //构造方法
   public Node(){
	   
   }
   public Node(String name,int age){
	  this.name=name;
	  this.age=age;
   } 
   @Override
	public String toString() {
		System.out.println("姓名"+this.name+"  年龄"+this.age);
		return super.toString();
	}
   
}

public class linkedListDemo {
  //操作链表  增 删 改 查
	//属性 
	Node head=null;//头部节点
	
  //添加节点
	public void addNode(Node node){
	   //1.判断头部节点是否为null
		if(head==null){
		   //头部 指向node            0x123   0x1234   0x12345
			head=node;              
			return;
		}
	   //2.节点的下个节点是否为空	
		   Node tmp=head;//把head赋值给临时一个变量
		   Node pre=null;//记录上个节点
		   while(tmp!=null){
			   pre=tmp;
			   //遍历接下个节点
			   tmp=tmp.next;
		   }
	   //3.如果为null ,把最新的节点 赋值给当前的节点下个节点	
		      pre.next=node;
	}
	
	public void deleteNode(String name){
		//1.将头部节点赋值给tmp
		   Node tmp=head;
		   //声明上个节点
		   Node pre=null;
		//2.判断当前节点是否为空
		   while(tmp!=null){
			 //当前节点是否是要删除的节点
			   if(tmp.name.equals(name)){
				  //删除节点
				  //判断是否删除是第一个节点
				   if(tmp==head){
					   head=head.next;
					   break;
				   } 
				   //不是头部节点使用这个
				   pre.next=tmp.next;   
			   }
			 //不是要删除的节点
			   pre=tmp;//记录当前节点
			   tmp=tmp.next;//下个节点赋值给tmp 
		   }
		
		
	}
	
	
	//查看所有节点
	public void list(){
	     //遍历所有节点  从头开始
		  //1.将头部节点赋值给tmp
		    Node tmp=head;
		  //2.判断节点是否为空
		    while(tmp!=null){
		      tmp.toString();//打印节点的数据
		      //将tmp执行的下个节点赋值给 tmp
		      tmp=tmp.next;	
		    }
	 }
	
	
	//查询 通过内容 查询索引
	
	//查询 通过内容查询
	
	//在指定的位置插入 一个node
	
	
	public static void main(String[] args) {
	   //1.初始化一个对象
		linkedListDemo demo=new linkedListDemo();
	   //2.添加 节点对象
		 demo.addNode(new Node("mars", 12));
		 demo.addNode(new Node("lucy", 15));
		 demo.addNode(new Node("meimei",16));
		 demo.addNode(new Node("李伟",78));
		//3.输出所有节点的数据
		 demo.list();
		 System.out.println("-----------------");
		 //删除节点
		 demo.deleteNode("mars");
		 demo.list();
		 	 
	}
	
	
	

}
