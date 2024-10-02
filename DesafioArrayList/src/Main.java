//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();

        ItemCardapio itemCardapio = new ItemCardapio();
        itemCardapio.descricao = "Rib Eye 500g";
        itemCardapio.preco = 95;

        ItemCardapio itemCardapio2 = new ItemCardapio();
        itemCardapio2.descricao = "Picanha 400g";
        itemCardapio2.preco = 102.5;

        cardapio.adicionarItem(itemCardapio);
        cardapio.adicionarItem(itemCardapio2);

        cardapio.imprimirItensCardapio(80, 150);
        cardapio.consultarItensPorPreco(0,10);

    }
}