/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas_jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author Caio Henrique
 */
public class cadastro_jogador {
    public String cadastro_Nome;
    public String cadastro_curso;
    public int cadastro_rgm;
    public int cadastro_semestre;
    
    public void cadastrar_dados(String cnome, String ccurso,int crgm, int csemestre){
        this.cadastro_Nome = cnome;
        this.cadastro_curso = ccurso;
        this.cadastro_rgm = crgm;
        this.cadastro_semestre = csemestre;
        
        
    
    }
}
