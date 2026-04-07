/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_48_funcionario_e_gerente;

/**
 *
 * @author JOAOGUILHERMEDASILVA
 */
public class Gerente extends Funcionario{
    
    private double bonus;
    private double total;
    
    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
        total = getSalario()+bonus;
    }
    
    @Override
    public void apresentar(){
        System.out.println("Gerente: " +getNome()+ " | salario com bonus: " +total);
    }
}
