/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.escolhas;

import br.edu.telasdadosespaciais.*;
import javax.swing.ImageIcon;
import principal.calcexpress.Menu.Equipe;
import principal.calcexpress.Menu.Sobre;
/**
 *
 * @author Alunos
 */
public class TipoCalculoTetraedro extends javax.swing.JFrame {

    /**
     * Creates new form TipoCalculo
     */
    public TipoCalculoTetraedro() {
        initComponents();  
        ImageIcon icon = new ImageIcon((new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/icon.png")).getImage()));  
        setIconImage(icon.getImage());
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

        CalculoPainel = new javax.swing.JPanel();
        ProsseguirButton = new javax.swing.JButton();
        RetornarButton = new javax.swing.JButton();
        CaixaDeCalculo = new javax.swing.JComboBox<>();
        CalculoText = new javax.swing.JLabel();
        CalculoFundo = new javax.swing.JLabel();
        BarMenu1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\br\\edu\\telasimagens\\icone.png").getImage()
        );

        CalculoPainel.setPreferredSize(new java.awt.Dimension(699, 374));
        CalculoPainel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProsseguirButton.setBackground(new java.awt.Color(153, 0, 51));
        ProsseguirButton.setForeground(new java.awt.Color(255, 255, 255));
        ProsseguirButton.setText("Prosseguir");
        ProsseguirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsseguirButtonActionPerformed(evt);
            }
        });
        CalculoPainel.add(ProsseguirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 110, -1));

        RetornarButton.setBackground(new java.awt.Color(153, 0, 51));
        RetornarButton.setForeground(new java.awt.Color(255, 255, 255));
        RetornarButton.setText(" Retorne  ");
        RetornarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetornarButtonMouseClicked(evt);
            }
        });
        CalculoPainel.add(RetornarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 100, -1));

        CaixaDeCalculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CaixaDeCalculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Área Total", "Volume" }));
        CaixaDeCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaDeCalculoActionPerformed(evt);
            }
        });
        CalculoPainel.add(CaixaDeCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 290, 30));

        CalculoText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CalculoText.setForeground(new java.awt.Color(153, 0, 0));
        CalculoText.setText("Selecione o tipo de cálculo a ser realizado:");
        CalculoPainel.add(CalculoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 290, 20));

        CalculoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/TelaCalculo.png"))); // NOI18N
        CalculoPainel.add(CalculoFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 390));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CalculoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(CalculoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(715, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CaixaDeCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaDeCalculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaDeCalculoActionPerformed

    private void ProsseguirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsseguirButtonActionPerformed
      if (CaixaDeCalculo.getSelectedIndex() == 0){
          DadosAreaTotalTetraedro datt = new DadosAreaTotalTetraedro();
          datt.setVisible(true);
      }
      else if (CaixaDeCalculo.getSelectedIndex() == 1){
          DadosVolumeTetraedro dvt = new DadosVolumeTetraedro();
          dvt.setVisible(true);
      }
      this.dispose();
    }//GEN-LAST:event_ProsseguirButtonActionPerformed

    private void RetornarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetornarButtonMouseClicked
        EscolhaFigEsp efe = new EscolhaFigEsp();
         efe.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_RetornarButtonMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        EscolhaFigEsp efe = new EscolhaFigEsp();
        efe.setVisible(true);
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
            java.util.logging.Logger.getLogger(TipoCalculoTetraedro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoCalculoTetraedro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoCalculoTetraedro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoCalculoTetraedro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoCalculoTetraedro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu1;
    private javax.swing.JComboBox<String> CaixaDeCalculo;
    private javax.swing.JLabel CalculoFundo;
    private javax.swing.JPanel CalculoPainel;
    private javax.swing.JLabel CalculoText;
    private javax.swing.JButton ProsseguirButton;
    private javax.swing.JButton RetornarButton;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    // End of variables declaration//GEN-END:variables


    
}
