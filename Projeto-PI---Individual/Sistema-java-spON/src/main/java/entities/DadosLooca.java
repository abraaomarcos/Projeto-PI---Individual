package entities;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import entities.util.Converter;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;


public class DadosLooca {

    Looca looca = new Looca();
    File disc = new File("C:");
    Temperatura temperatura = new Temperatura();
    DiscoGrupo disco = new DiscoGrupo();



    public Double tamanhoDisco() {

        return Converter.formater(disco.getTamanhoTotal());
    }

    public Double espacoDisco() {

        return Converter.formater(disc.getFreeSpace());
    }

    @Override
    public String toString() {

        return String.format("""
                Dados do do disco do seu computador
                Tamanho do disco = %.0f GB
                Espaço do disco = %.0f
                """, tamanhoDisco(), espacoDisco());
    }
}