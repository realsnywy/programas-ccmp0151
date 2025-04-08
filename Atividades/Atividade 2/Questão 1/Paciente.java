public class Paciente {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String planoSaude;
    private String alergia;
    private String tipoSanguineo;

    public Paciente(int codigo, String nome, String dataNascimento, String sexo, String planoSaude, String alergia,
            String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Plano de Saúde: " + planoSaude);
        System.out.println("Alergia: " + alergia);
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
    }

    public static void main(String[] args) {
        Paciente meuPaciente = new Paciente(1, "João Silva", "1990-05-15", "M", "Unimed", "Nenhuma", "O+");

        System.out.println("Dados do Paciente:");
        meuPaciente.imprimirDados();

        meuPaciente.setNome("Maria Silva");
        meuPaciente.setDataNascimento("1965-08-20");
        meuPaciente.setSexo("F");
        meuPaciente.setPlanoSaude("Amil");
        meuPaciente.setAlergia("Poeira");
        meuPaciente.setTipoSanguineo("A-");

        System.out.println("\nDados do Paciente (Atualizados):");
        meuPaciente.imprimirDados();
    }
}
