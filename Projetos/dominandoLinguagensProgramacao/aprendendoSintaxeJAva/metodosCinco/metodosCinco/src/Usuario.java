public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("Tv ligada?" + smartTv.ligada);
        System.out.println("canal atual?" + smartTv.canal);
        System.out.println("volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status?" + smartTv.ligada);

        System.out.println("teste terminal");
    }
}
