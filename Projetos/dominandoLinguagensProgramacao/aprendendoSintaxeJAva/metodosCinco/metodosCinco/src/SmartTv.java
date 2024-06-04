public class SmartTv{

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++; /*aumentar antes  */
        System.out.println("Fazendo o aumento para " + volume);
      

    }

    public void diminuirVolume(){
        volume--;
    }

    public void subirCanal(){
        canal++;

    }

    public void descerCanal(){
        canal--;

    }
    public void mudarCanal(int novoCanal){/*informa o número do canal desejado, ao invés de precisar subir ou descer*/
    canal = novoCanal;

    }

}
