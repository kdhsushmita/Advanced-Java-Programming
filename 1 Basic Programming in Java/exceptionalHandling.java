package Labsheet;

public class exceptionalHandling {
	public static void main(String[] args) {
		int a=1,b=0;
		try {
			int res=a/b;
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught"+e.getLocalizedMessage());
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
