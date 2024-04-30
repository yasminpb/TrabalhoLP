/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Usuario {
    private String nome;
    private String email;
    private int num_conta;
    private int valor_conta;
    private String informacoesUsuario;

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

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public int getValor_conta() {
        return valor_conta;
    }

    public void setValor_conta(int valor_conta) {
        this.valor_conta = valor_conta;
    }

    public String getInformacoesUsuario() {
        return informacoesUsuario;
    }

    public void setInformacoesUsuario(String informacoesUsuario) {
        this.informacoesUsuario = informacoesUsuario;
    }
    
    //String []informacoesUsuario = (JOptionPane.showInputDialog(""));
    
    public void depositar (){
        if (this.valor_conta>0) {
            JOptionPane.showMessageDialog(null, "Você pode sacar");
        }else{
            JOptionPane.showInputDialog(null, email);
        }
        
    }
    
    public void sacar (){
        
    }
    
    public void exibir (){
        
    }
}
