package com.connected.ui.tags.utils.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FormButton {

	    String name();

	    String id();

	    String cssClasses() default "ajaxLink";

        String submit() default "true";
}
