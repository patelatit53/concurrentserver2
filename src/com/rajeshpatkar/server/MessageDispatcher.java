package com.rajeshpatkar.server;

import java.io.PrintWriter;

public class MessageDispatcher extends Thread {
    
    @Override
    public void run() {
        while (true) {
            try {
                String str = Server.q.dequeue();
                for (PrintWriter o : Server.noslist) {
                    o.println(str);
                }
            } catch (Exception e) {
            }
        }
    }
}