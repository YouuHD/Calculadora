import javax.swing.*;
import java.awt.*;

public class DistribuciónSetBounds extends JFrame{

    private JLabel LbAGENDA, LbNomb,LbApellido, LbCorreo, LbCelu, LbFechaNac, LbCalleyNumero, LbColoniaOFracc;
    private String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String[] Month = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    private JComboBox dia, mes;
    private JTextField TxtNom, TxtApellido, TxtCorreo, TxtCelular, TxtAño, TextCalleyNumero, TextColFracc;
    private JButton BGuardar, BCancelar;
    JPanel pnl = new JPanel();

    public DistribuciónSetBounds (){
        super("Distribución");

        Ventana();
        Componentes();

        super.setVisible(true);

    }
    public void Ventana(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);


    }

    public void Componentes(){
        LbAGENDA = new JLabel("Agenda");
        LbAGENDA.setFont(new Font("arial",Font.BOLD,25));

        LbNomb = new JLabel("Nombre");
        LbApellido = new JLabel("Apellido");
        LbCorreo = new JLabel("Correo electrónico");
        LbCelu = new JLabel("Numero de celular");
        TxtNom = new JTextField();
        TxtApellido = new JTextField();
        TxtCorreo = new JTextField();
        TxtCelular = new JTextField();
        LbFechaNac = new JLabel("Fecha de nacimiento. día / mes / año ");
        BGuardar = new JButton("Guardar");
        BCancelar = new JButton("Cancelar");
        dia = new JComboBox(day);
        dia.setEditable(true);
        mes = new JComboBox(Month);
        mes.setEditable(true);
        TxtAño = new JTextField();
        LbCalleyNumero = new JLabel("Calle y numero");
        TextCalleyNumero = new JTextField();
        LbColoniaOFracc = new JLabel("Colonia o Fraccionamiento");
        TextColFracc = new JTextField();

        LbAGENDA.setBounds(206,20,100,25);
        LbNomb.setBounds(50,55,100,20);
        TxtNom.setBounds(50,80,384,20);
        LbApellido.setBounds(50,105,100,20);
        TxtApellido.setBounds(50,130,384,20);
        LbCorreo.setBounds(50,165,180,20);
        TxtCorreo.setBounds(50,190,150,20);
        LbCelu.setBounds(284, 165, 180, 20);
        TxtCelular.setBounds(284,190,150,20);
        LbFechaNac.setBounds(50,220,250,20);
        dia.setBounds(50,245,40,20);
        mes.setBounds(95,245,90,20);
        TxtAño.setBounds(190,245,50,20);
        LbCalleyNumero.setBounds(50,270,100,20);
        TextCalleyNumero.setBounds(50,290,384,20);
        LbColoniaOFracc.setBounds(50,320,200,20);
        TextColFracc.setBounds(50,350,384,20);
        BGuardar.setBounds(140,380,100,30);
        BCancelar.setBounds(260, 380,100,30);

        this.add(LbAGENDA);
        this.add(LbNomb);
        this.add(TxtNom);
        this.add(LbApellido);
        this.add(TxtApellido);
        this.add(LbCorreo);
        this.add(TxtCorreo);
        this.add(LbCelu);
        this.add(TxtCelular);
        this.add(LbFechaNac);
        this.add(dia);
        this.add(mes);
        this.add(TxtAño);
        this.add(LbCalleyNumero);
        this.add(TextCalleyNumero);
        this.add(LbColoniaOFracc);
        this.add(TextColFracc);
        this.add(BGuardar);
        this.add(BCancelar);

    }

    public static void main(String[] args) {
        DistribuciónSetBounds objs = new DistribuciónSetBounds();
    }

}
