import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * Created by Lucho on 09/04/2016.
 */
public class Main2 {
    public static void main(String[] args) {

        Charset oem = Charset.forName("Cp437");
        ByteBuffer b = ByteBuffer.allocate(0xFF - 0x20 - 1);
        for (int i = 0x20; i < 0xFF; i++) {
            if (i == 0x7F) {
                // skip DEL
                continue;
            }

            b.put((byte) i);
        }
        b.flip();
        CharBuffer c;
        c = oem.decode(b);
        System.out.println(c.toString());
    }
}

