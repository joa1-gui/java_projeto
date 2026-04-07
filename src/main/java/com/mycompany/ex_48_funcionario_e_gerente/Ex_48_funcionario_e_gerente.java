/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_48_funcionario_e_gerente;

/**
 *
 * @author JOAOGUILHERMEDASILVA
 */
public class Ex_48_funcionario_e_gerente {

    public static void main(String[] args) {
        Funcionario[] funci = new Funcionario[4];
        
        funci[0] = new Funcionario("Josefina", 2835.36);
        funci[1] = new Funcionario("Camilo", 1930.57);
        funci[2] = new Gerente("Rogerio", 6500.60, 715.78);
        funci[3] = new Gerente("Candida", 4896.22, 715.78);
        
        for(Funcionario f : funci){
            f.apresentar();
        }
    }
}
