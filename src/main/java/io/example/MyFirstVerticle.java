package io.example;

import io.vertx.core.AbstractVerticle;

/**
 * @author chenzejin
 * @since 2019/7/16
 */
public class MyFirstVerticle extends AbstractVerticle {

    public void start() {
        vertx.createHttpServer().requestHandler(req -> req.response()
                .putHeader("content-type", "text/plain")
                .end("Hello World!")).listen(8080);
    }

}
