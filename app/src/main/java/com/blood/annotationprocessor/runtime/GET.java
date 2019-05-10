package com.blood.annotationprocessor.runtime;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GET {
    String url() default "unknown";
}

/*

这里偶然发现个问题，定义为编译时注解，却还是能够被反射拿到注解信息。

 */
