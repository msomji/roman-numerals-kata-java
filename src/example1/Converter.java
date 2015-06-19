package example1;


public class Converter {


    public String toRoman(int x){
        if (x == 1) {
            return "I";
        }else if (x == 2){
            return "II";
        }else {
            return "III";
        }
    }
    
}
