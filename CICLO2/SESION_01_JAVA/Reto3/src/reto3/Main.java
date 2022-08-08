package reto3;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wilson Gutierrez
 */
public class Main extends javax.swing.JFrame {    
    
    List<String> nombreCA = new ArrayList<>();
    List<Integer> idCA = new ArrayList<Integer>();
    List<Double> clasificacionIRCA  = new ArrayList<Double>();    
    private int cuerpos = 0;    
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        lblTipoCA = new javax.swing.JLabel();
        lblTipoAgua = new javax.swing.JLabel();
        lblIrca = new javax.swing.JLabel();
        lblDatosIngresados = new javax.swing.JLabel();
        lblSalidas = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfMunicipio = new javax.swing.JTextField();
        tfTipoAgua = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        tfIrca = new javax.swing.JTextField();
        tfTipoCA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSalidaDatos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taIngresarDatos = new javax.swing.JTextArea();
        btnIngresar = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reto 3");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Nivel de Riesgo del Agua");

        lblNombre.setText("Nombre");

        lblId.setText("Id");

        lblMunicipio.setText("Municipio");

        lblTipoCA.setText("Tipo de cuerpo de Agua");

        lblTipoAgua.setText("Tipo de Agua");

        lblIrca.setText("IRCA");

        lblDatosIngresados.setText("Datos ingresados");

        lblSalidas.setText("Salidas");

        tfMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMunicipioActionPerformed(evt);
            }
        });

        taSalidaDatos.setEditable(false);
        taSalidaDatos.setBackground(new java.awt.Color(255, 255, 255));
        taSalidaDatos.setColumns(20);
        taSalidaDatos.setRows(5);
        jScrollPane1.setViewportView(taSalidaDatos);

        taIngresarDatos.setEditable(false);
        taIngresarDatos.setBackground(new java.awt.Color(255, 255, 255));
        taIngresarDatos.setColumns(20);
        taIngresarDatos.setRows(5);
        jScrollPane2.setViewportView(taIngresarDatos);

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMunicipio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTipoAgua)
                                            .addComponent(btnIngresar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnProcesar)
                                            .addComponent(tfTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(lblDatosIngresados))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIrca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfIrca, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSalidas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTipoCA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfTipoCA, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblId)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipio)
                    .addComponent(lblTipoCA)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipoCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoAgua)
                    .addComponent(lblIrca)
                    .addComponent(tfTipoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIrca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnProcesar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatosIngresados)
                    .addComponent(lblSalidas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        taIngresarDatos.append(tfNombre.getText() + " " +
                                           tfId.getText() + " " +
                                           tfMunicipio.getText() + " " +
                                           tfTipoCA.getText() + " " +
                                           tfTipoAgua.getText() + " " +
                                           tfIrca.getText() + "\n"
        ); // Mostrar en el area de texto lo que se digita en el text area    
                
        //Asigno a los vectores los valores por cada vez que se digiten
       nombreCA.add(tfNombre.getText());
        idCA.add(Integer.parseInt(tfId.getText()));
        clasificacionIRCA.add(Double.parseDouble(tfIrca.getText()));
        
        cuerpos++;
        
        //Limpio los valores ingresados
        tfNombre.setText("");
        tfId.setText("");
        tfMunicipio.setText("");
        tfTipoCA.setText("");
        tfTipoAgua.setText("");
        tfIrca.setText("");
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        String salida = "";
        taIngresarDatos.setText("");
        taSalidaDatos.setText("");
        CuerpoDeAgua validarCA = new CuerpoDeAgua(nombreCA, idCA, clasificacionIRCA);
        
        for (int i = 0; i < nombreCA.size(); i++) {
            salida += validarCA.nivel(i) + "\n";
        }
        
        salida += String.valueOf(String.format("%.02f", validarCA.cantMBSR()))+ "\n";        
        salida += validarCA.nombreMedio()+ "\n";
        salida += validarCA.clasificaBaja();
        taSalidaDatos.setText(salida);
        
        // Borra todos los elementos de las listas
        validarCA.getNombre().clear();
        validarCA.getCodigo().clear();
        validarCA.getIrca().clear();
    }//GEN-LAST:event_btnProcesarActionPerformed
    
    private void tfMunicipioActionPerformed(java.awt.event.ActionEvent evt){
    
    }
    
 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDatosIngresados;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIrca;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalidas;
    private javax.swing.JLabel lblTipoAgua;
    private javax.swing.JLabel lblTipoCA;
    private javax.swing.JTextArea taIngresarDatos;
    private javax.swing.JTextArea taSalidaDatos;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIrca;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTipoAgua;
    private javax.swing.JTextField tfTipoCA;
    // End of variables declaration//GEN-END:variables
}
