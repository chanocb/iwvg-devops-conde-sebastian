package DevOps;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchesTest {
    @Test
    void testFindFirstProperFractionByUserId() {
        Searches searches = new Searches();
        Optional<Fraction> result = searches.findFirstProperFractionByUserId("2");
        assertTrue(result.isPresent());
        Fraction fraction = result.get();
        assertEquals(-1, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }
    @Test
    void testFindUserIdBySomeProperFraction() {
        assertEquals(List.of("1","2","3","5"),new Searches().findUserIdBySomeProperFraction()
         .collect(Collectors.toList()));

    }
    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        assertEquals(List.of(-0.2, -0.5),new Searches().findDecimalFractionByNegativeSignFraction()
                .collect(Collectors.toList()));




    }
}
