package vista;

import logica.Logica;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminDirectorios extends JFrame{
    
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    public String usuario;
    public String contrasena;
    public Logica db;
    List<String> listDirectorios = new ArrayList<String>();
    ResultSet resultado;
    

    public AdminDirectorios(){
        
        initComponents(); //Carda los elementos del JFrame o JPanel

        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(AdminDirectorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Administración de Directorios"); //Título
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnBorrarDir = new javax.swing.JButton();
        boxDirectorios = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtxtArea = new javax.swing.JTextArea();
        lblListaRespaldos = new javax.swing.JLabel();
        btnCrearDirectorio = new javax.swing.JButton();
        comboUsuarios = new javax.swing.JComboBox<>();
        lblDirectorio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblListaRespaldos1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(java.awt.Color.lightGray);
        panel.setForeground(java.awt.Color.lightGray);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBorrarDir.setBackground(new java.awt.Color(255, 102, 102));
        btnBorrarDir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnBorrarDir.setForeground(java.awt.Color.white);
        btnBorrarDir.setText("Borrar Directorio");
        btnBorrarDir.setBorder(null);
        btnBorrarDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDirActionPerformed(evt);
            }
        });
        panel.add(btnBorrarDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 130, 30));

        boxDirectorios.setBackground(java.awt.Color.darkGray);
        boxDirectorios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        boxDirectorios.setForeground(java.awt.Color.white);
        boxDirectorios.setBorder(null);
        boxDirectorios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxDirectoriosItemStateChanged(evt);
            }
        });
        panel.add(boxDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, 20));

        btnRegresar.setBackground(java.awt.Color.darkGray);
        btnRegresar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverse.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        JtxtArea.setEditable(false);
        JtxtArea.setBackground(java.awt.Color.white);
        JtxtArea.setColumns(20);
        JtxtArea.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        JtxtArea.setRows(5);
        jScrollPane1.setViewportView(JtxtArea);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 360, 160));

        lblListaRespaldos.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblListaRespaldos.setForeground(new java.awt.Color(204, 0, 0));
        lblListaRespaldos.setText("Advertencia: el directorio sera borrado de forma permanente.");
        lblListaRespaldos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(lblListaRespaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 370, 20));

        btnCrearDirectorio.setBackground(new java.awt.Color(153, 255, 153));
        btnCrearDirectorio.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCrearDirectorio.setText("Crear Directorio");
        btnCrearDirectorio.setBorder(null);
        btnCrearDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDirectorioActionPerformed(evt);
            }
        });
        panel.add(btnCrearDirectorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 130, 30));

        comboUsuarios.setBackground(java.awt.Color.darkGray);
        comboUsuarios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboUsuarios.setForeground(java.awt.Color.white);
        panel.add(comboUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 230, 20));

        lblDirectorio.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDirectorio.setText("Seleccione el usuario al que le creará un nuevo directorio");
        panel.add(lblDirectorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, 50));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Directorios");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 30));

        jSeparator1.setBackground(java.awt.Color.black);
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 620, 10));

        jSeparator2.setBackground(java.awt.Color.black);
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 620, 10));

        lblListaRespaldos1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblListaRespaldos1.setText("Respaldos que hay en el directorio del usuario actual ");
        panel.add(lblListaRespaldos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 322, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Luego se le pedira el nombre logico del directorio (el que se vera en Oracle).");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 430, 20));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("Primero se le pedira la ubicacion y el nombre de la carpeta.");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 340, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////  ACCIONES  ////////////////////////////////////////////////////////
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void boxDirectoriosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxDirectoriosItemStateChanged
        if(listDirectorios.size() > 0 && boxDirectorios.getSelectedIndex() != -1 ){
            JtxtArea.setText("");//para limpiar el jtext cada vez que se cambia de opcion
            String sDirectorio=listDirectorios.get(boxDirectorios.getSelectedIndex()); //Directorio de elemento seleccionado
            File f=new File(sDirectorio);

            if(f.exists()){
                File[] ficheros=f.listFiles();
                for(int x=0; x<ficheros.length; x++)
                    JtxtArea.append(ficheros[x].getName()+"\n");  
            }
        }
       
    }//GEN-LAST:event_boxDirectoriosItemStateChanged

    private void btnCrearDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDirectorioActionPerformed
        
        if(comboUsuarios.getSelectedIndex()!=-1){
            JFileChooser dirCarpeta = new JFileChooser();
            dirCarpeta.showSaveDialog(null);

            File crearCarpeta = dirCarpeta.getSelectedFile();


            if(!crearCarpeta.exists()){
                crearCarpeta.mkdir();

                String dirNuevo = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo directorio", "Nuevo Directorio", JOptionPane.OK_CANCEL_OPTION);
                if(dirNuevo!=null){
                    if(db.crearDirectorio(dirNuevo, dirCarpeta.getSelectedFile().getPath(),(String)comboUsuarios.getSelectedItem()))
                        JOptionPane.showMessageDialog(null, "El directorio fue creado con exito","",JOptionPane.INFORMATION_MESSAGE);
                
                    cargarDirectorios();
                    JtxtArea.setText("");
                }
                
            }else{
                if(crearCarpeta.exists())
                    JOptionPane.showMessageDialog(null, "El directorio ya existe"); 
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un usuario","", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCrearDirectorioActionPerformed

    private void btnBorrarDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDirActionPerformed
        if(boxDirectorios.getSelectedIndex()!=-1){
            if(db.EliminarDirectorio((String)boxDirectorios.getSelectedItem()))
              JOptionPane.showMessageDialog(null, "El directorio fue eliminado con exito","",JOptionPane.INFORMATION_MESSAGE);
            
            
            cargarDirectorios();
            JtxtArea.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un directorio para borrar","", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarDirActionPerformed

    
      //////////////////////////////////////////////////  METODOS  ////////////////////////////////////////////////////////
    
    
    //metodo de cargar directorios
    public void cargarDirectorios(){
        
        ResultSet resultado = db.cargarDirectorios();

        boxDirectorios.removeAllItems();
        listDirectorios.clear();

        try{
            
            while(resultado.next()){
                boxDirectorios.addItem(resultado.getString(1));
                listDirectorios.add(resultado.getString(2));
            }
            boxDirectorios.setSelectedIndex(-1);
        }catch(SQLException ex){
            Logger.getLogger(CrearRespaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    //Carga los usuarios en la interfaz
    public void cargarUsuarios(){
        
      Logica fun = new Logica();

      fun.conectar("sys","root123");

      resultado=fun.usuarios();
      
        if(resultado!=null){

            try{
                comboUsuarios.removeAllItems();
                while(resultado.next()){
                    comboUsuarios.addItem(resultado.getString(1));
                }
                comboUsuarios.setSelectedIndex(-1);
                fun.Desconectar();

            }catch(SQLException ex){
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JtxtArea;
    private javax.swing.JComboBox<String> boxDirectorios;
    private javax.swing.JButton btnBorrarDir;
    private javax.swing.JButton btnCrearDirectorio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDirectorio;
    private javax.swing.JLabel lblListaRespaldos;
    private javax.swing.JLabel lblListaRespaldos1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
