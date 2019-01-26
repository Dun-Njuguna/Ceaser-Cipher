import org.junit.*;
import static org.junit.Assert.*;

public class EncodingTest {


    @Test
    public void encrypt_check_if_input_is_encrypted_String() {
        Encoding encoding = new Encoding();
        assertEquals("true",encoding.encrypt("test",15));
    }

}