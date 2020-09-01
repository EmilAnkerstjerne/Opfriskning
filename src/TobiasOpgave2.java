import java.util.ArrayList;
import java.util.ArrayList;

public class TobiasOpgave2 {
    //Bog
    //Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.
    //Skriv flg. metoder:
    //• Constructor
    //• Getters og setters
    //• toString
    //Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.
    //• Indsæt tre forskellige bøger i Biblioteket
    //• Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter, og returnerer true,
    //hvis listen indeholder et Bog objekt med samme ISBN.
    public void kørprogram(){
        Bibliotek bib = new Bibliotek();
        Bog b1 = new Bog("1234567899876","bog 1","26-08-2020");
        Bog b2 = new Bog("9876543211234","bog 2","13-08-2020");
        Bog b3 = new Bog("1234432165432", "Bog titel her", "02-05-2000");
        bib.tilføjBog(b1);
        bib.tilføjBog(b2);

        bib.indeholder(b1);
        bib.indeholder(b2);
        bib.indeholder(b3);
        System.out.println(b1);
    }
}
class Bog {
    String ISBN;
    String titel;
    String år;

    public Bog(String ISBN,String titel,String år){
        this.ISBN = ISBN;
        this.titel = titel;
        this.år = år;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setTitel(String titel){
        this.titel = titel;
    }
    public void setÅr(String år) {
        this.år = år;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitel() {
        return titel;
    }
    public String getÅr() {
        return år;
    }

    @Override
    public String toString() {
        return "Bog: " + titel +
                "\nISBN: " + ISBN  +
                ", udgivelsesdato: " + år;
    }
}
class Bibliotek {
    ArrayList<Bog> a1 = new ArrayList<>();

    public void tilføjBog(Bog bog){
        a1.add(bog);
    }

    public boolean indeholder(Bog bog){
        boolean re = false;
        for(int i =0; i<a1.size(); i++){
            if (a1.get(i).getISBN().equals(bog.getISBN())){
                re = true;
                break;
            }
            else{
                re = false;
            }

        }
        System.out.println(re);
        return re;
    }
}

