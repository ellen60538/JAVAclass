package tw.ellen.apps;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ellen028 extends JFrame{
	
	private JButton open, close, exit ;
	
	public ellen028() {
		super("我的視窗程式");
		
		setLayout(new FlowLayout(FlowLayout.RIGHT)) ;
				
		open = new JButton("Open") ;
		close = new JButton("Close") ;
		exit = new JButton("Exit") ;
		
		add(open) ; add(close) ; add(exit) ;
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640, 480) ;
		setVisible(true);
	}

	public static void main(String[] args) {
		new ellen028() ;
		
	}

}
