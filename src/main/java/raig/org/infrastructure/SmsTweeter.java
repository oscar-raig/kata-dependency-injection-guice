package raig.org.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import raig.org.core.Tweeter;

public class SmsTweeter implements Tweeter {

  private static final Logger LOGGER = LoggerFactory.getLogger(SmsTweeter.class);

  @Override
  public void send(String text) {
    LOGGER.info("Sending text:" + text);
  }
}
