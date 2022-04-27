
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xande
 */
public class Program {
    
    public static Dupla teste1(){
        ArrayList<Double> ins= new ArrayList<>();
        ArrayList<Double> outs= new ArrayList<>();
        ins.add(1.0);
        outs.add(1.0);
        ins.add(3.0);
        outs.add(3.0);
        ins.add(5.0);
        outs.add(5.0);
        Dupla duplaArrays = new Dupla(ins, outs);
        return duplaArrays;
    }
    
    public static Dupla teste2(){
        ArrayList<Double> ins= new ArrayList<>();
        ArrayList<Double> outs= new ArrayList<>();
        ins.add(1.0);
        outs.add(2.0);
        ins.add(3.0);
        outs.add(4.0);
        ins.add(5.0);
        outs.add(6.0);
        Dupla duplaArrays = new Dupla(ins, outs);
        return duplaArrays;
    }
     public static Dupla teste3(){
        ArrayList<Double> ins= new ArrayList<>();
        ArrayList<Double> outs= new ArrayList<>();
        ins.add(1.0);
        outs.add(3.0);
        ins.add(3.0);
        outs.add(7.0);
        ins.add(5.0);
        outs.add(11.0);
        Dupla duplaArrays = new Dupla(ins, outs);
        return duplaArrays;
    }
    
     public static Dupla teste4(){
        ArrayList<Double> ins= new ArrayList<>();
        ArrayList<Double> outs= new ArrayList<>();
        ins.add(1.0);
        outs.add(4.5);
        ins.add(3.0);
        outs.add(12.5);
        ins.add(5.0);
        outs.add(20.5);
        Dupla duplaArrays = new Dupla(ins, outs);
        return duplaArrays;
    }
    
    
     public static Dupla teste5(){
        ArrayList<Double> ins= new ArrayList<>();
        ArrayList<Double> outs= new ArrayList<>();
        ins.add(2.900000095);
        ins.add(6.699999809);
        ins.add(4.900000095);
        ins.add(7.900000095);
        ins.add(9.800000191);
        ins.add(6.900000095);
        ins.add(6.099999905);
        ins.add(6.199999809);
        ins.add(6.0);
        ins.add(5.099999905);
        ins.add(4.699999809);
        ins.add(4.400000095);
        ins.add(5.800000191);
        
        outs.add(4.0);
        outs.add(7.400000095);
        outs.add(5.0);
        outs.add(7.199999809);
        outs.add(7.900000095);
        outs.add(6.099999905);
        outs.add(6.0);
        outs.add(5.800000191);
        outs.add(5.199999809);
        outs.add(4.199999809);
        outs.add(4.0);
        outs.add(4.400000095);
        outs.add(5.199999809);
   
        Dupla duplaArrays = new Dupla(ins, outs);
        return duplaArrays;
    }
    
    public static void main(String[] args) {

        int e = 2000;
        Double lr = 0.025;
        Dupla duplaArrays = teste1();
        Scanner sc= new Scanner(System.in); 
        System.out.println("Qual teste deseja executar?");
        String str= sc.nextLine();
        switch (str){
            case "1" -> duplaArrays = teste1();
            case "2" -> duplaArrays = teste2();
            case "3" -> duplaArrays = teste3();
            case "4" -> duplaArrays = teste4();
            case "5" -> duplaArrays = teste5();
            default -> { System.out.println("Executando o teste 1.");
            }
        }
        //duplaArrays = teste1();
        ArrayList<Double> ins;
        ins = (ArrayList)duplaArrays.getP1();
        ArrayList<Double> outs;
        outs = (ArrayList)duplaArrays.getP2();
        Dupla ans;  
        ans = MinhaClasse.executar(ins, outs, e, lr);
        System.out.println("w0 = " +String.format("%.3f",ans.getP1()));
        System.out.println("w1 = " +String.format("%.3f",ans.getP2()));        
        
    }
    
}
