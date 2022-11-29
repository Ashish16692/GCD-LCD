import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.println("enter the s number");
    int s=scanner.nextInt();

    System.out.println("enter the g number"); 
    int g= scanner.nextInt(); 
        int r=s*g;
    while(g%s!=0){
    int rem= g%s;
    g=s;
    s=rem;
   }

    System.out.println("GCD:"+s);
    if(s>g){
        s=s-g;

    }
    else{
        g=g-s;
    }

    System.out.println("LCM:"+r/s);
    scanner.close();

    }

}
