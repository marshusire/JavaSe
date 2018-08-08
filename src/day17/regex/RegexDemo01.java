package day17.regex;

public class RegexDemo01 {

	public static void main(String[] args) {
		//1.split 分割
		  String  str="轻轻我将来,离开了你你你,请将眼角角,的泪拭去-齐秦";
		//2.以逗号进行分割
          String reg="将";
          reg="(.)\\1";//以叠词进行分割
         //3.分割 
          String[]list=str.split(reg);
          for (String string : list) {
		   System.out.println(string);	
	      }
          
         //替换 replace
         //替换叠词  //选择第一组规范 +1次以上
          reg="(.)\\1+"; 
          str=str.replaceAll(reg, "Java");
          System.out.println(str);
          
          //匹配身份证号号码 ？三代
          // ((a)(f)(s)(d)f)d
          
  
          
	}

}
