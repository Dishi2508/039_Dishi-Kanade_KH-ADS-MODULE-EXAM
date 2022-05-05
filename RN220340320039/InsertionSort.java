import java.util.*;
class InsertionSort
{
	public static void main(String args[ ])
	{
		int n, i, j, loc, a1[ ], ptr, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter : ");
		n = sc.nextInt( );
		a1 = new int[n];
		
		System.out.println("Enter Elements to be sorted : ");
		for(i = 0; i<n; i++)
		{
			a1[i] = sc.nextInt( );
		}
		System.out.println("==================================");
		
		for(i = 1; i<=n-1; i++)
		{
			temp = a1[i];
			j = i-1;
			while(j>=0 && a1[j]>temp)
			{
				a1[j+1] = a1[j];
				j = j-1;
			}
			a1[j+1]= temp;
		}
		for(i = 0; i<n; i++)
		{
			System.out.print(a1[i] +" ");
		}
	}
}
