/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xande
 * @param <K>
 */
public class Dupla<K> {
    K p1, p2;

    public Dupla() {
    }

    public Dupla(K p1, K p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    void setDupla(K a, K b){
        this.p1 = a;
        this.p2 = b;
    }

    Dupla getDupla(){
        return this;
    }
    public K getP1(){
        return p1;
    }
    public K getP2(){
        return p2;
    }
    
    public void printP1(){
        System.out.println(p1);
    }
    public void printP2(){
        System.out.println(p2);
    }
    

    
}
