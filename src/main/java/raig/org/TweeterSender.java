package raig.org;

import com.google.inject.Inject;

import raig.org.core.Shortener;
import raig.org.core.Tweeter;
import raig.org.core.TweeterFactory;


public class TweeterSender {

  private TextField textField;
  private Shortener shortener;

  @Inject
  public TweeterSender(TextField textField, Shortener shortener) {

    this.textField = textField;
    this.shortener = shortener;
  }

  public void sendTweet() {

    String text = textField.getField();

    if ( text.length() > Shortener.MAX_LENGHT) {

      text = shortener.shortener(text);
    }

    if ( text.length() <= Shortener.MAX_LENGHT) {
     // Tweeter tweeter = new SmsTweeter();
      Tweeter tweeter = TweeterFactory.get();
      tweeter.send(text);
    }

  }
}
