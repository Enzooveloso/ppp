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
        
        Duration duracaoDoFilme01 = Duration.ofMinutes(145);
        Duration duracaoDoFilme02 = Duration.ofMinutes(75);
        Duration duracaoDoFilme03 = Duration.ofMinutes(94);
        Duration duracaoDoFilme04 = Duration.ofMinutes(115);
        Duration duracaoDoFilme05 = Duration.ofMinutes(110);
        
         Filme filme0 = new Filme();
        GestaoDeFilmes gestaoDeFilmes = new GestaoDeFilmes();
        
        gestaoDeFilmes.cadastraFilme("Planeta dos Macacos, o reinado"," Acao", duracaoDoFilme01);
        gestaoDeFilmes.cadastraFilme("Ursinho Pooh: Sangue e mel 2"," Terror", duracaoDoFilme02);
        gestaoDeFilmes.cadastraFilme("Kung Fuu Panda 04"," Animacao", duracaoDoFilme03);
        gestaoDeFilmes.cadastraFilme("Godzilla e Kong: O novo Império"," Aventura", duracaoDoFilme04);
        gestaoDeFilmes.cadastraFilme("Guerra Civil"," acao", duracaoDoFilme05);
        
        
        Sessao sessao = new Sessao();
        sessao.selecionarFilme(gestaoDeFilmes);
        sessao.selecionarQuantIngressos();
        sessao.selecionarPoltronas(0, 0);
        
        
    }
}
