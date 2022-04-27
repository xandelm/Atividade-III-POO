
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Xande
 */
public class MinhaClasse {

    public MinhaClasse() {
    }

    public static Dupla executar(ArrayList<Double> ins, ArrayList<Double> outs, Integer e, Double lr) {
        Double w1, w0;
        w1 = w0 = 0.0;
        Double p;
        Double dif;
        for (int j = 0; j <= e; j++) {
            for (int i = 0; i < ins.size(); i++) {
                p = (w1 * ins.get(i) + w0);
                dif = outs.get(i) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(i);

            }
            if (j % 10 == 0) {
                System.out.println("e: " + j + ", w1: " + w1 + ", w0: " + w0 + ".");
            }
        }
        Dupla w = new Dupla(w1, w0);
        return w;
    }

}
