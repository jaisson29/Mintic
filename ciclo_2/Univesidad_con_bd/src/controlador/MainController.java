package controlador;

import modelo.ConexionDB;
import vista.MenuJFrame;

public class MainController {

    public MainController(){
        ConexionDB objConn = new ConexionDB();
        UniversidadController uController = new UniversidadController(objConn);
        /* Menu menuC = new Menu(uController);
        menuC.crearMenu(); */
        /* MenuGui menuGui = new MenuGui(uController);
        menuGui.crearMenu(); */
        new MenuJFrame();
    }
    
}
