package A.resources;

public class Ex {

    public static void main(String[] args) throws Exception {

//        try {
//            DBConnection dbConnection = new DBConnection();
//            throw new RuntimeException(":(");
//
////        } catch (Exception e) {
////            System.out.println("catch");
//        } finally {
//            System.out.println("finally block");
//        }

        try (DBConnection dbConnection = new DBConnection()) {
            dbConnection.executeQuery();
            throw new RuntimeException(":(");
        } catch (Exception e) {
            e.printStackTrace();
//            rollback
        } finally {
            System.out.println("finally block");
        }

        System.out.println("end");

    }
}