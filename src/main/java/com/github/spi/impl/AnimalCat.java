package com.github.spi.impl;

import com.github.spi.IAnimal;

/**
 * <p>
 * 创建时间为 13:30 2019-07-30
 * 项目名称 java_spi
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public class AnimalCat implements IAnimal {
    public void say() {
        System.out.println("I am a cat!");
    }
}
