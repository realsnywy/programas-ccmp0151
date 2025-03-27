public class Medico {
    private int codigo;
    private String nome;
    private String sexo;
    private String especialidade;
    private Endereco endereco;

    public Medico(int codigo, String nome, String sexo, String especialidade, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Endereço:");
        endereco.imprimirDados();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Avenida Central", 789, "Bloco B", "Centro", "São Paulo", "SP", "01010-001");

        Medico medico = new Medico(101, "Dr. João Silva", "M", "Neurologista", endereco);

        System.out.println("Dados do Médico:");
        medico.imprimirDados();

        medico.setNome("Dra. Maria Oliveira");
        medico.setSexo("F");
        medico.setEspecialidade("Dermatologista");

        endereco.setRua("Rua das Flores");
        endereco.setNumero(456);
        endereco.setComplemento("Casa 12");
        endereco.setBairro("Jardim Primavera");
        endereco.setCidade("Rio de Janeiro");
        endereco.setUf("RJ");
        endereco.setCep("22020-030");

        System.out.println("\nDados do Médico (Atualizados):");
        medico.imprimirDados();
    }
}
