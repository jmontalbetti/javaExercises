package Passwords;

import java.util.regex.Pattern;

public class PasswordIntermedia extends Password {

    public PasswordIntermedia() {
        super();
        this.setPattern(Pattern.compile("aca va el pattern de pi"));
    }

    public PasswordIntermedia(String regex) {
        return;
    }
}
