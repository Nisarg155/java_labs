import java.util.Scanner;

class Tester {
void calculateSumOfEvenNumbers (int arr[])
{
	int n = arr.length;
	int sum = 0;
	for(int i = 0;i< n ;i++)
	{
	 if(arr[i]%2 == 0) sum += arr[i];
	}
	System.out.println("The sum is :- " + sum );
}
}

class res {
public static void main(String [] args)
{
	Scanner obj = new Scanner(System.in);
	Tester Obj = new Tester();
	System.out.print("Enter size of array ");
	int n = obj.nextInt();
	int arr[] = new  int[n];
	for(int i = 0;i<n ;i++)
	{
	System.out.print("Enter the element " + (i+1 ) +  " :- ");
        arr[i] = obj.nextInt();
	}
	Obj.calculateSumOfEvenNumbers(arr);
}
}
