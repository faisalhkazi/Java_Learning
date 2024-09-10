package Package_learning;

public class parent1 {


    public void publicmethod()
    {
        System.out.println("This is the Public method from Parent1");
    }

    protected void protectedmethod()
    {
        System.out.println("This is the Protected method from Parent1");
    }

    void defaultmethod()
    {
        System.out.println("This is the defualt method from Parent1");
    }

    private void privatemethod()
    {
        System.out.println("This is the private method from Parent1");
    }


    public static void main(String args[])
    {

        parent1 p1= new parent1();
        p1.publicmethod();
        p1.protectedmethod();
        p1.defaultmethod();
        p1.privatemethod();

    }

}
