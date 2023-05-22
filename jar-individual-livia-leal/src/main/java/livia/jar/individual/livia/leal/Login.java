/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package livia.jar.individual.livia.leal;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author livia
 */
public class Login extends javax.swing.JFrame {
    Looca looca;
    ConexaoAzure conexaoAzure;
    ConexaoMySql conexaoMySql;
    JdbcTemplate con;
    JdbcTemplate conMySql;
            
    public Login() {
        initComponents();
        this.looca= new Looca();
        this.conexaoAzure= new ConexaoAzure();
        this.con= conexaoAzure.getConnection();
        this.conexaoMySql= new ConexaoMySql();
        this.conMySql= conexaoMySql.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSO = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        lblArquitetura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 13, 13));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 34, -1, -1));

        jLabel2.setForeground(new java.awt.Color(205, 205, 205));
        jLabel2.setText("E-mail");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 152, 37, -1));

        txtEmail.setBackground(new java.awt.Color(44, 44, 44));
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 174, 187, 31));

        txtSenha.setBackground(new java.awt.Color(44, 44, 44));
        txtSenha.setForeground(new java.awt.Color(205, 205, 205));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 251, 187, 37));

        btnEntrar.setBackground(new java.awt.Color(245, 230, 91));
        btnEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 306, 187, 35));

        jLabel3.setForeground(new java.awt.Color(205, 205, 205));
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 223, 69, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sistema Operacional");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 377, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fabricante");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 377, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arquitetura");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 377, -1, -1));

        lblSO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSO.setForeground(new java.awt.Color(245, 230, 91));
        lblSO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSO.setText("-");
        jPanel1.add(lblSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 405, 119, -1));

        lblFabricante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFabricante.setForeground(new java.awt.Color(245, 230, 91));
        lblFabricante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFabricante.setText("-");
        jPanel1.add(lblFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 405, 118, -1));

        lblArquitetura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblArquitetura.setForeground(new java.awt.Color(245, 230, 91));
        lblArquitetura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArquitetura.setText("-");
        jPanel1.add(lblArquitetura, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 405, 87, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = looca.getSistema();
        String email =  String.valueOf(txtEmail.getText());
        String senha = String.valueOf(txtSenha.getText());

        List<Usuario> usuariosAzure = con.query(String.format("select * from usuario where email = '%s' and senha = '%s'",email, senha), new BeanPropertyRowMapper(Usuario.class));
        List<Usuario> usuariosMySql = conMySql.query(String.format("select * from usuario where email = '%s' and senha = '%s'",email, senha), new BeanPropertyRowMapper(Usuario.class));

        System.out.println(usuariosAzure);
        if(usuariosAzure.size()>0){
        lblSO.setText(sistema.getSistemaOperacional());
        lblFabricante.setText(sistema.getFabricante().toString());
        lblArquitetura.setText(sistema.getArquitetura().toString());
        }else{
            System.out.println("Acesso negado!");
        }
        
        System.out.println(usuariosMySql);
        if(usuariosMySql.size()>0){
        lblSO.setText(sistema.getSistemaOperacional());
        lblFabricante.setText(sistema.getFabricante().toString());
        lblArquitetura.setText(sistema.getArquitetura().toString());
        }else{
            System.out.println("Acesso negado!");
        }
       
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArquitetura;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblSO;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
