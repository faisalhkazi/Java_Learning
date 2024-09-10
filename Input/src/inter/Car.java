package inter;

public class Car implements Automobile {

    public void break1()
    {
        System.out.println("Should be applied by leg");
    }

    public void accelrate()
    {
        System.out.println("Should be applied by leg");
    }


    public static void main(String args[])
    {
        Automobile a=new Car();

        a.break1();
        a.accelrate();
    }

}
