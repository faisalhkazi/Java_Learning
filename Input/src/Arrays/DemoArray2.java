package Arrays;

public class DemoArray2 {

    public static void main(String[] args)
    {
        String a[][] = { {"Manchester United", "Chelsea", "Liverpool"}, {"Real Madrid", "Barcelona"}, {"AC Milan", "Athletico Madrid", "real Betis", "Athletico bilbao"}
    };
    for(int row=0;row<a.length;row++)
    {
        for(int col=0;col<a[row].length;col++)
        {
            System.out.print(a[row][col] +" ");
        }
        System.out.println(" ");
    }

        
    }

}
