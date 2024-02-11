import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "abcdD";//System.out.println(duplicateCount(s));
        whoLikesIt("Jacob", "Alex");
    }
    public static String whoLikesIt(String... names) {
        if(names.length == 0) return "no one likes this";
        if(names.length == 1) return names[0] + " likes this";
        if(names.length == 2) return names[0] + " and " + names[1] + " like this";
        if(names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        if(names.length > 3) return names[0] + ", " + names[1] + " and " + (names.length - 2) + " like this";
        return "";
    }
}