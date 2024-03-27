import java.util.Scanner;

public class Options extends Transaction{
    public void menu()
    {
        System.out.println("Press 1 to Check Balance");
        System.out.println("Press 2 to Deposit");
        System.out.println("Press 3 to Withdraw");
        System.out.println("Press 4 to Print Receipt");
        System.out.println("Press 5 to Exit");

        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1: checkbal();
                    menu();
                    break;
            case 2: deposit();
                menu();
                break;
            case 3: withdraw();
                menu();
                break;
            case 4: printreceipt();
                menu();
                break;
            case 5: exit();
                break;
            default: exit();
                break;
        }
    }
}
