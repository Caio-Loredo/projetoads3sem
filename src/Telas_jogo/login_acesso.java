
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class login_acesso extends javax.swing.JFrame {

    
    public login_acesso() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome_login = new javax.swing.JLabel();
        nomelogin_campo = new javax.swing.JTextField();
        RGM = new javax.swing.JLabel();
        rgm_campo = new javax.swing.JTextField();
        conectar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        nome_login.setForeground(new java.awt.Color(255, 255, 255));
        nome_login.setText("Nome:");
        getContentPane().add(nome_login);
        nome_login.setBounds(190, 160, 40, 40);
        getContentPane().add(nomelogin_campo);
        nomelogin_campo.setBounds(230, 170, 120, 20);

        RGM.setForeground(new java.awt.Color(255, 255, 255));
        RGM.setText("RGM:");
        getContentPane().add(RGM);
        RGM.setBounds(190, 120, 30, 40);
        getContentPane().add(rgm_campo);
        rgm_campo.setBounds(220, 130, 120, 20);

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });
        getContentPane().add(conectar);
        conectar.setBounds(250, 390, 130, 50);

        cancelar.setText("Cancelar");
        cancelar.setMaximumSize(new java.awt.Dimension(59, 23));
        cancelar.setMinimumSize(new java.awt.Dimension(59, 23));
        cancelar.setPreferredSize(new java.awt.Dimension(59, 23));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(410, 390, 150, 50);
        cancelar.getAccessibleContext().setAccessibleName("cadastrar");

        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG 800.png"))); // NOI18N
        Splash_BG.setMaximumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setMinimumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_conectarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_acesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RGM;
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton conectar;
    private javax.swing.JLabel nome_login;
    private javax.swing.JTextField nomelogin_campo;
    private javax.swing.JTextField rgm_campo;
    // End of variables declaration//GEN-END:variables
}
