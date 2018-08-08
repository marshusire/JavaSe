package day17.regex;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo02 {

	public static void main(String[] args) {
	   //1.创建一个正则表达式
		 String reg="1[3578]\\d{9}";//规则
		 String str="18838113607";//要匹配的字符串
		 boolean r=str.matches(reg);
		 System.out.println(r);
		
	   //正则表达式 匹配器方式来
		 //1.通过 reg正则字符创建 创建一个Patter对象
		   Pattern p=Pattern.compile(reg);
		 //2.关联要操作的字符串，获取一个匹配器对象
           Matcher m=p.matcher(str);
         //3.匹配字符是否合法
           System.out.println(m.matches());
         //4.替换字符串
           System.out.println(m.replaceAll("beautiful"));
        
         //5.如果要分割字符串
           Pattern p1=Pattern.compile("3");//规则转换成对象
           String strs[]=p1.split("18838113607");//要分割那个字符串
           for (String string : strs) {
			System.out.println(string);
		   }
           
        /**
         * 组的捕获
         * 组 一对小括号() 
         * (A(B(C(D)))(E))
         *  1. ABCDE
         *  2. bcd
         *  3. CD
         *  4. D
         *  5. E
         */
           
         str="18838113607";//操作的字符串   
         //划分组 正则
         reg="(1)([3578])(\\d{9})";
         //将正则转换成Patter对象
         Pattern p2=Pattern.compile(reg);
       //2关联要操作的字符串 返回一个Matche对象
         Matcher m1=p2.matcher(str);
         //匹配成功
         //System.out.println(m1.matches());
       //3.捕获组
         // m1.find();//查找是否有更多的子序列
          System.out.println(m1.groupCount());//返回组的总数
             m1.find();//查找组
          //while(){
             System.out.println(m1.group());//默认获取第0组子串
        	 System.out.println("第一组"+m1.group(1));//获取组的子串
        	 System.out.println("第二组"+m1.group(2));
        	 System.out.println("第三组"+m1.group(3));
        	 //获取组的开始索引 和结束索引
        	 System.out.println(m1.start(2)+"  end"+m1.end(2));
          //} 
         
           
         //身份证 号码验证  
           reg="[1-8]\\d{5}(\\d{4})(\\d{2})(\\d{2})\\d{3}[0-9X]"; 
           String scard="41045719900110587X"; 
         //1先将正则转换成 Patter对象
           p=Pattern.compile(reg);
          //2.关联要操作的字符串，获取一个Matcher对象
           Matcher m3=p.matcher(scard);
          //3.查找
           if(m3.find()){
        	 //捕获组
        	   System.out.println("总共"+m3.groupCount()+"组");
        	   System.out.println("第一组"+m3.group(1));//年
        	   System.out.println("第二组"+m3.group(2));//月
        	   System.out.println("第三组"+m3.group(3));//日
           }
           
           
	}

}
