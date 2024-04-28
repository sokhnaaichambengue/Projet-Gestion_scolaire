import java.util.Scanner;

public class Notes {
    int notes;
    int m=6;
    int i=0;
    int note[] =new int[m];
    public void donnernotes(){
        Scanner sc =new Scanner(System.in);
        System.out.println("donner les notes");
        note[i]=sc.nextInt();
    }
}
