package TH_validateaccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAccount {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public CheckAccount(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
