package com.company;

public class Main {

    public static void main(String[] args) {
	// the ASCIItable
        package com.company;

        import java.lang.reflect.Field;
        import java.nio.charset.Charset;

        public class PrintTheASCIITable {
            public static void main(String[] args)  {
                // System.setProperty("file.encoding", "UTF-8");
                // Field charset = Charset.class.getDeclaredField("defaultCharset");
                //charset.setAccessible(true);
                // charset.set(null,null);

                for (int i = 0; i <= 32; i++) {
                    char symbol = (char) i;
                    System.out.println(i + ": " + symbol);
                }
                for (int c=32; c<256; c++) {
                    System.out.println(c + ": " + (char)c);
                }
            }
        }

    }
}
