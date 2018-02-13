package org.broadbandforum.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Defines several uniqueKey constraints on a CWMP object
 *
 * @author Andrius Druzinis-Vitkus
 * @since 0.0.2 created 03/02/2018
 */
@Retention(RUNTIME)
@Target({TYPE})
public @interface CWMPUniqueKeys {

  CWMPUniqueKey[] value();
}
