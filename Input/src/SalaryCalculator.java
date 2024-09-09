public class SalaryCalculator {

    public int getGross(int basic, int hra)
    {
        int GrossSal=basic+hra;
        System.out.println("Your Gross Salary is: "+GrossSal);
        return GrossSal;
    }

    public int getDeduct(int tax, int loan)
    {
        int Deduction=tax+loan;
        System.out.println("Your Deduction is: " +Deduction);

        return Deduction;

    }

    public void NetSal(int GrossSal, int Deduction)
    {
        int netsalary=GrossSal-Deduction;
        System.out.println("your net Salary is: "+netsalary);
    }

    public static void main(String[] args) {

        SalaryCalculator s = new SalaryCalculator();
        int  a=s.getGross(50000, 45000);
        int b=s.getDeduct(200, 30000);

        s.NetSal(a,b);

    }
}
