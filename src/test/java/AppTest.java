import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testAddAndShowActivities() {
        String input = "1\nRunning\n1\nMonday\n2\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Sport added"));
        assertTrue(output.contains("Activity: Run, Duration: 1 hours, Day: Monday"));
    }

    @Test
    public void testTotalTimeOnActivities() {
        String input = "1\nRunning\n1\nMonday\n1\nSwimming\n2\nTuesday\n3\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("3"));
    }
}