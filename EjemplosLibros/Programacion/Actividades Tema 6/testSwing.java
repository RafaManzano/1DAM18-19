import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class testSwing {
	
	//Esto no deberia ser asi pero me da error asi que incumplo la orientacion a objetos
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
	
	public static void main (String[] args) {

		try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e) {
		}
		
		JFrame frame = new JFrame("Controlando Eventos");
		btnlimpia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acciones(e);
			}
			
		});
		btnescribe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acciones(e);
			}
			
		});
		frame.getContentPane().add(label);
		frame.getContentPane().add(btnlimpia);
		frame.getContentPane().add(btnescribe);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setLayout(new GridLayout(0,1));
		frame.pack();
		frame.setVisible(true);
	}
}

