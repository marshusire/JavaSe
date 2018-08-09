package day18.generics;

public class GenericeDemo01 {

	/**
	 * ���ͷ��� 
	 *   һ�㶨��ķ�����һ�� 
	 *   //���Խ���
	 *   
	 */
	
	public static <T> void printList(T []arr){
		//��������
		 for (T t : arr) {
			System.out.print(t+" ");
		  }
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Integer[]arr={1,4,5,6,7};
		Double[]arr1={1.2,1.4,1.6,1.9};
		Character []arr2={'a','b','c','d'};
		//���÷��ͷ���
		printList(arr);
		printList(arr1);
		printList(arr2);
		
	}
	
	
}
