package day18.data;

//声明节点类
class Noder{
  //节点	
    Noder pre;//上个节点的引用
	Noder next;//下个节点的引用
	
  //数据	
	String name;
  //构造方法
	public Noder(){
		
	}
	public Noder(String name){
		this.name=name;
	}
   //重写toString	
	@Override
	public String toString() {
			System.out.println("name"+this.name);
			return super.toString();
	}	
}


public class QueueDemo {
   /**
    * 队列  先进 先出 FIFO
    *   对数据增加 删除最多 底层数据存储用链表最合适
    */
	
	//声明一个头部节点
	Noder head;//头部节点
	Noder foot;//尾部节点
	
	//在队列的尾部 添加一个节点
	public void pushLast(Noder node){
		//判断尾部节点是否为null
		if(foot==null){
		   foot=node;
		   head=node;
		   //头尾都指向于 node
		   return;
		}
		//在尾部添加节点
		   foot.next=node;  //尾部的节点的下个节点 指向于 node
		   node.pre=foot;   //node的上一个节点 指向于 foot;
		   //尾部指向于 最新
		   foot=node;
	}
	
	//在头部添加
	public void addFirst(Noder node){
		//1判断头部是否为null
		if(head==null){
			head=node;
			foot=node;
			return;
		}
	   //将node设置为head
		  node.next=head;
		  head.pre=node;
		//node 设置为头
		  head=node;	
	}
	
	
	//在队列的首部 删除一个节点
	public void popFirst(){
		//删除头部节点
		head=head.next;
		head.pre=null;
	}
	
	//在尾部删除
	public void popLast(){
		//找到上个节点
		Noder node=foot.pre;
		node.next=null;
		foot=node;
	}
	
	
	//查看对列表中所有的元素
	public void list(){
		//遍历链表上的所有节点 从头遍历到尾部
		    Noder node=head;
		  //判断node是否为null
		    while(node!=null){
		    	node.toString();//打印对象
		    	node=node.next;//把node下个节点赋值给node
		    }
	}
		
	public static void main(String[] args) {
		//1.初始化一个对象
		QueueDemo demo=new QueueDemo();
		
		//1.追加数据
		demo.pushLast(new Noder("mars1"));
		demo.pushLast(new Noder("mars2"));
		demo.pushLast(new Noder("mars3"));
		demo.pushLast(new Noder("mars4"));
		demo.pushLast(new Noder("mars5"));

		demo.addFirst(new Noder("lucy"));
		
		//2.列取所有成员
		demo.list();
		//3.删除成员
		//demo.popFirst();
		//demo.popFirst();
		
		demo.popLast();
		demo.popLast();
		System.out.println("--------");
		demo.list();
		
	}
	
	
}
