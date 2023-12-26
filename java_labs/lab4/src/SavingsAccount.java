public class SavingsAccount implements Account{
    private int balance = 50000;

    @Override
    public void deposite(int amount) {
        this.balance = amount;
    }

    @Override
    public void withdraw(int amount) throws Custom_Exception{

        if(amount> this.balance)
        {
            throw new Custom_Exception("Insufficient balance");
        }
    }
}
