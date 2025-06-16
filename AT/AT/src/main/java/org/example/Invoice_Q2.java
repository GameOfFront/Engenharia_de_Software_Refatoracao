package org.example;

public class Invoice_Q2 {
    private String clientName;
    private String clientEmail;
    private double amount;
    private TipoNotaFiscal tipo;

    public Invoice_Q2(String clientName, String clientEmail, double amount, TipoNotaFiscal tipo) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.amount = amount;
        this.tipo = tipo;
    }

    public void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }

    public void process() {

        if (clientEmail == null || !clientEmail.contains("@")) {
            System.out.println("Email inválido. Falha no envio.");
            return;
        }

        switch (tipo) {
            case SIMPLES:
                System.out.println("Nota fiscal simples");
                break;
            case COM_IMPOSTO:
                System.out.println("Nota fiscal com imposto");
                break;
            case FANTASMA:
                System.out.println("Nota fiscal fantasma");
                break;
            default:
                System.out.println("Tipo desconhecido");
        }

        System.out.println("--- NOTA FISCAL ---");
        System.out.println("Cliente: " + clientName);
        System.out.println("Valor: R$ " + amount);

        switch (tipo) {
            case SIMPLES:
                System.out.println("Tipo: Simples");
                break;
            case COM_IMPOSTO:
                System.out.println("Tipo: Com imposto");
                break;
            default:
                System.out.println("Tipo: Desconhecido");
        }
        System.out.println("---------------------");

        System.out.println("Enviando nota fiscal para: " + clientEmail);
        String nota = "--- NOTA FISCAL ---\n" +
                "Cliente: " + clientName + "\n" +
                "Valor: R$ " + amount + "\n" +
                "Tipo: " + getDescricaoTipo() + "\n" +
                "---------------------";
        enviarPorEmail(clientEmail, nota);
    }

    private String getDescricaoTipo() {
        switch (tipo) {
            case SIMPLES:
                return "Simples";
            case COM_IMPOSTO:
                return "Com imposto";
            case FANTASMA:
                return "Fantasma";
            default:
                return "Desconhecido";
        }
    }
}

