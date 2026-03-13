package polymorphism;

class Offseason extends Season {
    void discount(double amount) {
        double billAmount = amount - (amount * 0.15);
        System.out.println("Offseason Discount Price: " + billAmount);
    }
}

class Onseason extends Season {
    void discount(double amount) {
        double billAmount = amount - (amount * 0.40);
        System.out.println("Onseason Discount Price: " + billAmount);
    }

    public static void main(String[] args) {

        Season s = new Offseason();
        s.discount(5000);

        Season s1 = new Onseason();
        s1.discount(5000);
    }
}