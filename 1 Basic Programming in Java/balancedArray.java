package Labsheet;

public class balancedArray {
	public int checkBalanced(int[] numbers) {
		for(int i=0;i<numbers.length;i++)
		{
			if(i%2==0&&numbers[i]%2==0)
			{
				continue;
			}
			else if(i%2==1&&numbers[i]%2==1) {
				continue;
			}
			else {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		balancedArray arr=new balancedArray();
		int a[]= {0,1,2,3,4,5,6};
		System.out.println(arr.checkBalanced(a));
		
	}
}
