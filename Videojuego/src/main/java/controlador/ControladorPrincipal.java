/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUIHistoria;
import vista.GUIInstrucciones;
import vista.GUILaberinto;
import vista.GUIPrincipal;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal implements ActionListener {
     private GUIPrincipal guiPrincipal;
    private GUIInstrucciones guiInstrucciones;
    private GUIHistoria guiHistoria;
    private GUILaberinto guiLaberinto;

    public ControladorPrincipal() {
        guiPrincipal = new GUIPrincipal(this);
        guiInstrucciones = new GUIInstrucciones(this);
        guiHistoria = new GUIHistoria(this);
        guiLaberinto = new GUILaberinto (this);
        guiPrincipal.setVisible(true);
        guiHistoria.setVisible(false);
        guiInstrucciones.setVisible(false);
        guiLaberinto.setVisible(false);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "btnInstrucciones":
                guiInstrucciones.setVisible(true);
                guiPrincipal.setVisible(false);
                break;
            case "btnHistoria":
                guiHistoria.setVisible(true);
                guiPrincipal.setVisible(false);
                break;
            case "btnJugar":
                guiLaberinto.setVisible(true);
                guiPrincipal.setVisible(false);
                break;
            case "btnSalir":
                System.exit(0);
                break;
            case "btnVolver":
                guiPrincipal.setVisible(true);
                guiInstrucciones.setVisible(false);
                guiHistoria.setVisible(false);
                guiLaberinto.setVisible(false);
                break;
        }
    }
}
