package try1;
import java.util.Random;
public class Pass {
    public static void main(String[]args){
         String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String lower = "abcdefghijklmnopqrstuvwxyz";
         String num = "0123456789";
         String all= upper+lower+num;
         String  s1="";
         Random rand1=new Random();
         int r1=rand1.nextInt(0,25);
         int r2=rand1.nextInt(0,9);
         s1=s1+upper.substring(r1,r1+1)+lower.substring(r1,r1+4)+num.substring(r2,r2+3);
         System.out.println(s1);



   }
}
