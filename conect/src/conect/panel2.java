package conect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;

public class panel2 {

    private JFrame frame;
    private JList<String> list;
    private DefaultListModel<String> listModel;

    public static void main(String[] args) {
        panel2 window = new panel2();
        window.frame.setVisible(true);
    }

    public panel2() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(165, 80, 151, 92);
        frame.getContentPane().add(scrollPane);

        // Crear el modelo de la lista
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        scrollPane.setViewportView(list);
    }

    // Método para actualizar el modelo de la lista con los datos pasados como parámetro
    public void actualizarLista(String texto) {
        listModel.addElement(texto);
    }

    // Método para obtener el JFrame del panel2
    public JFrame getFrame() {
        return frame;
    }
}
