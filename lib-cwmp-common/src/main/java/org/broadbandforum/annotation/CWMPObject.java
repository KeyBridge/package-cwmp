package org.broadbandforum.annotation;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;

/**
 * * Defines @CWMPObject annotations
 *
 * @author Andrius Druzinis-Vitkus
 * @since 0.0.1 created 27/01/2018
 */
@Target({TYPE, FIELD})
public @interface CWMPObject {

  String name() default "";

  boolean optional() default true;
}
