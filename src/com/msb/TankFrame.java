package com.msb;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: yl
 * @Date: 2022/1/4 18:02
 * @Description: com.msb
 * @Version: 1.0
 */
public class TankFrame {
    //main
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(800,600);
        f.setResizable(false);
        f.setTitle("Tank War");
        f.setVisible(true);
        //窗口可关闭
        f.addWindowListener(new WindowAdapter() {  //匿名内部类  WindowAdapter实现了WindowListener的接口
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
