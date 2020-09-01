import java.util.ArrayList;
import com.sun.deploy.util.ArrayUtil;
import java.util.ArrayList;
public class TobiasOpgave1 {
    //ArrayList
    //Skriv en metode med navnet doesArraylistContainString, der modtager 2 parametrer: en arrayliste og
    //en streng. Metoden returnerer en boolean:
    //• Hvis strengen ikke findes i arraylisten indsættes strengen i listen og metoden returnerer false
    //• Hvis strengen findes i arraylisten returnerer metoden true og printer ”The String has been found”

    public boolean doesArraylistContainString(ArrayList x, String y) {
        boolean re;
        if(x.contains(y)) {
            re=true;
            System.out.println("The string has been found");
            return re;
        }
        else {
            x.add(y);
            re=false;
            return re;
        }
    }

    public void kørprogram(){
        ArrayList<String> a1 = new ArrayList();
        a1.add("hee");
        doesArraylistContainString(a1,"hee");
    }
}



