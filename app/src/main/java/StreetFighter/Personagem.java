/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StreetFighter;

/**
 *
 * @author jpman
 */
public class Personagem extends Pessoa{
    IComando comando;
    Personagem (IComando c, String nome, Integer idade){
        this.comando = c;
        this.nome = nome;
        this.idade = idade;
    }
    public String golpe(){
        return this.comando.golpe();
    }
}
