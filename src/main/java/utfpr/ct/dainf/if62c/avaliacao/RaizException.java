/*
 * License Headers
 */
package utfpr.ct.dainf.if62c.avaliacao;
//import java.math.*;

import java.util.Arrays;

/**
 *
 * author a1013343
 *
 * @author Tomás Abril
 */
public class RaizException extends java.lang.Exception {

    public RaizException(Number[] p) {
        super(String.format("Polinômio '" + p + "' não tem raízes"));
    }

    public RaizException(String p) {
        super(String.format("Polinômio '" + p + "' não tem raízes"));
    }

//        //	/*
//        public RaizException (Number[] p) {
//		super( String.format("Polinômio '%s' não tem raízes", p) );
//	}
////        */
//	public RaizException (String p) {
//		super( String.format("Polinômio '%s' não tem raízes", p) );
//	}
}
