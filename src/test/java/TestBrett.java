import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBrett {
    @Test
    public void playerMoveTest_whenInputW_thenReturn0() {

        //GIVEN
        string key = "W";

        //WHENwe
        int actual = Spiel.TestBrett(key);

        //THEN
        assertEquals("W", actual);

    }
    @Test
    public void playerMoveTest_whenInputA_thenReturn1() {

        //GIVEN
        string key = "A";

        //WHENwe
        int actual = Spiel.TestBrett(key);

        //THEN
        assertEquals("A", actual);

    }
    @Test
    public void playerMoveTest_whenInputS_thenReturn2() {

        //GIVEN
        string key = "S";

        //WHENwe
        int actual = Spiel.TestBrett(key);

        //THEN
        assertEquals("S", actual);

    }
    @Test
    public void playerMoveTest_whenInputD_thenReturn3() {

        //GIVEN
        string key = "D";

        //WHENwe
        int actual = Spiel.TestBrett(key);

        //THEN
        assertEquals("D", actual);

    }
}
