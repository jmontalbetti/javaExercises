package Passwords;

import java.util.regex.*;

public class Password {
    private Pattern pattern;
    private Matcher matcher;
    private String pass;

    public Password() {

    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher() {
        return matcher;
    }

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) throws Exception {
        this.matcher = pattern.matcher(pass);
        if (matcher.find())
            this.pass = pass;
        else throw new Exception("La password no cumple con los requerimientos minimos");
    }

    public Password(String regex) {
        this.pattern = Pattern.compile(regex);
    }

}
