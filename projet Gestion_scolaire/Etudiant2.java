import java.util.Scanner;

public class Etudiant2 {
String prenom [] =new String[5];
String nom[]=new String[5];
String adressemail[] =new String[5];
int i=0;
public void donnerinformationetudiants(){
Scanner sc =new Scanner(System.in);
System.out.println("donner votre prenom");
prenom[i]=sc.nextLine();
System.out.println("donner votre nom");
nom[i]=sc.nextLine();
System.out.println("donner votre adresse email");
adressemail[i]=sc.nextLine();

System.out.println("fin d'authentification");
}


}
