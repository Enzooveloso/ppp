/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemcinema;

import java.util.List;
import java.util.Scanner;

/**
 * Classe para representar abstr.
 * <p>
 * Esta classe é usada para gerir alguns metodos para realizar uma venda
 * </p>
 *
 * @author enzov
 * @version 1.0
 */
public class Carrinho 
{
    /**
     * Lista de produtos.
     */
    private List<Estoque> produto;
    /**
     * Lista de sessoes.
     */
    private List<Sessao> sessao;

    public List<Estoque> getProduto() {
        return produto;
    }

    public void setProduto(List<Estoque> produto) {
        this.produto = produto;
    }

    public List<Sessao> getSessao() {
        return sessao;
    }

    public void setSessao(List<Sessao> sessao) {
        this.sessao = sessao;
    }
    
    /**
     * Constrói um novo usuário com nome e idade.
     *
     * @param produto O produto.
     * @param sessao a sessao selecionada.
     */
    public Carrinho(List<Estoque> produto, List<Sessao> sessao) {
        this.produto = produto;
        this.sessao = sessao;
    }
    
    //Isso nao deve precisar usar, esse método esta em sessao
    public void addSessaoAoCarrinho()
    {
        for(Sessao sessao : sessao)
        {
            System.out.println(sessao.getFilmes() +" "+ sessao.getSala() + "" + sessao.getHorario());
        }
        try(Scanner scanner = new Scanner(System.in))
        {
        System.out.println("Selecione a sessao desejada");
        String filmeNome = scanner.nextLine();
        System.out.println("Selecione a sessao desejada");
        String horario = scanner.nextLine();
        

    }
    
    }}
