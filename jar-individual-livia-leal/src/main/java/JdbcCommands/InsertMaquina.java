/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JdbcCommands;

import Conexao.Conexao;
import Conexao.ConexaoDocker;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author livia
 */
public class InsertMaquina {
     Conexao conexaoBanco = new Conexao();
    JdbcTemplate con = conexaoBanco.getConnection();
    Registro registro = new Registro();
    ConexaoDocker conexaoDocker = new ConexaoDocker();
    JdbcTemplate conDocker = conexaoDocker.getConnection();

    String sistemaOperacional = registro.getSistemaOperacional();
    String fabricante = registro.getSistemaFabricante();
    String arquitetura = registro.getSistemaArquitetura();
    Double cpuUso = registro.getUsoCPU();
    Double ramUso = registro.getMemoriaEmUsoGB();
    Double ramDisponivel = registro.getMemoriaDisponivelGB();

    Date dataAtual = new Date();
    Timestamp dataHora = new Timestamp(dataAtual.getTime());
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    String formatoAmericano = formatter.format(dataHora);

    public void queryCadastrarMaquina(String email) {
        String queryCadastrarMaquina = String.format("EXEC cadastrar_maquina '%s','%s','%s','%s'", sistemaOperacional, arquitetura, fabricante, email);
        con.update(queryCadastrarMaquina);
        String queryCadastrarDocker = String.format("INSERT INTO Maquina values (null,'%s','%s','%s',1,null)", sistemaOperacional, fabricante, arquitetura);
        conDocker.update(queryCadastrarDocker);
    }
}
