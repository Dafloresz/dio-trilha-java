package SistemaUsuario;

public class Funcionario {
    private String name;
    private String email;
    private String password;
    private final boolean adm;

    public Funcionario(String name, String email, String password, boolean adm) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.adm = adm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdm() {
        return adm;
    }

    public void login(String email, String password){
        if (this.email.equals(email) && this.password.equals(password)){
            System.out.println("Login realizado! Bem-vindo, " + name + "!");
        } else {
            System.out.println("Email ou senha incorreta!");
        }
    }

    public void logoff(){
        System.out.println("Deslogando!");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.name = novoNome;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso!");
    }

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (this.password.equals(senhaAtual)) {
            this.password = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta!");
        }
    }
}
