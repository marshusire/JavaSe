package day18.data;
//单链表 实现栈

class Noders{
  //节点引用	
    Noders next;//下个节点
  //数据	 
	String name;//姓名
   //构造方法
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
   * 栈的特点  先进后出 FILO
   * 放数据：压栈
   * 取数据   出栈 
   */
	Noders head;//头
	
	
   //压栈	
   public void push(Noders node){
	   //每次将数据设置为头节点
	      //让node的下个节点next 指向于 head
	        node.next=head;
	      //把node的引用赋值给head
	        head=node; 
   }
   //出栈
   public void pop(){
	   //删除头节点
	    //头结点的下个节点赋值给 Node
	    // Noders node=head.next;
	    //  head=node;
	        head=head.next;  
   }
   //遍历所有的元素
   public void list(){
	   //头部 遍历到尾部
	     //将头部赋值给一个临时对象
	      Noders node=head;
	      while(node!=null){
	    	    node.toString();
	    	  //把node的下个节点赋值给node
	    	  node=node.next;
	      }
   }
    
   //入口方法
   public static void main(String[] args) {
	  //1.初始化一个对象
	   StackDemo demo=new StackDemo();
	  //2.压栈
	   demo.push(new Noders("花木兰"));
	   demo.push(new Noders("佩琪"));
	   demo.push(new Noders("苏西"));
	   demo.push(new Noders("丹妮"));
	   
	  //3.列出所有成员
	   demo.list();
	  
	  //出栈
	   System.out.println("---------------");
	   demo.pop();
	   demo.list();
	   
	   
	   
}
	
}
