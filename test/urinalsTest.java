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

}
