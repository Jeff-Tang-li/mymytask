package org.mytask.annotation;

import java.lang.annotation.*;

/**
 * 数据库字段映射字段属性
 *
 * @author Jeff·Tang
 * @version 1.0
 * @date 2021/1/22 10:29
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TableField {

    String id() default "";

    String name() default "";

    String type() default "";

}
