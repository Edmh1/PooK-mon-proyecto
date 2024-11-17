/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.pml.appPookemon.gui.admin;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import main.java.com.pml.appPookemon.datos.conf_arena.controller.ArenaController;
import main.java.com.pml.appPookemon.datos.pookemon.model.Efecto;
import main.java.com.pml.appPookemon.datos.pookemon.controller.MovimientoController;
import main.java.com.pml.appPookemon.datos.pookemon.controller.PookemonController;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoEnvenenamiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoParalisis;
import main.java.com.pml.appPookemon.datos.pookemon.model.EfectoQuemadura;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.gui.MainFrame;
import main.java.com.pml.appPookemon.gui.config.StandarPanel;
import org.jdesktop.swingx.prompt.PromptSupport;


/**
 *
 * @author eddie
 */
public class AgregarPanel extends StandarPanel {

    private String nombre;
    private Efecto efecto;
    private static final String GIF_EXTENSION = ".gif";
    private File selectedGifFile = null;
    
    /**
     * Creates new form AgregarPanel
     */
    public AgregarPanel(MainFrame mainFrame) {
        super(mainFrame);
        initComponents();
    }
    
    public void configurarContenido(){
        String lb = "Agregar: "+" "+nombre;
        lbAgregar.setText(lb);
        if(nombre.equalsIgnoreCase("pookemon")){
            configurarParaPookemon();
        }else{
            configurarParaMovimiento();
        }
    }

    private void configurarParaPookemon() {
        PromptSupport.setPrompt("NOMBRE", txtCampo1);
        PromptSupport.setPrompt("VELOCIDAD", txtCampo2);
        PromptSupport.setPrompt("ATQ. FISICO", txtCampo3);
        PromptSupport.setPrompt("DEF. FISICA", txtCampo4);
        PromptSupport.setPrompt("ATQ. ESPECIAL", txtCampo5);
        PromptSupport.setPrompt("DEF. ESPECIAL", txtCampo6);
        
        jpPookemon.setVisible(true);
        lblFilePath.setText("Seleccione la imagen del Pookemon.gif");
        lblFilePath.setVisible(true);
        btExaminar.setVisible(true);
        jpMovimiento.setVisible(false);
        txtProbabilidadEfecto.setVisible(false);
        lbPorcentaje.setVisible(false);
        
        this.revalidate();
        this.repaint();
    }
    
    private void configurarParaMovimiento() {
        PromptSupport.setPrompt("NOMBRE", txtCampo1);
        PromptSupport.setPrompt("POTENCIA", txtCampo2);
        PromptSupport.setPrompt("PRECISIÓN", txtCampo3);
        PromptSupport.setPrompt("CANTIDAD PP'S", txtCampo4);
        
        jpMovimiento.setVisible(true);
        jpPookemon.setVisible(false);
        lblFilePath.setVisible(false);
        btExaminar.setVisible(false);
        txtProbabilidadEfecto.setVisible(true);
        lbPorcentaje.setVisible(true);
        
        this.revalidate();
        this.repaint();
    }
    
    public void clearFields(){
        txtCampo1.setText("");
        txtCampo2.setText("");
        txtCampo3.setText("");
        txtCampo4.setText("");
        txtCampo5.setText("");
        txtCampo6.setText("");
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lbAgregar = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        txtCampo2 = new javax.swing.JTextField();
        txtCampo3 = new javax.swing.JTextField();
        txtCampo4 = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        btExaminar = new javax.swing.JButton();
        lblFilePath = new javax.swing.JLabel();
        jpMovimiento = new javax.swing.JPanel();
        jcbEfecto = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jpPookemon = new javax.swing.JPanel();
        txtCampo5 = new javax.swing.JTextField();
        txtCampo6 = new javax.swing.JTextField();
        jcbElemento = new javax.swing.JComboBox<>();
        txtProbabilidadEfecto = new javax.swing.JTextField();
        lbPorcentaje = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAgregar.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbAgregar.setText("Agregar: ");
        add(lbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 36, -1, -1));

