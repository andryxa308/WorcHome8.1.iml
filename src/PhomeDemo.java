public class PhomeDemo {
    public static void main(String[] args){
        Phone phone1=new Phone("80441111111","Honor",7.8);
        Phone phone2=new Phone("80442222222",78);
        Phone phone3=new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());


        phone1.receiveCall("Брат");
        phone2.receiveCall("Сестра");
        phone3.receiveCall("Теща", "80114524578");
        phone3.sendMessage("80114524578");

    }




    }


