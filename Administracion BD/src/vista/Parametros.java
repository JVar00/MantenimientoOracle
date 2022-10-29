
package vista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Logica;


public class Parametros extends javax.swing.JFrame{

    
    public String usuario;
    public String contrasena;
    public Opciones op;
    public Logica db;
    ResultSet resultado;
    
    public Parametros(){
        
        initComponents();

        //db.conectar(usuario + " as sysdba", contrasena);
        //db.conectar(usuario, contrasena);
        //System.out.print(usuario);
                
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            } 
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null);
        this.setTitle("Creación de Respaldos"); //Título
        this.setResizable(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbParametro = new javax.swing.JComboBox<>();
        param_header = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComando = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Seleccione una opción:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        cbParametro.setBackground(java.awt.Color.darkGray);
        cbParametro.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cbParametro.setForeground(java.awt.Color.white);
        cbParametro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Información de la instancia", "Nombre de la base de datos", "Parámetros de la base de datos", "Ubicación y nombre del fichero SPFILE", "Ubicación y nombre de los ficheros de control", "Todos los ficheros de datos y su ubicación", "Ficheros temporales", "Ficheros de Redo Log", "Espacio de los Tablespaces", "Tamaño ocupado por la base de datos", "Tamaño de ficheros de la base de datos", "Ocupación de todos los objetos", "Propietarios de objetos y número de objetos", "Informacion tablespaces" }));
        cbParametro.setBorder(null);
        jPanel1.add(cbParametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 340, -1));

        param_header.setBackground(java.awt.Color.lightGray);
        param_header.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        param_header.setText("Parámetros");
        jPanel1.add(param_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jButton1.setBackground(java.awt.Color.darkGray);
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Mostrar parametros");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 180, 30));

        jButton2.setBackground(java.awt.Color.darkGray);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverse.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        areaComando.setEditable(false);
        areaComando.setColumns(10);
        areaComando.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        areaComando.setRows(5);
        areaComando.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaComando);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 680, 146));

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Se requiere el usuario System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 680, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   
        //areaComando.append( String.format( "%s\n", resultado ));
        //areaComando.setText(resultado.getString);

        //db.conectar(usuario + " as sysdba", contrasena);

        String s = null;
        

        //"Información de la instancia"
        if(cbParametro.getSelectedItem().toString().equals("Información de la instancia")){
            
            areaComando.setText("");       
            ResultSet resultado = db.infoInstancia();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t");
                    results.append("-----------");
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        //Nombre de la base de datos    
            
            
        //Nombre de la base de datos    
        }else if(cbParametro.getSelectedItem().toString().equals("Nombre de la base de datos")){
            
            areaComando.setText("");
            ResultSet resultado = db.nombreDB();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        //Parámetros de la base de datos  
            
            
        //Parámetros de la base de datos  
        }else if(cbParametro.getSelectedItem().toString().equals("Parámetros de la base de datos")){
             
            areaComando.setText("");
            ResultSet resultado = db.parametrosDB();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        //Productos Oracle instalados y versiones
           
            
        }else if(cbParametro.getSelectedItem().toString().equals("Ubicación y nombre del fichero SPFILE")){
        
            areaComando.setText("");
            ResultSet resultado = db.SPFILEfile();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
        //Ubicación y nombre de los ficheros de control
        
            
        //Ubicación y nombre de los ficheros de control
        }else if(cbParametro.getSelectedItem().toString().equals("Ubicación y nombre de los ficheros de control")){
        
            areaComando.setText("");
            ResultSet resultado = db.controlfiles();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        //Todos los ficheros de datos y su ubicación
            
            
        //Todos los ficheros de datos y su ubicación
        }else if(cbParametro.getSelectedItem().toString().equals("Todos los ficheros de datos y su ubicación")){
        
            areaComando.setText("");
            ResultSet resultado = db.allfiles();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
        //Ficheros temporales  
        
            
        //Ficheros temporales  
        }else if(cbParametro.getSelectedItem().toString().equals("Ficheros temporales")){
            
            areaComando.setText("");
            ResultSet resultado = db.tempfiles();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        //Ficheros de RedoLog
            
            
        //Ficheros de RedoLog
        }else if(cbParametro.getSelectedItem().toString().equals("Ficheros de Redo Log")){
            
            areaComando.setText("");
            ResultSet resultado = db.redoLogfiles();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        //Espacio de los Tablespaces    
            
            
            
        //Espacio de los Tablespaces    
        }else if(cbParametro.getSelectedItem().toString().equals("Espacio de los Tablespaces")){
            
            areaComando.setText("");
            ResultSet resultado = db.tamTablespaces();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t\t\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        //Tamaño ocupado por la base de datos    
            
        
        //Tamaño ocupado por la base de datos    
        }else if(cbParametro.getSelectedItem().toString().equals("Tamaño ocupado por la base de datos")){
            
            areaComando.setText("");
            ResultSet resultado = db.tamBD();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t\t\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         
        //Tamaño de ficheros de la base de datos    
            
         
        //Tamaño de ficheros de la base de datos    
        }else if(cbParametro.getSelectedItem().toString().equals("Tamaño de ficheros de la base de datos")){
        
            areaComando.setText("");
            ResultSet resultado = db.tamFilesBD();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t\t\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        //Ocupación de todos los objetos
        
        
        //Ocupación de todos los objetos
        }else if(cbParametro.getSelectedItem().toString().equals("Ocupación de todos los objetos")){
            
            areaComando.setText("");
            ResultSet resultado = db.tamObjs();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t\t\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        //Propietarios de objetos y número de objetos    
            
            
        //Propietarios de objetos y número de objetos    
        }else if(cbParametro.getSelectedItem().toString().equals("Propietarios de objetos y número de objetos")){
            
            areaComando.setText("");
            ResultSet resultado = db.tamObjs();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t\t\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        //Información Tablespaces    
            
            
        //Información Tablespaces    
        }else if(cbParametro.getSelectedItem().toString().equals("Informacion tablespaces")){
            
            areaComando.setText("");
            ResultSet resultado = db.infoTablespaces();
            StringBuffer results = new StringBuffer();

            try{
                
                ResultSetMetaData metaData = resultado.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                for(int i=1; i<=numberOfColumns; i++){
                    results.append(metaData.getColumnName(i) + "\t\t\t");
                    
                }
                
                results.append("\n");
                
                while(resultado.next()){
                    for(int i=1; i<=numberOfColumns; i++){
                        results.append(resultado.getObject(i) + "\t\t\t");
                    }
                    //results += "\n";
                    results.append("\n");
                }
                areaComando.append(results.toString());
                
            }catch(SQLException ex){
                Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        op.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    public void ejecutar_parametro(){
        

        
    }

 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaComando;
    private javax.swing.JComboBox<String> cbParametro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel param_header;
    // End of variables declaration//GEN-END:variables
}
