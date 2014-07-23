
/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 *
 * @author Tomás Abril
 */
import utfpr.ct.dainf.if62c.avaliacao.*;
import java.math.*;

public class Avaliacao2 {

    public static void main(String[] args) throws RaizException {
        double la = 3, lb = 2;
        int qa = 3, qb = -2, qc = -1;

        PoliLinear linear = new PoliLinear(la, lb);
        PoliQuad quad = new PoliQuad(qa, qb, qc);

        try {
            System.out.println("raiz linear: " + linear.getRaizes()[0]);
        } catch (RaizException e) {
            System.out.println(e);
        }
        try {
            System.out.println("1ª raiz quadrada: " + quad.getRaizes()[0]);
        } catch (RaizException e) {
            System.out.println(e);
        }
        try {
            System.out.println("2ª raiz quadrada: " + quad.getRaizes()[1]);
        } catch (RaizException e) {
            System.out.println(e);
        }
        try {
            System.out.println("poli linear: " + linear.poli(linear.getRaizes()[0]));
        } catch (RaizException e) {
            System.out.println(e);
        }
        try {
            System.out.println("poli quadrada 1ª: " + quad.poli(quad.getRaizes()[0]));
        } catch (RaizException e) {
            System.out.println(e);
        }
        try {
            System.out.println("poli quadrada 2ª: " + quad.poli(quad.getRaizes()[1]));
        } catch (RaizException e) {
            System.out.println(e);
        }

        // Teste do erro    -----------------------------
              /*
         PoliLinear linearerro = new PoliLinear(0, 2);
         PoliQuad quaderro = new PoliQuad(1, 33, 2);

         try {
         System.out.println("raiz linear erro: " + linearerro.getRaizes()[0]);
         } catch (RaizException e) {
         System.out.println(e);
         }
         try {
         System.out.println("1ª raiz quadrada erro: " + quaderro.getRaizes()[0]);
         } catch (RaizException e) {
         System.out.println(e);
         }
         try {
         System.out.println("2ª raiz quadrada erro: " + quaderro.getRaizes()[1]);
         } catch (RaizException e) {
         System.out.println(e);
         }
         try {
         System.out.println("poli linear erro: " + linearerro.poli(linearerro.getRaizes()[0]));
         } catch (RaizException e) {
         System.out.println(e);
         }
         try {
         System.out.println("poli quadrada 1ª erro: " + quaderro.poli(quaderro.getRaizes()[0]));
         } catch (RaizException e) {
         System.out.println(e);
         }
         try {
         System.out.println("poli quadrada 2ª erro: " + quaderro.poli(quaderro.getRaizes()[1]));
         } catch (RaizException e) {
         System.out.println(e);
         }
         System.out.println("oi cheguei ate o fim !");
         System.out.println(quaderro);
         System.out.println(quaderro.toString());
         System.out.println(linearerro);
         System.out.println(linearerro.toString());
         */
    }
}
