public class dowhile1 {
    public static void main(String[] args) {
        int tempoTotal = 2;
        int minutoContado = 0;
        int segundoContado = 0;
        while (minutoContado <= tempoTotal) {
            try {
                System.out.println("Assistindo filme. Se passaram " + minutoContado + "minuto(s) e " + segundoContado + " sgundo(s)");
                Thread.sleep(1000);
                segundoContado++;
                if (segundoContado == 60) {
                    minutoContado++;
                    minutoContado = 0;
                }
            } catch (Exception e) {

            }
        }
        System.out.println("Acabou o filme");
    }
}
