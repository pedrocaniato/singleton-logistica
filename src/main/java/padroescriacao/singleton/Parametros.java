package padroescriacao.singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String operadorLogado;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getOperadorLogado() {
        return operadorLogado;
    }

    public void setOperadorLogado(String operadorLogado) {
        this.operadorLogado = operadorLogado;
    }
}