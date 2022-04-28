import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {

    SkillDem bruh;

    @Before

    public void setUp() {
        bruh = new SkillDem();
    }
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void add(){
        assertEquals(5, bruh.addI(5) );
    }
}