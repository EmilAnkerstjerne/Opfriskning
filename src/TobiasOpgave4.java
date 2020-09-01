public class TobiasOpgave4 {
    //Kvadrat
    //Skriv en metode, der som parameter modtager et heltal. Metoden skal udskrive et kvadrat på skærmen
    //svarende til heltallet. I det følgende eksempel er tallet 6 modtaget som parameter til metoden:
    //* * * * * *
    //* * * * * *
    //* * * * * *
    //* * * * * *
    //* * * * * *
    //* * * * * *
    //• Udvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen

    public void kørprogram(){
        Kvadrat k = new Kvadrat();
        k.lavKvadrat(6,"u");
    }
}
class Kvadrat {

    public void lavKvadrat(int strIn, String tegn){

        for(int i=0; i<strIn; i++){
            for(int u=0;u<strIn; u++){
                System.out.print(tegn+"  ");
            }
            System.out.println();
        }

    }
}
