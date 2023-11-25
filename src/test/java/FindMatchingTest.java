import com.engeto.resources.Find;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindMatchingTest {
    @Test
    public void middle1Test(){
        List<Double> testList = List.of(10.0, 15.45, 5.811, 175.0);
        try {
            Double actual = Find.findMatching(testList, 4.0, 9.3);
            Double expected = 5.811;

            Assertions.assertEquals(expected, actual);
        } catch (Exception exc){
            System.err.println("Exception in middle1Test.");

        }

    }

    @Test
    public void emptyTest(){
        List<Double> testList = new ArrayList<>();
        Assertions.assertThrows(Exception.class,
                () -> Find.findMatching(testList, 10.0, 12.0));
    }

    @Test
    public void top1Test(){
        try {
            List<Double> testList = List.of(12.0, 8.126, 6.0);
            Double actual = Find.findMatching(testList, 11.0, 12.6);
            Double expected = 12.0;

            Assertions.assertEquals(expected, actual);
        } catch (Exception exc){
            System.err.println("Exception in top1Test.");
        }
    }

    @Test
    public void middle2Test(){
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        try {
            Double actual = Find.findMatching(testList, 8.0, 10.0);
            Double expected = 8.126;

            Assertions.assertEquals(expected, actual);
        } catch (Exception exc){
            System.err.println("Exception in middle2Test");
        }
    }

    @Test
    public void findMatchNullTest(){
        try {
            List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
            Double actual = Find.findMatching(testList, 0.0, 3.0);
            Assertions.assertNull(actual);
        } catch (Exception exc){
            System.err.println("Exception in findMatchNullTest.");
        }
    }
}
