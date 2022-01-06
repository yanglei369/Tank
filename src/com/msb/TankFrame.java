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
public class TankFrame extends Frame{
    //重新绘制界面时，自动执行的函数。
    @Override
    public void paint(Graphics g) {   // Graphics看着画笔类。
        System.out.println("paint");
        g.fillRect(200,200,50,50);   // 前两个参数是x,y坐标。  后两个指定矩形宽高。 左上角为0,0
    }

    public TankFrame() throws HeadlessException {
        setSize(800,600);
        setResizable(false);
        setTitle("Tank War");
        setVisible(true);
        //窗口可关闭
        addWindowListener(new WindowAdapter() {  //匿名内部类  WindowAdapter实现了WindowListener的接口
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
