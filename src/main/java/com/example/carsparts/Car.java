package com.example.carsparts;

public class Car {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Car[] cars = {
            new Car("Star", "FSC Star - dawne polskie zakłady motoryzacyjne" +
                    " specjalizujące się w produkcji lekkich i średnich samochodów ciężarowych," +
                    " które miały swoją siedzibę w Starachowicach. Ich głównym sukcesorem w" +
                    " zakresie fabryki w Starachowicach jest spółka MAN Bus.",
                    R.drawable.star),
            new Car("Jelcz", "Jelcz – polskie przedsiębiorstwo motoryzacyjne z" +
                    " siedzibą w Jelczu-Laskowicach w powiecie oławskim w województwie" +
                    " dolnośląskim oraz marka samochodów ciężarowych i autobusów.",
                    R.drawable.jelcz),
            new Car("Ferrari", "Ferrari Testarossa – supersamochód klasy średniej" +
                    " produkowany przez włoską markę Ferrari w latach 1984–1996.",
                    R.drawable.ferrari),
            new Car("Lamborghini", "Lamborghini Diablo – supersamochód produkowany" +
                    " przez włoską markę Lamborghini w latach 1991 – 2000.",
                    R.drawable.lamborghini),
            new Car("Vw", "Volkswagen Passat − samochód osobowy klasy średniej" +
                    " produkowany pod niemiecką marką Volkswagen od 1973 roku. Od 2014 roku" +
                    " produkowana jest ósma generacja modelu.",
                    R.drawable.vw),
            new Car("Opel", "Opel Astra – samochód osobowy klasy kompaktowej" +
                    " produkowany pod niemiecką marką Opel od 1991 roku. Od 2021 roku" +
                    " produkowana jest szósta generacja pojazdu.",
                    R.drawable.opel)
    };
    private Car(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}

