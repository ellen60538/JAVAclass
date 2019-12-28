import javax.swing.JOptionPane;

public class ellen003 {

	public static void main(String[] args) {
		//JOptionPane ==> 輸入輸出框
		String x = JOptionPane.showInputDialog("Input a number") ;
		String y = JOptionPane.showInputDialog("Input a number") ;
		
		int intX = Integer.parseInt(x) ;
		int intY = Integer.parseInt(y) ;
		int intR = intX + intY ;
		JOptionPane.showMessageDialog(null, intX + "+" + intY + "=" + intR);
		
	}

}
