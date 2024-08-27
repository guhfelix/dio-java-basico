public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume();
        
        System.out.println("TV ligada? " + smartTv.ligada); 
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);


        smartTv.ligar(); 
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.deligar(); 
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    }

}
