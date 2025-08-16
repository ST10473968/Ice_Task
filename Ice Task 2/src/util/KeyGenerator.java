package util;

import java.util.Date;

public class KeyGenerator{
    public static long generatePK(){
        return new Date().getTime();
    }
}