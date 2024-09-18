package DevOps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(3, 4);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFractionDefaultConstructor() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.75, fraction.decimal(), 1e-5);
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(6);
        assertEquals(6, fraction.getDenominator());
    }
    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertFalse(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction equivalentFraction = new Fraction(6, 8);
        assertTrue(fraction.isEquivalent(equivalentFraction));
    }

    @Test
    void testAdd() {
        Fraction other = new Fraction(1, 4);
        Fraction result = fraction.add(other); // 3/4 + 1/4 = 1
        assertEquals(16, result.getNumerator());
        assertEquals(16, result.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction other = new Fraction(2, 3);
        Fraction result = fraction.multiply(other); // 3/4 * 2/3 = 6/12 = 1/2
        assertEquals(6, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction other = new Fraction(2, 3);
        Fraction result = fraction.divide(other); // 3/4 ÷ 2/3 = 3/4 * 3/2 = 9/8
        assertEquals(9, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    void testToString() {
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }
}
