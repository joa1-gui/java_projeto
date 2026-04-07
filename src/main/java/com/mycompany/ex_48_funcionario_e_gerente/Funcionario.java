/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_48_funcionario_e_gerente;

/**
 *
 * @author JOAOGUILHERMEDASILVA
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
   
   public String getNome(){return nome;}
   public double getSalario(){return salario;}
   
   public void apresentar(){
       System.out.println("Funcionario: " +nome+ " | salario: " +salario);
   }
}
