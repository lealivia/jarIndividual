/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livia.jar.individual.livia.leal;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 *
 * @author livia
 */
public class ConexaoAzure {
    private JdbcTemplate connectionAzure;
    
    public ConexaoAzure(){
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        dataSource.setUrl("jdbc:sqlserver://srv-projeto-bitbox.database.windows.net:1433;databaseName=bd-projeto-bitbox");

        dataSource.setUsername("admin-projeto-bitbox");

        dataSource.setPassword("#Gfgrupo4");
        this.connectionAzure = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connectionAzure;
    }
    
    
}
