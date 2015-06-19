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
        
        
//            if the number is greater than the biggest number take that
//            if (number >= uniqueArabicNumerals[i]){
//                roman+=uniqueRomanNumerals[i];
//                number-=uniqueArabicNumerals[i];
//            }
        
      
        return roman;
    }
    
}
