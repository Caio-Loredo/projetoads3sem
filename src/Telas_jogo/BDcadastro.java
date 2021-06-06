package Telas_jogo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BDcadastro {

    cadastro_jogador jogador = new cadastro_jogador();
    java.sql.ResultSet rs;
    private Connection conexao = null;
    private Statement comando = null;

        public void Conecta(){    
            try {
                String serverName = "localhost";
                String mydatabase = "BDjogo";
                String username = "root";
                String password = "123Mudar";          
                String driverName = "com.mysql.cj.jdbc.Driver";
                Class.forName(driverName);           
                String url = "jdbc:mysql://" + serverName + "/" + mydatabase+"?useTimezone=true&serverTimezone=UTC";
                conexao = DriverManager.getConnection(url,username,password);
                comando = conexao.createStatement();
                System.out.println("Conexão com o banco de dados efetuada com sucesso!");
            }
            catch (ClassNotFoundException e){
                        System.out.println("Driver não encontrado!"+e);
            }
            catch (Exception e){
                   System.out.println(" SQL Exception "+ e.getMessage()+" Erro ao conectar o Banco de Dados");
            }        
        }
        
        public void InsereDados(int cadastro_rgm,String cadastro_nome, String cadastro_curso,int cadastro_semestre){
            jogador.setRgm(cadastro_rgm);
            jogador.setNome(cadastro_nome);
            jogador.setCurso(cadastro_curso);
            jogador.setSemestre(cadastro_semestre);
            Insert();
        }
        public void InsereLogin(int login_rgm){
            jogador.setRgm(login_rgm);
            Logar();
            
        }
        
        public void Insert(){ 
        if ((jogador.getRgm()!=0)&&(jogador.getNome().length() >1)&&(jogador.getCurso().length()>1)&&(jogador.getSemestre()!=0)){
            try {
                PreparedStatement PreparedStatement;
                String sql = "INSERT INTO cadastro(rgm,nome,curso,semestre)"+ "VALUES(?,?,?,?)"; 
                PreparedStatement = conexao.prepareStatement(sql);
                PreparedStatement.setInt(1,jogador.getRgm()); 
                PreparedStatement.setString(2,jogador.getNome());
                PreparedStatement.setString(3,jogador.getCurso());       
                PreparedStatement.setInt(4,jogador.getSemestre());
                int intRegistro = PreparedStatement.executeUpdate(); 
                if (intRegistro !=0){ 
                    JOptionPane.showMessageDialog(null,"Registro adicionado com sucesso !", "Menagem ao Usuario",JOptionPane.INFORMATION_MESSAGE); 
                 } 
                else{ 
                    JOptionPane.showMessageDialog(null,"Registro nao adicionado !", "Mensagem ao Usuário",JOptionPane.INFORMATION_MESSAGE); 
                } 
            }
            catch (Exception Excecao) {
                JOptionPane.showMessageDialog(null,"SQLException: " + Excecao.getMessage(),"Erro: Selecao de registro", JOptionPane.INFORMATION_MESSAGE); 
            }
        } else {
            JOptionPane.showMessageDialog(null,"Falta Preencher Campo!\n "+"Aluno: "+jogador.getNome()+"\n"+"RGM: "+ jogador.getRgm()+"\n"+"Curso: "+jogador.getCurso()+"\n"+"Semestre: "+jogador.getSemestre()); 
        }
    }
        
    public void Logar(){
    PreparedStatement pst=null;

    String sql = "SELECT*FROM cadastro WHERE rgm=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, jogador.getRgm());
            rs = pst.executeQuery();
            if(rs.next()){
                
                intro intro = new intro();
                intro.setVisible(true);
                dispose();
            } else{
                JOptionPane.showMessageDialog(null, "Usuário e ou senha inválidos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       

    }

    private void dispose() {
        JOptionPane.showMessageDialog(null, "Bem Vindo!");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}


