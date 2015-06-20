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

    public int toArabic(String x){
        int arabic = 0;  
        
        for (int i=0; i < x.length(); i++){
            for(int j=0; j<=uniqueRomanNumerals.length-1; j++ ){
                char letter = x.charAt(i);
                String str = Character.toString(letter);
                if (uniqueRomanNumerals[j].equals(str)){
                    arabic+= uniqueArabicNumerals[j];
                }
            }
        }
        
        int fourAndNineCount = x.split("IV", -1).length-1;
        fourAndNineCount += x.split("IX", -1).length-1;
        
        int fourtyAndNintyCount = x.split("XL", -1).length-1;
        fourtyAndNintyCount += x.split("XC", -1).length-1;
        
        int fourHunderedAndNineHunderedCount = x.split("CD", -1).length-1;
        fourHunderedAndNineHunderedCount += x.split("CM", -1).length-1;
        
        arabic -= fourHunderedAndNineHunderedCount*200;
        arabic -= fourtyAndNintyCount*20;
        arabic -= fourAndNineCount*2;
        
        return arabic;
        }
    }
    

