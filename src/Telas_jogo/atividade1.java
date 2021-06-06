
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class atividade1 extends javax.swing.JFrame {

  int vida = 3;

    
    
    public atividade1() {
        
       
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());        

        
        new Thread(){
        @Override
            public void run(){
                for (int i=0 ; i<=100 ; i++){
                    try{
                        sleep(1000);
                        timebar.setValue(i);
                        
                        if(timebar.getValue()==100){
                           JOptionPane.showMessageDialog(null,"Tempo esgotado!!!");
                           atividade1 Mn = new atividade1();
                           Mn.setVisible(true);
                           dispose();
                           i = 0;
                        }
                        
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar");
                    }
                }
            }
        
        }.start();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        status3 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jTextField3 = new javax.swing.JTextField();
        timebar = new javax.swing.JProgressBar();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coracao1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 10, 80, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coracao1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 10, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coracao1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 10, 80, 40);
        getContentPane().add(status3);
        status3.setBounds(470, 440, 50, 20);
        getContentPane().add(status2);
        status2.setBounds(340, 400, 50, 20);
        getContentPane().add(status1);
        status1.setBounds(430, 310, 50, 40);

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane3.setText("Tempo");
        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(170, 10, 100, 40);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(450, 460, 40, 20);

        timebar.setString("0");
        getContentPane().add(timebar);
        timebar.setBounds(270, 20, 210, 20);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(270, 420, 60, 20);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 320, 150, 20);

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setToolTipText("Clique para ir para a próxima tela");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusCycleRoot(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(680, 500, 50, 50);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane1.setText("Fase 1");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 70, 24);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTextPane2.setEditable(false);
        jTextPane2.setContentType(""); // NOI18N
        jTextPane2.setText("Como primeira atividade ajude a terminar o codigo de calculo de média, complete as partes que faltam com a estrutura correta!\n\n\nalgoritmo \"Soma Media com função\"\n\nfuncao calcular_Media(): REAL\nvar\n    media : REAL\ninicio\n\tmedia := (nota1 + nota2) / 2\n\tRETORNE media\nfimfuncao\n\nvar\n    nota1, nota2 : \n\ninicio\n\tESCREVA (\"Digite a primeira nota do aluno: \")\n\tLEIA (nota1)\n\tESCREVA (\"Digite a segunda nota do aluno: \")\n\t\n\n\tmedia := calcular_Media()\n\tESCREVA (\"A media do aluno é: \",              )\nfimalgoritmo");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(190, 110, 540, 390);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerif.png"))); // NOI18N
        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 520, 170, 40);

        Splash_BG.setBackground(new java.awt.Color(0, 204, 255));
        Splash_BG.setForeground(new java.awt.Color(0, 204, 255));
        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GB-fundo.png"))); // NOI18N
        Splash_BG.setMaximumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setMinimumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String text1 = jTextField1.getText();
        String text2 = jTextField2.getText();
        String text3 = jTextField3.getText();
        
        if(text1.equals("REAL")){
            this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png"))); 
        }        
        else{
               this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));
               vida = vida -1;
        }
        
        if(text2.equals("LEIA (nota2)")){
            this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png")));
        }
        else{
            this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));
            vida = vida -1;
        }
        
        if(text3.equals("media")){
            this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png")));
        }
        else{
            this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));
            vida = vida -1;
        }
        
        if(text1.equals("REAL") && text2.equals("LEIA (nota2)") && text3.equals("media")){
            this.jButton4.setIcon((Icon)new ImageIcon(getClass().getResource("/img/btnProximo.png")));
            JOptionPane.showMessageDialog(null, "Todas as linhas estão corretas!! \n O código vai funcionar corretamente parabéns");    
        }
        else{
            JOptionPane.showMessageDialog(null, "Uma ou mais Linhas estão erradas, tente novamente");
        }
        
        if(vida == 2){
            this.jLabel1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao1.png")));
            this.jLabel3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao1.png")));
        }
         if(vida == 1){
            this.jLabel1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao1.png")));
        }
          if(vida <= 0){
            this.jLabel1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            JOptionPane.showMessageDialog(null,"Perdeu todas as chances, tente novamente!!");
            atividade1 Mn = new atividade1();
            Mn.setVisible(true);
            dispose();
          }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
       
        atividade2 next = new atividade2();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JLabel status3;
    private javax.swing.JProgressBar timebar;
    // End of variables declaration//GEN-END:variables
}
