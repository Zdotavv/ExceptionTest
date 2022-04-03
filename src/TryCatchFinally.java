//public class TryCatchFinally {
    ////Нет исключения
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            // nothing
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");
//    }
//}

////Не заходим в catch, заходим в finally, продолжаем после оператора
////Есть исключение и есть подходящий catch
//public static void main(String[] args) {
//    try {
//        System.err.print(" 0");
//        if (true) {throw new Error();}
//        System.err.print(" 1");
//    } catch(Error e) {
//        System.err.print(" 2");
//    } finally {
//        System.err.print(" 3");
//    }
//    System.err.print(" 4");
//}
//}

////Заходим в catch, заходим в finally, продолжаем после оператора
////Есть исключение но нет подходящего catch
//public static void main(String[] args) {
//    try {
//        System.err.print(" 0");
//        if (true) {throw new RuntimeException();}
//        System.err.print(" 1");
//    } catch(Error e) {
//        System.err.print(" 2");
//    } finally {
//        System.err.print(" 3");
//    }
//    System.err.print(" 4");
//}
//}