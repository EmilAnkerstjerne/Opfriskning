import java.util.ArrayList;

public class TobiasOpgave7 {
    //Søgning
    //Skriv en metode, der som parametre modtager et array af typen String samt en String.
    //Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen, hvis
    //strengen findes i arrayet og –1 hvis strengen ikke findes i arrayet.
    //Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du i stedet kaster en exception.

    public void kørprogram(){
        ArrayList<String> a = new ArrayList<String>();
        Søgning s = new Søgning();
        // Strings tilføjet hardcoded ind
        a.add("Hey");
        a.add("test");
        a.add("test2");

        s.søg(":D",a);
    }
}
class Søgning {

    public int søg(String tekst, ArrayList<String> a){
        if (a.contains(tekst)){
            //for testing purpose, har jeg tilføjet et udprint til konsollen.
            System.out.println(a.indexOf(tekst));
            return a.indexOf(tekst);
        }
        else{
            System.out.println(-1);
            return -1;
        }
    }
}
