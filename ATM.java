import java.util.Scanner;

class ATM {
    public static void main(String[] args) {

        int balance = 5000, Withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        
        int pincode = 333;
        System.out.print("enter your pin number: ");
         pincode = sc.nextInt();
        if (pincode != 333) {
            System.out.println("pin number is wrong ");
            System.exit(0);
        }
        if (pincode== 333) {
            while (true) {
                System.out.println( "..... Welcome to Account .....");
                System.out.println("option 1 for Withdraw");
                System.out.println("option 2 for Deposit");
                System.out.println("option 3 for Check Balance");
                System.out.println("option 4 to Quit" );
            
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                    
                        System.out.print("Enter amount for withdrawn: ");
                        Withdraw = sc.nextInt();
                        if (balance >= Withdraw) {
                            balance = balance - Withdraw;
                            System.out.println("now Your balance is " + balance );
                        } else {
                            System.out.println("Balance is not sufficient");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        
                        System.out.print("Enter deposit amount: ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Total balance is : " + balance );
                        System.out.println("Your amount is successfully deposit");
                        System.out.println("");
                        break;

                    case 3:
                     
                        System.out.println(" Your Balance is : " + balance);
                        System.out.println("");
                        break;

                    
                    case 4:
                        System.exit(0);

                }
            }
        }
    }
}