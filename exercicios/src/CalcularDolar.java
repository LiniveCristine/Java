public class CalcularDolar {
    public static double cotacao;
    public static double valorComprar;

    public static double valorTotal(){
        return cotacao*valorComprar+(valorComprar*0.6);
    }


}
