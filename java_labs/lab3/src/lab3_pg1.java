import java.util.*;

class NumberClass {
    private int value ;
    private boolean[] isprime;

    NumberClass(int val)
    {
        this.value = val;
        this.isprime = new boolean[val + 1];
        for(int i = 0;i<=val;i++) isprime[i] = true;
    }

    boolean isPrimeNumber()
    {

        isprime[0] = isprime[1] = false;
        for(int i = 2;i<=value ; i++)
        {
            if(isprime[i])
            {
                for(int j = 2*i ; j<=value;j += i)
                {
                    isprime[j] = false;
                }
            }
        }

        return isprime[value];
    }
}

class lab3_pg1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = obj.nextInt();
        NumberClass c1 = new NumberClass(n);

        if(c1.isPrimeNumber())  System.out.print("Number is prime");
        else System.out.print("number is not prime ");

    }

}
