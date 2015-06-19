package example1;

import java.util.Arrays;


public class Converter {
    public static final String[] uniqueRomanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static final int[] uniqueArabicNumerals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            
    
    public String toRoman(int x){
        int number = x;
        String roman ="";
        while (number !=0){
            for (int i=0; i < uniqueRomanNumerals.length; i++){
                while (number >= uniqueArabicNumerals[i]){
                    roman+= uniqueRomanNumerals[i];
                    number-=uniqueArabicNumerals[i];
                }
            }
        };
        return roman;
    }
//    while the string length is longer than 0 keep looping.
//    if the first character matches a string in the array then move forward and check if the first and second 
//            characters are a match on the array, if so then use that and remove those two characters from the string
//                    repeat
    public int toArabic(String x){
        int arabic = 0;  
        String roman = x;
        while (roman.length() !=0){
            for (int i=0; i < uniqueRomanNumerals.length; i++){
                if (roman == uniqueRomanNumerals[i]){
                    arabic += uniqueArabicNumerals[i];
                    if (uniqueRomanNumerals[i].length() == 2){
                       roman = roman.substring(2);
                    }else{
                       roman = roman.substring(1);
                    }
                }
            }
        }
        return arabic;
        }
    
    }
    
}
