package day10.test03;

public class Foods extends Goods{
    
    @Override
	public void printPirce() {
	 //打印 价格	
    	System.out.println("食品的价格是"+this.getPrice());
	}
	
}
