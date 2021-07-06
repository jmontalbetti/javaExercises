package Utils;

public class StringUtils {

    public static String lPad(String s, char c, int n) {
        if (s.length() >= n) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < n - s.length()) {
            sb.append(c);
        }
        sb.append(s);
        return sb.toString();
    }

    public static String rPad(String s, char c, int n) {
        if (s.length() >= n) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (sb.length() < n - s.length()) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static String lTrim(String s) {
        if (s.length() <= 0) return s;
        StringBuilder sb = new StringBuilder();
        int charCounter = 0;
        while(charCounter < s.length() && s.substring(charCounter, charCounter).equals(" "))
        {
            charCounter++;
        }
        return sb.append(s.substring(charCounter)).toString();
    }

    public static String rTrim(String s) {
        if (s.length() <= 0) return s;
        StringBuilder sb = new StringBuilder();
        int charCounter = 0;
        while(charCounter < s.length() && s.substring(charCounter, charCounter).equals(" "))
        {
            charCounter++;
        }
        return sb.append(s.substring(1, charCounter)).toString();
    }

    public static int indexOfN(String s, char c, int n) {
        if (s.length() <= 0 || s.length() < n) return -1;
        int charCounter = 0;
        int repeatedChar = 0;
        int position = 0;
        while(charCounter < s.length() && repeatedChar < n)
        {
            if (s.substring(charCounter, charCounter).equals(c)) {
                repeatedChar++;
                position = charCounter;
            }
            charCounter++;
        }
        return position;
    }
}
