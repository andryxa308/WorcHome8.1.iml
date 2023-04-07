import java.util.Arrays;

public  class Phone {
    public boolean getNumber;
    String number;
    String model;
    double weight;

    public Phone(String n, String m, double w) {
        this.number = n;
        this.model = m;
        this.weight = w;
    }

    public Phone(String n, double w) {
        this.number = n;
        this.weight = w;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит" + name + " number:" + number);
        System.out.println("My number(80447741486)");

    }

    public void sendMessage(String numbers) {
        System.out.println("Сообщение отправлено на номера: "+ Arrays.toString(new String[]{numbers}) );
    }



    }











