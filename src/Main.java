import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "abcdD";//System.out.println(duplicateCount(s));
        System.out.println(isIsogram(s));

    }
    public static boolean  isIsogram(String str) {
        if(str.isEmpty()) return true;
        String s = str.toLowerCase();
        String uniqueSymbol = s.substring(0, 1);
        String test = s.substring(1);
        if(test.contains(uniqueSymbol))return false;
        return isIsogram(test);
    }
}