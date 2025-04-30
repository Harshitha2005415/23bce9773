import java.util.*;
class Happy{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=happy(n);
        if(a==1||a==7) System.out.print(true);
        else System.out.print(false);
    }
    public static int happy(int n){
        if(n<10) return n;
        int k=0;
        while(n>0){
            int r=n%10;
            k+=r*r;
            n=n/10;
        }
    return happy(k);
    }
}
