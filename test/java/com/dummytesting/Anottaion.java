package com.dummytesting;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Anottaion {
    String author() default "Nararyan";
    String date();
    int revision() default 1;
    String comments();
}
