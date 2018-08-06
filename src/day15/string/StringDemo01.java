package day15.string;

import java.io.UnsupportedEncodingException;

public class StringDemo01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	  //1.创建一个字符串 通过构造方法	
		String str=new String();//创建一个空字符串
		System.out.println(str.isEmpty());//判断字符串是否是一个空串""
		System.out.println(str.length());//获取字符串的长度
		
		byte[]b={1,3,4,5};
		
		str=new String(b);//将byte数组中转成一个字符串
		System.out.println(str);
		str=new String(b,"UTF-8");//指定编码格式
		System.out.println(str);
		char[]c={'a','b','c','d','e'};
		str=new String(c,1,4); //将数组 c 从下标1开始 截取长度4 转成String类型
		System.out.println(str);
		
		 char cr= str.charAt(0);//获取指定索引的 char字符
		 System.out.println(cr);
		
		//返回一个负数  表示字符串 小于 另一个字符串 等于0 相等       大于1
		 int result=str.compareTo("ebcd");   //比较字符串   大于(正数)  等于（0）  小于(负数)
		 result=str.compareToIgnoreCase("BCDE");
		 System.out.println(result);
		
		//判断字符串是否包含某个字符串
		  System.out.println(str.contains("bc"));
		  System.out.println(str.equalsIgnoreCase("BcdE"));//比较字符串 不区分大小写
		  System.out.println(str.equals("BCde"));//比较字符串区分大小写
		
		  //静态方法 将char 数组转换成String
		  str=String.copyValueOf(c);
		  System.out.println(str);
		  
		  //判断字符串以已结尾
		  System.out.println(str.endsWith("de"));
	      //以某个字符串为前缀
		  System.out.println(str.startsWith("ab"));
		  
		  //字符串查询 indexof()查询字符所在字符串第一次出现的索引
		  System.out.println(str.indexOf('b'));
		  System.out.println(str.indexOf("cd"));//字符串首次出现的位置
		  //最后一次出现的位置
		  System.out.println(str.lastIndexOf('b'));
		  System.out.println(str.lastIndexOf("de"));
		  
		  //字符串 小写转大写  大写转小写  生成新的字符串
		    System.out.println(str.toUpperCase());//转换成大写
		    System.out.println(str.toLowerCase());//大写转换成小写	
		  
		    
		    //截取字符串
		     System.out.println(str.substring(2));//从下标2开始截取子串
		     System.out.println(str.substring(1, 3));//从下标1开始截取 到 下标三结束[1,3)
		 
		    //分割字符串 返回一个数组
		       str="轻轻的你走了,犹如你轻轻的来,我挥一挥衣袖不带走一片云彩";
		       String list[]=str.split(",");
		       for (String string : list) {
				System.out.println(string);
			 }
		    
		    //替换
		       System.out.println(str.replace("轻轻", "扭扭"));
		    
		
	}
	
	
	
}
