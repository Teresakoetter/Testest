import com.sun.source.util.SourcePositions;
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean length = lengthTest("dlfjggggfgjhgjghjghdjgghkfdjh");
        System.out.println(length);
        boolean fancy = fancyCheck("schalafancyschala");
        System.out.println(fancy);
        //boolean cM = callM();
        //System.out.println(cM);
        callM();
        //both("kdfjghfdkjghfjk");
        System.out.println(both("akdjfgfanchfdkfkjh"));

        }

        public static boolean lengthTest (String word){
        if(word.length() > 2){
            return true;
        }else{
            return false;
        }
        }
        public static boolean fancyCheck(String word){
        if(word.contains("fancy")){
            return true;
        }else{
            return false;
        }

        }
        public static  void callM (){
            System.out.println(lengthTest("akdfjghkf"));
        }

        public static boolean both(String word){
        return lengthTest(word) && fancyCheck(word);
        }

        }





