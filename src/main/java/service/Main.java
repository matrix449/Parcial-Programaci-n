package service;

import Interface.Collaborator;
import javax.swing.JFrame;

/**
 * Clase principal para probar el flujo desde el panel Collaborator.
 * @author chaco
 */
public class Main {

    public static void main(String[] args) {
        /* Establecer el aspecto visual Nimbus */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Ejecutar la aplicación en el hilo de Swing */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 1. Creamos la ventana principal (Frame)
                JFrame framePrincipal = new JFrame("Panel de Control - Collaborator");
                framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // 2. Instanciamos tu panel Collaborator
                Collaborator panelCollaborator = new Collaborator();
                
                // 3. Agregamos el panel al contenedor de la ventana
                framePrincipal.getContentPane().add(panelCollaborator);
                
                // 4. Empaquetamos la ventana para que tome el tamaño del panel y la centramos
                framePrincipal.pack();
                framePrincipal.setLocationRelativeTo(null);
                
                // 5. Hacemos visible la interfaz completa
                framePrincipal.setVisible(true);
            }
        });
    }
}