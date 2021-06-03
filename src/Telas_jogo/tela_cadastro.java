
package Telas_jogo;

import javax.swing.ImageIcon;


public class tela_cadastro extends javax.swing.JFrame {
    cadastro_jogador jogador = new cadastro_jogador();
    BDcadastro controle = new BDcadastro();
    
    public tela_cadastro() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        jText_cadastro_nome = new javax.swing.JTextField();
        rgm = new javax.swing.JLabel();
        jText_cadastro_rgm = new javax.swing.JTextField();
        Curso = new javax.swing.JLabel();
        jText_cadastro_curso = new javax.swing.JTextField();
        semestre = new javax.swing.JLabel();
        jText_cadastro_semestre = new javax.swing.JTextField();
        voltar_tela = new javax.swing.JButton();
        jButtron_cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome completo:");
        getContentPane().add(nome);
        nome.setBounds(190, 210, 110, 15);

        jText_cadastro_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_cadastro_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(jText_cadastro_nome);
        jText_cadastro_nome.setBounds(190, 230, 180, 20);

        rgm.setBackground(new java.awt.Color(255, 255, 255));
        rgm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rgm.setForeground(new java.awt.Color(255, 255, 255));
        rgm.setText("RGM:");
        getContentPane().add(rgm);
        rgm.setBounds(190, 140, 40, 15);

        jText_cadastro_rgm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_cadastro_rgmActionPerformed(evt);
            }
        });
        getContentPane().add(jText_cadastro_rgm);
        jText_cadastro_rgm.setBounds(190, 160, 180, 20);

        Curso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Curso.setForeground(new java.awt.Color(255, 255, 255));
        Curso.setText("Curso:");
        getContentPane().add(Curso);
        Curso.setBounds(190, 270, 60, 15);
        getContentPane().add(jText_cadastro_curso);
        jText_cadastro_curso.setBounds(190, 290, 180, 20);

        semestre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        semestre.setForeground(new java.awt.Color(255, 255, 255));
        semestre.setText("Semestre:");
        getContentPane().add(semestre);
        semestre.setBounds(190, 330, 70, 15);
        getContentPane().add(jText_cadastro_semestre);
        jText_cadastro_semestre.setBounds(190, 350, 180, 20);

        voltar_tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnvoltar.png"))); // NOI18N
        voltar_tela.setText("Voltar");
        voltar_tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_telaActionPerformed(evt);
            }
        });
        getContentPane().add(voltar_tela);
        voltar_tela.setBounds(340, 480, 180, 50);

        jButtron_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btncadastro.png"))); // NOI18N
        jButtron_cadastrar.setText("Cadastrar");
        jButtron_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtron_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtron_cadastrar);
        jButtron_cadastrar.setBounds(530, 310, 180, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Faça o seu cadastro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 100, 178, 40);

        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG 800.png"))); // NOI18N
        Splash_BG.setMaximumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setMinimumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltar_telaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_telaActionPerformed
        // TODO add your handling code here:
       login_acesso var = new login_acesso();
               var.setVisible(true);
               dispose();
    }//GEN-LAST:event_voltar_telaActionPerformed

    private void jText_cadastro_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cadastro_nomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jText_cadastro_nomeActionPerformed

    private void jButtron_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtron_cadastrarActionPerformed
        int cadastro_rgm = Integer.parseInt(this.jText_cadastro_rgm.getText());
        String cadastro_nome = this.jText_cadastro_nome.getText();
        String cadastro_curso = this.jText_cadastro_curso.getText();
        int cadastro_semestre = Integer.parseInt(this.jText_cadastro_semestre.getText());
        controle.InsereDados(cadastro_rgm,cadastro_nome,cadastro_curso,cadastro_semestre);
        
    }//GEN-LAST:event_jButtron_cadastrarActionPerformed

    private void jText_cadastro_rgmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cadastro_rgmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_cadastro_rgmActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Splash_BG;
    public javax.swing.JButton jButtron_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jText_cadastro_curso;
    private javax.swing.JTextField jText_cadastro_nome;
    private javax.swing.JTextField jText_cadastro_rgm;
    private javax.swing.JTextField jText_cadastro_semestre;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel rgm;
    private javax.swing.JLabel semestre;
    private javax.swing.JButton voltar_tela;
    // End of variables declaration//GEN-END:variables
}
