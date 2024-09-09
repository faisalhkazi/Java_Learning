package Arrays;

public class PiramidString {

    public static void main(String args[])
    {
        String piramid = "Manchester_United";

        int len = piramid.length();

        System.out.println("Length: "+piramid);

        char tempCharArray[] = new char[len];

        for (int i=0; i<len; i++)
        {
            tempCharArray[i] = piramid.charAt(i);

        }

        char c[][] = new char [len] [len];

        for(int row = 0; row < len; row++)
        {
            for (int col=0; col <= row; col++)
            {
                c[row][col] = tempCharArray[col];
                System.out.print(" "+c[row][col]);
            }
            System.out.println(" ");
        }
    }

}
