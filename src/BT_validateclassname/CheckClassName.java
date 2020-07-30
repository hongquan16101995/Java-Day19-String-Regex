package BT_validateclassname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {
    private  static final String CLASSNAME_REGEX = "^[C,A,P][0-9]{4}[G,H,I,K,L,M]$";

    public CheckClassName(){

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
