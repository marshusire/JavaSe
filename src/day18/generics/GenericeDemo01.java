package day18.generics;

public class GenericeDemo01 {

	/**
	 * 泛型方法 
	 *   一般定义的方法是一致 
	 *   //可以接受
	 *   
	 */
	
	public static <T> void printList(T []arr){
		//遍历数组
		 for (T t : arr) {
			System.out.print(t+" ");
		  }
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Integer[]arr={1,4,5,6,7};
		Double[]arr1={1.2,1.4,1.6,1.9};
		Character []arr2={'a','b','c','d'};
		//调用泛型方法
		printList(arr);
		printList(arr1);
		printList(arr2);
		
	}
	
	
}
