import javax.swing.*;

public class CuadroDeDialogo extends JFrame{

    public CuadroDeDialogo(){
        //JOptionPane.showMessageDialog(null, "Información");
        int res;
        res=JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "ADVERTENCIA",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        System.out.println(res);
    }

    public static void main(String[] args){
        CuadroDeDialogo obj= new CuadroDeDialogo();
    }
}