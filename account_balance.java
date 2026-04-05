// problem:
// Write a program that reads account balance from the keyboard and then outputs the updated balance. The class should have a separate method to calculate the new account balance once the existing balance is given.

// Updating of the account balance should be as follows: 

// •	If the balance is greater than 50,000 Rupees, 8% is added to the balance. 
// •	If the balance is greater than 25,000 and less than or equal 50,000 Rupees, 5% is added to the balance. 
// •	If the balance is greater than 10,000 and less than or equal 25,000 Rupees, 2% is added to the balance. 
//	No addition for the accounts having balances less than 10,000 Rupees.


// get scanner object
import java.util.Scanner;
public class account_balance {
    public static double calculateBalance(double balance){
        if(balance>50000){
            balance=balance+(balance*0.08);
        }
        else if(balance>25000){
            balance=balance+(balance*0.05);
        }
        else if(balance>10000){
            balance=balance+(balance*0.02);
        }

        return balance;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // get user input
        System.out.print("Enter account balance: ");
        double balance=sc.nextDouble();

        // call the method
        double updatedBalance=calculateBalance(balance);

        // print the updated balance
        System.out.print("Updated balance: "+updatedBalance);

        sc.close();
    }
    
}

