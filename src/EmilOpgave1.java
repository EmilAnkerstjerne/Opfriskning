import java.util.ArrayList;

public class EmilOpgave1 {
    public boolean doesArraylistContainString(ArrayList arrayList, String string){
        boolean contains;
        if(arrayList.contains(string)){
            contains = true;
            System.out.println("The String has been found");
            arrayList.add(string);
        }
        else{
            contains = false;
        }
        return contains;
    }
    public void koerProgram(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hej");

        doesArraylistContainString(arrayList, "Hej");

    }
}
