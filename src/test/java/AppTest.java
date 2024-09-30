import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGetName() {
        SportApp sport = new SportApp("Run", 1, "Monday");
        assertEquals("Run", sport.getName());
    }

    @Test
    public void testGetDuration() {
        SportApp sport = new SportApp("Run", 1, "Monday");
        assertEquals(1, sport.getDuration());
    }

    @Test
    public void testGetDay() {
        SportApp sport = new SportApp("Run", 1, "Monday");
        assertEquals("Monday", sport.getDay());
    }

    @Test
    public void testSetName() {
        SportApp sport = new SportApp("Run", 1, "Monday");
        sport.setName("Swim");
        assertEquals("Swim", sport.getName());
    }

    @Test
    public void testSetDuration() {
        SportApp sport = new SportApp("Run", 1, "Monday");
        sport.setDuration(2);
        assertEquals(2, sport.getDuration());
    }

    @Test
    public void testSetDay() {
        SportApp sport = new SportApp("Run", 1, "Monday");
        sport.setDay("Tuesday");
        assertEquals("Tuesday", sport.getDay());
    }

    @Test
    public void testToString() {
        SportApp sport = new SportApp("Running", 1, "Monday");
        assertEquals("Activity: Running, Duration: 1 hours, Day: Monday", sport.toString());
    }
}