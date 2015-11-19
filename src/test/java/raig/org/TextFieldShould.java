package raig.org;

import org.junit.Assert;
import org.junit.Test;

public class TextFieldShould {

  @Test
  public void getFieldShouldReturnHola() {

    TextField textField = new TextField("hola");
    Assert.assertEquals("hola",textField.getField());
  }
}
