import java.util.Arrays;
public class Sort {
    public String SortString(String string){
        if(string == null)
            return null;
        String strArray[] = string.split("//s");
        Arrays.sort(strArray);
        return String.join(" ",strArray);


    }
}
