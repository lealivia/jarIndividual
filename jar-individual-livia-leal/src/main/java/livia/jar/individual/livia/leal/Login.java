/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livia.jar.individual.livia.leal;

import Conexao.Conexao;
import Conexao.ConexaoDocker;
import JdbcCommands.InsertMaquina;
import JdbcCommands.InsertRegistro;
import JdbcCommands.SelectUser;
import java.util.Scanner;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author livia
 */
public class Login {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Conexao conexaoBanco = new Conexao();
      JdbcTemplate con = conexaoBanco.getConnection();
      ConexaoDocker conexaoDocker = new ConexaoDocker();
      JdbcTemplate conDocker = conexaoDocker.getConnection();

      SelectUser select = new SelectUser();
      InsertMaquina maquina = new InsertMaquina();
      InsertRegistro registros = new InsertRegistro();

      System.out.println(" ||| >>> BEM VINDO <<< |||");

      System.out.println("Digite seu email: ");
      String email = sc.nextLine();

      System.out.println("Digite senha: ");
      String senha = sc.nextLine();

      select.selectAndInsert(email, senha);

      if (select.isLoginValido()) {
         System.out.println("Login deu certo!");
         
         maquina.queryCadastrarMaquina(email);
         registros.queryInserirRegistros(email);
      } else {
         System.out.println("Login deu errado");
      }
   }
}
