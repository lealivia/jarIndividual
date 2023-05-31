/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JdbcCommands;

import Conexao.Conexao;
import Entidades.Usuario;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author livia
 */
public class SelectUser {
      private Boolean loginValido = false;
        
    Conexao conexaoBanco = new Conexao();
    JdbcTemplate con = conexaoBanco.getConnection();
    List<Usuario> listaObjetoUsuario;
    
    public void selectAndInsert(String email, String senha){
        
        //Select no Usuario
        listaObjetoUsuario = con.query(
                "select * from funcionario where email = ? and senha = ?", 
                new BeanPropertyRowMapper<>(Usuario.class), email, senha);
        
        if (listaObjetoUsuario.size()>0) {
            loginValido = true;

        } else {
            loginValido = false;

        }
        
        System.out.println(listaObjetoUsuario);

    }
    
    public Boolean isLoginValido() {
        return loginValido;
    }
}
