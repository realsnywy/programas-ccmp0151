import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String descricao;
    private double valor;

    public Pedido(String descricao, double valor) {
        setDescricao(descricao);
        setValor(valor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("A descrição do pedido não pode ser nula ou vazia.");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("O valor do pedido deve ser maior que zero.");
        }
    }

    public double calcularDesconto() {
        if (valor > 500) {
            return valor * 0.20;
        } else if (valor >= 200) {
            return valor * 0.10;
        } else {
            return valor * 0.05;
        }
    }

    public double calcularTotalComDesconto() {
        return valor - calcularDesconto();
    }
}