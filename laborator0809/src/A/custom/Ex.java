package A.custom;

public class Ex {

    public static void main(String[] args) throws InvalidCardException {

        pay(40, "20");
        System.out.println();

        pay(40, null);

        System.out.println("end");
    }

    static void pay(Integer sender,
                    String amountS) throws InvalidCardException {

        if (amountS == null)
            throw new InvalidCardException();

        Integer amount = Integer.valueOf(amountS);

        if (sender < amount)
            throw new NotEnoughMoneyException("not enough money " + amount);

        System.out.println("payment successful");
    }


//    Varianta 2
//
//    public static void main(String[] args) {
//        try {
//            pay(40, "20");
//            System.out.println();
//
//            pay(40, null);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("end");
//    }
//
//    static void pay(Integer sender,
//                    String amountS) throws InvalidCardException {
//
//        if (amountS == null)
//            throw new InvalidCardException();
//
//        Integer amount = Integer.valueOf(amountS);
//
//        if (sender < amount)
//            throw new NotEnoughMoneyException("not enough money " + amount);
//
//        System.out.println("payment successful " + sender + " " + amount);
//    }

//    static void pay(Integer sender,
//                    String amountS) {
//
//        try {
//            if (amountS == null)
//                throw new InvalidCardException();
//
//            Integer amount = Integer.valueOf(amountS);
//
//            if (sender < amount)
//                throw new NotEnoughMoneyException("not enough money " + amount);
//
//            System.out.println("payment successful " + sender + " " + amount);
//        } catch (InvalidCardException e) {
//            System.out.println("date card invalide " + sender + " " + amountS);
//        }
//    }
}
