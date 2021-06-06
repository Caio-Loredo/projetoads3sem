
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class atividade3 extends javax.swing.JFrame {
    
    int vida = 3;
    
    public atividade3() {
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        timebar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        status4 = new javax.swing.JLabel();
        status3 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
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

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane3.setText("Tempo");
        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(170, 10, 100, 40);

        timebar.setString("0");
        getContentPane().add(timebar);
        timebar.setBounds(270, 20, 210, 20);

        jTextPane1.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane1.setText("Fase 3");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 70, 24);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 175, 60, 20);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(240, 233, 110, 20);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(180, 310, 70, 20);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(270, 440, 90, 20);
        getContentPane().add(status4);
        status4.setBounds(370, 440, 50, 20);
        getContentPane().add(status3);
        status3.setBounds(260, 310, 50, 20);
        getContentPane().add(status2);
        status2.setBounds(370, 233, 50, 20);
        getContentPane().add(status1);
        status1.setBounds(250, 175, 50, 20);

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

        jTextPane2.setEditable(false);
        jTextPane2.setContentType(""); // NOI18N
        jTextPane2.setText("Obrigado por me ajudar com o primeiro código, agora teremos um novo desafio por favor veja o código abaixo e complete com os comandos certos para o código funcionar !\n\n\nalgoritmo \"Montando um Sandubão\"\n\nfuncao fazer_Sanduiche(): CARACTERE\n\n    sanduiche : CARACTERE\ninicio\n\tsanduiche := pao + recheio + vegetal\n\t\nfimfuncao\n\nvar\n    pao, recheio, vegetal : CARACTERE\n\n\n\n      ESCREVA (\"Para começar a montar o seu sanduíche, digite um tipo de pão que será utilizado: \")\n      LEIA (pao)\n      ESCREVA (\"Agora que o pao foi escolhido, digite um recheio que você quer no seu sanduiche: \")\n      LEIA (recheio)\n      ESCREVA (\"Hmm, muito bem! Agora escolha um vegetal para acompanhar o seu sanduíche: \")\n      LEIA (vegetal)\n\n      sanduiche := \n\n      ESCREVA (\"Seu sanduiche de \", recheio, \" com \", vegetal, \" está pronto! Bom apetite ^^!\")\nfimalgoritmo");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 75, 540, 430);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerif.png"))); // NOI18N
        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 520, 170, 40);

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
        String text4 = jTextField4.getText();
        
        if(text1.equals("var")){
            this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png"))); 
        }        
        else{
               this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));         
        }
        
        if(text2.equals("RETORNE sanduiche")){
            this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png")));
        }
        else{
            this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));         
        }
        
        if(text3.equals("inicio")){
            this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png")));
        }
        else{
            this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png"))); 
        }
        
        if(text4.equals("fazer_Sanduiche()")){
            this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png"))); 
        }        
        else{
            this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));         
        }
        
        if(text1.equals("var") && text2.equals("RETORNE sanduiche") && text3.equals("inicio") && text4.equals("fazer_Sanduiche()")){
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
            atividade3 Mn = new atividade3();
            Mn.setVisible(true);
            dispose();
          }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        atividade4 next = new atividade4();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade3().setVisible(true);
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JLabel status3;
    private javax.swing.JLabel status4;
    private javax.swing.JProgressBar timebar;
    // End of variables declaration//GEN-END:variables
}
