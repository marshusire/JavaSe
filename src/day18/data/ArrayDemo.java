package day18.data;

import java.util.Arrays;

public class ArrayDemo {
/**
 *         1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码.
           2):安排5个球员上场:[11,22,33,44,55].
           3):查询指定位置的球员的球衣号码是多少.查询索引位置为2的球衣号码是:33.
           4):根据球衣号码查询该球员在场上的索引位置. 44球衣号的球员在场上的索引位置是:3.
           5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333. 333把33替换了.
           6):替换球衣号码为22的球员,替换之后为222.
           7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位.).
           8):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55].
 */
  //属性
	private Integer[]player=new Integer[5];
	
  //1.添加元素
	public void addPlayerNum(int num){
	    //1.遍历数组
		  for (int i = 0; i <player.length; i++) {
			   Integer j = player[i];
			   //判断元素是否为null
			   if(j==null){
				 player[i]=num;
				 break;
			   }else if(i==player.length-1){
				  //对数组进行扩容
				    player= Arrays.copyOf(player,player.length+5);
			   }
		 }
	 }
	
	//2.返回索引处的值
	 public Integer searchByIndex(int index){
		 //返回索引处的值
		 return player[index];
	 }
	
	//3.根据内容查索引
	 public int searchByNum(Integer num){
		 for (int i = 0; i < player.length; i++) {
			 Integer integer = player[i];
			 if(integer==num)return i;
		 }
		 //没有查到
		 return -1;
	 }
	//4.替换球场上 某个位置的球衣
	 public void replaceFromIndex(int index,Integer num){
		   player[index]=num;
	 }
    //5.通过号码来替换球场上球衣
	 public void replaceFromNum(Integer oriNum,Integer desNum){
		 for (int i = 0; i < player.length; i++) {
			Integer integer = player[i];
			//判断是否相等
			if(oriNum==integer){
				player[i]=desNum;
			}
		} 
	 }
	//6.删除数组元素通过下标
	 public void deleteById(int index){
		//1.进行遍历 删除
		 for (int i =index; i < player.length; i++) {
			 if(index<=i&&i<player.length-1){
				//将后边的元素往前边来放
				 player[i]=player[i+1]; 
			 }
		 }
	   //4.重新减容
		  player=Arrays.copyOf(player,player.length-1);
	 }
	 //7.查看所有元素打印出来
	 public void list(){
		 System.out.print("[");	
		for (int i = 0; i < player.length; i++) {
			Integer integer = player[i];
			if(integer!=null){
			 System.out.print(integer+" ");	
			}
		}
		 System.out.println("]");	
	 }
	 
	 public static void main(String[] args) {
		//1.初始化一个对象 
		 ArrayDemo demo=new ArrayDemo();
		//2.球员依次上场
		 demo.addPlayerNum(11);
		 demo.addPlayerNum(22);
		 demo.addPlayerNum(33);
		 demo.addPlayerNum(44);
		 demo.addPlayerNum(55);
		 demo.addPlayerNum(66);
	    //3.查询索引球员
		 System.out.println(demo.searchByIndex(2));
		 System.out.println(demo.searchByNum(22));
		 
		 
	   //list
		 demo.list();
		//替换索引3位置的球衣
		 demo.replaceFromIndex(2, 333);
		 //根据内容替换球衣
		 demo.replaceFromNum(22, 222);
		 demo.list();
		 
		//删除指定位置的球员
		 demo.deleteById(2);
		//
		 demo.list();
		 
		 
	}
	 
	 
	
	
}
