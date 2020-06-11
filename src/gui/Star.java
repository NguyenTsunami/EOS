/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

/**
 *
 * @author thuy
 */
public class Star {

    private double x;
    private double y;
    private double r;
    private double xPoints[] = new double[10];
    private double yPoints[] = new double[10];

    public void initPoints() {
        double rInside = r * Math.cos(Math.toRadians(72)) / Math.cos(Math.toRadians(36));

        xPoints[0] = x - r;
        yPoints[0] = y;

        xPoints[1] = x - rInside * Math.sin(Math.toRadians(54));
        yPoints[1] = y - rInside * Math.cos(Math.toRadians(54));

        xPoints[2] = x - r * Math.cos(Math.toRadians(72));
        yPoints[2] = y - r * Math.sin(Math.toRadians(72));

        xPoints[3] = x + rInside * Math.cos(Math.toRadians(72));
        yPoints[3] = y - rInside * Math.sin(Math.toRadians(72));

        xPoints[4] = x + r * Math.sin(Math.toRadians(54));
        yPoints[4] = y - r * Math.cos(Math.toRadians(54));

        xPoints[5] = x + rInside;
        yPoints[5] = y;

        xPoints[6] = x + r * Math.sin(Math.toRadians(54));
        yPoints[6] = y + r * Math.cos(Math.toRadians(54));

        xPoints[7] = x + rInside * Math.cos(Math.toRadians(72));
        yPoints[7] = y + rInside * Math.sin(Math.toRadians(72));

        xPoints[8] = x - r * Math.cos(Math.toRadians(72));
        yPoints[8] = y + r * Math.sin(Math.toRadians(72));

        xPoints[9] = x - rInside * Math.sin(Math.toRadians(54));
        yPoints[9] = y + rInside * Math.cos(Math.toRadians(54));
    }
    
    public double getYmin() {
        return y - r * Math.sin(Math.toRadians(72));
    }
    
    public double getYmax() {
        return y + r * Math.sin(Math.toRadians(72));
    }
    
    public void draw(Graphics g, double YPos) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        if (y + r * Math.sin(Math.toRadians(72)) <= YPos) {
            GeneralPath star = new GeneralPath();
            star.moveTo(yPoints[0], xPoints[0]);
            for (int i = 0; i < 10; i++) {
                star.lineTo(yPoints[i], xPoints[i]);
            }
            star.closePath();
            g2d.setPaint(Color.yellow);
            g2d.fill(star);
        } else {
            double[] xPNew = new double[20];
            double[] yPNew = new double[20];
            int count = 0;

            //create new shape
            for (int i = 0; i < 10; i++) {
                int j = (i + 1) % 10;
                double x1 = xPoints[i];
                double y1 = yPoints[i];
                double x2 = xPoints[j];
                double y2 = yPoints[j];
                if (y1 > YPos && y2 <= YPos) {
                    double xNew = ((YPos - y1) * (x2 - x1)) / (y2 - y1); //hệ số góc
                    xNew += x1;

                    xPNew[count] = xNew;
                    yPNew[count] = YPos;
                    count++;
                    xPNew[count] = x2;
                    yPNew[count] = y2;
                    count++;
                } else if (y1 <= YPos && y2 > YPos) {
                    double xNew = ((YPos - y1) * (x2 - x1)) / (y2 - y1); //hệ số góc
                    xNew += x1;

                    xPNew[count] = x1;
                    yPNew[count] = y1;
                    count++;
                    xPNew[count] = xNew;
                    yPNew[count] = YPos;
                    count++;
                } else if (y1 <= YPos && y2 <= YPos) {
                    xPNew[count] = x1;
                    yPNew[count] = y1;
                    count++;
                    xPNew[count] = x2;
                    yPNew[count] = y2;
                    count++;
                }
            }
            //draw
            GeneralPath star = new GeneralPath();
            star.moveTo(yPNew[0], xPNew[0]);
            for (int i = 0; i < count; i++) {
                star.lineTo(yPNew[i], xPNew[i]);
            }
            star.closePath();
            g2d.setPaint(Color.yellow);
            g2d.fill(star);
        }

        g2d.setPaint(Color.black);
        for (int i = 0; i < 10; i++) {
            int j = (i + 1) % 10;
            g2d.draw(new Line2D.Double(yPoints[i], xPoints[i], yPoints[j], xPoints[j]));
        }
    }

    public Star(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        initPoints();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
}
