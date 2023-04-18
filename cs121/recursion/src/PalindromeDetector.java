import java.util.*;
public class PalindromeDetector {

    public static boolean PalCheck(String w)
    {
        if (w.length()==0 || w.length()==1)
        {
            return true;
        }
        if(w.charAt(0)==w.charAt(w.length()-1))
        {
            return PalCheck(w.substring(1,w.length()-1));
        }
        return false;
    }
}
