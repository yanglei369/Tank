package com.msb;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: yl
 * @Date: 2022/1/6 9:46
 * @Description: com.msb
 * @Version: 1.0
 */
public class Main {
    //main
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        //屏幕自动刷新
        while (true){
            Thread.sleep(50);
            tf.repaint();   //repaint会自动调用paint方法。
        }
    }
}
