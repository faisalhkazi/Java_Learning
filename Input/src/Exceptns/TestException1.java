package Exceptns;

public class TestException1 {

    public static void main(String args[])  throws Exception
    {
        int a = 10;
        int b = 7;
        int c = 5;
        int x = 0;

        try
        {
            System.out.println("One");
            x= a/(b-c-2);
            System.out.println("From try x: "+x);
        }

        catch(ArithmeticException e) 
        {
            System.out.println("My message cannot be division by Zero");
            e.printStackTrace();

            x=a/1;
            System.out.println("Alternate code for catch: " +x);
        }

        finally
        {
            System.out.println("Two: ");
            int y=a/(b-c);
            System.out.println("Y: " +y);
        }
    }

}
