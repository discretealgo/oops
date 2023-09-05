import java.lang.Math;
import java.util.Scanner;
public class accprog {
    public static void main(String args[]){
        int account_number;
        System.out.println("WELCOME TO YOUR ACCOUNT");
        System.out.println("Enter your account number:");
        Scanner sc=new Scanner(System.in);
        account_number=sc.nextInt();
        System.out.println("Thanks for giving your account number");

    }
}
class account{
    int account_no;
    int account_balance;
    public account(int account_no,int account_balance){
        this.account_balance=account_balance;
        this.account_no=account_no;
    }
    public int deposit(int amount){
        account_balance=account_balance+amount;
        return account_balance;
    }
    public int withdraw(int amount){
        account_balance=account_balance-amount;
        return account_balance;
    }
    public void display(){
        System.out.println("Balance of the account is:"+account_balance);
    }
}
class saving extends account{
    public int interest;
    public int year;
    public int account_balance;
    public saving(int interest,int year,int account_balance){
        super(account_balance, account_balance);
        this.interest=interest;
        this.year=year;
    }
    public double interest_calculate(int interest,int year,int account_balance){
        double interest_amount;
        interest_amount = account_balance*(Math.pow((1+(interest/4)),(4*year)));
        return interest_amount;
    }
}
class current extends account{
    public current(int account_balance){
        super(account_balance, account_balance);
    }
    public int withdrawc(int amount){
        if(amount>100000){
            System.out.println("The limit of withdrawal is reached");
        }
        else{
            super.withdraw(amount);
        }
        return amount;
    }
}
