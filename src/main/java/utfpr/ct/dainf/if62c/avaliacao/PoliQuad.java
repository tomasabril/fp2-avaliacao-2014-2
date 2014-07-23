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
public class PoliQuad extends Polinomio {

    public PoliQuad(Number a, Number b, Number c) {
        coef = new Number[3];
        coef[0] = a;
        coef[1] = b;
        coef[2] = c;
    }

    @Override
    public Double[] getRaizes() throws RaizException {
        Double[] x = new Double[2];

        double delta;
        delta = Math.pow(coef[1].doubleValue(), 2)
                - 4 * coef[0].doubleValue() * coef[2].doubleValue();
        if (delta < 0) {
//            throw new RaizException((coef.toString()));
            throw new RaizException(coef);
        }

        x[0] = (-coef[1].doubleValue() + Math.sqrt(delta)) / (2 * coef[0].doubleValue());
        x[1] = (-coef[1].doubleValue() - Math.sqrt(delta)) / (2 * coef[0].doubleValue());
        return x;
    }

}
