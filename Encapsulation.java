//Encapsulation

class BankAccount{
    private double balance=0;
    
    public void deposite(double dep){
        if(dep<=0){
            System.out.println("Invalid! enter vaild number");
        }
        else{
        balance+=dep;
        System.out.println("Deposite Succesfull!!\nBalance:"+balance);
        }

    }
    public void withdraw(double with){
        if(balance<with){
            System.out.println("Balance is too small !");
        }
        else{
            System.out.println("Withdraw succesfull!!");
            balance-=with;
            System.out.println("balance amount is:"+balance);
        }
    }
    
    public double getter(){
        return balance;
    }
}

public class inheritance{
    public static void main(String args[]){
        BankAccount b1=new BankAccount();
        
        b1.deposite(20000);
        b1.deposite(-10);
        b1.withdraw(200);
        b1.withdraw(22222);
    }
}