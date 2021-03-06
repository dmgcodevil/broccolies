package com.bavelsoft.broccolies.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FluentScenarios {
	FluentScenario[] value() default {};
}

