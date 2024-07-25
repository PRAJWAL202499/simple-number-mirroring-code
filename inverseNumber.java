import java.util.*;
public class inverseloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("give a number which you wanna inverse: " + " ");
        int num = sc.nextInt(); //10899
        while(num>0){
             int mod = num % 10;
            System.out.print(mod);
            num/=10;
           }
   }
}
