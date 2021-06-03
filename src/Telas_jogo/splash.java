
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class splash extends javax.swing.JFrame {

    
    public splash() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        
        new Thread(){
        @Override
            public void run(){
                for (int i=0 ; i<=100 ; i++){
                    try{
                        sleep(30);
                        ProgressBar.setValue(i);
                        
                        if(ProgressBar.getValue()<=30){
                            status.setText("Iniciando S.O...");
                        } else if(ProgressBar.getValue()<=60){
                            status.setText("Iniciando funções cognitivas...");
                        } else if(ProgressBar.getValue()<=99){
                            status.setText("Iniciando drives...");
                        } else if(ProgressBar.getValue()==100){
                            status.setText("Tudo pronto!");
                        }
                        
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar");
                    }
                }
               Menu Menu = new Menu();
               Menu.setVisible(true);
               dispose();
            }
        
        }.start();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");
        getContentPane().add(status);
        status.setBounds(120, 570, 470, 20);

        ProgressBar.setBackground(new java.awt.Color(0, 0, 0));
        ProgressBar.setForeground(new java.awt.Color(255, 255, 255));
        ProgressBar.setToolTipText("");
        ProgressBar.setBorderPainted(false);
        ProgressBar.setStringPainted(true);
        getContentPane().add(ProgressBar);
        ProgressBar.setBounds(120, 540, 520, 30);

        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaSplash.jpg"))); // NOI18N
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
