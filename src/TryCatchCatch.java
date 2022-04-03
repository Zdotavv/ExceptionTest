//public class TryCatchCatch {
    //// Мы можем расположить несколько catch после одного try.
   //// Но есть такое правило — нельзя ставить потомка после предка! (RuntimeException после Exception)
//
//        public static void main(String[] args) {
//            try {
//            } catch (Exception e) {
//            } catch (RuntimeException e) {  //не компилируется из-за того, что потомок стоит после предка
//            }
//        }
//    }

////Ставить брата после брата — можно (RuntimeException после Error)

//    public static void main(String[] args) {
//        try {
//        } catch (Error e) {
//        } catch (RuntimeException e) {
//        }
//    }
//}

////JVM идет сверху-вниз до тех пор, пока не найдет такой catch что в нем
//// указано ваше исключение или его предок — туда и заходит. Ниже — не идет.
//public static void main(String[] args) {
//    try {
//        throw new Exception();
//    } catch (RuntimeException e) {
//        System.err.println("catch RuntimeException");
//    } catch (Exception e) {
//        System.err.println("catch Exception");
//    } catch (Throwable e) {
//        System.err.println("catch Throwable");
//    }
//    System.err.println("next statement");  //Error: Could not find or load main class TryCatch
//}                                          //Caused by: java.lang.ClassNotFoundException: TryCatch
//}

////Выбор catch осуществляется в runtime (а не в compile-time),
//// значит учитывается не тип ССЫЛКИ (Throwable), а тип ССЫЛАЕМОГО (Exception)

//    public static void main(String[] args) {
//        try {
//            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
//            throw t;
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");   //Error: Could not find or load main class TryCatch
//    }                                           //Caused by: java.lang.ClassNotFoundException: TryCatch
//}