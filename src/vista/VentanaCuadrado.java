package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Cuadrado;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCuadrado extends JFrame {

	private JPanel contentPane;
	private JTextField txtLado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCuadrado frame = new VentanaCuadrado();
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
	public VentanaCuadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCuadrado = new JLabel("Cuadrado");
		lblCuadrado.setBounds(165, 16, 69, 20);
		contentPane.add(lblCuadrado);

		JLabel lblLado = new JLabel("Lado:");
		lblLado.setBounds(81, 55, 69, 20);
		contentPane.add(lblLado);

		txtLado = new JTextField();
		txtLado.setBounds(165, 52, 146, 26);
		contentPane.add(txtLado);
		txtLado.setColumns(10);

		JLabel lblResultado = new JLabel("New label");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResultado.setBounds(81, 122, 240, 20);
		contentPane.add(lblResultado);

		JButton btnCalcularArea = new JButton("Calcular Area");
		btnCalcularArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuadrado cuadrado = new Cuadrado();

				cuadrado.setLado(Float.parseFloat(txtLado.getText()));

				float area = cuadrado.calcularArea();

				lblResultado.setText("El valor del area es: " + area);

			}
		});
		btnCalcularArea.setBounds(65, 158, 146, 29);
		contentPane.add(btnCalcularArea);

		JButton btnCalcularPerimetro = new JButton("Calcular Perimetro");
		btnCalcularPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cuadrado cuadrado = new Cuadrado();

				cuadrado.setLado(Float.parseFloat(txtLado.getText()));

				float perimetro = cuadrado.calcularPerimetro();

				lblResultado.setText("El valor del perimetro es: " + perimetro);
			}
		});
		btnCalcularPerimetro.setBounds(240, 158, 163, 29);
		contentPane.add(btnCalcularPerimetro);

	}
}
