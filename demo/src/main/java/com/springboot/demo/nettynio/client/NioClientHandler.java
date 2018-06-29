package com.springboot.demo.nettynio.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * @AUTHOR Yrp
 * @CREATE 2018-05-29
 * 14:54
 **/
public class NioClientHandler extends ChannelHandlerAdapter {

    private final ByteBuf firstMessage;

    public NioClientHandler() {
        byte[] req = "QUERY TIME ORDER".getBytes();
        firstMessage = Unpooled.buffer(req.length);
        firstMessage.writeBytes(req);
    }

    //当客户端和服务端TCP链路建立成功之后，Netty的NIO线程会调用channelActive方法
    public void channelActive(ChannelHandlerContext ctx) {
        //发送查询时间的指令给服务端
        //调用ChannelHandlerContext的writeAndFlush方法将请求消息发送给服务端。
        ctx.writeAndFlush(firstMessage);
    }

    //当服务端返回应答消息时，channelRead方法被调用
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //从Netty的ByteBuf中读取并打印应答消息。
        ByteBuf buf = (ByteBuf) msg;
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        String body = new String(req, "UTF-8");
        System.out.println("Now is : " + body);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // 释放资源
        //当发生异常时，打印异常日志，释放客户端资源。
        ctx.close();
    }
}
