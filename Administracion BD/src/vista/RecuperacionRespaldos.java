package vista;

import logica.Logica;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RecuperacionRespaldos extends JFrame{
    
    public Opciones op;//se va a igualar a la ventana principal, así no se pierde la referencia de la conexión
    public String usuario;
    public String contrasena;
    public Logica db;
    List<String> listDirectorios = new ArrayList<String>();
    ResultSet resultado;
    
    
    //Creacion del hilo para la exportacion o importacion
    Runnable run = new Runnable(){
        @Override
        public void run(){ 
            Importar();
        }
    };
    

    public RecuperacionRespaldos(){
        
        initComponents(); //Carga los elementos del JFrame o JPanel
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(RecuperacionRespaldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null); //Centa la pantalla
        this.setTitle("Recuperación de Respaldos"); //Título
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        radioSchema = new javax.swing.JRadioButton();
        radioTablas = new javax.swing.JRadioButton();
        boxTablas = new javax.swing.JComboBox();
        radioFull = new javax.swing.JRadioButton();
        boxDirectorios = new javax.swing.JComboBox();
        lblDirectorios = new javax.swing.JLabel();
        btnCargarResp = new javax.swing.JButton();
        lblTipoElegido = new javax.swing.JLabel();
        btnCargarArch = new javax.swing.JButton();
        lblRuta = new javax.swing.JLabel();
        jtextRuta = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComando = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(java.awt.Color.lightGray);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioSchema.setBackground(new java.awt.Color(36, 47, 65));
        radioSchema.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        radioSchema.setText("Esquema");
        radioSchema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSchemaActionPerformed(evt);
            }
        });
        panel.add(radioSchema, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 20));

        radioTablas.setBackground(new java.awt.Color(36, 47, 65));
        radioTablas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        radioTablas.setText("Tabla");
        radioTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTablasActionPerformed(evt);
            }
        });
        panel.add(radioTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, 20));

        boxTablas.setBackground(java.awt.Color.darkGray);
        boxTablas.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        boxTablas.setForeground(java.awt.Color.white);
        boxTablas.setBorder(null);
        boxTablas.setEnabled(false);
        panel.add(boxTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 210, -1));

        radioFull.setBackground(new java.awt.Color(36, 47, 65));
        radioFull.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        radioFull.setText("Full");
        radioFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFullActionPerformed(evt);
            }
        });
        panel.add(radioFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 20));

        boxDirectorios.setBackground(java.awt.Color.darkGray);
        boxDirectorios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        boxDirectorios.setForeground(java.awt.Color.white);
        boxDirectorios.setBorder(null);
        panel.add(boxDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 203, -1));

        lblDirectorios.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblDirectorios.setText("Directorios");
        panel.add(lblDirectorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        btnCargarResp.setBackground(java.awt.Color.darkGray);
        btnCargarResp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCargarResp.setForeground(java.awt.Color.white);
        btnCargarResp.setText("Cargar Respaldo");
        btnCargarResp.setBorder(null);
        btnCargarResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarRespActionPerformed(evt);
            }
        });
        panel.add(btnCargarResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 30));

        lblTipoElegido.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblTipoElegido.setForeground(new java.awt.Color(51, 102, 0));
        lblTipoElegido.setText("...");
        panel.add(lblTipoElegido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 440, -1));

        btnCargarArch.setBackground(java.awt.Color.darkGray);
        btnCargarArch.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCargarArch.setForeground(java.awt.Color.white);
        btnCargarArch.setText("Cargar Archivo");
        btnCargarArch.setBorder(null);
        btnCargarArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchActionPerformed(evt);
            }
        });
        panel.add(btnCargarArch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 100, 30));

        lblRuta.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblRuta.setText("Archivo:");
        panel.add(lblRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 70, 24));

        jtextRuta.setEditable(false);
        jtextRuta.setBorder(null);
        panel.add(jtextRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 200, 20));

        btnRegresar.setBackground(java.awt.Color.darkGray);
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverse.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        panel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        areaComando.setEditable(false);
        areaComando.setColumns(1);
        areaComando.setLineWrap(true);
        areaComando.setRows(5);
        areaComando.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaComando);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 630, 150));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Recuperar respaldos");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de Respaldo");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Archivo");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 610, 20));
        panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 610, 10));
        panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 610, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////  ACCIONES  ////////////////////////////////////////////////////////
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        op.setVisible(true);    
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCargarArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchActionPerformed
        // TODO add your handling code here:
        JFileChooser explorador=new JFileChooser("home"); //Explorador de carpetas y archivos
        FileNameExtensionFilter filter=new FileNameExtensionFilter(".DMP","dmp"); //Muestra solo los .DMP
        explorador.setFileFilter(filter); //Aplica el filtro
        explorador.setDialogTitle("Cargar archivo Dump File"); //Título
        int seleccion=explorador.showDialog(null, "Cargar"); //Botón

        switch(seleccion)
        {
            case JFileChooser.APPROVE_OPTION: //Seleccionó cargar
            break;

            case JFileChooser.CANCEL_OPTION: //Seleccionó cancelar o cerró ventana
            break;

            case JFileChooser.ERROR_OPTION: //Viene aquí si hay error
            break;
        }

        File archivo=explorador.getSelectedFile(); //"archivo" tiene lo seleccionado
        String ruta=archivo.getName(); //"ruta" tiene la ruta del archivo seleccionado
        //System.out.println("La ruta del fichero es: "+ruta);
        jtextRuta.setText(ruta); //La ruta se muestra en el jTextField
        //para abrir
        //int seleccion=explorador.showOpenDialog(parent);

        //para guardar
        //int seleccion = explorador.showSaveDialog(parent);
    }//GEN-LAST:event_btnCargarArchActionPerformed

    private void radioTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTablasActionPerformed
        boxTablas.enable(true);
        radioSchema.setSelected(false);
        radioFull.setSelected(false);
    }//GEN-LAST:event_radioTablasActionPerformed

    private void radioSchemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSchemaActionPerformed
        boxTablas.enable(false);
        radioTablas.setSelected(false);
        radioFull.setSelected(false);
    }//GEN-LAST:event_radioSchemaActionPerformed

    private void radioFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFullActionPerformed
        boxTablas.enable(false);
        radioTablas.setSelected(false);
        radioSchema.setSelected(false);
    }//GEN-LAST:event_radioFullActionPerformed

    private void btnCargarRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarRespActionPerformed
        if(validaciones()){
            String mensaje="Importando respaldo "; //Variable con el mensaje "Creando respaldo "

            if(radioFull.isSelected()) //Si se selecciona la opción Full
                mensaje= mensaje+"Full..."; //El mensaje será "Creando respaldo Full..."
            
            else if (radioSchema.isSelected()) //Si se selecciona la opción Schema
                mensaje= mensaje+"del Schema..."; //El mensaje será "Creando respaldo de Schema..."
            
            else if (radioTablas.isSelected()) //Si se selecciona la opción Tablas
                mensaje= mensaje+"de Tabla..."; //El mensaje será "Creando respaldo de Tablas..."
            
            lblTipoElegido.setText(mensaje); //El label cambia su contenido con el texto
            
            btnCargarResp.setEnabled(false);//para bloquear el boton de crear
            btnRegresar.setEnabled(false);
            
            Thread h1 = new Thread(run);
            h1.start();
        }
    }//GEN-LAST:event_btnCargarRespActionPerformed

    
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
    
    
    //metodo de cargar directorios
    public void cargarTablasUsuario(){
        
        ResultSet resultado = db.cargarTablasUsuario(usuario);
       
        boxTablas.removeAllItems();
        
        try{
            
            while(resultado.next()){
                boxTablas.addItem(resultado.getString("TABLE_NAME"));
            }
            boxTablas.setSelectedIndex(-1);
        }catch(SQLException ex){
            Logger.getLogger(CrearRespaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void Importar(){
        
       String s = null;
       String tipoRespaldo = "";//el tipo de respaldo que se hará
       String dir = "";//directorio donde se guardara el respaldo


        if(radioTablas.isSelected()){
            tipoRespaldo = "TABLES = "+boxTablas.getSelectedItem().toString();
        }
        if(radioSchema.isSelected()){
            tipoRespaldo = "SCHEMAS = "+usuario;
        }
        if(radioFull.isSelected()){
           tipoRespaldo = "FULL=Y";
        }

       dir = boxDirectorios.getSelectedItem().toString();

        try{

            String comando;
            comando = "cmd /c " + "IMPDP" + " " + usuario +"/"+ contrasena  + " " + tipoRespaldo +" DIRECTORY = "+ dir 
                    + " DUMPFILE = " + jtextRuta.getText() +" LOGFILE = " + jtextRuta.getText() + ".log";

            // Ejcutamos el comando
            Process p = Runtime.getRuntime().exec(comando);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                    p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(
                    p.getErrorStream()));

            // Leemos la salida del comando
            while((s = stdInput.readLine()) != null){
                areaComando.append(s + "\n");
            }

            // Leemos los errores si los hubiera
            while((s = stdError.readLine()) != null){
                areaComando.append(s + "\n");
            }

            lblTipoElegido.setText("La Importación ha concluido");
            JOptionPane.showMessageDialog(null," La importación ha concluido..","Proceso Completado",JOptionPane.INFORMATION_MESSAGE);
            btnRegresar.setEnabled(true);

        }catch(IOException e){
            System.out.println("Excepción: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    
    public boolean validaciones(){
        
        if(!radioTablas.isSelected() && !radioSchema.isSelected() && !radioFull.isSelected()){
            JOptionPane.showMessageDialog(null,"Debe seleccionar el tipo de respaldo","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(radioTablas.isSelected() && boxTablas.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar la tabla a respaldar","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(boxDirectorios.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null,"Debe seleccionar un directorio","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(jtextRuta.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Seleccione un archivo de respaldo","", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaComando;
    private javax.swing.JComboBox boxDirectorios;
    private javax.swing.JComboBox boxTablas;
    private javax.swing.JButton btnCargarArch;
    private javax.swing.JButton btnCargarResp;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jtextRuta;
    private javax.swing.JLabel lblDirectorios;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTipoElegido;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radioFull;
    private javax.swing.JRadioButton radioSchema;
    private javax.swing.JRadioButton radioTablas;
    // End of variables declaration//GEN-END:variables
}
