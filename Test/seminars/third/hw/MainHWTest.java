package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    void testEvenOddNumber_Even() {
        MainHW utils = new MainHW();
        assertTrue(utils.evenOddNumber(4));
    }

    @Test
    void testEvenOddNumber_Odd() {
        MainHW utils = new MainHW();
        assertFalse(utils.evenOddNumber(7));
    }

    @Test
    void testNumberInInterval_InInterval() {
        MainHW utils = new MainHW();
        assertTrue(utils.numberInInterval(50));
    }

    @Test
    void testNumberInInterval_OutOfInterval() {
        MainHW utils = new MainHW();
        assertFalse(utils.numberInInterval(20));
    }

    @Test
    void testNumberInInterval_AtLowerBound() {
        MainHW utils = new MainHW();
        assertFalse(utils.numberInInterval(25));
    }

    @Test
    void testNumberInInterval_AtUpperBound() {
        MainHW utils = new MainHW();
        assertFalse(utils.numberInInterval(100));
    }

    @Test
    void testNumberInInterval_NegativeNumber() {
        MainHW utils = new MainHW();
        assertFalse(utils.numberInInterval(-30));
    }

    @Test
    void testNumberInInterval_Zero() {
        MainHW utils = new MainHW();
        assertFalse(utils.numberInInterval(0));
    }

}