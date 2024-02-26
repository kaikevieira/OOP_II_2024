package revisao_desafio_jogador;

import java.util.ArrayList;

public class Time {

    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time() {
        setNome("");
        setJogadores(new ArrayList<Jogador>());
    }
    
    public Time(String nome, ArrayList<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getJogadores().size() + ")";
    }
    
    
}
