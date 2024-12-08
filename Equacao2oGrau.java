package equacaosegundograu;

public class Equacao2oGrau extends Delta{

    private double x1;
    private double x2;

    public Equacao2oGrau(int a, int b, int c) {
        super(a, b, c);
        delta = calcularDelta();
    }

    public String resolverEquacao() {

        if(delta < 0){
            return "Não há solução real.";
        }
        x1 = (- b + Math.sqrt(delta)) / (2 * a);
        x2 = (- b - Math.sqrt(delta)) / (2 * a);

        if(delta == 0) {
            return "Solução da equação: " + x1;
        }

        return "x1: " + x1 + "\nx2: " + x2;
    }



}
