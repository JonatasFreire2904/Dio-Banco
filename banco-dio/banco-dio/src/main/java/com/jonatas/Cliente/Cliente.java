package com.jonatas.Cliente;

import com.jonatas.Contas.Conta;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nome;
    private String telefone;
    private String endereco;
    private List<Conta> listaContas;

    public Cliente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.listaContas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public List<Conta> getListaContas() {
        return listaContas;
    }

    public void adicionarConta(Conta conta) {
        this.listaContas.add(conta);
    }
}
