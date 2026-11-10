package interpolacion;

public class Main {
    public static void main(String[] args) {
        // CAMBIA ESTOS DATOS por los tuyos
        double[] x = {3, 6, 9, 4};
        double[] y = {5, 7, 2, 8};
        double xEval = 5;

        System.out.println("Nodos x: " + java.util.Arrays.toString(x));
        System.out.println("Valores y: " + java.util.Arrays.toString(y));
        System.out.println("Punto a evaluar: x = " + xEval);

        // ----- Newton -----
        double[][] tabla = InterpolacionNewton.calcularDiferenciasDivididas(x, y);
        InterpolacionNewton.imprimirTabla(x, tabla);
        double newton = InterpolacionNewton.evaluarPolinomio(x, tabla, xEval);

        // ----- Lagrange -----
        double lagrange = InterpolacionLagrange.interpolacionLagrange(x, y, xEval);

        // ----- Resultados -----
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Newton   P(" + xEval + ") = " + newton);
        System.out.println("Lagrange P(" + xEval + ") = " + lagrange);
        System.out.println("Diferencia absoluta = " + Math.abs(newton - lagrange));
    }
}