import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField primeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JLabel txtPrimeiroValor;
    private JPanel panelMain;

    public Calculadora() {

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Peguei informação da tela
                Integer primeiro = Integer.valueOf(primeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                System.out.println(primeiro);
                System.out.println(segundo);

                //Processei
                Integer resultado = primeiro + segundo;
                
                //Mandei a tela para o resultado
                txtResultado.setText(resultado.toString());
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.pack();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
