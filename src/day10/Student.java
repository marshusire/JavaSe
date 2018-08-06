package day10;

public class Student {
   //属性
	private int id;
	private String name;
	private int  age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//构造方法
	 public Student(){
		 
	 }
	 public Student(String name,int age,int id){
		//设置属性
		 this.name=name;
		 this.id=id;
		 this.age=age;
	 }
	
	 
	 //重写equals方法
	   @Override
		public boolean equals(Object obj) {
		   
		     //直接调用父类的equals方法 保留父类方法
		     if(super.equals(obj))
		      return true;
		     
			//.判断obj 是否是Student
		      if(obj instanceof Student){
		      //先将obj转换成Student 
		    	Student stu=(Student)obj;
		      //判断属性是否相等
		    	if(this.name.equals(stu.name)&&this.id==stu.id&&this.age==stu.age)
		    	  return true;
		      }
		   
			  return false;
		}
	 
	  //入口方法
	   public static void main(String[] args) {
		 //1.创建Student对象
		   Student stu=new Student("mars",12,1);
		 //2.创建Student对象
		   Student stu1=new Student("mars", 12, 1);
		 //进行比较
		   if(stu.equals(stu1)){
			   System.out.println("相等");
		   }else{
			   System.out.println("不相等");
		   }
		   
		   
		   
    	}
	   
	   
	   
	
	
	
}
