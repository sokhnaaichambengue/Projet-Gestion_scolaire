public class Test {
    public static void main(String[] args) {
        Etudiant1 e =new Etudiant1();
        e.authentification();
        Administrateur a = new Administrateur();
        Etudiant2 r =new Etudiant2();
        r.donnerinformationetudiants();
        Cours c =new Cours();
        c.donnenomcours();
        a.ajoutercours();
        Notes n =new Notes();
        n.donnernotes();
        
    }
}
