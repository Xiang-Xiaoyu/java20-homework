import cn.edu.nju.chengker.advancedjava.hulubro.BattleField;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BattleFieldTest {
    static private BattleField battleField=new BattleField();

    @Before
    public void setUpBeforeClass(){
        battleField.sortBros();
    }

    @Test
    public void testToString() {
        assertEquals(battleField.toString(),"[RED,ORANGE,YELLOW,GREEN,CRAN,BLUE,PURPLE]");
    }

    @Test
    public void testReverseBros() {
        battleField.reverseBros();
        assertEquals(battleField.toString(),"[PURPLE,BLUE,CRAN,GREEN,YELLOW,ORANGE,RED]");
    }
}
