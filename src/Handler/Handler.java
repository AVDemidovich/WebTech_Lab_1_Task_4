package Handler;

/**
 * Created by Alexander_Demidovich on 10/7/2016.
 */
public class Handler {
    public static boolean checkSimpleNumber(int number) {
        if (number<=0) return  false;
        for (int i = 2;i<=Math.round(number/2);i++){
            if ( (number % i) == 0) return false;
        }
        return true;
    }
}

