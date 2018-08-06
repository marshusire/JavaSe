package day09.test01;
//子类继承父类
public class Dog extends Animal{
  //子类特有属性
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
  //狗有一个特有一个行为
	 public void swiming(){
		 System.out.println("会游泳"); 
	 }
	
	 //构造方法
	  public Dog(){
		  
	  }
	  public Dog(String name,int age){
		 //调用父类的构造方法 给属性进行赋值
		  super(name,age);
	  }
	 
	  //重写 toEat
	   @Override
		public void doEat() {
		   //重新定义子类特有行为
		    System.out.println("狗吃肉 旺旺");
		    //如果保留父类的行为 可以使用super调用父类的方法
		     super.doEat(); 
		}
	    
	   public void methodA(){
		   super.doEat(); 
	   }
	  
	  
	  
}
