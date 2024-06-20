import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalcTest {

    @Test
    @DisplayName("Add 2+2")
    void add() {
        SimpleCalc calc = new SimpleCalc();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    @DisplayName("Add 2+5")
    void add2() {
        SimpleCalc calc = new SimpleCalc();
        assertEquals(7, calc.add(2, 5));
    }
}