
/**
 * Escreva uma descrição da classe Conjunto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Conjunto
{
    
    private ListaDuplamenteLigadaCircular lista; 

    public Conjunto() {
        lista = new ListaDuplamenteLigadaCircular();
    }
 
    // funcao para adicionar um elemento ao conjunto
    public void adicionarElemento(int conteudo) {
        if (!lista.possuiElemento(conteudo)) {
            lista.adicionarElemento(conteudo);
        }
    }

    // funcao para remover um elemento do conjunto
    public void removerElemento(int conteudo) {
        if (lista.possuiElemento(conteudo)) {
            lista.removerElemento(conteudo);
        }
    }

    // funcao para verificar se um elemento pertence ao conjunto
    public boolean possuiElemento(int conteudo) {
        return lista.possuiElemento(conteudo);
    }
 
    // funcao para calcular a diferença entre dois conjuntos
    public Conjunto diferenca(Conjunto conjuntoB) {
        Conjunto conjuntoResultado = new Conjunto();
        No atual = lista.inicio;
        do {
            if (!conjuntoB.possuiElemento(atual.conteudo)) {
                conjuntoResultado.adicionarElemento(atual.conteudo);
            }
            atual = atual.proximo;
        } while (atual != lista.inicio);
        return conjuntoResultado;
    }

    // funcao para imprimir os elementos do conjunto
    public void MostrarConjunto() {
        lista.MostrarLista();
    }
}

