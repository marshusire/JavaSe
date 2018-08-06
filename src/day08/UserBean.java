package day08;

/**
 * JavaBean 可重用的组件
 *  1.属性私有化
 *  2.公开其属性设置和获取方法
 *  3.必须有一个无参数的构造方法,如果有有参数的构造方法,需要写一个无参数构造方法
 * */

public class UserBean{
   //字段
  private  String name; //姓名
  private  int   age;   //年龄
  private  boolean sex; //性别
  
  //公开setter方法 	set后跟的单词，必须属性的单词 ，首字母一定要大写
  public void setName(String name){
	  //赋值
	  //name=name; 编译器区分不出来局部变量和成员变量，都识别成局部变量了 所以成员变量没有赋上值。
	  //this 代表当前对象,那个对象调用该方法,this就代表谁,this.name 代表对象的属性。
	    this.name=name;
  }
  public void setAge(int age){
	    this.age=age;
  }
  public void setSex(boolean sex){
	    this.sex=sex;
  }
  
  //公开getter方法  get后跟上属性的单词,单词的首字母要大写，如果是boolean类型 不能使用 get 是 is
  public String getName(){
	  return name;
  }
  public int getAge(){
	  return age;
  }
  public boolean isSex(){
	  return sex;
  }
  //构造方法重载的时候，必须写上默认构造方法
    
}
