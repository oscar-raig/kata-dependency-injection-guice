package raig.org;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import raig.org.core.Shortener;
import raig.org.core.Tweeter;
import raig.org.core.TweeterFactory;
import raig.org.infrastructure.TinyUrlShortener;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TweeterSenderShould {

  @Test
  public void tweeterSenderShouldCallgetTextField() {

    TextField textField = Mockito.mock(TextField.class);
    when(textField.getField()).thenReturn("hello");
    TweeterSender tweeterSender = new TweeterSender(textField, new TinyUrlShortener());
    tweeterSender.sendTweet();
    verify(textField,times(1)).getField();

  }

  @Test
  public void testShouldCallSortenerIflenghIsGreaterThanMax() {
    TextField textField = new TextField("12345");
    TweeterSender tweeterSender = new TweeterSender(textField,new TinyUrlShortener());
    tweeterSender.sendTweet();

  }

  @Test
  public void testTweeterWithFactory() {

    Tweeter doubleTwitter = Mockito.mock(Tweeter.class);
    TweeterFactory.setForTesting(doubleTwitter);

    TextField textField = new TextField("12345");
    TweeterSender tweeterSender = new TweeterSender(textField,new TinyUrlShortener());
    tweeterSender.sendTweet();
    verify(doubleTwitter,times(1)).send(anyString());
  }



}
