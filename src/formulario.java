import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario {
    private JPanel rootPanel;
    private JTextField txtcodig;
    private JTextField txtcedula;
    private JTextField txtnombre;
    private JTextField txtfecha;
    private JComboBox Signo;
    private JButton buscarPorCodigoButton;
    private JButton buscarPorNombreButton;
    private JButton buscarPorSignoButton;
    private JButton borrarElPresenteRegistroButton;
    private JButton actualizarElPresenteRegistroButton;
    private JButton ingresarElPresenteRegistroButton;
    private JButton limpiarFormularioButton;

    String v1,v2,v3,v4,v5;

    Cregistro objetoRegistro = new Cregistro();

    private formulario(){
        buscarPorCodigoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ingresarElPresenteRegistroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = txtcodig.getText().toString();
                v2 = txtcedula.getText().toString();
                v3 = txtnombre.getText().toString();
                v4 = txtfecha.getText().toString();
                v5 = Signo.getActionCommand().toString();
                objetoRegistro.ingresarReg(v1,v2,v3,v4,v5);
            }
        });
        limpiarFormularioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtcodig.setText("");
                txtcedula.setText("");
                txtfecha.setText("");
                txtnombre.setText("");
            }
        });
        buscarPorCodigoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = txtcodig.getText().toString();
                objetoRegistro.buscarcodigo(v1);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("formulario");
        frame.setContentPane(new formulario().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Cconection objetoconeccion = new Cconection();
        objetoconeccion.establecerCon();
    }
}
