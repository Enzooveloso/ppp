/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemcinema;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author enzov
 */
public class SystemCinema {

    public static void main(String[] args) 
    {
        
        GestaoDeFilmes gestaoDeFilmes = new GestaoDeFilmes();
        gestaoDeFilmes.cadastraFilme("Planeta dos Macacos, o reinado", "Ação", Duration.ofMinutes(145));
        gestaoDeFilmes.cadastraFilme("Ursinho Pooh: Sangue e mel 2", "Terror", Duration.ofMinutes(75));
        gestaoDeFilmes.cadastraFilme("Kung Fuu Panda 04", "Animação", Duration.ofMinutes(94));
        gestaoDeFilmes.cadastraFilme("Godzilla e Kong: O novo Império", "Aventura", Duration.ofMinutes(115));
        gestaoDeFilmes.cadastraFilme("Guerra Civil", "Ação", Duration.ofMinutes(110));

        // Criação da sessão de cinema
        Sessao sessao = new Sessao();
        sessao.setFilmes(gestaoDeFilmes.getFilmes()); // Configura filmes na sessão
        sessao.inicializarSalas(); // Inicializa as salas com filmes
        
        
        Estoque estoque = new Estoque();
        estoque.cadastrarProduto("Pipoca", "01/01/2024");
        estoque.cadastrarProduto("Chocolate", "05/01/2024");
        estoque.cadastrarProduto("Refrigerante", "10/01/2024");
        
        Carrinho carrinho = new Carrinho(estoque);
    
        
        Salas sala = new Salas();
        
        sessao.selecionarFilme(gestaoDeFilmes);
        int ingressos = sessao.selecionarQuantIngressos();
        
        sessao.selecionarPoltronas(ingressos, 4);
        
        
        
        carrinho.selecionarQuantProduto();
        
        
    }
}
