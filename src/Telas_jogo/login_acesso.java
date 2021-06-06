
package Telas_jogo;

import javax.swing.ImageIcon;


public class login_acesso extends javax.swing.JFrame {
       
    BDcadastro controle = new BDcadastro();
    
    public login_acesso() {
        initComponents();
        controle.Conecta();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome_login = new javax.swing.JLabel();
        jText_login_nome = new javax.swing.JTextField();
        RGM = new javax.swing.JLabel();
        jText_login_rgm = new javax.swing.JTextField();
        Entrar = new javax.swing.JButton();
        cadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        nome_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nome_login.setForeground(new java.awt.Color(255, 255, 255));
        nome_login.setText("Nome completo");
        getContentPane().add(nome_login);
        nome_login.setBounds(190, 150, 150, 40);

        jText_login_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_login_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(jText_login_nome);
        jText_login_nome.setBounds(190, 190, 280, 20);

        RGM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RGM.setForeground(new java.awt.Color(255, 255, 255));
        RGM.setText("RGM:");
        getContentPane().add(RGM);
        RGM.setBounds(190, 220, 190, 40);

        jText_login_rgm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_login_rgmActionPerformed(evt);
            }
        });
        getContentPane().add(jText_login_rgm);
        jText_login_rgm.setBounds(190, 260, 280, 20);

        Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnentrar.png"))); // NOI18N
        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar);
        Entrar.setBounds(330, 400, 180, 50);

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
        cadastro.setBounds(330, 480, 180, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 110, 210, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Não tem cadastro? clica em CADASTRAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 330, 400, 20);

        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG 800.png"))); // NOI18N
        Splash_BG.setMaximumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setMinimumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        int login_rgm = Integer.parseInt(this.jText_login_rgm.getText());      
        controle.InsereLogin(login_rgm);
    }//GEN-LAST:event_EntrarActionPerformed

    private void jText_login_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_login_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_login_nomeActionPerformed

    private void jText_login_rgmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_login_rgmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_login_rgmActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed

        tela_cadastro tela_cadastro = new tela_cadastro();
        tela_cadastro.setVisible(true);
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
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel RGM;
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JButton cadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jText_login_nome;
    private javax.swing.JTextField jText_login_rgm;
    private javax.swing.JLabel nome_login;
    // End of variables declaration//GEN-END:variables
}
