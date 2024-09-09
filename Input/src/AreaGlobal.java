public class AreaGlobal {

    int ar = 0;

    public void getArea(int l, int b) {
        ar = l * b;
        System.out.println("Your area is: " + ar);
    }

    public void getParameter(int h)
    {
        int param=ar*h;
        System.out.println("Your Patameter is: "+param);
    }

    public static void main(String[] args){
        AreaGlobal a=new AreaGlobal();
        a.getArea(25, 15);
        a.getParameter(64);
    }
}
