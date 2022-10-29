package vista;
import logica.Logica;
import java.awt.Color;
import javax.swing.JFrame;



public class Opciones extends JFrame{
    
    Logica db;
    public String usuario;
    public String contrasena;
    
    
    public Opciones(){
        
        initComponents(); //Carda los elementos del JFrame o JPanel
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            } 
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        setLocationRelativeTo(null); //Centa la pantalla
        setTitle("Administración de Oracle"); //Título
        setResizable(false);
        this.getContentPane().setBackground(Color.white);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrearRespaldos = new javax.swing.JButton();
        btnImportarRespaldo = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnDirectorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnParametros = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnTablespaces = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRoles = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnAuditoria = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnTunning = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cerrar_sesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearRespaldos.setBackground(java.awt.Color.darkGray);
        btnCrearRespaldos.setForeground(java.awt.Color.white);
        btnCrearRespaldos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/respaldo_off.png"))); // NOI18N
        btnCrearRespaldos.setBorder(null);
        btnCrearRespaldos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearRespaldos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/respaldo.png"))); // NOI18N
        btnCrearRespaldos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCrearRespaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRespaldosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearRespaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 110));

        btnImportarRespaldo.setBackground(java.awt.Color.darkGray);
        btnImportarRespaldo.setForeground(java.awt.Color.white);
        btnImportarRespaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recuperacion_respaldo_off.png"))); // NOI18N
        btnImportarRespaldo.setBorder(null);
        btnImportarRespaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImportarRespaldo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recuperacion_respaldo.png"))); // NOI18N
        btnImportarRespaldo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImportarRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarRespaldoActionPerformed(evt);
            }
        });
        jPanel1.add(btnImportarRespaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 110, 110));

        btnEstadisticas.setBackground(java.awt.Color.darkGray);
        btnEstadisticas.setForeground(java.awt.Color.white);
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadisticas_off.png"))); // NOI18N
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estadisticas.png"))); // NOI18N
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 110, 110));

        btnDirectorios.setBackground(java.awt.Color.darkGray);
        btnDirectorios.setForeground(java.awt.Color.white);
        btnDirectorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivos_directorios_off.png"))); // NOI18N
        btnDirectorios.setBorder(null);
        btnDirectorios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivos_directorios.png"))); // NOI18N
        btnDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectoriosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 110, 110));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Creación de Respaldos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Recuperación  de Respaldos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Estadísticas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("Administración de Archivos");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        btnParametros.setBackground(java.awt.Color.darkGray);
        btnParametros.setForeground(java.awt.Color.white);
        btnParametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parametros_off.png"))); // NOI18N
        btnParametros.setBorder(null);
        btnParametros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parametros.png"))); // NOI18N
        btnParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 110));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Tuning");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 60, 20));

        btnTablespaces.setBackground(java.awt.Color.darkGray);
        btnTablespaces.setForeground(java.awt.Color.white);
        btnTablespaces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablespace_off.png"))); // NOI18N
        btnTablespaces.setBorder(null);
        btnTablespaces.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablespace.png"))); // NOI18N
        btnTablespaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablespacesActionPerformed(evt);
            }
        });
        jPanel1.add(btnTablespaces, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 110, 110));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("Auditoría");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 60, -1));

        btnRoles.setBackground(java.awt.Color.darkGray);
        btnRoles.setForeground(java.awt.Color.white);
        btnRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/users_off.png"))); // NOI18N
        btnRoles.setBorder(null);
        btnRoles.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/users.png"))); // NOI18N
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });
        jPanel1.add(btnRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 110, 110));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Tablespaces");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, -1));

        btnAuditoria.setBackground(java.awt.Color.darkGray);
        btnAuditoria.setForeground(java.awt.Color.white);
        btnAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auditoria_off.png"))); // NOI18N
        btnAuditoria.setBorder(null);
        btnAuditoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/auditoria.png"))); // NOI18N
        btnAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuditoriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAuditoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 110, 110));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setText("Roles");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 50, -1));

        btnTunning.setBackground(java.awt.Color.darkGray);
        btnTunning.setForeground(java.awt.Color.white);
        btnTunning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tunning_off.png"))); // NOI18N
        btnTunning.setBorder(null);
        btnTunning.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tunning.png"))); // NOI18N
        btnTunning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTunningActionPerformed(evt);
            }
        });
        jPanel1.add(btnTunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 110, 110));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setText("Parámetros");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 80, 20));

        jSeparator1.setBackground(java.awt.Color.black);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 490, 10));

        jSeparator2.setBackground(java.awt.Color.black);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 490, 10));

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setForeground(java.awt.Color.white);

        jMenu1.setText("Salir");

        cerrar_sesion.setText("Cerrar Sesión");
        cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu1.add(cerrar_sesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesionActionPerformed
        db.Desconectar();
        this.setVisible(false);
        Login is = new Login();
        is.cargarUsuarios();
        is.setVisible(true);
    }//GEN-LAST:event_cerrar_sesionActionPerformed

    private void btnCrearRespaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRespaldosActionPerformed

        this.setVisible(false);
        CrearRespaldo cr = new CrearRespaldo();
        cr.usuario=usuario;
        cr.contrasena=contrasena;
        cr.db=this.db;
        cr.op=this;//le pasamos la referencia de esta ventana
        cr.cargarTablasUsuario(); 
        cr.cargarDirectorios();
        cr.setVisible(true);
    }//GEN-LAST:event_btnCrearRespaldosActionPerformed

    private void btnDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectoriosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminDirectorios ad = new AdminDirectorios();
        ad.usuario=usuario;
        ad.contrasena=contrasena;
        ad.db=this.db;
        ad.op=this;//le pasamos la referencia de esta ventana
        ad.cargarDirectorios();
        ad.cargarUsuarios();
        ad.setVisible(true);
        
    }//GEN-LAST:event_btnDirectoriosActionPerformed

    private void btnImportarRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarRespaldoActionPerformed

        this.setVisible(false);
        RecuperacionRespaldos rr = new RecuperacionRespaldos();
        rr.usuario = usuario;
        rr.contrasena = contrasena;
        rr.db = this.db;
        rr.op = this;//le pasamos la referencia de esta ventana
        rr.cargarTablasUsuario();
        rr.cargarDirectorios();
        rr.setVisible(true);
    }//GEN-LAST:event_btnImportarRespaldoActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed

        this.setVisible(false);
        AdminEstadisticas ae = new AdminEstadisticas();
        ae.usuario=usuario;
        ae.contrasena=contrasena;
        ae.db=this.db;
        ae.op=this;//le pasamos la referencia de esta ventana
        ae.cargarTablasUsuario();
        ae.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametrosActionPerformed
        this.setVisible(false);
        Parametros par = new Parametros();
        par.usuario = usuario;
        par.contrasena = contrasena;
        par.db = this.db;
        par.op = this;//le pasamos la referencia de esta ventana
        par.setVisible(true);
    }//GEN-LAST:event_btnParametrosActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        this.setVisible(false);
        Roles rol = new Roles();
        rol.usuario = usuario;
        rol.contrasena = contrasena;
        rol.db = this.db;
        rol.op = this;//le pasamos la referencia de esta ventana
        //par.cargarTablasUsuario();
        rol.setVisible(true);   
    }//GEN-LAST:event_btnRolesActionPerformed

    private void btnTablespacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablespacesActionPerformed
        this.setVisible(false);
        Tablespaces tb = new Tablespaces();
        tb.usuario = usuario;
        tb.contrasena = contrasena;
        tb.db = this.db;
        tb.op = this;//le pasamos la referencia de esta ventana
        //par.cargarTablasUsuario();
        tb.setVisible(true);  
    }//GEN-LAST:event_btnTablespacesActionPerformed

    private void btnAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuditoriaActionPerformed
        this.setVisible(false);
        Auditoria aud = new Auditoria();
        aud.usuario = usuario;
        aud.contrasena = contrasena;
        aud.db = this.db;
        aud.op = this;//le pasamos la referencia de esta ventana
        //par.cargarTablasUsuario();
        aud.setVisible(true);  
    }//GEN-LAST:event_btnAuditoriaActionPerformed

    private void btnTunningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTunningActionPerformed
        this.setVisible(false);
        Tunning aud = new Tunning();
        aud.usuario = usuario;
        aud.contrasena = contrasena;
        aud.db = this.db;
        aud.op = this;
        aud.setVisible(true);
    }//GEN-LAST:event_btnTunningActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuditoria;
    private javax.swing.JButton btnCrearRespaldos;
    private javax.swing.JButton btnDirectorios;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnImportarRespaldo;
    private javax.swing.JButton btnParametros;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnTablespaces;
    private javax.swing.JButton btnTunning;
    private javax.swing.JMenuItem cerrar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
