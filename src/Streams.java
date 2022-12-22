import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Streams {
    public static void main(String[] args) throws IOException {
       Reader reader = new FileReader("/home/narayan/file"); 
        int length;
        char[] charBuff = new char[10]; //using char array as a buffer
        while((length=reader.read(charBuff)) >= 0) {
            for (int i = 0; i < length; i++) {
                char charVal = charBuff[i];
                System.out.print((charVal));
            }
        }
        reader.close();
    }
}
