package code;

public class Main {
    public static void main(String[] args){
        PT pt1 = new PT();
        PT pt2 = new PT();
        pt1.x = 1; pt1.y = 2;
        pt2.x = 0; pt2.y = 5;
        System.out.printf("1 точка: %d %d\n2 точка: %d %d",pt1.x,pt1.y,pt2.x,pt2.y);
    }
}
class PT{
    int x,y;
}
/*
1 точка: 1 2
2 точка: 0 5
 */