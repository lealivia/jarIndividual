/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author livia
 */
public class Usuario {
    private Integer id_Usuario;
    private String nome;
    private String email;
    private String senha;
    private String cargo;

    public Usuario(Integer id_Usuario, String nome, String email, String senha, String cargo) {
        this.id_Usuario = id_Usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
    }

    public Usuario() {
        
    }

    public Integer getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Integer idUsuario) {
        this.id_Usuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_Usuario=" + id_Usuario + ", nome=" + nome + ", email=" + email + ", senha=" + senha + '}';
    }
    
    
    
}
