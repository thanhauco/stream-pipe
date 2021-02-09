package com.example;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.OutputStream;
public class HealthServer {
    public void start() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/health", t -> {
            String r = "OK";
            t.sendResponseHeaders(200, r.length());
            OutputStream os = t.getResponseBody();
            os.write(r.getBytes());
            os.close();
        });
        server.start();
    }
}