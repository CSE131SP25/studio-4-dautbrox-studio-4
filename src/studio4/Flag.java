package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0, 71, 171);
		StdDraw.filledSquare(0.5, 0.5, .5);
		double[] x = {0.0,0.5,0.7};
		double[] y = {0.0, 0.7, 0.0};
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledPolygon(x, y);
		
		double[] x2 = {0.4,0.7,1.0};
		double[] y2 = {0.0, 0.5, 0.0};
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledPolygon(x2, y2);
	}
}