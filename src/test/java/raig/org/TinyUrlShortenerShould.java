package raig.org;

import org.junit.Assert;
import org.junit.Test;
import raig.org.core.Shortener;
import raig.org.infrastructure.TinyUrlShortener;

public class TinyUrlShortenerShould {
  @Test
  public void shortenShouldReturnLessMaxCharacters() {

    Shortener shortener = new TinyUrlShortener();
    String originalText = "12345";
    String expectedShortened = "1234";

    Assert.assertTrue(expectedShortened.equals(shortener.shortener(originalText)));
  }
}
