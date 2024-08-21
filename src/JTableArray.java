import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTableArray extends JFrame{

    public JTableArray(){
        super("Matriz en una trabla");

        //Arreglo con los titulos de las columnas de la tabla
        String[] titulos = {"Carrera", "Nombre ", "Apellidos"};

        //Arreglo bidimencional de objetos con los datos de la tabla
        Object[][]datos = {
                {"Sistemas, ","Anibal","Saucedo"},
                {"Informática","Juan","Perez"},
                {"TICS","Rosa","Lopez"},
        };
        //Tabla
        final JTable miTabla = new JTable(datos,titulos);
        miTabla.setPreferredScrollableViewportSize(new Dimension(700,100));
        //Creación del scrool para visualizar y poder recorrer datos
        JScrollPane scroll = new JScrollPane(miTabla);

        getContentPane().add(scroll,BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        JTableArray obj = new JTableArray();
        obj.pack();
        obj.setVisible(true);
    }
}
