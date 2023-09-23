import java.util.Scanner;

public class Semana {

    private String dados;
    
    public Semana(String dados) {
        this.dados = dados;
    }

    public Semana() {
    }

    public int temperaturaMedia(){
        Integer contador = 0;
        try{
            float soma = 0;
            float media = 0;
            String diasFormatar[] = new String[7];
            Integer dias[] = new Integer[7];
            diasFormatar = dados.split(" ");

            for (int i = 0; i < 7; i++) {
                dias[i] = Integer.valueOf(diasFormatar[i]);
                soma = soma + dias[i];
                media = soma / 7;
            }

            for (int j = 0; j < 7; j++) {
                if (dias[j] > media) {
                    contador = contador + 1;
                }
            }

            System.out.println(contador);
        }catch (Exception e){
            System.out.println("Erro");
        }
        return contador;
    }



}
