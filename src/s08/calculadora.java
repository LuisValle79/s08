/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s08;

/**
 *
 * @author Lab06
 */
public class calculadora {
    public void sumar(int a , int b){
        System.out.println("la suma es"+(a+b));
    }
     public int sumar2(int a , int b){
        return (a+b);
    }
    public calculadora(int a ,int b){
        this.a = a;
        this.b = b;        
    }
    public calculadora(int a){
        this.a = a;
    }
}
