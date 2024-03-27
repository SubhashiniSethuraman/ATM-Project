import java.util.HashMap;
import java.util.Scanner;

public class Customer extends EncapATM{
    public void customerdet()
    {
        HashMap<String,Integer> ob=new HashMap<>();
        ob.put("ROHAN", 1234);
        ob.put("HANA", 5783);
        ob.put("VARUN", 3492);
        ob.put("SHINY", 8971);

        do {
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter name: ");
                setName(sc.next());
                String cname=getName().toUpperCase();
                if(!ob.containsKey(cname))
                {
                    System.out.println("Invalid name !");
                    System.exit(0);
                }
                System.out.println("Enter pin: ");
                setPin(sc.nextInt());
                int cpin=getPin();
                if(ob.get(cname)!=cpin)
                {
                    System.out.println("Wrong Pin !");
                    System.exit(0);
                }
                if(ob.containsKey(cname) && ob.get(cname)==cpin)
                {
                    System.out.println("Welcome !");
                    acctype();
                }
            }
            catch (Exception e)
            {
                System.exit(0);
            }
        }while(true);
    }

    public void acctype()
    {
        System.out.println("Press 1 for Savings Account");
        System.out.println("Press 2 for Current Account");

        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();

        switch (ch)
        {
            case 1: menu();
                    break;
            case 2: menu();
                    break;
            default: System.exit(0);
                    break;
        }
    }

    public static void main(String[] args) {
        Customer ob=new Customer();
        ob.customerdet();
    }
}
