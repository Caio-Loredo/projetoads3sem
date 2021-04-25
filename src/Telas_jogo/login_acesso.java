
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class login_acesso extends javax.swing.JFrame {

    cadastro_jogador CJ = new cadastro_jogador();
    
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
        cadastro = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        nome_login.setForeground(new java.awt.Color(255, 255, 255));
        nome_login.setText("Aluno:");
        getContentPane().add(nome_login);
        nome_login.setBounds(190, 160, 40, 40);

        nomelogin_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomelogin_campoActionPerformed(evt);
            }
        });
        getContentPane().add(nomelogin_campo);
        nomelogin_campo.setBounds(230, 170, 120, 20);

        RGM.setForeground(new java.awt.Color(255, 255, 255));
        RGM.setText("RGM:");
        getContentPane().add(RGM);
        RGM.setBounds(190, 200, 30, 40);

        rgm_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgm_campoActionPerformed(evt);
            }
        });
        getContentPane().add(rgm_campo);
        rgm_campo.setBounds(230, 210, 120, 20);

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });
        getContentPane().add(conectar);
        conectar.setBounds(190, 390, 130, 50);

        cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btncadastro.png"))); // NOI18N
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
        cadastro.setBounds(340, 390, 180, 50);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnvoltar.png"))); // NOI18N
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
        cancelar.setBounds(530, 390, 180, 50);
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
       String id_nome;
       id_nome = nomelogin_campo.getText();
       int id_RGM;
       id_RGM = Integer.parseInt(this.rgm_campo.getText());
       int IDrgm = CJ.cadastro_rgm;
       if(id_nome.equals(CJ.cadastro_Nome) ){
          JOptionPane.showMessageDialog(null,"Aluno "+id_nome+ " logado com sucesso!!");
          intro var = new intro();
          var.setVisible(true);
          dispose();
       }
       else {
           JOptionPane.showMessageDialog(null,"Nome ou RGM não não reconhecidos,favor colocar dados cadastrados");
       }
       
    }//GEN-LAST:event_conectarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        Menu var = new Menu();
        var.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nomelogin_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomelogin_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomelogin_campoActionPerformed

    private void rgm_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgm_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgm_campoActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        // TODO add your handling code here:
        tela_cadastro var = new tela_cadastro();
        var.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastroActionPerformed

  
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
    private javax.swing.JButton cadastro;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton conectar;
    private javax.swing.JLabel nome_login;
    private javax.swing.JTextField nomelogin_campo;
    private javax.swing.JTextField rgm_campo;
    // End of variables declaration//GEN-END:variables
}
