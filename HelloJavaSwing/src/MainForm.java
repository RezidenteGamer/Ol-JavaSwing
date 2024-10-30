import javax.swing.*;

public class MainForm {
    private JTextField txtNome;
    private JPanel mainPanel;
    private JButton btnValidar;
    private JLabel resultado;

    public static void main(String[] args) {

        //cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira Tela");
        //<pstra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha TV no tamanho do meu painel
        frame.pack();
        //frame.setSize(500,500);
      //Ligar a TV
        frame.setVisible(true);


    }

}