public class Professor {
    String nome = "";
    int quantidade_cafe = 0;
    String humor = "";
    String nivel_paciencia = "";
    boolean usa_data_show = true;
    String frase_favoritra = "";

public Professor ( String nome, int quantidade_cafe, String humor, String nivel_paciencia, boolean usa_data_show, String frase_favoritra) {
    this.nome = nome;
    this.quantidade_cafe = quantidade_cafe;
    this.humor = humor;
    this.nivel_paciencia = nivel_paciencia;
    this.frase_favoritra = frase_favoritra;

}


public void setNome (String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}


public void setQuantidadeCafe (String quantidade_cafe){
    this.quantidade_cafe = quantidade_cafe;
}


public String getQuantidadeCafe(){
    return this.quantidade_cafe;
}


public void setHumor(String humor){
    this.humor = humor;
}

public String getHumor(){
    return this.humor;   
}


public void setNivelPaciencis(String nivel_paciencia){
    this.nivel_paciencia = nivel_paciencia;
}

public String getNivelDePaciencia(){
    return this.nivel_paciencia;
}


public void setUsaDataShow(boolean usa_data_show){
    this.usa_data_show = usa_data_show;
}

public String getUsaDataShow(){
    return this.usa_data_show;
}


public void setFraseFavorita(String frase_favoritra){
    this.frase_favoritra = frase_favoritra;
}

public String getFraseFavorita(){
    return this.frase_favoritra;
}



    
}
