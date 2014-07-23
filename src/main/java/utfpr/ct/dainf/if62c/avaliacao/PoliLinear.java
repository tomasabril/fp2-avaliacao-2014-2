/*
 * License Headers
 */
package utfpr.ct.dainf.if62c.avaliacao;
//import java.math.*;

/**
 *
 * author a1013343
 *
 * @author Tomás Abril
 */
public class PoliLinear extends Polinomio {

    public PoliLinear(Number a, Number b) {
        coef = new Number[2];
        coef[0] = a;
        coef[1] = b;
    }

    @Override
    public Double[] getRaizes() throws RaizException {
        Double[] x = new Double[1];
        if (coef[0].doubleValue() == 0) {
//            throw new RaizException((coef.toString()));
            throw new RaizException(coef);
        }
        x[0] = -coef[1].doubleValue() / coef[0].doubleValue();
        return x;
    }

}
