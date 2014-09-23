/* Hello! The authors of this code are: Misha Lavva, Peter Turnbull, and Przemek Gardias
 * 
 * Other contributors/helpers:
 * 
 * Sources of code:
 * 
 * Problems We Encountered:
 * 
 * Decisions We Made:
 * 
 * Assumptions We Made in the Bleak Storm of Ambiguity
 * 
 * Justifications for Choices We Made That Resulted in Fewer Features Than the Requirements Call For:
 * 
 */

package v1;

import java.awt.Dimension;
import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		final int HEIGHT = 1000;
		final int WIDTH = 1000;
		JFrame f = new JFrame();
		f.setSize(WIDTH, HEIGHT);
		GameFrame display = new GameFrame(WIDTH, HEIGHT);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("HiVolts");
		f.add(display);
		f.setVisible(true);
	}
}