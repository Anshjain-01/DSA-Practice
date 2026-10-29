public class acount {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(22111, 8000);
        b1.deposit(200);
        System.out.println("Your balance is "+b1.getBalance()); 
        b1.withdrawn(9000);
        b1.withdrawn(900);
       System.out.println("Your balance is "+b1.getBalance()); 
    }
}
class BankAccount{
        private int accountNumber;
        private float balance;
        BankAccount(int accountNumber,float balance){
            this.accountNumber=accountNumber;
            // this.balance=balance;
            this.balance=Math.max(balance,0);
        }

        void deposit(float amount){
            if(amount<=0){
                System.out.println("Invalid deposit amount");
                return;
            }
            balance+=amount;
            System.out.println("now Your balance is :"+balance);
        }
        void withdrawn(float amount){
            if(amount<=0){
                System.out.println("Invalid withdrawal amount");
            }
         else if(amount>balance){
            System.out.println("Insufficient balance");
          }
          else{
            balance-=amount;
             System.out.println("Now Your balance is :"+balance);
          }
        }
        float getBalance(){
            return balance;
        }
}