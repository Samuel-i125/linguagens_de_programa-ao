public class Aluno {
String nome = "" ;
String email = "";
boolean inteligente = true; 
int nivel_sono = 0;
boolean piscando_lento = true;

public static void dormiuNaaula(){ 
    System.out.println("O aluno: " + Aluno.nome + "dormiu na aula");
}

public static void fingeEstudar(){ 
    System.out.println("O aluno: " + Aluno.nome + "finge estudar");
}

public Aluno (String nome, String email, boolean inteligente, int nivel_sono, boolean piscando_lento) {
    this.nome = nome;
    this.email = email;
    this.inteligente = inteligente;
    this.nivel_sono = nivel_sono;
    this.piscando_lento = piscando_lento;
}

    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    
    public void setEmail (String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }


    public void setInteligente(boolean inteligente){
        this.inteligente = inteligente;
    }

    public String getInteligente(){
        return this.inteligente;   
    }


    public void setNivelDeSono(int nivel_sono){
        this.nivel_sono = nivel_sono;
    }

    public String getNivelDeSono(){
        return this.nivel_sono;
    }

    public void setPiscandolento(boolean piscando_lento){
        this.piscando_lento = piscando_lento;
    }
    
    public String getPiscandoLento(){
        return this.piscando_lento;
    }

  
}
