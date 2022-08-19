class LessBalanceException extends Exception{
    double bal;
    LessBalanceException(double b) {
        bal=b;
    }
    public String toString() {
        return "\nWithdraw amount Rs. "+bal+" not valid\n"; 
    }
}
class Account {
    double balance;
    Account() {
        balance=500;
    }
    public void deposite(double amt) {
        balance=balance+amt;
        System.out.println("\nSuccessfully Deposited Rs. "+amt+"!!");
    }
    public void withdraw(double amt) throws LessBalanceException {
        double temp=0;
        temp=balance-amt;
        if(temp<500)
           throw new LessBalanceException(amt); 
        else {
            balance=balance-amt;
            System.out.println("\nSuccessfully Withdrawn Rs. "+amt+"!!");
        }
    }
}
class test {
    public static void main(String args[]) {
        try{
            Account obj1 = new Account();
            Account obj2 = new Account();
            System.out.println("\n-----ACCOUNT 1-----");
            obj1.deposite(5000.0);
            obj1.withdraw(2000.0);
            System.out.println("\n-----ACCOUNT 2-----");
            obj2.deposite(7000.0);
            obj2.withdraw(8000.0);
        }
        catch(LessBalanceException e) {
            System.out.println(e);
        }
    }
}
