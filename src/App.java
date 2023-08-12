public class App {
    public static void main(String[] args) {
        // iPhone 12, 6.1'', 256gb
        // Galaxy Note 20 Ultra, 6.9', 256gb
        // Xiaomi Mi 11 Pro, 6.81', 128gb

        Celular celularA = new Celular();
        celularA.nome = "iPhone 12";
        celularA.tamanhoTela = 6.1;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81;
        celularC.armazenamento = 128;
        celularC.sistemaOperacional = "Android";

        System.out.println("/////////////////////////");
        System.out.println("Celular: " + celularA.nome);
        System.out.println("Tamanho de tela: " + celularA.tamanhoTela);
        System.out.println("Armazenamento: " + celularA.armazenamento);
        System.out.println("Sistema operacional: " + celularA.sistemaOperacional);
        System.out.println("/////////////////////////");

        System.out.println("/////////////////////////");
        System.out.println("Celular: " + celularB.nome);
        System.out.println("Tamanho de tela: " + celularB.tamanhoTela);
        System.out.println("Armazenamento: " + celularB.armazenamento);
        System.out.println("Sistema operacional: " + celularB.sistemaOperacional);
        System.out.println("/////////////////////////");

        System.out.println("/////////////////////////");
        System.out.println("Celular: " + celularC.nome);
        System.out.println("Tamanho de tela: " + celularC.tamanhoTela);
        System.out.println("Armazenamento: " + celularC.armazenamento);
        System.out.println("Sistema operacional: " + celularC.sistemaOperacional);
        System.out.println("/////////////////////////");


    }

}