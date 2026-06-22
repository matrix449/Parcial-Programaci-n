
package Interface;


public class DeleteEntity extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DeleteEntity.class.getName());


    public DeleteEntity(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Boton1.addActionListener(this::Boton1ActionPerformed);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IdEntity = new javax.swing.JLabel();
        EntityText = new javax.swing.JTextField();
        Boton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        IdEntity.setText("Id_entity:");

        EntityText.addActionListener(this::EntityTextActionPerformed);

        Boton1.setText("Confirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(IdEntity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntityText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdEntity)
                    .addComponent(EntityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(Boton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntityTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EntityTextActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String idInput = EntityText.getText().trim();

        // 1. Validar que el campo no esté vacío
        if (idInput.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de entidad.", "Validación", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // 2. Convertir el texto ingresado a un número entero
            int idEntity = Integer.parseInt(idInput);

            // 3. Confirmación de seguridad antes de proceder con el borrado
            int respuesta = javax.swing.JOptionPane.showConfirmDialog(
                    this, 
                    "¿Está seguro de que desea eliminar la entidad con ID " + idEntity + "? Esta acción también borrará sus categorías vinculadas.", 
                    "Confirmar Eliminación", 
                    javax.swing.JOptionPane.YES_NO_OPTION, 
                    javax.swing.JOptionPane.QUESTION_MESSAGE
            );

            if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                // 4. Instanciar los objetos DAO
                dao.EntityDAO entityDAO = new dao.EntityDAO();
                dao.EntityCategoryDAO categoryDAO = new dao.EntityCategoryDAO();

                // 5. Ejecutar la eliminación en cascada
                // Primero removemos las relaciones de categoría basadas en el id_entity
                categoryDAO.borrarEntityCategory2(idEntity);

                // Segundo removemos el registro principal de la tabla entity
                entityDAO.borrarEntityDAO(idEntity);

                // 6. Informar éxito al usuario y cerrar ventana
                javax.swing.JOptionPane.showMessageDialog(this, "Entidad eliminada correctamente.", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El ID ingresado debe ser un valor numérico válido.", "Error de Formato", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado al intentar borrar: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
           DeleteEntity dialog = new DeleteEntity(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Boton1;
    private javax.swing.JTextField EntityText;
    private javax.swing.JLabel IdEntity;
    // End of variables declaration//GEN-END:variables
}
