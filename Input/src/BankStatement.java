public class BankStatement {

    static int bal;

    public void deposite(int acno, int amt)
    {
        if(acno == 1)
        {
            bal += amt;
        }
        else
        {
            System.out.println("Invalid..");
        }
    }

    public void witdraw(int acno, int amt)
    {
        if(acno == 1)
        {
            bal -= amt;
        }
        else
        {
            System.out.println("Invalid..");
        }
    }

    public void balance(int acno)
    {
        if(acno == 1)
        {
            System.out.println(bal);
        }
        else
        {
            System.out.println("Invalid..");
        }
    }

    public static void main(String[] args)
    {
        BankStatement online=new BankStatement();
        online.deposite(1,6000);
        online.witdraw(1,1000);
        online.balance(1);

        BankStatement offline=new BankStatement();
        offline.deposite(1, 90000);
        offline.witdraw(1, 50000);
        offline.balance(1);
    }
}
