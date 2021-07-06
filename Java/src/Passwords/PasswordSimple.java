package Passwords;

import java.util.regex.Pattern;

public class PasswordSimple extends Password {

    public PasswordSimple() {
        super();
        this.setPattern(Pattern.compile("aca va el pattern de ps"));
    }

    public PasswordSimple(String regex) {
        return;
    }
}
