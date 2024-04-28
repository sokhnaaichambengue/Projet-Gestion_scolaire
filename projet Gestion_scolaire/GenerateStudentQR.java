import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.Document;

public class GenerateStudentQR {
public static void main(String[] args) {
    Document document = new Document() ;
    //Informations de l'etudiant
    String prenom="aicha";
    String nom ="Mbengue";
    int age =21;
    String sexe="feminin";
    String adressemail ="aicha@19gmail.com";
    int numtel=774150895;
    String cours ="java";
    int notes=18;
     String informationsEtudiant= "nom:" +nom+ "\nprenom:" +prenom+ "\nage:"+age+ "/nsexe:"+sexe +"adressemail:"+adressemail+"/nnumtel"+numtel+"/ncours:"+cours+
     "/notes:"+notes;
     try{
        PdfWriter =PdfWriter.getInstance(document ,new FileOutputStream("sTUDENT.PDF"));
        document.open();
        PdfContentByte cb =Writer.getDirectContent();
        BarcodeQRCode qrcode = new BarcodeQRCode(informationsEtudiant ,100 ,null);
        document.add(qrcode.getImage());
     }catch(DocumentException |IOException e){
        e.printStackTrace();
     }finally{
        document.close();
     }
     }
        
    };
    


