import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodingTest {

    @Test
    public void decode_check_if_input_is_encrypted_String() {
        Encoding encoding = new Encoding("gchg","bjhbj",15,"vhgvu");
        assertEquals("true",encoding.encrypt("test",15));
    }
}
