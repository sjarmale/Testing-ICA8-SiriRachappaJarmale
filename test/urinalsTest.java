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

}
