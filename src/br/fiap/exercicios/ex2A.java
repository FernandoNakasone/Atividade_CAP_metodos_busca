package br.fiap.exercicios;
import br.fiap.models.Registro;
import java.util.Scanner;

public class ex2A {
    public static void main(String[] args) {

        //Busca Sequencial Exaustiva

        Scanner sc = new Scanner(System.in);
        Registro[] bd = new Registro[6];

        bd[0] = new Registro("Parafuso",623,"ABC",0.75);
        bd[1] = new Registro("Prego",133,"ABC",0.50);
        bd[2] = new Registro("Martelo",686,"XYZ",34.75);
        bd[3] = new Registro("Alicate",461,"W2M",22.50);
        bd[4] = new Registro("Soldador",201,"ABC",48.99);
        bd[5] = new Registro("Tesoura",732,"W2M",23.80);

        Registro encontrados[] = new Registro[6];

        String fornecedor;
        System.out.print("Informe o nome do fornecedor:");
        fornecedor = sc.next();

        int qtdEncontrados = buscaSequencialExaustiva(bd,fornecedor,encontrados);

        System.out.println("Quantidade de produtos do fornecedor encontrados:" + qtdEncontrados);

        System.out.println("-------------------------------------------------------");
        if(qtdEncontrados != 0) {
            for (Registro r : encontrados) {
                if (r != null) {
                    System.out.println(r);
                }
            }
        } else {
            System.out.println("Nenhum produto deste fornecedor encontrado!");
        }

    }

    public static int buscaSequencialExaustiva(Registro bd[], String chave, Registro encontrados[]) {
        int ne = 0;
        int num = bd.length;
        for (int i = 0; i < num; i++) {
            if (bd[i].getFabricante().equalsIgnoreCase(chave)) {
                encontrados[ne] = bd[i];
                /* armazena registro da posição em que a chave foi encontrada */
                ne++;
            }
        }
        return (ne); /* quantidade de registros com a chave procurada */
    }
}
