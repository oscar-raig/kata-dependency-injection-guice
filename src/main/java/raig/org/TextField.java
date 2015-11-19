package raig.org;

import com.google.inject.BindingAnnotation;
import com.google.inject.Inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



public class TextField {

  private String field;

  @Inject
  public TextField(@FieldParameter String field) {
    this.field = field;
  }

  public String getField() {
    return field;
  }
}
