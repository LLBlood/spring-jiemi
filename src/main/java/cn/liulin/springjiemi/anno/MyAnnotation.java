package cn.liulin.springjiemi.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * cn.liulin.springjiemi.anno$
 *
 * @author ll
 * @date 2024-01-16 13:38:22
 **/
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String msg() default "no msg";
}
