
package Telas_jogo;

import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class tela_cadastro extends javax.swing.JFrame {

    cadastro_jogador cj = new cadastro_jogador();
    
    public tela_cadastro() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_login = new javax.swing.JLabel();
        login_nome = new javax.swing.JTextField();
        login_RGM = new javax.swing.JLabel();
        login_rgm = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        cadastro_nome = new javax.swing.JTextField();
        rgm = new javax.swing.JLabel();
        cadastro_rgm = new javax.swing.JTextField();
        Curso = new javax.swing.JLabel();
        cadastro_curso = new javax.swing.JTextField();
        Login_btn = new javax.swing.JButton();
        semestre = new javax.swing.JLabel();
        cadastro_semestre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        voltar_tela = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        name_login.setForeground(new java.awt.Color(255, 255, 255));
        name_login.setText("Nome do Aluno:");
        getContentPane().add(name_login);
        name_login.setBounds(190, 130, 90, 14);
        getContentPane().add(login_nome);
        login_nome.setBounds(280, 130, 190, 20);

        login_RGM.setForeground(new java.awt.Color(255, 255, 255));
        login_RGM.setText("RGM:");
        getContentPane().add(login_RGM);
        login_RGM.setBounds(190, 170, 26, 14);
        getContentPane().add(login_rgm);
        login_rgm.setBounds(230, 170, 100, 20);

        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome completo:");
        getContentPane().add(nome);
        nome.setBounds(180, 250, 80, 14);

        cadastro_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(cadastro_nome);
        cadastro_nome.setBounds(270, 250, 220, 20);

        rgm.setBackground(new java.awt.Color(255, 255, 255));
        rgm.setForeground(new java.awt.Color(255, 255, 255));
        rgm.setText("RGM:");
        getContentPane().add(rgm);
        rgm.setBounds(180, 280, 30, 14);
        getContentPane().add(cadastro_rgm);
        cadastro_rgm.setBounds(220, 280, 130, 20);

        Curso.setForeground(new java.awt.Color(255, 255, 255));
        Curso.setText("Curso:");
        getContentPane().add(Curso);
        Curso.setBounds(180, 310, 50, 14);
        getContentPane().add(cadastro_curso);
        cadastro_curso.setBounds(230, 310, 130, 20);

        Login_btn.setText("Entrar");
        Login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Login_btn);
        Login_btn.setBounds(540, 160, 180, 50);

        semestre.setForeground(new java.awt.Color(255, 255, 255));
        semestre.setText("Semestre:");
        getContentPane().add(semestre);
        semestre.setBounds(180, 340, 60, 14);
        getContentPane().add(cadastro_semestre);
        cadastro_semestre.setBounds(240, 340, 110, 20);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(180, 220, 540, 10);

        voltar_tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnvoltar.png"))); // NOI18N
        voltar_tela.setText("Voltar");
        voltar_tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_telaActionPerformed(evt);
            }
        });
        getContentPane().add(voltar_tela);
        voltar_tela.setBounds(80, 400, 180, 50);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btncadastro.png"))); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(540, 320, 180, 50);

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

    private void cadastro_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_nomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cadastro_nomeActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
     String c_nomecompleto = this.cadastro_nome.getText();
       int c_RGM = Integer.parseInt(this.cadastro_rgm.getText());
       String c_Curso = this.cadastro_curso.getText();
       int c_Semestre= Integer.parseInt(this.cadastro_semestre.getText());
       this.cadastro_nome.setText("");
       this.cadastro_rgm.setText("");
       this.cadastro_semestre.setText("");
       this.cadastro_curso.setText("");
       cj.cadastrar_dados(c_nomecompleto, c_Curso, c_RGM, c_Semestre);
       JOptionPane.showMessageDialog(null,"Aluno:"+c_nomecompleto+"\nRGM: "+c_RGM+"\nCurso: "+c_Curso+"\nSemestre: "+c_Semestre + "cadastrado com sucesso ");
    }//GEN-LAST:event_cadastrarActionPerformed

    private void Login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_btnActionPerformed
        // TODO add your handling code here:
        String nomealuno;
        nomealuno = this.login_nome.getText();
        int rgmaluno;
        rgmaluno = Integer.parseInt(this.login_rgm.getText());
        if(nomealuno.equals(cj.cadastro_Nome ) ){
            if(rgmaluno == cj.cadastro_rgm){
            JOptionPane.showMessageDialog(null,"Aluno "+nomealuno+ " logado com sucesso!!");
           try{ 
               sleep(20);
          intro var = new intro();
          var.setVisible(true);
          dispose();
           }
           catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao carregar login");
                }
            }
        } 
        else {
            JOptionPane.showMessageDialog(null,"Nome ou RGM incorretos tente novamente");
        }
        this.login_rgm.setText("");
        this.login_nome.setText("");
    }//GEN-LAST:event_Login_btnActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Curso;
    private javax.swing.JButton Login_btn;
    private javax.swing.JLabel Splash_BG;
    public javax.swing.JButton cadastrar;
    private javax.swing.JTextField cadastro_curso;
    private javax.swing.JTextField cadastro_nome;
    private javax.swing.JTextField cadastro_rgm;
    private javax.swing.JTextField cadastro_semestre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel login_RGM;
    private javax.swing.JTextField login_nome;
    private javax.swing.JTextField login_rgm;
    private javax.swing.JLabel name_login;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel rgm;
    private javax.swing.JLabel semestre;
    private javax.swing.JButton voltar_tela;
    // End of variables declaration//GEN-END:variables
}
