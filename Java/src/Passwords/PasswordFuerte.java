package Passwords;

import java.util.regex.*;

public class PasswordFuerte extends Password {

    public PasswordFuerte() {
        super();
        this.setPattern(Pattern.compile("aca va el pattern de pf"));
    }


    public PasswordFuerte(String regex) {
        return;
    }
}
