package raig.org;

import com.google.inject.Guice;
import com.google.inject.Injector;
import raig.org.infrastructure.TinyUrlShortener;

public class TestGuice {


  public static void main(String [] args) {

    System.out.println("Hello World");
    Injector injector = Guice.createInjector(new TweeterModule());
    TweeterSender tweeterSender = injector.getInstance(TweeterSender.class);
    tweeterSender.sendTweet();
  }

}
