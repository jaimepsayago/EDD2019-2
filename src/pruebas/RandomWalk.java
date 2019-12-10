package pruebas;

import java.util.Scanner;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.util.LinkedList;



public class RandomWalk {
	

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	//StdDraw stdDraw = new StdDraw();
        int n = Integer.parseInt("4");
        StdDraw.setXscale(-n, +n);
        StdDraw.setYscale(-n, +n);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        while (Math.abs(x) < n && Math.abs(y) < n) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.45);
            double r = Math.random();
            if      (r < 0.25) x--;
            else if (r < 0.50) x++;
            else if (r < 0.75) y--;
            else if (r < 1.00) y++;
            steps++;
            StdDraw.setPenColor(StdDraw.PINK);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(40);
        }
        StdOut.println("Total steps = " + steps);
    }

}


