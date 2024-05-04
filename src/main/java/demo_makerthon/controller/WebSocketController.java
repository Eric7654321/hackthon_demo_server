package demo_makerthon.controller;

import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;

import java.io.IOException;

@ServerEndpoint("/channel/echo")
public class WebSocketController {
    private Session session;

    @OnMessage
    public void onMessage(String message) throws IOException {
        // 處理收到的消息
    }

    @OnOpen
    public void onOpen(Session session, EndpointConfig endpointConfig) {
        // 處理連接打開事件
    }

    @OnClose
    public void onClose(CloseReason closeReason) {
        // 處理連接關閉事件
    }
}
