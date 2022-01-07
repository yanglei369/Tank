package com.msb;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: yl
 * @Date: 2022/1/4 18:02
 * @Description: com.msb
 * @Version: 1.0
 */
public class TankFrame extends Frame{
    int x = 200;
    int y = 200;


    public TankFrame() throws HeadlessException {
        setSize(800,600);
        setResizable(false);
        setTitle("Tank War");
        setVisible(true);
        //监听器： 添加窗口监听器   窗口可关闭，
        addWindowListener(new WindowAdapter() {  //匿名内部类  WindowAdapter实现了WindowListener的接口
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //监听器： 添加键盘监听器
        this.addKeyListener(new MyKeyListener());

    }

    //重新绘制界面时，自动执行的函数。
    //只要有动作不停的调用这个方法，窗口内容就会动起来。
    //如何实现刷新呢？  可以按某个键实现刷新或者开一个线程。
    @Override
    public void paint(Graphics g) {   // Graphics看作画笔类。
        System.out.println("paint");
        g.fillRect(x,y,50,50);   // 前两个参数是x,y坐标。  后两个指定矩形宽高。 左上角为0,0
        x += 10;
        y += 10;
    }
    //内部类，不暴露给外面，只是自己用。
    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("KEY Pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("KEY released");
        }
    }
}
