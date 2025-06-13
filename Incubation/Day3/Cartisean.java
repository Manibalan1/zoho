public class Cartisean {
    public static void main(String[] args) {

        int x1 = 1, y1 = 1, x2 = 7, y2 = 1 , x3 =7 , y3 = 5, x4 =1 ,y4= 5 ;
        int x5 = 2, y5 = 2,x6 = 10,y6 = 2, x7 = 2 ,y7 = 7,x8= 7,y8 = 5;

        if ((x6 >= x1 && x6 <= x2) || (x4 >= x1 && x4 <= x2) || (x8 >= x3 && x6 <= x1) ||
                (x8>=x3 && x8<=x6)|| (x5 >= x2 && x5 <= x4) ||(x5>=x8 && x5<=x4)||(x7 <= x4 && x7 >= x2))
        {
            System.out.println("overlap");
        }
        else
        {
            System.out.println("no");
        }
    }
}