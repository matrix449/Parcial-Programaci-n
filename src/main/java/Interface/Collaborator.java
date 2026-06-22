
package Interface;

import javax.swing.Timer;

public class Collaborator extends javax.swing.JPanel {
    
    private int idUsuarioLogueado;
    

    public Collaborator(int idUsuarioActivo) {
        
        this.idUsuarioLogueado = idUsuarioActivo;
        
        initComponents();
        cargarTablaEntity();
        cargarTablaEntityCat();
        
        Timer timerModerno = new Timer(10000, e -> {
            System.out.println("Actualizando tablas de forma automática...");
            cargarTablaEntity();
            cargarTablaEntityCat();
        });
        
        // 3. Iniciar el Timer para que corra en segundo plano
        timerModerno.start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableentitycat = new javax.swing.JTable();
        Texto1Cre = new javax.swing.JLabel();
        Texto3Del = new javax.swing.JLabel();
        Texto2Mo = new javax.swing.JLabel();
        Boton2 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Titulo.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        Titulo.setText("Collaborator");

        Tableentitycat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tableentitycat);

        Texto1Cre.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Texto1Cre.setText("Creatre entity");

        Texto3Del.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Texto3Del.setText("Delete entity");

        Texto2Mo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Texto2Mo.setText("Modify entity");

        Boton2.setText("IR");
        Boton2.addActionListener(this::Boton2ActionPerformed);

        Boton1.setText("IR");
        Boton1.addActionListener(this::Boton1ActionPerformed);

        Boton3.setText("IR");
        Boton3.addActionListener(this::Boton3ActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto2Mo)
                            .addComponent(Texto1Cre)
                            .addComponent(Texto3Del))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton3)
                            .addComponent(Boton1)
                            .addComponent(Boton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto1Cre)
                    .addComponent(Boton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto2Mo)
                    .addComponent(Boton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto3Del)
                    .addComponent(Boton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void cargarTablaEntity() {
        // Instanciamos el DAO de Entity
        dao.EntityDAO entityDAO = new dao.EntityDAO();

        // Definimos los títulos de las columnas que queremos mostrar en jTable1
        String[] columnas = {
            "ID", "Nombre", "Dimensión", "Zona", "Dirección", 
            "Estado", "Descripción", "Teléfono", "Email", "Web"
        }; 
        
        // Creamos el modelo de tabla vacío con los encabezados
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(null, columnas);

        try {
            // Llamamos al método listar() de tu EntityDAO para traer los registros de la BD
            java.util.List<entity.Entity> listaEntities = entityDAO.listar(); 
            
            // Recorremos la lista y agregamos fila por fila al modelo
            for (entity.Entity ent : listaEntities) {
                Object[] fila = {
                    ent.getIdEntity(),       // Usa tus getters reales
                    ent.getName(),
                    ent.getIdDimension(),
                    ent.getIdZone(),
                    ent.getIdAddress(),
                    ent.getIdState(),
                    ent.getDescription(),
                    ent.getPhone(),
                    ent.getEmail(),
                    ent.getWww()
                };
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            System.err.println("Error al cargar los datos en jTable1: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Le asignamos el modelo cargado a jTable1
        jTable1.setModel(modelo);
    }
    
    private void cargarTablaEntityCat() {
        // Instanciamos el DAO de EntityCategory
        dao.EntityCategoryDAO categoryDAO = new dao.EntityCategoryDAO();

        // Definimos los títulos de las columnas para Tableentitycat
        String[] columnas = {
            "ID Relación", "ID Entidad", "ID Categoría", "Fecha Creación", "Fecha Actualización"
        }; 
        
        // Creamos el modelo de tabla vacío con los encabezados correspondientes
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(null, columnas);

        try {
            // Llamamos al método listar() de tu EntityCategoryDAO para traer los registros de la BD
            java.util.List<entity.EntityCategory> listaCategories = categoryDAO.listar(); 
            
            // Recorremos la lista y mapeamos los getters de tu clase EntityCategory al Object[]
            for (entity.EntityCategory ec : listaCategories) {
                Object[] fila = {
                    ec.getIdEntityCategory(), // get identitycategory
                    ec.getIdEntity(),         // get identity
                    ec.getIdCategory(),       // get idcategory
                    ec.getDateCreate(),       // get datecreate
                    ec.getDateUpdate()        // get dateupdate
                };
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            System.err.println("Error al cargar los datos en Tableentitycat: " + e.getMessage());
            e.printStackTrace();
        }
        
        // 6. Asignamos el modelo de datos estructurado a tu tabla Tableentitycat
        Tableentitycat.setModel(modelo);
    }
    
    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
String input = javax.swing.JOptionPane.showInputDialog(
            this, 
            "Ingrese el ID de la entidad que desea modificar:", 
            "Modificar Entidad", 
            javax.swing.JOptionPane.QUESTION_MESSAGE
        );
        
        // 2. Si el usuario no canceló la ventana y escribió algo:
        if (input != null && !input.trim().isEmpty()) {
            try {
                // Convertimos lo que escribió a un número entero
                int idEntity = Integer.parseInt(input.trim());
                
                // Buscamos la ventana ancestro (Frame) para poder montar el JDialog correctamente
                java.awt.Window parentWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
                java.awt.Frame parentFrame = null;
                if (parentWindow instanceof java.awt.Frame) {
                    parentFrame = (java.awt.Frame) parentWindow;
                }
                
                // 3. ¡REPARADO! Abrimos la pantalla ModifyEntity pasándole el parentFrame, el boolean modal,
                // el ID de la entidad que ingresó en el cuadro de texto y el ID del usuario actual.
                ModifyEntity dialog = new ModifyEntity(parentFrame, true, idEntity, this.idUsuarioLogueado);
                
                // Centramos el formulario de modificación en pantalla y lo hacemos visible
                dialog.setLocationRelativeTo(parentWindow);
                dialog.setVisible(true);
                
            } catch (NumberFormatException e) {
                // Si escribió letras o símbolos en vez de un número de ID, salta este aviso
                javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Por favor, ingrese un número de ID válido.", 
                    "Error de Formato", 
                    javax.swing.JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
    // 1. Buscamos el Frame ancestro en el que esté contenido este JPanel
        java.awt.Window parentWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        java.awt.Frame parentFrame = null;
        
        if (parentWindow instanceof java.awt.Frame) {
            parentFrame = (java.awt.Frame) parentWindow;
        }
        
        // 2. Instanciamos el JDialog enviando el parentFrame encontrado
        CreateEntity dialog = new CreateEntity(parentFrame, true, this.idUsuarioLogueado);
        
        // 3. Centramos el diálogo respecto a la pantalla/ventana principal y lo hacemos visible
        dialog.setLocationRelativeTo(parentWindow);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        // TODO add your handling code here:
        // --- CÓDIGO PARA ELIMINAR ENTIDAD ---
        java.awt.Window parentWindow = javax.swing.SwingUtilities.getWindowAncestor(this);
        java.awt.Frame parentFrame = null;
        
        if (parentWindow instanceof java.awt.Frame) {
            parentFrame = (java.awt.Frame) parentWindow;
        }
        
        DeleteEntity dialog = new DeleteEntity(parentFrame, true);
        dialog.setLocationRelativeTo(parentWindow);
        dialog.setVisible(true);
    }//GEN-LAST:event_Boton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JTable Tableentitycat;
    private javax.swing.JLabel Texto1Cre;
    private javax.swing.JLabel Texto2Mo;
    private javax.swing.JLabel Texto3Del;
    private javax.swing.JLabel Titulo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
