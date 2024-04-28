
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Decoration{
    public static void main(String[] args) {
        JFrame f =new JFrame("Interface utilisateur");
        f.setSize(300,100);
        JPanel pannel = new JPanel();
        JTextField b =new JTextField("saisir votre prenom");
        pannel.add(b);
        f.getContentPane().add(pannel);
        f.setVisible(true);
        JTextField c =new JTextField("saisir votre nom");
        pannel.add(c);
        f.getContentPane().add(pannel);
        f.setVisible(true);
        JTextField d =new JTextField("saisir votre adresse email");
        pannel.add(d);
        f.getContentPane().add(pannel);
        f.setVisible(true);
        JButton e =new JButton("Envoyer");
        f.getContentPane().add(e);
        






        
    

        




        
        
    


    }
}