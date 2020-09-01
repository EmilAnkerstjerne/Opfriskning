import java.util.Scanner;

public class TobiasOpgave3 {
    //Hvor tit skal græsset slås
    //Om sommeren vokser græsset ca. 0,8 cm om dagen.
    //Skriv en metode, der tager imod 2 inputparametre: hvor langt græsset er lige nu og hvor højt det må være
    //for at skulle slås. Metoden skal beregne og returnere hvor mange dage der er til, at græsset skal slås næste
    //gang.
    //Hvor højt græsset er, når det skal slås, kan forstås på 2 måder.
    //1. Græsset skal overstige denne værdi, før vi starter græsslåmaskinen
    //2. Græsset skal slås, inden værdien overstiges
    //Du vælger selv hvilken løsning du vil implementere.
    //Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen.


    public void kørprogram(){
        Scanner f = new Scanner(System.in);
        System.out.println("Hvor langt er græsset nu?");
        double længdeInput = f.nextDouble();
        System.out.println("Hvor langt må græsset være?");
        double tilladtLængdeInput = f.nextDouble();

        Græsset g = new Græsset();
        g.skalGræssetSlås(længdeInput, tilladtLængdeInput);
    }
}

class Græsset {
    double gVækst = 0.8;
    double glTemp;
    int dage;

    public void skalGræssetSlås(double græslnu, double græsltilladt){
        if (græslnu > græsltilladt){
            System.out.println("Græsset er for langt og skal slås nu");
        }
        else if(græslnu<græsltilladt){
            glTemp = græslnu;
            while (glTemp<græsltilladt){
                glTemp = Double.sum(glTemp,gVækst);
                dage++;
                // Koden regner fra påbegyndt dag. Sådan at hvis vi siger græsset en dag er 10cm og må være 15cm
                // Det ville være 15 efter 6,25 dage, men den ville sige at det først skulle klippes efter 7 dage, fordi
                // den først klipper nå det er for langt, på den begyndte dag.
            }
            System.out.println("Græsset skal slås om " + dage + " dag(e)");

        }
        else if(græslnu==græsltilladt){
            System.out.println("Græsset er så langt det må være, så det skal klippes i morgen!");
        }

    }
}
