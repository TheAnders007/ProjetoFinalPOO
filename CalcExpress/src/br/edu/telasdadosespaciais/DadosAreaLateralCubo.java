/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.telasdadosespaciais;

import br.edu.escolhas.TipoCalculoCubo;
import br.edu.escolhas.UsarNovamente;
import br.edu.figurasgeometricasespaciais.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class DadosAreaLateralCubo extends javax.swing.JFrame {

 
    
    /**
     * Creates new form DadosEsfera
     */
    public DadosAreaLateralCubo() {
        initComponents();
        ImageIcon icon = new ImageIcon((new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/icon.png")).getImage()));  
        setIconImage(icon.getImage());
        AreaLateralLabel.setVisible(false);
        AreaLateralText.setVisible(false);
         this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaLateralText = new javax.swing.JTextField();
        CalculeButton = new javax.swing.JButton();
        AreaLateralLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        LadoText = new javax.swing.JTextField();
        LadoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BarMenu1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AreaLateralText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaLateralTextActionPerformed(evt);
            }
        });
        getContentPane().add(AreaLateralText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 320, -1));

        CalculeButton.setBackground(new java.awt.Color(153, 0, 51));
        CalculeButton.setForeground(new java.awt.Color(255, 255, 255));
        CalculeButton.setText("Calcule");
        CalculeButton.setBorderPainted(false);
        CalculeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CalculeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 340, 90, -1));

        AreaLateralLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AreaLateralLabel.setForeground(new java.awt.Color(153, 0, 0));
        AreaLateralLabel.setText("Área Lateral");
        getContentPane().add(AreaLateralLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 40));

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Resetar");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 90, -1));

        LadoText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LadoTextMouseClicked(evt);
            }
        });
        LadoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LadoTextActionPerformed(evt);
            }
        });
        getContentPane().add(LadoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 320, -1));

        LadoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LadoLabel.setForeground(new java.awt.Color(153, 0, 0));
        LadoLabel.setText("Lado");
        getContentPane().add(LadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 40));

        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/CuboAreaLateralDados.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        //new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\Telas\\TIPFIG.png"));

    jMenu6.setForeground(new java.awt.Color(51, 0, 51));
    jMenu6.setText("Menu");
    jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenu6MouseClicked(evt);
        }
    });

    jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/retornar.png"))); // NOI18N
    jMenu7.setText("Retornar");
    jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenu7MouseClicked(evt);
        }
    });
    jMenu6.add(jMenu7);

    jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/sair.png"))); // NOI18N
    jMenu4.setText("Sair");
    jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jMenu4MouseClicked(evt);
        }
    });
    jMenu6.add(jMenu4);

    BarMenu1.add(jMenu6);

    setJMenuBar(BarMenu1);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AreaLateralTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaLateralTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaLateralTextActionPerformed

    private void CalculeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculeButtonActionPerformed
         if(CalculeButton.getText().equals("Próximo")){
                UsarNovamente un = new UsarNovamente();
                un.setVisible(true); 
                this.dispose();
            }
         try{
         if (LadoText.getText().trim().equals("")){
                   LadoText.setText("Campo Vazio");
            }
         else if (Double.parseDouble(LadoText.getText()) <= 0){
                   LadoText.setText("Valor Não Aceito");
            }
          } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Não digite letras.");
        }
         
        if ((Double.parseDouble(LadoText.getText())) > 0) { 
        Cubo cubo = new Cubo();
        cubo.setLado(Double.parseDouble(LadoText.getText()));
        cubo.CalcAreaLateral(); 
        AreaLateralLabel.setVisible(true);
        AreaLateralText.setText(String.format("%.2f", cubo.getAreaLateral()));
        AreaLateralText.setVisible(true);
        CalculeButton.setText("Próximo");
       }
    }//GEN-LAST:event_CalculeButtonActionPerformed

    private void LadoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LadoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LadoTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LadoText.setText("");
        AreaLateralText.setVisible(false);
        AreaLateralLabel.setVisible(false);
        CalculeButton.setText("Calcule");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LadoTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LadoTextMouseClicked
        if ((LadoText.getText().equals("Campo Vazio")) || (LadoText.getText().equals("Valor Não Aceito"))){
                   LadoText.setText("");
        }
    }//GEN-LAST:event_LadoTextMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        TipoCalculoCubo tcc = new TipoCalculoCubo();
        tcc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked

    }//GEN-LAST:event_jMenu6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DadosAreaLateralCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosAreaLateralCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosAreaLateralCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosAreaLateralCubo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosAreaLateralCubo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaLateralLabel;
    private javax.swing.JTextField AreaLateralText;
    private javax.swing.JMenuBar BarMenu1;
    private javax.swing.JButton CalculeButton;
    private javax.swing.JLabel LadoLabel;
    private javax.swing.JTextField LadoText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    // End of variables declaration//GEN-END:variables
}