package com.xxl.socketio;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import com.xxl.socketio.listener.ChatListener;

public class ListenerServer {
	public static ListenerServer server;
	public ListenerServer() {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		//config.setHostname("127.0.0.1");
		config.setPort(9999);
		config.setOrigin("*");

		SocketIOServer server = new SocketIOServer(config);
		server.addListeners(new ChatListener(server));

		server.start();
	}

}
