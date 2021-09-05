import java.io.*;


class Sumofsq
{   int n;
    void getnum(int num)
    {
        n=num;
      
    }
    
}

class Result
{
    public static void main (String args[])
    {   
        Sumofsq s1=new Sumofsq();
        s1.getnum(10);
        int n=s1.n;
        int ans=(n*(n+1)*((2*n)+1))/6;
        System.out.println("Ans is " + ans);
    }
}
