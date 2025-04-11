public class Item {
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    public Item(String nome, String codigo, int quantidade, double precoUnitario) {
        setNome(nome);
        setCodigo(codigo);
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome do item não pode ser nulo ou vazio.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("O código do item não pode ser nulo ou vazio.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            throw new IllegalArgumentException("O preço unitário deve ser maior que zero.");
        }
    }

    public void atualizarEstoque(int quantidadeAdicional) {
        if (quantidadeAdicional >= 0) {
            this.quantidade += quantidadeAdicional;
            System.out.println("Estoque atualizado. Quantidade atual: " + this.quantidade);
        } else {
            throw new IllegalArgumentException("A quantidade adicional não pode ser negativa.");
        }
    }
    
    public double calcularValorTotal() {
        return quantidade * precoUnitario;
    }
}