import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Calculadora extends JFrame {
    //Creación del panel
    JPanel Centro = new JPanel();
    JPanel pnl = new JPanel();
    JPanel panelSuperior = new JPanel();
    JPanel Pizq = new JPanel();
    JPanel Pder = new JPanel();

    //Caja de texto
    JTextField Pant = new JTextField("0",25);
    //Objetos de ImageIcon que tienen la imagen y asignarsela a un label
    ImageIcon Logo = new ImageIcon("Icons/LogoCaca.png");
    JLabel Log = new JLabel(Logo);
    ImageIcon CelSol = new ImageIcon("Icons/CelSol.png");
    JLabel Celda = new JLabel(CelSol);

    //Creación de botones
    JButton BApagado = new JButton("OFF");
    JButton BC = new JButton(" C ");
    JButton BPorcentaje = new JButton(" % ");
    JButton BRaiz = new JButton("Raíz");
    JButton BSuma = new JButton(" + ");
    JButton BMC = new JButton("MC");
    JButton BSeven = new JButton(" 7 ");
    JButton BEight = new JButton(" 8 ");
    JButton BNine = new JButton(" 9 ");
    JButton BResta = new JButton(" - ");
    JButton BMR = new JButton("MR");
    JButton BFour = new JButton(" 4 ");
    JButton BFive = new JButton(" 5 ");
    JButton BSix = new JButton(" 6 ");
    JButton BDivisión = new JButton(" / ");
    JButton BMplus = new JButton("M+");
    JButton BOne = new JButton(" 1 ");
    JButton BTwo = new JButton(" 2 ");
    JButton BThree = new JButton(" 3 ");
    JButton BMulti = new JButton(" X ");
    JButton BMrest = new JButton("M-");
    JButton BPLusraro = new JButton("+/-");
    JButton BCero = new JButton(" 0 ");
    JButton BPoint = new JButton(" . ");
    JButton BResult = new JButton(" = ");

    //Imagenes de los botones
    ImageIcon ImgOff = new ImageIcon("Icons/ImgOff.png");
    ImageIcon ImgC = new ImageIcon("Icons/ImgC.png");
    ImageIcon ImgPorci = new ImageIcon("Icons/ImgPorci.png");
    ImageIcon ImgRaiz = new ImageIcon("Icons/ImgRaiz.png");
    ImageIcon ImgPlus = new ImageIcon("Icons/ImgPlus.png");
    ImageIcon ImgMC = new ImageIcon("Icons/ImgMC.png");
    ImageIcon Img7 = new ImageIcon("Icons/Img7.png");
    ImageIcon Img8 = new ImageIcon("Icons/Img8.png");
    ImageIcon Img9 = new ImageIcon("Icons/Img9.png");
    ImageIcon Imgmenos = new ImageIcon("Icons/Img-.png");
    ImageIcon ImgMR = new ImageIcon("Icons/ImgMR.png");
    ImageIcon Img4 = new ImageIcon("Icons/Img4.png");
    ImageIcon Img5 = new ImageIcon("Icons/Img5.png");
    ImageIcon Img6 = new ImageIcon("Icons/Img6.png");
    ImageIcon ImgSlash = new ImageIcon("Icons/ImgSlash.png");
    ImageIcon ImgMplus = new ImageIcon("Icons/ImgM+.png");
    ImageIcon Img1 = new ImageIcon("Icons/Img1.png");
    ImageIcon Img2 = new ImageIcon("Icons/Img2.png");
    ImageIcon Img3 = new ImageIcon("Icons/Img3.png");
    ImageIcon ImgEquis = new ImageIcon("Icons/ImgX.png");
    ImageIcon ImgMmenos = new ImageIcon("Icons/ImgM-.png");
    ImageIcon ImgRaro = new ImageIcon("Icons/Img+S-.png");
    ImageIcon Img0 = new ImageIcon("Icons/Img0.png");
    ImageIcon ImgPont = new ImageIcon("Icons/ImgPont.png");
    ImageIcon ImgResult = new ImageIcon("Icons/ImgResult.png");

    JButton nuv = new JButton();


    //Creación del objeto de Grid para asignar la posición
    GridBagConstraints Posicion = new GridBagConstraints();

    public Calculadora(){
        //Creación de ventana asignandole un nombre
        super("Calculadora");
        //Tamaño
        super.setSize(350,350);
        //Que se cierre al presionar el botón de salir
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Lugar de aparición
        super.setLocationRelativeTo(null);
        //No modificable
        super.setResizable(false);


        Prueba();
        PanelArriba();
        //PanelCentral();
        PanelIzq();
        PanelDer();

        super.add(panelSuperior);
        super.add(Pizq);
        super.add(Pder);
        super.add(Centro);
        super.add(pnl);

        AddColor();
        super.setVisible(true);
    }
//Panel que tiene los botones
    public void Prueba(){
        Centro.setBounds(10,80,315,220);
        Centro.setBackground(Color.WHITE);
        Centro.setLayout(new GridBagLayout());

        Posicion.gridwidth = 1;
        Posicion.weightx = 1;
        Posicion.weighty = 1;

        //Posición botones fila 1
        Posicion.gridx = 0;
        Posicion.gridy = 0;
        Centro.add(BApagado,Posicion);

        Posicion.gridx = 1;
        Posicion.gridy = 0;
        Centro.add(BC,Posicion);

        Posicion.gridx = 2;
        Posicion.gridy = 0;
        Centro.add(BPorcentaje,Posicion);

        Posicion.gridx = 3;
        Posicion.gridy = 0;
        Centro.add(BRaiz,Posicion);

        Posicion.gridx = 4;
        Posicion.gridy = 0;
        Centro.add(BSuma,Posicion);

        //Posición botones fila 2
        Posicion.gridx = 0;
        Posicion.gridy = 1;
        Centro.add(BMC,Posicion);

        Posicion.gridx = 1;
        Posicion.gridy = 1;
        Centro.add(BSeven,Posicion);

        Posicion.gridx = 2;
        Posicion.gridy = 1;
        Centro.add(BEight,Posicion);

        Posicion.gridx = 3;
        Posicion.gridy = 1;
        Centro.add(BNine,Posicion);

        Posicion.gridx = 4;
        Posicion.gridy = 1;
        Centro.add(BResta,Posicion);

        //Posición botones fila 3
        Posicion.gridx = 0;
        Posicion.gridy = 2;
        Centro.add(BMR,Posicion);

        Posicion.gridx = 1;
        Posicion.gridy = 2;
        Centro.add(BFour,Posicion);

        Posicion.gridx = 2;
        Posicion.gridy = 2;
        Centro.add(BFive,Posicion);

        Posicion.gridx = 3;
        Posicion.gridy = 2;
        Centro.add(BSix,Posicion);

        Posicion.gridx = 4;
        Posicion.gridy = 2;
        Centro.add(BDivisión,Posicion);

        //Posición botones fila 4
        Posicion.gridx = 0;
        Posicion.gridy = 3;
        Centro.add(BMplus,Posicion);

        Posicion.gridx = 1;
        Posicion.gridy = 3;
        Centro.add(BOne,Posicion);

        Posicion.gridx = 2;
        Posicion.gridy = 3;
        Centro.add(BTwo,Posicion);

        Posicion.gridx = 3;
        Posicion.gridy = 3;
        Centro.add(BThree,Posicion);

        Posicion.gridx = 4;
        Posicion.gridy = 3;
        Centro.add(BMulti,Posicion);

        //Posición botones fila 5
        Posicion.gridx = 0;
        Posicion.gridy = 4;
        Centro.add(BMrest,Posicion);

        Posicion.gridx = 1;
        Posicion.gridy = 4;
        Centro.add(BPLusraro,Posicion);

        Posicion.gridx = 2;
        Posicion.gridy = 4;
        Centro.add(BCero,Posicion);

        Posicion.gridx = 3;
        Posicion.gridy = 4;
        Centro.add(BPoint,Posicion);

        Posicion.gridx = 4;
        Posicion.gridy = 4;
        Centro.add(BResult,Posicion);

    }
    public void PanelArriba(){
        panelSuperior.setLayout(null);
        panelSuperior.setBounds(0,0,350,85);
        panelSuperior.setBackground(new Color(177, 74, 213));
        Log.setBounds(10,0,100,50);
        Pant.setBounds(15,50,300,20);
        Celda.setBounds(200,2,100,50);
        panelSuperior.add(Log);
        panelSuperior.add(Celda);
        panelSuperior.add(Pant);
/*
        nuv.setBounds(30,30,51,26);
        nuv.setIcon(ImgOff);
        panelSuperior.add(nuv);*/

    }
    public void PanelIzq(){

        Pizq.setBounds(0,80,10,270);
        Pizq.setBackground(new Color(177, 74, 213));

    }
    public void PanelDer(){
        Pder.setBounds(325,80,10,270);
        Pder.setBackground(new Color(177, 74, 213));

    }

    public void PanelCentral(){

        pnl.setBounds(10,80,350,265);
        pnl.setBackground(Color.WHITE);

        pnl.setLayout(new GridBagLayout());
    }

    public void AddColor(){
        BApagado.setBackground(new Color(200, 70, 200));
        BApagado.setForeground(Color.WHITE);
        BApagado.setBorderPainted(false);
        BC.setBackground(new Color(200, 70, 200));
        BC.setForeground(Color.WHITE);
        BC.setBorderPainted(false);
        BPorcentaje.setBackground(new Color(177, 74, 213));
        BPorcentaje.setBorderPainted(false);
        BPorcentaje.setForeground(Color.WHITE);
        BRaiz.setBackground(new Color(177, 74, 213));
        BRaiz.setBorderPainted(false);
        BRaiz.setForeground(Color.WHITE);
        BSuma.setBackground(new Color(177, 74, 213));
        BSuma.setBorderPainted(false);
        BSuma.setForeground(Color.WHITE);
        BMC.setBackground(new Color(177, 74, 213));
        BMC.setBorderPainted(false);
        BMC.setForeground(Color.WHITE);
        BSeven.setBackground(Color.WHITE);
        BSeven.setForeground(new Color(177,74,213));
        BEight.setBackground(Color.WHITE);
        BEight.setForeground(new Color(177,74,213));
        BNine.setBackground(Color.WHITE);
        BNine.setForeground(new Color(177,74,213));
        BResta.setBackground(new Color(177, 74, 213));
        BResta.setForeground(Color.WHITE);
        BResta.setBorderPainted(false);
        BMR.setBackground(new Color(177, 74, 213));
        BMR.setForeground(Color.WHITE);
        BMR.setBorderPainted(false);
        BFour.setBackground(Color.WHITE);
        BFour.setForeground(new Color(177,74,213));
        BFive.setBackground(Color.WHITE);
        BFive.setForeground(new Color(177,74,213));
        BSix.setBackground(Color.WHITE);
        BSix.setForeground(new Color(177,74,213));
        BDivisión.setBackground(new Color(177, 74, 213));
        BDivisión.setForeground(Color.WHITE);
        BDivisión.setBorderPainted(false);
        BMplus.setBackground(new Color(177, 74, 213));
        BMplus.setForeground(Color.WHITE);
        BMplus.setBorderPainted(false);
        BOne.setBackground(Color.WHITE);
        BOne.setForeground(new Color(177,74,213));
        BTwo.setBackground(Color.WHITE);
        BTwo.setForeground(new Color(177,74,213));
        BThree.setBackground(Color.WHITE);
        BThree.setForeground(new Color(177,74,213));
        BMulti.setBackground(new Color(177, 74, 213));
        BMulti.setForeground(Color.WHITE);
        BMulti.setBorderPainted(false);
        BMrest.setBackground(new Color(177, 74, 213));
        BMrest.setForeground(Color.WHITE);
        BMrest.setBorderPainted(false);
        BPLusraro.setBackground(new Color(177, 74, 213));
        BPLusraro.setForeground(Color.WHITE);
        BPLusraro.setBorderPainted(false);
        BCero.setBackground(Color.WHITE);
        BCero.setForeground(new Color(177, 74, 213));
        BPoint.setBackground(new Color(177, 74, 213));
        BPoint.setForeground(Color.WHITE);
        BPoint.setBorderPainted(false);
        BResult.setBackground(new Color(200,70,200));
        BResult.setForeground(Color.WHITE);
        BResult.setBorderPainted(false);


    }
    // METODO PARA DISEÑAR LOS LABELES CON LOS PARAMETROS NECESARIOS
    public void imgBotones() {
        // CREAMOS UNA IMAGEN EN BASE A UNA DIRECCION
        ImageIcon imagen = new ImageIcon("Icons/ImgOff.png");
        // CREAMOS UN ICONO EN BASE AL TAMAÑO DE LA IMAGEN
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(51,26, Image.SCALE_DEFAULT));
        // MANDAMOS EL ICONO A LOS LABELS
       BApagado.setIcon(icono);
    }
    public static void main(String[] args) {

            Calculadora obj = new Calculadora();

    }

}
