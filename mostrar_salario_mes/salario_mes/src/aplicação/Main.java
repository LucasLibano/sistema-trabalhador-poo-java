package aplicação;

import entidade.Departamento;
import entidade.HorasContrato;
import entidade.NivelTrabalho;
import entidade.Trabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamentoNome = sc.nextLine();

        System.out.print("Entre com a data de trabalho:");
        System.out.print("Nome: ");
        String NomeTrabalho = sc.nextLine();
        System.out.print("Nivel de trabalho: ");
        String NivelTrabalho = sc.nextLine();
        System.out.print("Base salarial:  ");
        Double baseSalarial = sc.nextDouble();

        Trabalho trabalho = new Trabalho (NomeTrabalho, entidade.NivelTrabalho.valueOf(NivelTrabalho), baseSalarial, new Departamento (departamentoNome));

        System.out.print("Quantos contratos esse trabalhor vai ter?  ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.println("Entre com o #" + i +  "data: ");
            System.out.print("Entre com a data (DD/MM/AAAA/): ");
            Date contratoDate = sdf.parse(sc.next());
            System.out.print("Digite o valor por hora: ");
            double ValorPorHora = sc.nextDouble();
            System.out.print("Duração (Hora): ");
            int horas = sc.nextInt();

            HorasContrato contrato = new HorasContrato(contratoDate, ValorPorHora, horas);
            trabalho.adicionarContrato(contrato);
        }

        System.out.println("");

        System.out.println("Entre com o mes e ano para calculo (MM/YYYY): ");
        sc.nextLine();
        String mesEAno = sc.nextLine();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + trabalho.getName());
        System.out.println("Departamento: " + trabalho.getDepartamento().getName());
        System.out.println("Ganhou no mes: " + mesEAno + " : " + String.format("%.2f", trabalho.renda(ano,mes)));



        }
    }
