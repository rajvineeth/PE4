package com.company;

public class Occurance {
    public int countOccurance(String input,char ch)
    {
        int count = 0;
        for(int i=0; i< input.length();i++){
            if(input.charAt(i) == ch){
                count++;
            }

        }
        return count;

    }
}
