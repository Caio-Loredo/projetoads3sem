
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class tela_cadastro extends javax.swing.JFrame {

    
    public tela_cadastro() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JLabel();
        cadastro_nome = new javax.swing.JTextField();
        rgm = new javax.swing.JLabel();
        cadastro_rgm = new javax.swing.JTextField();
        Curso = new javax.swing.JLabel();
        cadastro_curso = new javax.swing.JTextField();
        semestre = new javax.swing.JLabel();
        cadastro_semestre = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        cadastro_senha = new javax.swing.JTextField();
        voltar_tela = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome completo:");
        getContentPane().add(nome);
        nome.setBounds(180, 130, 80, 14);
        getContentPane().add(cadastro_nome);
        cadastro_nome.setBounds(270, 130, 220, 20);

        rgm.setBackground(new java.awt.Color(255, 255, 255));
        rgm.setForeground(new java.awt.Color(255, 255, 255));
        rgm.setText("RGM:");
        getContentPane().add(rgm);
        rgm.setBounds(180, 160, 30, 14);
        getContentPane().add(cadastro_rgm);
        cadastro_rgm.setBounds(220, 160, 130, 20);

        Curso.setForeground(new java.awt.Color(255, 255, 255));
        Curso.setText("Curso:");
        getContentPane().add(Curso);
        Curso.setBounds(180, 190, 32, 14);
        getContentPane().add(cadastro_curso);
        cadastro_curso.setBounds(220, 190, 130, 20);

        semestre.setForeground(new java.awt.Color(255, 255, 255));
        semestre.setText("Semestre:");
        getContentPane().add(semestre);
        semestre.setBounds(180, 220, 60, 14);
        getContentPane().add(cadastro_semestre);
        cadastro_semestre.setBounds(240, 220, 110, 20);

        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("Senha:");
        getContentPane().add(senha);
        senha.setBounds(180, 250, 34, 14);
        getContentPane().add(cadastro_senha);
        cadastro_senha.setBounds(220, 250, 130, 20);

        voltar_tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnvoltar.png"))); // NOI18N
        voltar_tela.setText("Voltar");
        voltar_tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_telaActionPerformed(evt);
            }
        });
        getContentPane().add(voltar_tela);
        voltar_tela.setBounds(430, 390, 180, 50);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btncadastro.png"))); // NOI18N
        cadastrar.setText("Cadastrar");
        getContentPane().add(cadastrar);
        cadastrar.setBounds(170, 390, 180, 50);

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
        login var = new login();
        var.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltar_telaActionPerformed

  
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
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cadastro_curso;
    private javax.swing.JTextField cadastro_nome;
    private javax.swing.JTextField cadastro_rgm;
    private javax.swing.JTextField cadastro_semestre;
    private javax.swing.JTextField cadastro_senha;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel rgm;
    private javax.swing.JLabel semestre;
    private javax.swing.JLabel senha;
    private javax.swing.JButton voltar_tela;
    // End of variables declaration//GEN-END:variables
}
