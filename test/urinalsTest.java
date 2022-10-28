import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class urinalsTest {
    private final urinals urinal = new urinals();

    @Test
    public void testGoodStringReturnsFalse(){
        Boolean actualResult= urinal.goodString("111111");
        System.out.println("===== Siri Jarmale == TEST ONE EXECUTED =====");
        Assertions.assertEquals(actualResult, false);
    }

    @Test
    public void testGoodStringReturnsTrue(){
        Boolean actualResult= urinal.goodString("10010101");
        System.out.println("===== Siri Jarmale == TEST TWO EXECUTED =====");
        Assertions.assertEquals(actualResult, true);
    }

    @Test
    public void testGoodStringReturnsFalseForRandomString(){
        Boolean actualResult= urinal.goodString("SIRIJARMALE");
        System.out.println("===== Siri Jarmale == TEST THREE EXECUTED =====");
        Assertions.assertEquals(actualResult, false);
    }

    @Test
    public void testCountFreeUrinalsForInvalidString() {
        int actualResult= urinal.countFreeUrinals("11001");
        System.out.println("===== Siri Jarmale == TEST FOUR EXECUTED =====");
        Assertions.assertEquals(actualResult, -1);
    }

    @Test
    public void testCountFreeUrinals1() {
        int actualResult= urinal.countFreeUrinals("10001");
        System.out.println("===== Siri Jarmale == TEST FIVE EXECUTED =====");
        Assertions.assertEquals(actualResult, 1);
    }

    @Test
    public void testCountFreeUrinals2() {
        int actualResult= urinal.countFreeUrinals("1001");
        System.out.println("===== Siri Jarmale == TEST SIX EXECUTED =====");
        Assertions.assertEquals(actualResult, 0);
    }

    @Test
    public void testCountFreeUrinals3() {
        int actualResult= urinal.countFreeUrinals("00000");
        System.out.println("===== Siri Jarmale == TEST SEVEN EXECUTED =====");
        Assertions.assertEquals(actualResult, 3);
    }

    @Test
    public void testCountFreeUrinals4() {
        int actualResult= urinal.countFreeUrinals("01000");
        System.out.println("===== Siri Jarmale == TEST EIGHT EXECUTED =====");
        Assertions.assertEquals(actualResult, 1);
    }

}
