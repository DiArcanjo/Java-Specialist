import java.util.ArrayList;
import java.util.Arrays;

public class Cardapio {

    ArrayList<ItemCardapio> itensCardapio = new ArrayList<>();

    void adicionarItem(ItemCardapio itens) {
        itensCardapio.add(itens);
    }

    void removerItem(ItemCardapio revomeIten){
        itensCardapio.remove(revomeIten);
    }

    void imprimirItensCardapio(double precoMinmo, double precoMaxmo){
        for (ItemCardapio item : itensCardapio) {
            item.imprimir();
        }
    }

    ArrayList<ItemCardapio> consultarItensPorPreco(double precoMinmo, double precoMaxmo){
        ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();

        for (ItemCardapio item : itensCardapio) {
            if(item.possuiPrecoEntre(precoMinmo, precoMaxmo)){
                itensEncontrados.add(item);
            }
        }

        return itensEncontrados;
    }

}
