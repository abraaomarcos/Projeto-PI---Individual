package entities;

import DAO.ChamadosDAO;
import DAO.LoocaDAO;
import DAO.UserDAO;

import javax.swing.*;

import java.time.LocalDateTime;
import java.util.Scanner;

import static java.lang.System.exit;

public class Interface {
    Scanner ler = new Scanner(System.in);

    public void Opcoes() {
        UserDAO user = new UserDAO();

        ItensDecoracao.barra();
        System.out.println(String.format("""
                Olá %s, escolha uma das opções abaixo:
                1 - Enviar dados do disco
                2 - Fechar sistema""", user.getNome()));
        ItensDecoracao.barra();
        Integer escolha = ler.nextInt();
        Escolha(escolha);
    }

    public void Escolha(Integer escolha) {

        switch (escolha) {
            case 1: {
                EnviarDadosLooca();
                break;
            }
            case 2: {

                exit(0);
                break;
            }
            default: {
                System.out.println("Sistema finalizado");
                exit(0);
            }
        }
    }

    public void EnviarDadosLooca() {
        DadosLooca dados = new DadosLooca();
        LoocaDAO looca = new LoocaDAO();

        // Mostra os dados vindo da looca
        ItensDecoracao.barra();
        System.out.println("\n" + dados);

        looca.InsertDados(dados);
        //Envia para a tela de login
        Opcoes();
    }
}
