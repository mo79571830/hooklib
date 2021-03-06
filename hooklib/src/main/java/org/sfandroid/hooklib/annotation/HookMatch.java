/*
 * Copyright (c) 2020 HookLib by sfandroid.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sfandroid.hooklib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author beichen
 * @date 2019/05/23
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface HookMatch {
    /**
     * @return 监听的类名集合, 默认空
     */
    String[] value() default {};

    /**
     * 不要添加<code>null、Void.class等无意义的类，会导致运行时异常</code>
     *
     * @return 监听的类集合, 默认空
     */
    Class<?>[] cls() default {};
}
