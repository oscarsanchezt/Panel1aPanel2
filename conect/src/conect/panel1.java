package conect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class panel1 {

    private JFrame frame;
    private JTextField textField;
    private panel2 panel2;

    public static void main(String[] args) {
        panel1 window = new panel1();
        window.frame.setVisible(true);
    }

    public panel1() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(117, 80, 225, 21);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(172, 129, 105, 27);
        frame.getContentPane().add(btnEnviar);

        // Agregar un ActionListener para el botón "Enviar"
        btnEnviar.addActionListener(e -> {
            // Obtener el texto del JTextField
            String texto = textField.getText();

            // Actualizar el modelo de la lista en el panel2 existente
            if (panel2 != null) {
                panel2.actualizarLista(texto);
            }
        });

        // Crear una instancia del panel2 y mostrarlo
        panel2 = new panel2();
        panel2.getFrame().setVisible(true);
    }
}
