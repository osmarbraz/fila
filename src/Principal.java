/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplina: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Página 170 Thomas H. Cormen 3a Ed 
 *
 * Fila/Queue
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtração de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 *
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {
    //Tamanho máximo da fila.
    static final int TAMANHOMAXIMO=100;    
    //Vetor que armazena os dados da fila 
    static int[] Q;
    //Ponteiro para o início da fila
    static int inicio;
    //Ponteiro para o fim da fila
    static int fim;

    /**
     * Inicializa o vetor e dados da fila
     */
    public static void inicializacaoFila() {
        Q = new int[TAMANHOMAXIMO];
        inicio = 0;
        fim = 0;
    }

    /**
     * Emfileira ou Enqueue.
     *
     * @param x valor a ser colocado no final da fila
     */
    public static void emfileirar(int x) {
        Q[fim] = x;
        if (fim == Q.length) {
            fim = 1;
        } else {
            fim = fim + 1;
        }
    }

    /**
     * Desempilhar ou Pop.
     *
     * Retorna e remove o elemento do inicio da fila.
     *
     * @return O elemento do inicio da fila.
     */
    public static int desemfileirar() {
        int x = Q[inicio];
        if (inicio == Q.length) {
            inicio = 1;
        } else {
            inicio = inicio + 1;
        }
        return x;
    }

    public static void main(String args[]) {

        //Inicializa o vetor utilizado na fila    
        inicializacaoFila();

        //Vetor de Dados          
        int A[] = {50, 70, 60, 90, 10, 30, 20, 40};

        System.out.println(">>> Fila/Queue <<<");

        for (int i = 0; i < A.length; i++) {
            System.out.println("Emfileirando:" + A[i]);
            emfileirar(A[i]);
        }

        System.out.println("\nDados na fila");
        for (int i = inicio; i < fim; i++) {
            System.out.println(i + "=>" + Q[i]);
        }

        System.out.println("\nDesemfileirando:" + desemfileirar());
        System.out.println("Dados na fila");
        for (int i = inicio; i < fim; i++) {
            System.out.println(i + "=>" + Q[i]);
        }

        System.out.println("\nDesemfileirando:" + desemfileirar());
        System.out.println("Dados na fila");
        for (int i = inicio; i < fim; i++) {
            System.out.println(i + "=>" + Q[i]);
        }
        
        System.out.println("\nDesemfileirando:" + desemfileirar());
        System.out.println("Dados na fila");
        for (int i = inicio; i < fim; i++) {
            System.out.println(i + "=>" + Q[i]);
        }
    }
}