package br.fiap.exercicios;
import br.fiap.models.Registro;
import java.util.Scanner;

public class ex2B {
    public static void main(String[] args) {

        //Busca sequencial

        Scanner sc = new Scanner(System.in);
        Registro[] bd = new Registro[6];

        bd[0] = new Registro("Parafuso",623,"ABC",0.75);
        bd[1] = new Registro("Prego",133,"ABC",0.50);
        bd[2] = new Registro("Martelo",686,"XYZ",34.75);
        bd[3] = new Registro("Alicate",461,"W2M",22.50);
        bd[4] = new Registro("Soldador",201,"ABC",48.99);
        bd[5] = new Registro("Tesoura",732,"W2M",23.80);

        int chave;
        System.out.print("Informe o código do produto a ser procurado:");
        chave = sc.nextInt();

        int posicao = buscaSequencial(bd,chave);

        System.out.println(bd[posicao]);
    }

    public static int buscaSequencial(Registro[] baseDados, int chaveproc) {
        int pos = -1;
        for (int i = 0; i< baseDados.length && pos == -1; i++)
            if((baseDados[i].getCodigo() == chaveproc))
                pos = i;

        return pos;
    }


}
