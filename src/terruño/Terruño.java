package terruño;

import Vista.Menu;
import javax.swing.JOptionPane;

public class Terruño {

    public static void main(String[] args) {
        try { 
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"debe agregar los drivers "+ex.getMessage());
        }
        Menu.main(args);
    }
}
   
