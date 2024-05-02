package com.mycompany.systemcinema;
import com.google.gson.Gson;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enzov
 */
public class RepositoryFilmes 
{
    private static RepositoryFilmes instance;
        private GestaoDeFilmes filmes;


    static RepositoryFilmes getInstance(){
        if(RepositoryFilmes.instance != null){
            return RepositoryFilmes.instance;
        }
        
        RepositoryFilmes.instance = new RepositoryFilmes();
        
        return RepositoryFilmes.instance;
        
    }    
    
    
    public String toJson(String dados){
        Gson gson = new Gson();
        String json = gson.toJson(dados);
        return json;
    }
}
