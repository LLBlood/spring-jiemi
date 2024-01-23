package cn.liulin.springjiemi.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * cn.liulin.springjiemi.anno$
 *
 * @author ll
 * @date 2024-01-16 13:35:45
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyReport {
    String name() default "";
    int value() default 0;
}
