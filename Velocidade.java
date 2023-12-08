/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoLP;

import java.util.Scanner;

/**
 *
 * @author yasmin
 */
public class Velocidade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int VelocidadeMaxima, VelocidadeDoMotorista, excesso, multa;
        System.out.println("Digite a velocidade maxima:");
        VelocidadeMaxima = entrada.nextInt();
        System.out.println("Digite a velocidade do motorista:");
        VelocidadeDoMotorista = entrada.nextInt();
        excesso = VelocidadeDoMotorista - VelocidadeMaxima;
        
        if(VelocidadeDoMotorista > VelocidadeMaxima){
            multa= excesso*5;
            System.out.printf("A multa é de R$"+multa);
        }else{
            System.out.println("Sem multa");
        }
    }
}
