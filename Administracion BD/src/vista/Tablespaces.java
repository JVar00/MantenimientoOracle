
package vista;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.Logica;
import org.apache.commons.io.FilenameUtils;


public class Tablespaces extends JFrame{
    
    public String usuario;
    public String contrasena;
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    public Logica db;
    ResultSet resultado;
    



    public Tablespaces(){
        
        initComponents();
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            } 
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablespaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null);
        this.setTitle("Tablespaces"); //Título
        this.setResizable(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        param_header = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnCrearTablespace = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        btnCrearTablespaceTemp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        btnSelectDBF = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

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

        param_header.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        param_header.setText("Administrar tablespaces");
        jPanel1.add(param_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Cambiar Tamaño de Datafile");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 200, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione Tamaño");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 120, -1));

        jSpinner1.setBorder(null);
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 100, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("MB");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 30, 20));

        btnCrearTablespace.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearTablespace.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearTablespace.setText("Crear");
        btnCrearTablespace.setBorder(null);
        btnCrearTablespace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTablespaceActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearTablespace, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 70, 30));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Crear Tablespace");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, -1));

        jSpinner2.setToolTipText("50");
        jSpinner2.setBorder(null);
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 100, 30));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("MB");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 30, 20));

        btnCrearTablespaceTemp.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearTablespaceTemp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearTablespaceTemp.setText("Crear");
        btnCrearTablespaceTemp.setBorder(null);
        btnCrearTablespaceTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTablespaceTempActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearTablespaceTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 70, 30));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Crear Tablespace Temporal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setText("Tamaño del Tablespace Temporal");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 210, -1));

        jSpinner3.setBorder(null);
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 100, 30));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setText("MB");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 30, 20));

        btnSelectDBF.setBackground(new java.awt.Color(153, 255, 153));
        btnSelectDBF.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnSelectDBF.setText("Seleccione Datafile");
        btnSelectDBF.setBorder(null);
        btnSelectDBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDBFActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectDBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 130, 30));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setText("Tamaño del Tablespace");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 600, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 600, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 600, 10));

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Advertencia: elija un tamaño superior al que que ya ocupan los datos almacenados o estos seran borrados");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 610, 20));

        jLabel11.setBackground(java.awt.Color.lightGray);
        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 0));
        jLabel11.setText("Primero elija el tamaño");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 140, 20));

        jLabel12.setBackground(java.awt.Color.lightGray);
        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 0));
        jLabel12.setText("Primero elija el tamaño");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCrearTablespaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTablespaceActionPerformed
        crearTablespace();
    }//GEN-LAST:event_btnCrearTablespaceActionPerformed

    private void btnCrearTablespaceTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTablespaceTempActionPerformed
        crearTablespaceTemporal();
    }//GEN-LAST:event_btnCrearTablespaceTempActionPerformed

    private void btnSelectDBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDBFActionPerformed
        cambiarTamanoDatafile();
    }//GEN-LAST:event_btnSelectDBFActionPerformed


    public void crearTablespace(){
        
        
        
        JFileChooser fileChooser = new JFileChooser("C:/OracleXE/app/oracle/oradata/XE");//Abre una ventana para guardar el archivo
        fileChooser.setFileFilter(new FileNameExtensionFilter("Database File","dbf"));//Filtra la extensión .dbf
            
        if(fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                
            File file = fileChooser.getSelectedFile();
            String nombreTablespace;
            String tamanoTablespace;
            
            
                
            if(FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("dbf")){} 
            else{
                file = new File(file.toString() + ".dbf");//Añade extensión .dbf
                file = new File(file.getParentFile(), FilenameUtils.getBaseName(file.getName())+".dbf");//Reemplaza la extensión con .dbf
                nombreTablespace = FilenameUtils.getBaseName(file.getName());
                //nombreTablespace = NombreTablespace.getText();
                tamanoTablespace = this.jSpinner2.getValue().toString();
                    
                try{
                    Connection conexionSys = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",usuario,contrasena);//Hace conexión con SYSDBA
                    Statement sys = conexionSys.createStatement();
                    sys.executeQuery("CREATE TABLESPACE "+nombreTablespace+" DATAFILE '"+file.getPath()+"' SIZE "+tamanoTablespace+"M ONLINE");
                    conexionSys.close();
                }catch(Exception ex){System.out.println(ex.getMessage());}
            } 
        }
    }
    
    public void crearTablespaceTemporal(){
        
        JFileChooser fileChooser = new JFileChooser("C:/OracleXE/app/oracle/oradata/XE");//Abre una ventana para guardar el archivo
        fileChooser.setFileFilter(new FileNameExtensionFilter("Database File","dbf"));//Filtra la extensión .dbf
            
        if(fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                
            File file = fileChooser.getSelectedFile();
            String nombreTablespaceTemporal;
            String tamanoTablespaceTemporal;
            
            
                
            if(FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("dbf")){} 
            else{
                file = new File(file.toString() + ".dbf");//Añade extensión .dbf
                file = new File(file.getParentFile(), FilenameUtils.getBaseName(file.getName())+".dbf");//Reemplaza la extensión con .dbf
                nombreTablespaceTemporal = FilenameUtils.getBaseName(file.getName());
                //nombreTablespaceTemporal = NombreTablespaceTemp.getText();
                tamanoTablespaceTemporal = this.jSpinner1.getValue().toString();
                    
                try{
                    Connection conexionSys = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",usuario,contrasena);//Hace conexión con SYSDBA
                    Statement sys = conexionSys.createStatement();
                    sys.executeQuery("CREATE TEMPORARY TABLESPACE "+nombreTablespaceTemporal+" TEMPFILE '"+file.getPath()+"' SIZE "+tamanoTablespaceTemporal+"M AUTOEXTEND ON");
                    conexionSys.close();
                }catch(Exception ex){System.out.println(ex.getMessage());}
            } 
        }
    }
    
    public void cambiarTamanoDatafile(){
        
        JFileChooser fileChooser = new JFileChooser("C:/OracleXE/app/oracle/oradata/XE");//Abre una ventana para guardar el archivo
        fileChooser.setFileFilter(new FileNameExtensionFilter("Database File","dbf"));//Filtra la extensión .dbf
            
        if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                
            File file = fileChooser.getSelectedFile();
            String tamanoTablespace = this.jSpinner3.getValue().toString();
                  
            try{
                Connection conexionSys = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",usuario,contrasena);//Hace conexión con SYSDBA
                Statement sys = conexionSys.createStatement();
                sys.executeQuery("ALTER DATABASE DATAFILE '"+file.getPath()+"' RESIZE "+tamanoTablespace+"M");
                conexionSys.close();
            }catch(Exception ex){System.out.println(ex.getMessage());}                
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearTablespace;
    private javax.swing.JButton btnCrearTablespaceTemp;
    private javax.swing.JButton btnSelectDBF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JSpinner jSpinner1;
    public javax.swing.JSpinner jSpinner2;
    public javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel param_header;
    // End of variables declaration//GEN-END:variables
}
