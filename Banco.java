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
public class Banco {
    public static void main(String[] args) {
        Usuario u = new Usuario();
        
        u.setValor_conta(Integer.parseInt(JOptionPane.showInputDialog("Quanto você quer depositar na sua conta? ")));
    }
}
