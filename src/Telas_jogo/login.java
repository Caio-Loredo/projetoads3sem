
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        cadastro = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(260, 250, 130, 50);

        cadastro.setText("Cadastrar");
        cadastro.setMaximumSize(new java.awt.Dimension(57, 23));
        cadastro.setMinimumSize(new java.awt.Dimension(57, 23));
        cadastro.setPreferredSize(new java.awt.Dimension(57, 23));
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(cadastro);
        cadastro.setBounds(420, 250, 130, 50);
        cadastro.getAccessibleContext().setAccessibleName("cadastrar");

        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG_Game.png"))); // NOI18N
        Splash_BG.setMaximumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setMinimumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_loginActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        // TODO add your handling code here:
        tela_cadastro var = new tela_cadastro();
        var.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastroActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JButton cadastro;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
