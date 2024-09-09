package Arrays;

public class FindLargestSmallestNumber {

    public static void main(String args[])
    {
        int numbers[] = {55, 669, 889, 747, 445, 664, 1125, 47, 5, 7789, 114, 556, 111, 75369, 112};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i=1; i < numbers.length; i++)
        {
            if (numbers[i] > largest)
            {
                largest = numbers[i];
            }
            else if (numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }
        System.out.println("The largest number is: " +largest);
        System.out.println("The Smallest number is: " +smallest);
    }

}
