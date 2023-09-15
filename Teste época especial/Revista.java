public class Revista {
    public static void main(String[] args) {
        Computador hp1 = new Computador.Builder(
                "HP Pavilion 15-104",
                new Processador("Intel Core i5-5500U Dual Core", "2.7GHz", "4MB"),
                new Memoria("DDR4-2133, 1x 4GB + 1x 8GB", "12GB"),
                new Armazenamento(TipoArmazenamento.HDD, "1TB"),
                849.99)
                .build();

        Computador hp2 = new Computador.Builder(
                "HP Pavilion 15-104",
                new Processador("Intel Core i5-5500U Dual Core", "2.7GHz", "4MB"),
                new Memoria("DDR4-2133, 1x 4GB + 1x 8GB", "12GB"),
                new Armazenamento(TipoArmazenamento.HDD, "1TB"),
                849.99)
                .addInterface("2x USB 3.1")
                .addInterface("HDMI")
                .addInterface("JACK 3, 5mm (Combo)")
                .monitor("15\"")
                .tamanho("15\"")
                .build();

        Computador macbook = new Computador.Builder(
                "Apple Macbook Air",
                new Processador("Intel Core i7 Dual Core", "1.6GHz", "3MB"),
                new Memoria("LPDDR3-1600", "8GB"),
                new Armazenamento(TipoArmazenamento.SSD, "128GB"),
                1159.0)
                .monitor("13 \"")
                .tamanho("13 \"")
                .peso("1.35kg")
                .build();
        
        System.out.println(hp1);
        System.out.println("\n");
        System.out.println(macbook);
        System.out.println("\n");
        System.out.println(hp2);

    }
}

