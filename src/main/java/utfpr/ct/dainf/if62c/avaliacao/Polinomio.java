/*
 * License Headers
 */
package utfpr.ct.dainf.if62c.avaliacao;

import java.math.*;

/**
 *
 * author a1013343
 *
 * @author Tomás Abril
 */
public abstract class Polinomio {

    protected Number[] coef;

    protected Polinomio() {

    }

    public Polinomio(Number[] coef) throws java.lang.IllegalArgumentException {
        if (coef.length < 1) {
            throw new IllegalArgumentException("Polinômio Inválido");
        }
        this.coef = coef;
    }

    @Override
    public String toString() {
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("Some text");
//            stringBuilder.append("Some text");
//            String finalString = stringBuilder.toString();

        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < coef.length; i++) {
            if (coef[i].doubleValue() >= 0) {
                texto.append("+");
            } else {
                texto.append("-");
            }
            texto.append(coef[i].doubleValue());
            texto.append("x^");
            texto.append((coef.length - i - 1));
        }
        String finalString = texto.toString();
        return finalString;

//		String imprimir = "";
//		for (int i=0; i<coef.length; i++) {
//			if( coef[i].doubleValue() >= 0) {
//                            imprimir += "+";
//			} else imprimir += "-";
//			imprimir += ( coef[i].doubleValue() + "x^" + (coef.length -i -1) );
//		}
//		return imprimir;
        
    }

    public int getGrau() {
        return coef.length - 1;
    }

    public double poli(double x) {
        double valor = 0;
        for (int i = 0; i < coef.length; i++) {
            valor += coef[i].doubleValue() * Math.pow(x, (coef.length - i - 1));
        }
        return valor;
    }

    public abstract Double[] getRaizes() throws RaizException;

}
