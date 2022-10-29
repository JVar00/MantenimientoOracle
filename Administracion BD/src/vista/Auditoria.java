package vista;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Logica;

public class Auditoria extends JFrame {

    public String usuario;
    public String contrasena;
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    List<String> listDirectorios = new ArrayList<String>();
    public Logica db = new Logica();
    ResultSet resultado;
    ResultSet resultado2;

    public Auditoria() {
        initComponents();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auditoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Auditoria"); //Título
        this.setResizable(false);
        cargarUsuarios();
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(java.awt.Color.darkGray);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverse.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jSeparator1.setBackground(java.awt.Color.black);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 620, 10));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.blue);
        jButton1.setText("Visualizar auditoria de sesiones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 260, 40));

        jButton3.setForeground(java.awt.Color.blue);
        jButton3.setText("Auditar Conexiones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jButton4.setForeground(java.awt.Color.blue);
        jButton4.setText("Auditar inicios de sesión fallidos");
        jButton4.setActionCommand("Auditar inicios de sesión fallidos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        jButton5.setForeground(java.awt.Color.blue);
        jButton5.setText("Auditar inicios de sesión");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jButton6.setForeground(java.awt.Color.blue);
        jButton6.setText("Auditar inicios de sesión exitosos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 140, 30));

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Tabla:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Auditoria de tablas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel3.setBackground(java.awt.Color.black);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Schema:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Session Id", "Userhost", "Username", "ActionName", "Tabla", "Action"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 500, 200));

        jButton7.setForeground(java.awt.Color.blue);
        jButton7.setText("Visualizar auditoria de las tablas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Tipo Suceso", "Hora Inicio Sesion", "Hora Fin Sesion"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 500, 240));

        jButton8.setForeground(java.awt.Color.blue);
        jButton8.setText("Activar auditoria de la tabla");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (db.auditarConexiones()) {
            JOptionPane.showMessageDialog(null, "Se ha activado la auditoria para las conexiones", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se logro activar la auditoria para las conexiones", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (db.auditarIniciosSesionNoExitosos()) {
            JOptionPane.showMessageDialog(null, "Se ha activado la auditoria para los inicios de sesion no exitosos", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se logro activar la auditoria para los inicios de sesion no exitosos", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarGrid2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (db.auditarIniciosSesion()) {
            JOptionPane.showMessageDialog(null, "Se ha activado la auditoria para los inicios de sesion", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se logro activar la auditoria para los inicios de sesion", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (db.auditarIniciosSesionExitosos()) {
            JOptionPane.showMessageDialog(null, "Se ha activado la auditoria para los inicios de sesion exitosos", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se logro activar la auditoria para los inicios de sesion exitosos", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        llenarGrid();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (db.auditarTabla(String.valueOf(jComboBox2.getSelectedItem()), String.valueOf(jComboBox1.getSelectedItem()))) {
            JOptionPane.showMessageDialog(null, "Se ha activado la auditoria para la tabla " + String.valueOf(jComboBox1.getSelectedItem())
                    + " del schema " + String.valueOf(jComboBox2.getSelectedItem()), "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se logro activar la auditoria para la tabla " + String.valueOf(jComboBox1.getSelectedItem())
                    + " del schema " + String.valueOf(jComboBox2.getSelectedItem()), "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        cargarTablas();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    //CARGA LOS USUARIOS EN LA INTERFAZ
    public void cargarUsuarios() {

        db.conectar("sys", "root123");
        resultado = db.usuarios();

        if (resultado != null) {

            try {
                jComboBox2.removeAllItems();
                while (resultado.next()) {
                    jComboBox2.addItem(resultado.getString(1));
                }
                jComboBox2.setSelectedIndex(-1);

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cargarTablas() {
        db.conectar("sys", "root123");
        resultado2 = db.verTablasXSchema(String.valueOf(jComboBox2.getSelectedItem()));

        if (resultado2 != null) {

            try {
                jComboBox1.removeAllItems();
                while (resultado2.next()) {
                    jComboBox1.addItem(resultado2.getString(1));
                }
                jComboBox1.setSelectedIndex(-1);

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void llenarGrid() {

        ResultSet resultado;
        DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }

        resultado = db.verAuditoriaPorAccion();

        this.jTable1.removeAll();

        try {
            while (resultado.next()) {
                Object[] fila = new Object[6];
                fila[0] = resultado.getString("SESSIONID");
                fila[1] = resultado.getString("USERHOST");
                fila[2] = resultado.getString("USERNAME");
                fila[3] = resultado.getString("ACTION_NAME");
                fila[4] = resultado.getString("OBJ_NAME");
                fila[5] = resultado.getInt("ACTION");
                modelo.addRow(fila);
            }
            jTable1.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(AdminEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void llenarGrid2() {

        ResultSet resultado;
        DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();

        for (int i = 0; i < jTable2.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }

        resultado = db.visualizarAuditoriaSesiones();

        this.jTable2.removeAll();

        try {
            while (resultado.next()) {
                Object[] fila = new Object[4];
                fila[0] = resultado.getString("USERNAME");
                fila[1] = resultado.getString("TIPO_SUCESO");
                fila[2] = resultado.getString("HORA_INICIO_SESION");
                fila[3] = resultado.getString("HORA_FIN_SESION");
                modelo.addRow(fila);
            }
            jTable2.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(AdminEstadisticas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
