package org.broadbandforum.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * * Defines @CWMPObject annotations
 *
 * @author Andrius Druzinis-Vitkus
 * @since 0.0.2 created 27/01/2018
 */
@Retention(RUNTIME)
@Target({TYPE, FIELD})
public @interface CWMPObject {

  String name() default "";

  boolean optional() default true;

  CWMPUnique[] uniqueConstraints() default {};
}
