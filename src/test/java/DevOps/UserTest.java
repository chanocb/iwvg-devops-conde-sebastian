package DevOps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User("1", "Sebastián", "Conde", Arrays.asList(
                new Fraction(1, 2),
                new Fraction(3, 4)
        ));
    }

    @Test
    void testUserDefaultConstructor() {
        user = new User();
        assertNull(user.getId());
        assertNull(user.getName());
        assertNull(user.getFamilyName());
        assertEquals(0, user.getFractions().size());
    }

    @Test
    void testUserConstructorWithParameters() {
        assertEquals("1", user.getId());
        assertEquals("Sebastián", user.getName());
        assertEquals("Conde", user.getFamilyName());
        assertEquals(2, user.getFractions().size());
    }

    @Test
    void testAddFraction() {
        user.addFraction(new Fraction(5, 6));
        assertEquals(3, user.getFractions().size());
    }

    @Test
    void testFullName() {
        assertEquals("Sebastián Conde", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("S.", user.initials());
    }

    @Test
    void testSetName() {
        user.setName("Juan");
        assertEquals("Juan", user.getName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Pérez");
        assertEquals("Pérez", user.getFamilyName());
    }
}