package package4;

import java.util.Arrays;

public class Check {
    public String getTranspose(String s){
        StringBuffer result = new StringBuffer();
        String[] arr = s.split("\\s");
        String[] t = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            t[i] = new StringBuilder(arr[i]).reverse().toString();
            System.out.print("");
        }
        String str = Arrays.toString(t);
        str = str.substring(1, str.length()-1).replace(",", "");



        return str;
    }
}

