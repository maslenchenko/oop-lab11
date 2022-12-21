import org.example.ProxyImage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testImage {

    @Test
    public void testImage() {
        ProxyImage image = new ProxyImage("test.jpg");
        image.display();
    }
}
