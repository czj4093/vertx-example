package io.example;

import io.vertx.core.AbstractVerticle;

/**
 * @author chenzejin
 * @since 2019/7/16
 */
public class MainVerticle extends AbstractVerticle {

    public void start() {
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }

}
