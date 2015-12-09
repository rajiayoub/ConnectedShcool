package com.connected.ui.tags.utils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for filter fields.
 *
 * @author lroman
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface FormField {

    int order();

    String name() default "";

    String label();

    FormWidgetType type() default FormWidgetType.INPUT;

    String cssClasses() default "";

    String[] attributes() default "";

    String optionsExpression() default "";
}
