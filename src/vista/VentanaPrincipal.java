package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFigurasd = new JLabel("Figuras 2D");
		lblFigurasd.setBounds(178, 16, 92, 20);
		contentPane.add(lblFigurasd);
		
		JButton btnCuadrado = new JButton("Cuadrado");
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCuadrado ventanaCuadrado = new VentanaCuadrado();
				ventanaCuadrado.setVisible(true);
				
			}
		});
		btnCuadrado.setBounds(31, 124, 115, 29);
		contentPane.add(btnCuadrado);
		
		JButton btnRectangulo = new JButton("Rectangulo");
		btnRectangulo.setBounds(161, 124, 115, 29);
		contentPane.add(btnRectangulo);
		
		JButton btnTriangulo = new JButton("Triangulo");
		btnTriangulo.setBounds(291, 124, 115, 29);
		contentPane.add(btnTriangulo);
	}

}
