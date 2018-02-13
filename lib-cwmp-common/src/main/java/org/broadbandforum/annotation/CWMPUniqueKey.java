package org.broadbandforum.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Defines a single uniqueKey constraint
 *
 * @author Andrius Druzinis-Vitkus
 * @since 0.0.2 created 03/02/2018
 */
@Retention(RUNTIME)
@Target({TYPE})
public @interface CWMPUniqueKey {

  boolean functional() default true;

  String[] value () default {};
}
