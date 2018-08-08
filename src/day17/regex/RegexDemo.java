package day17.regex;

public class RegexDemo {
     /***
      * 正则表达式：规则表达式 
      *          目的：处理字符串
      * 
      * 写的技巧：
      * 自左向右来写，先写元字符 量词 最后在写逻辑
      * 
      * @param args
      */
	
	public static void main(String[] args) {
	  //判断1个字符串是否由纯数字组成
	  /**
	   * 数字怎么表示[0-9]
	   * \d 元字符
	   * +  量词 1次以上	
	   */
		//规则  使用的时候加上转义符\
		String reg="\\d{4,7}";
		//匹配 
		boolean r="23456789".matches(reg);
		System.out.println(r);
		
		//匹配规则
		/**
		 * 3.qq号码验证
		 * 1.必须纯数字
		 * 2.不能以0开头
		 * 3.5-10位
		 */
		//1.规则
		   reg="[1-9]\\d{4,9}";
		 //2验证
		   r="06765779".matches(reg);
		 //3.输出
		   System.out.println(r);
		     
		//1.手机号码  邮箱   用户名 数字 字母 下划线  不能以下划线开头结尾
		   /**
		    * 手机号码
		    * 1.必须纯数字
		    * 2.必须1开头
		    * 3.第二位 3 5 7 8
		    * 
		    */
		   //规则
		    reg="1[3578]\\d{9}";
		   //匹配规则
		    r="1383813709".matches(reg);
		    System.out.println(r); 
		   
		   /**
		    *  邮箱
		    *  符合规则     xxx@域名.com cn net 
		    *  前缀 字母 数字 下划线
		    *  @
		    *  域名 
		    *  字母和数字 长度至少一个
		    *  .
		    *  com|cn
		    */
		     //规则
		     reg="\\w+@[a-zA-Z0-9]+\\.(com|cn|qq)";
		     //匹配
		     r="62626@qq.com".matches(reg);
		     System.out.println(r);
		     
		     
		    //用户名匹配规则    数字 字母 下划线  不能以下划线开头结尾
		     /***
		      * 
		      * 分成3部分
		      * 
		      */
		     reg="[a-zA-Z0-9]\\w{4,14}[a-zA-Z0-9]";
		     //匹配
		     r="ddd377".matches(reg);
		     System.out.println(r);
		

	}

}
