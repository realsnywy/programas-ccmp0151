import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ConjuntoDePalavras {
    private Set<String> palavrasSet;

    public ConjuntoDePalavras(String palavras) {
        palavrasSet = new HashSet<>(Arrays.asList(palavras.split(",")));
    }

    public boolean contemTodas(String palavras) {
        Set<String> palavrasConsulta = new HashSet<>(Arrays.asList(palavras.split(",")));
        return palavrasSet.containsAll(palavrasConsulta);
    }
}

public class Questao4 {
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras("casa,carro,livro,caneta,caderno");

        System.out.println(conjunto.contemTodas("casa,carro")); // true
        System.out.println(conjunto.contemTodas("casa,computador")); // false
    }
}