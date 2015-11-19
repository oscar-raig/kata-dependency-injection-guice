package raig.org.infrastructure;

import raig.org.core.Shortener;

public class TinyUrlShortener implements Shortener{


  @Override
  public String shortener(String text) {
    return text.substring(0,MAX_LENGHT);
  }
}
