package Account;

public class Account {

    private String name;
    private int acc_no;
    private float amount;

    public void setData(int acc_no, String name, float amount){
        this.name = name;
        this.acc_no = acc_no;
        this.amount = amount;
    }

    // Deposit
    public void deposit(float amnt){
        amount += amnt;
        System.out.println("Deposited " +  amnt + " Your total Amount is now : " +  amount);
    }

    // Withdraw

    public void withdraw(float amnt){
        if(amount < amnt){
            System.out.println("Insufficient Balance");
        }else{
            amount -= amnt;
            System.out.println("You have withdrawn "+ amnt + " " +" your amount is now : " + amount);
        }
    }
    // Check Balance
    public void checkBalance(){
        System.out.println("Your balance is : " + amount);
    }

    // Check Account

    public void checkAccount(){
        String x = String.format("Your Account Number is : %s,  Your Name is:  %s  and your Amount is : %.1f", acc_no, name, amount);
        System.out.println(x);
    }


}
