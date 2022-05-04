import javax.swing.JOptionPane;

public class Pedido{
    public static void main(String[] args) {
        int QtdeBebidas, QtdeComidas, PrecoBebida, PrecoComida, TotalBebidas, TotalComidas, TotalPedido, TotaldePedidos, TotaldeItens, TotalPedidosGeral;
        int contador = 1;
        int Pedidos = 1;
        TotalPedidosGeral = 0;
        TotaldePedidos = 0;
        
        Pedidos = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Pedidos: "));
        while (contador <= Pedidos ) {
            //Entrada de Dados
            QtdeBebidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de itens para Beber(Sendo cada Item R$5): "));
            QtdeComidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens para Comer(Sendo cada Item R$10): "));
            
            //Processamento de Valores
            PrecoBebida = 5;
            PrecoComida = 10;
            TotalBebidas = PrecoBebida * QtdeBebidas;
            TotalComidas = PrecoComida * QtdeComidas;
            TotalPedido = TotalBebidas + TotalComidas;
            TotaldeItens = QtdeBebidas + QtdeComidas;

            TotaldePedidos = TotaldePedidos + 1 ;
            TotalPedidosGeral = TotalPedidosGeral + TotalPedido;
            //Finalização do Processo
            JOptionPane.showMessageDialog(null, "Valor dos itens para beber:" + "R$" + TotalBebidas);
            JOptionPane.showMessageDialog(null, "Valor dos itens para comer:" + "R$" + TotalComidas);
            JOptionPane.showMessageDialog(null, "Valor Total do Pedido:" + "R$" + TotalPedido + " | Sendo ao todo:" + TotaldeItens + " itens pedidos.");
            JOptionPane.showMessageDialog(null, "Número de Pedidos:" + TotaldePedidos);
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null, "Média dos valores dos pedidos:" + "R$" + TotalPedidosGeral / TotaldePedidos);
    }
}
