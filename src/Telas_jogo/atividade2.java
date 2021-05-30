
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class atividade2 extends javax.swing.JFrame {

    
    public atividade2() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        status3 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextPane1.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane1.setText("Fase 2");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 70, 24);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(250, 250, 80, 20);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(240, 340, 60, 20);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(293, 425, 90, 20);
        getContentPane().add(status3);
        status3.setBounds(400, 425, 50, 20);
        getContentPane().add(status2);
        status2.setBounds(190, 350, 50, 20);
        getContentPane().add(status1);
        status1.setBounds(340, 250, 50, 20);

        jTextPane2.setEditable(false);
        jTextPane2.setContentType(""); // NOI18N
        jTextPane2.setText("Obrigado por me ajudar com o primeiro código, agora teremos um novo desafio por favor veja o código abaixo e complete com os comandos certos para o código funcionar !\n\n\nalgoritmo \"Função Calcular IMC\"\n\nfuncao calcular_IMC(): REAL\nvar\n    peso, altura, IMC : REAL\ninicio\n\tIMC := peso / (altura * 2)\n\t\nfimfuncao\n\nvar\n    peso, altura, IMC : REAL\n\ninicio\n\tESCREVA (\"Vamos calcular o seu IMC :)\")\n\tESCREVA (\"Digite o seu peso: \")\n\tLEIA (peso)\n\tESCREVA (\"Digite a sua altura: \")\n\tLEIA (altura)\n\n\tIMC := calcular_IMC()\n\tESCREVA (\"O seu IMC é: \", IMC)\nfimalgoritmo");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 90, 540, 400);

        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 500, 71, 50);

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

        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG 800.png"))); // NOI18N
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
        if(this.jTextField1.equals("RETORNE IMC")){           
            this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_acerto.png"))); 
                                  
        }
        
        else{
               this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_erro.png"))); 
               
        }
       
        if(this.jTextField2.equals("LEIA(nota2)")){
                    this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_acerto.png")));
            }
         else{
               this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_erro.png"))); 
         }
        if(this.jTextField4.equals("calcular_IMC()")){
                    this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_acerto.png")));
            }
         else{
               this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_erro.png"))); 
         }
        if(this.jTextField1.equals("RETORNE IMC") && this.jTextField2.equals("ESCREVA") && this.jTextField4.equals("calcular_IMC()")){
        
            this.jButton4.setIcon((Icon)new ImageIcon(getClass().getResource("img/btnProximo.png")));
            JOptionPane.showMessageDialog(null,"Todas as linhas estão corretas!! \n O código vai funcionar corretamente parabéns" );
            
        }
         else{
                             
               JOptionPane.showMessageDialog(null, "Uma ou mais Linhas estão erradas, tente novamente");
               atividade2 var = new atividade2();
          var.setVisible(true);
          dispose();
         }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        atividade3 next = new atividade3();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JLabel status3;
    // End of variables declaration//GEN-END:variables
}
