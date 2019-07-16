package io.example;

import io.vertx.core.Vertx;

/**
 * @author chenzejin
 * @since 2019/7/16
 */
public class Main {

    public static void main(String[] args){
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }

}
