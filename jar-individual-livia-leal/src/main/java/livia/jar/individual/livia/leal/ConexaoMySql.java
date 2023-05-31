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
public class ConexaoMySql {
    private JdbcTemplate connectionMySql;
    
    public ConexaoMySql(){
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://54.167.36.204:3306/BitBoxDB");

        dataSource.setUsername("root");

        dataSource.setPassword("urubu100");
        this.connectionMySql = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connectionMySql;
    }
}
