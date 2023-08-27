class Testeoperacao {
    public static void main(String[] args) {
        Conjunto conjuntoA = new Conjunto();
        conjuntoA.adicionarElemento(77);
        conjuntoA.adicionarElemento(19);
        conjuntoA.adicionarElemento(38);
        conjuntoA.adicionarElemento(43);
        conjuntoA.adicionarElemento(921);

 

        Conjunto conjuntoB = new Conjunto();
        conjuntoB.adicionarElemento(38);
        conjuntoB.adicionarElemento(43);
        conjuntoB.adicionarElemento(53);
        conjuntoB.adicionarElemento(67);

        System.out.println("conjunto A:");
        conjuntoA.MostrarConjunto();
        System.out.println("conjunto B:");
        conjuntoB.MostrarConjunto();

        Conjunto conjuntoResultado = conjuntoA.diferenca(conjuntoB);
        System.out.println("A - B:");
        conjuntoResultado.MostrarConjunto(); // Deve Mostrar: os elementos exclusivos de A
    }
}