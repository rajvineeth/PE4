public class CharReplace {
    public String replace(String input){
        if(input == null)
            return null;

        input=input.replace('d','f');
        input=input.replace('l','t');
              return input;

    }
}
