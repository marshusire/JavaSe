package day10;

public class Student {
   //����
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

	//���췽��
	 public Student(){
		 
	 }
	 public Student(String name,int age,int id){
		//��������
		 this.name=name;
		 this.id=id;
		 this.age=age;
	 }
	
	 
	 //��дequals����
	   @Override
		public boolean equals(Object obj) {
		   
		     //ֱ�ӵ��ø����equals���� �������෽��
		     if(super.equals(obj))
		      return true;
		     
			//.�ж�obj �Ƿ���Student
		      if(obj instanceof Student){
		      //�Ƚ�objת����Student 
		    	Student stu=(Student)obj;
		      //�ж������Ƿ����
		    	if(this.name.equals(stu.name)&&this.id==stu.id&&this.age==stu.age)
		    	  return true;
		      }
		   
			  return false;
		}
	 
	  //��ڷ���
	   public static void main(String[] args) {
		 //1.����Student����
		   Student stu=new Student("mars",12,1);
		 //2.����Student����
		   Student stu1=new Student("mars", 12, 1);
		 //���бȽ�
		   if(stu.equals(stu1)){
			   System.out.println("���");
		   }else{
			   System.out.println("�����");
		   }
		   
		   
		   
    	}
	   
	   
	   
	
	
	
}
