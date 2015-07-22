package by.tranning.book.chapter13;

import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="SimpleApplet" width="200" height="60"/>
 */
public class SimpleApplet extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1103654908585687999L;

	@Override
	public void paint(Graphics g) {
		g.drawString("Simple applet", 20, 20);
	}

	
}
