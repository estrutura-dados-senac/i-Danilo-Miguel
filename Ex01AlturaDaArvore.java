public class Ex01AlturaDaArvore {
    // Estrutura basica do no da arvore.
    static class Node {
        String nome;
        Node left;
        Node right;

        Node(String nome) {
            this.nome = nome;
        }
    }

    // Calcula a altura total da arvore.
    public static int altura(Node raiz) {
        // Caso base: sem no, sem altura.
        if (raiz == null) {
            return 0;
        }

        // Passo recursivo: calcula altura de cada lado.
        int alturaEsquerda = altura(raiz.left);
        int alturaDireita = altura(raiz.right);

        // A altura do no atual e 1 + maior altura entre filhos.
        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }

    // Monta um exemplo simples de arvore de pastas.
    public static Node exemploPastas() {
        Node raiz = new Node("/");
        raiz.left = new Node("home");
        raiz.right = new Node("etc");
        raiz.left.left = new Node("user");
        raiz.left.left.left = new Node("documentos");
        return raiz;
    }
}
