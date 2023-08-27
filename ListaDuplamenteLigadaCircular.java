class ListaDuplamenteLigadaCircular {
    public No inicio;
 
    public ListaDuplamenteLigadaCircular() {
        inicio = null;
    }
 
    // Funcao para adicionar um elemento na lista
    public void adicionarElemento(int conteudo) {
        No novoNo = new No(conteudo);
        
        if (inicio == null) {
            inicio = novoNo;
            inicio.proximo = inicio;
            inicio.anterior = inicio;
        } else {
            No ultimo = inicio.anterior;
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
        }
    }

    // Funcao para remover um elemento da lista
    public void removerElemento(int conteudo) {
        if (inicio == null) {
            return;
        } 

        No atual = inicio;
        No anterior = null; 

        while (atual.conteudo != conteudo) {
            if (atual.proximo == inicio) {
                return;
            }

            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == inicio && atual.proximo == inicio) {
            inicio = null;
        } else if (atual == inicio) {
            No ultimo = inicio.anterior;
            inicio = inicio.proximo;
            ultimo.proximo = inicio;
            inicio.anterior = ultimo;
        } else {
            anterior.proximo = atual.proximo;
            atual.proximo.anterior = anterior;
        }
    } 

    // Funcao para verificar se um elemento pertence à lista
    public boolean possuiElemento(int conteudo) {
        if (inicio == null) {
            return false;
        } 

        No atual = inicio; 

        do {
            if (atual.conteudo == conteudo) {
                return true;
            } 

            atual = atual.proximo;
        } while (atual != inicio);

        return false;
    }

    // Funcao para imprimir os elementos da lista
    public void MostrarLista() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        } 

        No atual = inicio; 

        do {
            System.out.print(atual.conteudo + " ");
            atual = atual.proximo;
        } while (atual != inicio);
 
        System.out.println();
    }
}

 