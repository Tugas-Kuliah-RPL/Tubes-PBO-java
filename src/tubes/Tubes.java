/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.File;
import view.table.pelamaar;
import view.auth.Login;

/**
 *
 * @author USER
 */
public class Tubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login viewPelamar = new Login();
        viewPelamar.setVisible(true);
    }
    
}
