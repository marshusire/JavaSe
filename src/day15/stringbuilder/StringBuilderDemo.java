package day15.stringbuilder;

public class StringBuilderDemo {
  /***
   * StringBuilder 
   *  1.可变字符串，内容改变引用地址是不会改变
   *  2.StringBilder 它不是线程安全的，不支持同步，读写速度比较快，一般不考虑线程安全的情况下
   *    尽可能使用该类
   *  3.该类和StringBuffer 功能方法一样 唯一区别，Stingbuffer 线程安全,支持线程同步，性能比较低
   */
	
	public static void main(String[] args) {
	   //1.初始化一个StringBuilder对象  空字符序列
		 StringBuilder str=new StringBuilder();
	   //2.在尾部追加字符
		 str.append(true);//将boolean类型转换成String类型  内容改变了,引用地址不变
		 str.append('你');//追加char
		 str.append(0.8); //追加double类型
		 str.append(11);  //追加一个int类型
		 str.append(new Object());//追加一个对象
		 char[]c={'张','大','胆','.'};
		 str.append(c);//追加一个char数组
		 str.append(c,1,3);//追加一个数组 从数组下标位置开始- 长度
		 str.append("喜欢你", 1, 2);//追加字符序列 ，从位置0开始 截取字符  结束下标[开始下标,结束下标）
	
	   //3.在指定位置插入数据
		 str.insert(1,'d');
		 str.insert(3,"舔瓶盖");
	
	   //4.替换 从某个位置开始 到 某个位置结束  替换指定的字符串【起始位置,结束位置)
		 str.replace(3,6,"喝酸奶");		  
		 System.out.println("=="+str);
		
	    //5.查询
		String ss= str.substring(10);//从字符序列 下标位置 一直截取到最后  返回一个String类型
		ss=str.substring(0,3);//从指定位置开始截取一个字符串[起始位置,结束位置)
		System.out.println(ss);
		//查询指定索引位置的字符
		 char cc=str.charAt(0);
		 System.out.println(cc);
		//查询指定字符 首次出现的索引位置
		  int index=str.indexOf("大胆");
		  System.out.println(index);
		//查询指定字符串 最后一次出现的索引位置
		  index=str.lastIndexOf("大胆");
		  System.out.println(index);
		 
		//删除指定的字符
		  str.delete(0, 5);//从指定位置 删除到结束  [起始位置,结束位置)
		  System.out.println(str);
		  str.deleteCharAt(0);//删除指定索引位置的字符
		  System.out.println(str);
		  
		//反转字符串
		  str.reverse();
		  System.out.println(str);
		  
		  

		
	}
	
	
	
	
}
