package org.broadbandforum.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Defines several @CWMPParameter annotations on the same element
 *
 * @author Andrius Druzinis-Vitkus
 * @since 0.0.2 created 27/01/2018
 */
@Retention(RUNTIME)
@Target({FIELD})
public @interface CWMPParameter {

  String access() default "readOnly";

  boolean optional() default true;

  boolean required() default false;

  int minEntries() default 0;

  int maxEntries() default Integer.MAX_VALUE;

  String activeNotify() default "";

  boolean forcedInform() default false;

  String units() default "";
}
