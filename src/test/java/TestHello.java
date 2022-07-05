import br.com.throchadev.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {

  @Test
  public void testHello(){
    Hello hello = new Hello();
    assertEquals("Hello world!", hello.hello());
  }
}
