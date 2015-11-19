package raig.org.core;

import raig.org.infrastructure.SmsTweeter;

public class TweeterFactory {

  private static Tweeter testValue;

  public static Tweeter get() {
    if ( testValue != null) {
      return testValue;
    }
    return new SmsTweeter();
  }


  public static void setForTesting( Tweeter tweeter) {
    testValue = tweeter;
  }
}
