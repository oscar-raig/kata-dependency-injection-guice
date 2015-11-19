package raig.org;

import com.google.inject.AbstractModule;
import raig.org.core.Shortener;
import raig.org.infrastructure.TinyUrlShortener;

public class TweeterModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Shortener.class).to(TinyUrlShortener.class);
    bind(TextField.class);
    bindConstant().annotatedWith(FieldParameter.class).to("iholajja");
  }
}
