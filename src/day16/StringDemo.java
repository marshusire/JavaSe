package day16;

public class StringDemo {
	/**
	 * 1.用户名必须是6-16位 可以是字母数字下划线 
	 * 2.手机号码验证 
	 * 3.qq号码验证
	 * 4.“蒹葭苍苍,白鹭为霜霜,所谓伊伊人,再水一方”以逗号来分割字符
	 * 
	 * 串 
	 * 
	 * 5.第四题中文本 替换叠词为，"Java"
	 * 
	 * 
	 * @param args
	 */

	// 初始化用户名
	public static boolean regexUser(String name) {
		// 用户名必须是6-16位 可以是字母数字下划线
		// 1.判断字符串长度
		if (name.length() >= 6 && name.length() <= 16) {
			// 2.字符串分割成一个字符数组
			char cs[] = name.toCharArray();
			// 3.遍历字符数组，用字符和 字母 数字 下划线的 编码进行对比
			// 小写字母取值 97-122
			// 大写字母取值 65-90
			// 下划线 95
			// 数字 48-57
			for (char c : cs) {
				// 判断是否在范围内
				if (!(c >= 97 && c <= 122 || c >= 65 && c <= 90 || c >= 48 && c <= 57 || c == 95))
					return false;
			}
			return true;
		}
		return false;
	}


	public static boolean regexPhone(String phone) {
		/**
		 * 1.手机号码验证 1.必须11位 2.必须全部是数字 3.第一位必须是1 4.第二位 必须是 3 5 7 8
		 * 
		 */

		// 1.必须先判断长度
		if (phone.length() != 11)
			return false;
		// 2.将字符串 分割成字符
		char[] cs = phone.toCharArray();
		// 3.判断是否是全数字 同时判断 第一位 和第二位的值
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];// 通过索引取出值
			// 判断是否是数字
			if (c >= 48 && c <= 57) {
				// 是否是第一个
				if (i == 0 && c != 49)
					return false;
				else if (i == 1) {
					if (!(c == 51 || c == 53 || c == 55 || c == 56))
						return false;
				}
			} else {
				// 不是数字
				return false;
			}

		}
	    	
		return true;
		
	}
	
	//qq号码
	 public static boolean regexQQ(String qq){
		/**
		 *  1.5-10位
		 *  2.必须是数字
		 *  3.不允许0开头  
		 */
		 //1.判断qq号码的长度
          if(!(qq.length()>=5&&qq.length()<=10))return false;
		 //2.字符串 转换成 字符类型
		   char[]cs=qq.toCharArray();
		 //3.判断字符是否是全数字 判断首位不能为0
		     //遍历取出字符
		   for (int i = 0; i < cs.length; i++) {
			   char c = cs[i];
			   //判断字符是否是纯数字
		       if(c>=48&&c<=57){
		    	   //第一位不能为0
		    	   if(i==0&&c==48){
		    		 return false;
		    	   }
		    	   
		       }else{
		    	   return false;
		       }
		   }
		   
		   //循环执行完毕
		   return true;
	 }
	 
	 public static String replace(String str,String newStr){
		 //1.将str转换成char数组
		   char[]arr=str.toCharArray();
		  //声明一个临时的字符串 用来合并替换 
		   String tmp="";
		 //2.遍历数组
		   for (int i = 0; i < arr.length; i++) {
			   char c = arr[i];
			  //1.判断是否是空串
			   if(tmp.length()==0){
				   tmp+=c;
			   }else{
				  //tmp中是否包含c 
				    if(tmp.contains(""+c)){
				       //包含 就继续合并	
				    	tmp+=c;
				       //判断是否是最后一位
				    	if(i==arr.length-1){
				    		str=str.replace(tmp,newStr);
				    	}
				    }else{//不包含c
				    	if(tmp.length()>1){//有叠词  tmp
				    		//替换新的值
				    	 str=str.replace(tmp, newStr);
				    	}
				        tmp=c+"";//重新赋值
				    }
				   
			   }
		   }
		 
		 
		 return str;
				 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(regexUser("ddddddddddddd_123A"));
		System.out.println(regexPhone("1983&113607"));
		System.out.println(regexQQ("146047566"));
		System.out.println(replace("深深深庭院深深深深深深几许", "Java"));
	}

}
