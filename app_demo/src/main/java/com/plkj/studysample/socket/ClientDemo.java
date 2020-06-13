package com.plkj.studysample.socket;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Renzituo
 * on 2020-06-06
 */
public class ClientDemo {

    private static final String TAG = "ClientDemo";
    /**
     * 最基础的客户端Demo
     */
    public void toConnectSocketServerDemo() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Socket socket = new Socket();
                    socket.setSoTimeout(3000);//设置超时时间
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(Inet4Address.getLocalHost(),
                            2000);//要建立连接的IP地址与端口号
                    socket.connect(inetSocketAddress, 3000);//设置连接超时时间
                    Log.d(TAG, "已经发起服务器连接，并进入后续流程");
                    Log.d(TAG, "客户端信息：" + socket.getLocalAddress() + " P:" + socket.getLocalPort());
                    Log.d(TAG, "服务端信息：" + socket.getInetAddress() + " P:" + socket.getPort());

                    // 发送接收数据
                    todo(socket);

                    // 释放资源
                    socket.close();
                    System.out.println("客户端已退出～");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private static void todo(Socket client) throws IOException {
        // 构建键盘输入流
        InputStream in = System.in;
        BufferedReader input = new BufferedReader(new InputStreamReader(in));


        // 得到Socket输出流，并转换为打印流
        OutputStream outputStream = client.getOutputStream();
        PrintStream socketPrintStream = new PrintStream(outputStream);


        // 得到Socket输入流，并转换为BufferedReader
        InputStream inputStream = client.getInputStream();
        BufferedReader socketBufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        boolean flag = true;
        do {
            // 键盘读取一行
            String str = input.readLine();
            // 发送到服务器
            socketPrintStream.println(str);


            // 从服务器读取一行
            String echo = socketBufferedReader.readLine();
            if ("bye".equalsIgnoreCase(echo)) {
                flag = false;
            }else {
                System.out.println(echo);
            }
        }while (flag);
        // 资源释放
        socketPrintStream.close();
        socketBufferedReader.close();
    }
}
