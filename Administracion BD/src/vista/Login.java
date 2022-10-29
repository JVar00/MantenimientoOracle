
package vista;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Logica;


public class Login extends javax.swing.JFrame{

    Logica fun = new Logica();  //fun = funcionalidad
    ResultSet resultado;
    String usuario;
    String contrasena;

    public Login(){
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
        
    //CARGA LOS USUARIOS EN LA INTERFAZ
    public void cargarUsuarios(){
        

      fun.conectar("sys","root123");

      resultado = fun.usuarios();
      
        if(resultado!=null){
          
          try{
            esquemas_combo_box.removeAllItems();
            while(resultado.next()){
                esquemas_combo_box.addItem(resultado.getString(1));
            }
            esquemas_combo_box.setSelectedIndex(-1);
            fun.Desconectar();
            
            }catch(SQLException ex){
              Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_izquierdo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cubo_pic = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Panel_derecho = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Ingresar_esquema_boton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Panel_cerrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        contrasena_esquema = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        esquemas_combo_box = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));
        setIconImages(null);
        setLocation(new java.awt.Point(400, 150));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(630, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_izquierdo.setBackground(java.awt.Color.gray);
        Panel_izquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Administrador de BD");
        Panel_izquierdo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        cubo_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/db_administracion.png"))); // NOI18N
        Panel_izquierdo.add(cubo_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 210));

        jSeparator1.setBackground(java.awt.Color.black);
        Panel_izquierdo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, 10));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Compatible con OracleXE 18c");
        Panel_izquierdo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 170, -1));
        jLabel7.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(Panel_izquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 400));

        Panel_derecho.setBackground(java.awt.Color.lightGray);
        Panel_derecho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Algunas funciones requieren al usuario SYSTEM.");
        Panel_derecho.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        Ingresar_esquema_boton.setBackground(new java.awt.Color(153, 255, 153));
        Ingresar_esquema_boton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Ingresar_esquema_boton.setText("Ingresar");
        Ingresar_esquema_boton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ingresar_esquema_boton.setBorderPainted(false);
        Ingresar_esquema_boton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ingresar_esquema_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_esquema_botonActionPerformed(evt);
            }
        });
        Panel_derecho.add(Ingresar_esquema_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 30));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 63, 65));
        jLabel2.setText("Esquema");
        Panel_derecho.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 60, -1));

        Panel_cerrar.setBackground(new java.awt.Color(36, 47, 65));
        Panel_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_cerrarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        Panel_cerrar.add(jLabel4);

        Panel_derecho.add(Panel_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 20, -1));

        contrasena_esquema.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        contrasena_esquema.setText("contrasena");
        contrasena_esquema.setAutoscrolls(false);
        contrasena_esquema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contrasena_esquema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contrasena_esquemaMouseClicked(evt);
            }
        });
        Panel_derecho.add(contrasena_esquema, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 170, 20));

        jSeparator2.setBackground(java.awt.Color.black);
        Panel_derecho.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 310, 10));

        esquemas_combo_box.setBackground(java.awt.Color.darkGray);
        esquemas_combo_box.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        esquemas_combo_box.setForeground(java.awt.Color.white);
        esquemas_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        esquemas_combo_box.setBorder(null);
        esquemas_combo_box.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        esquemas_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esquemas_combo_boxActionPerformed(evt);
            }
        });
        Panel_derecho.add(esquemas_combo_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 220, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña");
        Panel_derecho.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("Elija el esquema al que quiera conectarse");
        Panel_derecho.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        getContentPane().add(Panel_derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 370, 400));

        setSize(new java.awt.Dimension(628, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contrasena_esquemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasena_esquemaMouseClicked
        contrasena_esquema.setText("");
    }//GEN-LAST:event_contrasena_esquemaMouseClicked

    
    
    //ENVIA A LA VENTANA PRINCIPAL
    private void Ingresar_esquema_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_esquema_botonActionPerformed
        
        usuario = (String)esquemas_combo_box.getSelectedItem();
        contrasena = String.valueOf(contrasena_esquema.getPassword());
       
        if(fun.conectar(usuario, contrasena)){
            
            Opciones opc = new Opciones();
         
            opc.db = this.fun;
            opc.usuario = usuario;
            opc.contrasena = contrasena;

            opc.setVisible(true);
            this.dispose();
            //JOptionPane.showMessageDialog(null, "Ha iniciado exitósamente");
            
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error al iniciar sesión",
                JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_Ingresar_esquema_botonActionPerformed

    private void Panel_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Panel_cerrarMouseClicked

    private void esquemas_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esquemas_combo_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esquemas_combo_boxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar_esquema_boton;
    private javax.swing.JPanel Panel_cerrar;
    private javax.swing.JPanel Panel_derecho;
    private javax.swing.JPanel Panel_izquierdo;
    private javax.swing.JPasswordField contrasena_esquema;
    private javax.swing.JLabel cubo_pic;
    private javax.swing.JComboBox<String> esquemas_combo_box;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
