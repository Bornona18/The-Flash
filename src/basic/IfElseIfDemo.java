package basic;

public class IfElseIfDemo {
	
	public static void main(String []args) {
		
		int x =10;
		int y= 15;
		
		int sub=0;
		
		if(x>y)
			sub =x-y;
		else if(y>x)
			sub =y-x;
		else if(x==y)
		    sub=1 ;
		else 
			sub= 0;
		
		System.out.println(sub);
		
		
		
		
		
	}

}
