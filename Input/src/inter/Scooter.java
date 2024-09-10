package inter;

public class Scooter implements Automobile {


    public void break1()
    {
        System.out.println("Should be applied by Hand");
    }

    public void accelrate()
    {
        System.out.println("Should be applied by Hand");
    }

    public static void main(String args[])
    {

        Automobile a=new Scooter();

        a.break1();
        a.accelrate();
    }

}
