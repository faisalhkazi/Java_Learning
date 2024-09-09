package Arrays;

public class AscendingOrder {

    public static void main(String args[])
    {
        int numbers[] = {55, 669, 889, 747, 445, 664, 1125, 47, 5, 7789, 114, 556, 111, 75369, 112};

        for (int i=0; i<numbers.length;i++)
        {
            System.out.println("Outer for:" +i);
            for (int j=i+1;j<numbers.length;j++)
            {
                System.out.println("Inner for:" +j);

                System.out.println("if ("+numbers[i]+") > ("+numbers[j]+")");
                if (numbers[i] > numbers[j])
                {
                    System.out.println("int temp=" +numbers[i]);
                    
                    int temp=numbers[i];
                    
                    
                    System.out.println("temp:" +temp);
                    System.out.println(numbers[i]+ "=" +numbers[j]);
                    
                    
                    numbers[i]=numbers[j];

                    System.out.println(numbers[j]+ "=" +temp);

                    numbers[j]=temp;

                }
            }
        }

        System.out.println("Ascending order list");
                    for (int i=0; i< numbers.length; i++)
                    {
                        System.out.println("Valuse are: " +numbers[i]);
                    }
    }

}