        txtCampo1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampo1ActionPerformed(evt);
            }
        });
        add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 114, 150, -1));

        txtCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampo2ActionPerformed(evt);
            }
        });
        add(txtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 182, 150, -1));
        add(txtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 246, 150, -1));
        add(txtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 306, 150, -1));

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 390, 165, 38));

        btExaminar.setText("Examinar...");
        btExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExaminarActionPerformed(evt);
            }
        });
        add(btExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 150, -1));

        lblFilePath.setText("Seleccione la imagen del Pookemon.gif");
        add(lblFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jcbEfecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Quemadura", "Envenenamiento", "Paralisis" }));
        jcbEfecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEfectoActionPerformed(evt);
            }
        });

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mov. Fisico", "Mov. Especial" }));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMovimientoLayout = new javax.swing.GroupLayout(jpMovimiento);
        jpMovimiento.setLayout(jpMovimientoLayout);
        jpMovimientoLayout.setHorizontalGroup(
            jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMovimientoLayout.createSequentialGroup()
                .addGroup(jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                    .addComponent(jcbEfecto, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jpMovimientoLayout.setVerticalGroup(
            jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMovimientoLayout.createSequentialGroup()
                .addComponent(jcbEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 170, 90));

        javax.swing.GroupLayout jpPookemonLayout = new javax.swing.GroupLayout(jpPookemon);
        jpPookemon.setLayout(jpPookemonLayout);
        jpPookemonLayout.setHorizontalGroup(
            jpPookemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPookemonLayout.createSequentialGroup()
                .addGroup(jpPookemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCampo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(txtCampo5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jpPookemonLayout.setVerticalGroup(
            jpPookemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPookemonLayout.createSequentialGroup()
                .addComponent(txtCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(txtCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpPookemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 114, 160, 93));

        jcbElemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "acero", "agua", "aicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha", "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador" }));
        add(jcbElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 150, -1));

        txtProbabilidadEfecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProbabilidadEfectoActionPerformed(evt);
            }
        });
        add(txtProbabilidadEfecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 30, -1));

        lbPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPorcentaje.setText(" %");
        lbPorcentaje.setPreferredSize(new java.awt.Dimension(19, 20));
        add(lbPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 30, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampo1ActionPerformed

    private void txtCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampo2ActionPerformed

    private void btExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExaminarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos GIF", "gif"));
        int option = fileChooser.showOpenDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            selectedGifFile = fileChooser.getSelectedFile();
            lblFilePath.setText("Archivo seleccionado: " + selectedGifFile.getName());
        } else {
            lblFilePath.setText("No se seleccionó ningún archivo.");
        }
    }//GEN-LAST:event_btExaminarActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        ArenaController arena = new ArenaController();

        String nombreElemento = txtCampo1.getText();
        if (nombre.equalsIgnoreCase("Pookemon")) {
            agregarPookemon(arena, nombreElemento);
        } else {
            agregarMovimiento(arena, nombreElemento);
        }
    }//GEN-LAST:event_btAgregarActionPerformed
   

    private void agregarPookemon(ArenaController arena, String nombreElemento) {
        PookemonController controlador = new PookemonController();
        int velocidad = Integer.parseInt(txtCampo2.getText());
        int ataqueFisico = Integer.parseInt(txtCampo3.getText());
        int defensaFisica = Integer.parseInt(txtCampo4.getText());
        int ataqueEspecial = Integer.parseInt(txtCampo5.getText());
        int defensaEspecial = Integer.parseInt(txtCampo6.getText());
        String elemento = (String) jcbElemento.getSelectedItem();

        Pookemon pookemon = controlador.agregarPookemon(nombreElemento, velocidad, ataqueFisico, defensaFisica, ataqueEspecial, defensaEspecial, elemento);
        arena.agregarPookemon(pookemon);

        // Solo guardar el GIF si se ha seleccionado uno
        if (selectedGifFile != null) {
            if (uploadGif(nombreElemento)) {
                JOptionPane.showMessageDialog(null, "Pookemon guardado correctamente :)");
                lblFilePath.setText("Archivo guardado correctamente.");
            }
        } else {
            lblFilePath.setText("No se ha seleccionado ningún archivo GIF para guardar.");
        }
    }

    private void agregarMovimiento(ArenaController arena, String nombreElemento) {
        MovimientoController controlador = new MovimientoController();
        String nombreMovimiento = nombreElemento;
        int potencia = Integer.parseInt(txtCampo2.getText());
        int precision = Integer.parseInt(txtCampo3.getText());
        int cantidadPP = Integer.parseInt(txtCampo4.getText());
        String nombreEfecto = (String) jcbEfecto.getSelectedItem();
        Efecto efecto = getEfecto(nombreEfecto);
        String elemento = (String) jcbElemento.getSelectedItem();
        String tipo = (String) jcbTipo.getSelectedItem();
        int probabilidadEfecto = Integer.parseInt(txtProbabilidadEfecto.getText());

        Movimiento movimiento = controlador.agregarMovimiento(nombreMovimiento, potencia, precision, cantidadPP, elemento, efecto, tipo, probabilidadEfecto);
        arena.agregarMovimiento(movimiento);
        
        JOptionPane.showMessageDialog(null, "Movimiento guardado correctamente :)");
    }

    private Efecto getEfecto(String nombreEfecto) {
        switch (nombreEfecto) {
            case "Paralisis":
                return new EfectoParalisis();
            case "Quemadura":
                return new EfectoQuemadura();
            case "Envenenamiento":
                return new EfectoEnvenenamiento();
            default:
                return null;
        }
    }

    private boolean uploadGif(String nombreElemento) {
        File sprites = new File("src/main/resources/img/SpritesPookemon");
        File archivoDestino = new File(sprites, nombreElemento + GIF_EXTENSION);

        // Redimensionar el GIF antes de guardarlo
        BufferedImage resizedImage = resizeGif(selectedGifFile);
        if (resizedImage == null) {
            JOptionPane.showMessageDialog(null, "Error al redimensionar el GIF.");
            return false;
        }

        try {
            // Guardar la imagen redimensionada
            ImageIO.write(resizedImage, "gif", archivoDestino);
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
            return false;
        }
    }

    private BufferedImage resizeGif(File gifFile) {
        try {
            BufferedImage originalImage = ImageIO.read(gifFile);
            BufferedImage resizedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = resizedImage.createGraphics();
        
            g.drawImage(originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH), 0, 0, null);
            g.dispose();
            return resizedImage;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo GIF");
            return null;
        }
    }
    
    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void txtProbabilidadEfectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProbabilidadEfectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProbabilidadEfectoActionPerformed

    private void jcbEfectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEfectoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbEfectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btExaminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jcbEfecto;
    private javax.swing.JComboBox<String> jcbElemento;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JPanel jpMovimiento;
    private javax.swing.JPanel jpPookemon;
    private javax.swing.JLabel lbAgregar;
    private javax.swing.JLabel lbPorcentaje;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JTextField txtCampo1;
    private javax.swing.JTextField txtCampo2;
    private javax.swing.JTextField txtCampo3;
    private javax.swing.JTextField txtCampo4;
    private javax.swing.JTextField txtCampo5;
    private javax.swing.JTextField txtCampo6;
    private javax.swing.JTextField txtProbabilidadEfecto;
    // End of variables declaration//GEN-END:variables
  
}
