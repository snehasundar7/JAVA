package encodeDouble;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;

public class Encoded {

    
    private static String encodeValue(String value) {
        try {
        	 return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    public static void main(String[] args) {
        

        String value = "huö iölϿd@Java//!#~%^&*()-=_+`{}[]/";
        for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);

			
			if (ch > 128) {
				String s = Character.toString(ch);
				String urlop = encodeValue(s);
				
				
				value = value.replace(s, urlop);
			}

		}
		System.out.println(value);

	}
}