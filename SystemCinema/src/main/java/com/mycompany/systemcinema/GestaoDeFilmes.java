/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;
import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
/**
 * Classe para fazer a gestao de filmes.
 * <p>
 * Esta classe é usada para gerir os filmes, tanto o filme em específico, como cadastrar um novo filme e remover um filme.
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class GestaoDeFilmes 
{   /**
     * Lista para criar diversos filmes.
     */
    private List<Filme> filmes = new ArrayList<>();
    /*
    private final Salas[] salas = new Salas[5];
    
     public Salas[] getSala() {
        return salas;
    }
    */
    private Salas sala;
    /**
     * Contrutor que filmes recebe um ArrayList.
     * @param filmes direciona a todos os atributos da classe Filme
     */
    public GestaoDeFilmes(List<Filme> filmes) 
    {
        this.filmes = new ArrayList<>();
        
    }
    public GestaoDeFilmes(){}
    /**
     * Cadastra um filme na lista de filmes.
     * @param nome nome do filme.
     * @param genero genero do filme.
     * @param duracao duracao do filme.
     */
    public Filme cadastraFilme(String nome, String genero, Duration duracao)
    {
        Filme novoFilme = new Filme(nome, genero, duracao);
        this.filmes.add(new Filme(nome,genero,duracao));
        return novoFilme;
    }
    
    
     
    /**
     * Remove um filme da lista atravês de uma expressao lambda, em que caso X.getNome(chama o método getNome da clase Filme)e que em seguida compara o nome do filme X com o parâmetro nome. retorna True se forem iguais, removendo o filme da lista
     * @param nome nome do filme.
     * @return O filme removido.
     */
    public boolean removeFilme(String nome)
    {
        return filmes.removeIf(x -> x.getTitulo().equals(nome));
    }
    
    public List<Filme> getFilmes(){
    return filmes;
}
    
}
