package day11.exception;

public class ExceptionDemo01 {
	
	/***
	 *  �����쳣          
	 *  try{
	 *    //�п��ܳ����쳣�Ĵ���
	 *  }catch(Exception e){
	 *    //�����쳣
	 *  }finally{//����
	 *    //���������쳣 ���ջ���Ҫִ��
	 *  }
	 *
	 *  try ����� catch ����finally���ʹ�� ��һtry����ʹ��
	 * @param args
	 */
	

	public static void main(String[] args) {
		 
		//������������
		  int num=1;
		  int num1=1;
		  int[]arr=new int[1];
		  
		  
		try{//����п��ܳ����쳣�Ĵ���
		  System.out.println(num/num1);  //��������쳣,û�ж��쳣�������´��뽫����ִ��
		}catch(ArithmeticException e){
			
		}catch (ArrayIndexOutOfBoundsException e){
			// TODO: handle exception
		}catch(Exception e){//�����쳣  ���쳣���д��� ����֤�����������
			   //�����쳣
				 System.out.println(e.getMessage());//��ȡ���쳣����Ϣ
				//�쳣���е���Ϣ��ӡ����
				 e.printStackTrace();//��ӡ������еĶ�ջ����Ϣ
	    }
		 
		 System.out.println("hello   =====");
		 /**
		  * try��finally���ʹ��
		  * 
		  * */
	
		  try{
			  //�п��ܳ����쳣�Ĵ���
			   arr[0]=1;
			  // arr[1]=2;
		  }finally {
			  //���������쳣����ִ�иô����  ���û��catch��� �����쳣�󣬴���ִ�л���ϣ������ж�
			  System.out.println("����");
		   }
		      System.out.println("finally");
		 
		
		   /**
		    * 
		    * try{
		    *   ���ܳ����쳣�Ĵ����
		    * }catch(�쳣����1){
		    *    //�����쳣����1
		    * }catch(�쳣����2){
		    *    //�����쳣����2
		    * }finally{
		    *    //����Ҫִ�еĴ���
		    * }
		    * 
		    * catch �������쳣��ʱ��
		    *       �������쳣  ��������
		    * 
		    * 
		    * 
		    * */   
		      
		      try{
		    	//�п��ܳ����쳣�Ĵ����  
		    	  System.out.println(num/num1);  //�����쳣
		    	  System.out.println(arr[1]);    //�����±�Խ���쳣  
		      }catch (ArithmeticException e) {
				//�����쳣
		    	  e.printStackTrace();//��ӡ�����ǰ��ջ���쳣��Ϣ
			  }catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				   e.printStackTrace();
		      }catch(Exception e){
		    	  
		      }finally{
				  System.out.println("����ִ�еĴ����");
			  }
		      
		      
		      
		      
		      
		      
		      
		      
		      

	}

}
