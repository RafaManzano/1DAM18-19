import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ProbandoSwing {
	
	private static JLabel label = new JLabel ("--");
	private static JButton btnlimpia = new JButton("Limpia");
	private static JButton btnescribe = new JButton("Escribe");
	
	public static void acciones(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btnlimpia) {
			label.setText("");
		}
		if (obj == btnescribe) {
			label.setText("Hola Mundo");
		}
	}
}

