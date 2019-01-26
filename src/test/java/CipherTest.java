import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {


    @Test
    public void textInput_check_if_input_is_a_string_true() {
        Cipher cipher = new Cipher("vghcghch", "vghchgchg", 15);
        assertEquals(true,cipher.textInput("test"));
    }

    @Test
    public void textOutput_check_if_output_is_a_string_true() {
        Cipher cipher = new Cipher("vghcghch", "vghchgchg", 15);
        assertEquals(true,cipher.textOutput("test"));
    }

}