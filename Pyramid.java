/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		/* You fill this in. */
		  /* y-coordinate of the top layer */
	      int initY = (getHeight() - BRICKS_IN_BASE*BRICK_HEIGHT) / 2;
	      /* draw layers, top down */
	      for (int i = 0; i < BRICKS_IN_BASE; i++) {
	         /* y-coordinate of layer i */
	         int y = initY + i*BRICK_HEIGHT;
	         /* starting x-coordinate of layer i */
	         int initX = (getWidth() - (i + 1)*BRICK_WIDTH) / 2;
	       
	         /* draw bricks in layer i */
	         for (int j = 0; j <= i; j++) {
	            /* x-coordinate of brick j in layer i */
	            int x = initX + j*BRICK_WIDTH;
	            /* draw brick j in layer i */
	            GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
	            add(brick);
	         } /* for j */
	      } /* for i */

	}
}

