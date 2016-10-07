/**
 * Created by Alexander_Demidovich on 10/7/2016.
 */

import Handler.Handler;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTests {
    @Test
    public void CheckSimpleNumber_2_trueReturned() {
        int number = 2;
        boolean expected = true;
        boolean actual = Handler.checkSimpleNumber(number);
        assertEquals(expected, actual);
    }
    @Test
    public void CheckSimpleNumber_991_trueReturned() {
        int number = 991;
        boolean expected = true;
        boolean actual = Handler.checkSimpleNumber(number);
        assertEquals(expected, actual);
    }
    @Test
    public void CheckSimpleNumber_123_trueReturned() {
        int number = 123;
        boolean expected = false;
        boolean actual = Handler.checkSimpleNumber(number);
        assertEquals(expected, actual);
    }
    @Test
    public void CheckSimpleNumber_0_trueReturned() {
        int number = 0;
        boolean expected = false;
        boolean actual = Handler.checkSimpleNumber(number);
        assertEquals(expected, actual);
    }
}
