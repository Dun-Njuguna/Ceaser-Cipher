import org.junit.*;
import static org.junit.Assert.*;

public class EncodingTest {


    @Test
    public void textInput_check_if_input_is_a_string_true() {
        Encoding cipher = new Encoding("vghcghch", "vghchgchg", 15 , "njkbjk");
        assertEquals(true,cipher.textInput("test"));
    }

    @Test
    public void textOutput_check_if_output_is_a_string_true() {
        Encoding cipher = new Encoding("vghcghch", "vghchgchg", 15, "vhvh");
        assertEquals(true,cipher.textOutput("test"));
    }

    @Test
    public void encrypt_check_if_input_is_encrypted_String() {
        Encoding encoding = new Encoding("gchg","bjhbj",15,"vhgvu");
        assertEquals("true",encoding.encrypt("test",15));
    }

}