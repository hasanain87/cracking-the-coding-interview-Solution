import java.awt.*;
import java.util.concurrent.Semaphore;

import javax.swing.*;

class MyBall extends Thread
{
int x;
int y;
int sleeptime;
MyBallWindow ballWindow;
Color c;
int deltaY = 10;
int counter = 0;
int xy = 0;
Semaphore s;

public MyBall(int xx, int yy, int sleepTime, MyBallWindow ballWindow,
Color cc, int xy, Semaphore s)
{
x = xx;
y = yy;
sleeptime = sleepTime;
this.ballWindow = ballWindow;
c = cc;
this.xy = xy;
this.s = s;
}

public void run()
{
try {
s.acquire();
} catch (InterruptedException e1) {
}
while (true)
{
ballWindow.repaint();
y = y + deltaY;
if (y > 550)
{
deltaY = -deltaY;
counter ++;
if (counter > 3)
break;
}
if (y < 10) deltaY = -deltaY;
try
{
Thread.sleep(sleeptime);
}
catch (Exception e)
{ }
}
s.release();
}

public void draw(Graphics g)
{
g.setColor(Color.white);
g.fillOval(x, y-deltaY, 50, 50);

g.setColor(c);
g.fillOval(x, y, 50, 50);
}
}


class MyBallWindow extends JFrame
{
MyBall myBall[];

public MyBallWindow()
{
myBall = new MyBall[6];
Semaphore sem = new Semaphore(1);
myBall[0] = new MyBall(100, 50, 10, this, Color.red, 1, sem);
myBall[1] = new MyBall(200, 50, 15, this, Color.blue, 0, sem);
myBall[2] = new MyBall(300, 50, 30, this, Color.yellow, 1, sem);
myBall[3] = new MyBall(400, 50, 35, this, Color.green, 0, sem);
myBall[4] = new MyBall(500, 50, 50, this, Color.orange, 1, sem);
myBall[5] = new MyBall(600, 50, 60, this, Color.pink, 0, sem);

for (int i = 0; i < 6; i++)
{
myBall[i].start();
}
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(800, 800);
setVisible(true);
}

public void paint(Graphics g)
{
for (int i = 0; i < 6; i++)
{
myBall[i].draw(g);
}
}
}

public class MovingBalls
{
public static void main(String[] args)
{
new MyBallWindow();
}
}

