import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TobiasOpgave6 {
    //Sortering
    //Skriv en metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetisk
    //faldende orden på skærmen.
    //Hvis der indlæses:
    //abekat
    //musefælde
    //ananas
    //slut
    //solskin
    //skal der udskrives følgende på skærmen:
    //solskin
    //slut
    //musefælde
    //ananas
    //abekat
    public void kørprogram(){
        Sortering s = new Sortering();
        Scanner f = new Scanner(System.in);
        System.out.println("Skriv 5 ord, husk at trykke enter efter hvert ord: ");
        String ord1 = f.nextLine();
        String ord2 = f.nextLine();
        String ord3 = f.nextLine();
        String ord4 = f.nextLine();
        String ord5 = f.nextLine();
        s.sorter(ord1,ord2,ord3,ord4,ord5);
    }
}

class Sortering {

    ArrayList<String> ord = new ArrayList<String>();
    public void sorter(String ord1, String ord2, String ord3, String ord4, String ord5){
        ord.add(ord1);
        ord.add(ord2);
        ord.add(ord3);
        ord.add(ord4);
        ord.add(ord5);

        Collections.sort(ord);
        Collections.reverse(ord);

        System.out.println("Efter Sorting:");
        for(String counter: ord){
            System.out.println(counter);
        }
    }

}

