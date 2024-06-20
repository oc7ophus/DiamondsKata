import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiamondTest {

    private Diamond diamond;

    @BeforeEach
    void setUp() {
        diamond = new Diamond();
    }

    // Diamond.fill();

    @Test
    void fillLotsLots() {
        String temp = diamond.fill(17,19);
        assertEquals(19, temp.replaceAll(" ", "").length());
        assertEquals(17, temp.replaceAll("\\*", "").length());
    }

    @Test
    void fillOneOne() {
        String temp = diamond.fill(1,1);
        assertEquals(1, temp.replaceAll(" ", "").length());
        assertEquals(1, temp.replaceAll("\\*", "").length());
    }

    @Test
    void fillZeroZero() {
        String temp = diamond.fill(0,0);
        assertEquals(0, temp.replaceAll(" ", "").length());
        assertEquals(0, temp.replaceAll("\\*", "").length());
        assertEquals(0, temp.length());
    }

    // Diamond.generateDiamond();

    @Test
    void inputEvenNumber() {
        assertEquals("null", diamond.generate(8));
    }

    @Test
    void inputNegNumber() {
        assertEquals("null", diamond.generate(-7));
    }

    @Test
    void inputZero() {
        assertEquals("null", diamond.generate(0));
    }

    @Test
    void inputOddNumber() {
        assertNotEquals("null", diamond.generate(3));
    }
}