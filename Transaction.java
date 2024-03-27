import java.util.Scanner;

public class Transaction implements InterfaceATM{
    float amt1=0;
    float amt2=0;
    float acbal=10000;
    Scanner sc=new Scanner(System.in);

    public void checkbal()
    {
        System.out.println("Available balance is: "+acbal);
    }
    public void deposit()
    {
        System.out.println("Enter amount to be deposited: ");
        amt1=sc.nextFloat();
        acbal=acbal+amt1;
        System.out.println("Amount credited..");
    }

    public void withdraw()
    {
        System.out.println("Enter amount to be withdrawn: ");
        amt2=sc.nextFloat();
        if(amt2%500==0)
        {
            if(amt2<acbal)
            {
                acbal=acbal-amt2;
                System.out.println("Amount debited..");
            }
            else
            {
                System.out.println("Insufficient Balance..");
            }
        }
        else
        {
            System.out.println("Please enter amount in denominator of 500");
        }

    }

    public void printreceipt()
    {
        System.out.println("Welcome !");
        System.out.println("Amount credited: "+amt1);
        System.out.println("Amount debited: "+amt2);
        System.out.println("Available balance: "+acbal);
        System.out.println("Thank You ! Visit Again !");
    }

    public void exit()
    {
        System.exit(0);
    }
}
