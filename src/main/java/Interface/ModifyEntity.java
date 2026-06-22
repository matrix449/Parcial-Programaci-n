
package Interface;


public class ModifyEntity extends javax.swing.JDialog {
    
    private int idEntityAEditar;
    private int idUsuarioModificador;
    private dao.EntityDAO entityDAO = new dao.EntityDAO();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ModifyEntity.class.getName());


    public ModifyEntity(java.awt.Frame parent, boolean modal, int idEntity, int idUsuarioActivo) {
    super(parent, modal);
    this.idEntityAEditar = idEntity;
    this.idUsuarioModificador = idUsuarioActivo;
    
    initComponents(); // Este lo deja NetBeans por defecto
    cargarDatosEntidad();// Llamamos al método que va a rellenar los cuadritos de texto
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        DimesionBox = new javax.swing.JComboBox<>();
        Dimesion = new javax.swing.JLabel();
        Zone = new javax.swing.JLabel();
        ZoneBox = new javax.swing.JComboBox<>();
        Address = new javax.swing.JLabel();
        AddressText = new javax.swing.JTextField();
        CategoryBox = new javax.swing.JComboBox<>();
        Category = new javax.swing.JLabel();
        State = new javax.swing.JLabel();
        StateBox = new javax.swing.JComboBox<>();
        Phone = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        Link = new javax.swing.JLabel();
        LinkText = new javax.swing.JTextField();
        www = new javax.swing.JLabel();
        wwwText = new javax.swing.JTextField();
        Description = new javax.swing.JLabel();
        DescriptionText = new javax.swing.JTextField();
        Boton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Name.setText("Name:");

        NameText.addActionListener(this::NameTextActionPerformed);

        DimesionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Dimesion.setText("Dimesion:");

        Zone.setText("Zone:");

        ZoneBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Address.setText("Address:");

        AddressText.addActionListener(this::AddressTextActionPerformed);

        CategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Category.setText("Category:");

        State.setText("State:");

        StateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Phone.setText("Phone:");

        PhoneText.addActionListener(this::PhoneTextActionPerformed);

        Email.setText("Email:");

        EmailText.addActionListener(this::EmailTextActionPerformed);

        Link.setText("Link:");

        LinkText.addActionListener(this::LinkTextActionPerformed);

        www.setText("www:");

        wwwText.addActionListener(this::wwwTextActionPerformed);

        Description.setText("Description:");

        DescriptionText.addActionListener(this::DescriptionTextActionPerformed);

        Boton2.setText("Confirmar");
        Boton2.addActionListener(this::Boton2ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Address)
                                    .addComponent(Zone)
                                    .addComponent(State)
                                    .addComponent(Category))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ZoneBox, 0, 124, Short.MAX_VALUE)
                                    .addComponent(CategoryBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(StateBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddressText)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Name)
                                    .addComponent(Dimesion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NameText)
                                    .addComponent(DimesionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(www, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Description, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wwwText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescriptionText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Link)
                                .addGap(18, 18, 18)
                                .addComponent(LinkText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Phone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phone)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email)
                            .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Link)
                            .addComponent(LinkText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(www)
                            .addComponent(wwwText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Description))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(State)
                            .addComponent(StateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dimesion)
                            .addComponent(DimesionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zone)
                            .addComponent(ZoneBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address)
                            .addComponent(AddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Category)
                            .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Boton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextActionPerformed

    private void AddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextActionPerformed

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextActionPerformed

    private void LinkTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LinkTextActionPerformed

    private void wwwTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wwwTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wwwTextActionPerformed

    private void DescriptionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionTextActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        // TODO add your handling code here:
        if (NameText.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "El nombre es obligatorio", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Creamos el objeto con las modificaciones que el usuario hizo en la pantalla
            entity.Entity entModificada = new entity.Entity();
            entModificada.setIdEntity(this.idEntityAEditar); // Importante para el WHERE del SQL
            entModificada.setName(NameText.getText().trim());
            entModificada.setDescription(DescriptionText.getText().trim());
            entModificada.setPhone(PhoneText.getText().trim());
            entModificada.setEmail(EmailText.getText().trim());
            entModificada.setWww(wwwText.getText().trim());
            entModificada.setLink(LinkText.getText().trim());
            
            // IDs temporales para las llaves foráneas (ajústalos según la lógica de tus combos)
            entModificada.setIdDimension(1); 
            entModificada.setIdZone(1);      
            entModificada.setIdAddress(1);   
            entModificada.setIdState(1);     

            // Guardamos en la base de datos llamando al DAO
            entityDAO.modificarEntityDAO(entModificada, this.idUsuarioModificador);
            
            // Avisamos al usuario que todo salió bien y cerramos la ventanita
            javax.swing.JOptionPane.showMessageDialog(this, "Entidad modificada con éxito", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            this.dispose(); 
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar los cambios: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Boton2ActionPerformed
    
    private void cargarDatosEntidad() {
    // Buscamos los datos actuales usando el método que creamos en el Paso 1
    entity.Entity ent = entityDAO.buscarPorId(this.idEntityAEditar);
    
    if (ent != null) {
        // Ponemos el texto actual en cada campo de la pantalla
        NameText.setText(ent.getName());
        AddressText.setText(String.valueOf(ent.getIdAddress())); 
        PhoneText.setText(ent.getPhone());
        EmailText.setText(ent.getEmail());
        LinkText.setText(ent.getLink());
        wwwText.setText(ent.getWww());
        DescriptionText.setText(ent.getDescription());
        
        // (Opcional) Para los ComboBoxes, de momento los dejamos en el primer ítem
        DimesionBox.setSelectedIndex(0); 
        ZoneBox.setSelectedIndex(0);
        StateBox.setSelectedIndex(0);
        CategoryBox.setSelectedIndex(0);
        
    } else {
        // Si el usuario escribió un ID que no existe, avisa y cierra la ventana
        javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ninguna entidad con el ID: " + idEntityAEditar, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        this.dispose(); 
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
                ModifyEntity dialog = new ModifyEntity(new javax.swing.JFrame(), true, 0, 0);
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
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AddressText;
    private javax.swing.JToggleButton Boton2;
    private javax.swing.JLabel Category;
    private javax.swing.JComboBox<String> CategoryBox;
    private javax.swing.JLabel Description;
    private javax.swing.JTextField DescriptionText;
    private javax.swing.JLabel Dimesion;
    private javax.swing.JComboBox<String> DimesionBox;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel Link;
    private javax.swing.JTextField LinkText;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JLabel State;
    private javax.swing.JComboBox<String> StateBox;
    private javax.swing.JLabel Zone;
    private javax.swing.JComboBox<String> ZoneBox;
    private javax.swing.JLabel www;
    private javax.swing.JTextField wwwText;
    // End of variables declaration//GEN-END:variables
}
