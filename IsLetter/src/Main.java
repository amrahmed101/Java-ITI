import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String [] args){
        String string1="abcdefg";
        String string2="abcs1234";
        System.out.println(checkAlphabet(string1));
        System.out.println(checkAlphabet(string2));

    }

    public static boolean checkAlphabet(String s){
        if(s!=null &&
                !s.equals("") &&
                s.chars().allMatch(Character::isLetter)){
            return true; }
        return false;
    };
}
