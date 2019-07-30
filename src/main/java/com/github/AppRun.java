package com.github;

import com.github.spi.IAnimal;

import java.util.ServiceLoader;

/**
 * <p>
 * 创建时间为 13:29 2019-07-30
 * 项目名称 java_spi
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public class AppRun {

    public static void main(String[] args) {
        ServiceLoader<IAnimal> serviceLoader = ServiceLoader.load(IAnimal.class);
        serviceLoader.forEach(IAnimal::say);
    }

}
