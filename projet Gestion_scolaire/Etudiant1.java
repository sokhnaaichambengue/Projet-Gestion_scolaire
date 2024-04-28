public class Etudiant1 {
    String prenom;
    String nom;

    public Etudiant1(){
        this.prenom=prenom;
        this.nom= nom;
        
    }
    public void authentification(){
        System.out.println("demande page");
        System.out.println("retourne page");
        System.out.println("demande d'authentification");
        if("authentification"=="prenom"&& "authentification"!="nom"&& "authentification"=="adresseemail"){
            System.out.println("vous ne pouvez pas vous authentifier");
        }
        else{
            System.out.println("vous  pouvez vous authentifier");
        }
    }

    
}

