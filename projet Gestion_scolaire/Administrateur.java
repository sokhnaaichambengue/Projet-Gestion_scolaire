import java.util.Scanner;

public class Administrateur {
    String prenom;
    String nom;
    String cours[]=new String[5];
    int i=0;
    public Administrateur(){
        this.prenom=prenom;
        this.nom=nom;
    }

public void ajoutercours(){
    Scanner sc =new Scanner(System.in);
    System.out.println("ajouter des cours");
    cours[i]=sc.nextLine();
   
    }
}

