
public class TryCatch {

////catch по типу Parent перехватывает летящие экземпляры любого типа, который является Parent-ом
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
//            System.err.print(" 2");
//        }
//        System.err.println(" 3");
//    }
//}

//// Даже так: в блоке catch мы будем иметь ссылку типа Exception на объект типа RuntimeException
//public static void main(String[] args) {
//    try {
//        throw new RuntimeException();
//    } catch (Exception e) {
//        if (e instanceof RuntimeException) {
//            RuntimeException re = (RuntimeException) e;
//            System.err.print("Это RuntimeException на самом деле!!!");
//        } else {
//            System.err.print("В каком смысле не RuntimeException???");
//        }
//    }
//}
//}

////catch по потомку не может поймать предка

//    public static void main(String[] args) throws Exception { // пока игнорируйте 'throws'
//        try {
//            System.err.print(" 0");
//            if (true) {
//                throw new Exception();
//            }
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }
//    }

////catch по одному «брату» не может поймать другого «брата»
//// (Error и Exception не находятся в отношении предок-потомок, они из параллельных веток наследования от Throwable)
//public static void main(String[] args) {
//    try {
//        System.err.print(" 0");
//        if (true) {throw new Error();}
//        System.err.print(" 1");
//    } catch (Exception e) {
//        System.err.print(" 2");
//    }
//    System.err.print(" 3");
//}
//}

////А что будет, если мы зашли в catch, и потом бросили исключение ИЗ catch?
//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // но бросили Error
//        }
//        System.err.println(" 3");          // пропускаем - уже летит Error
//    }
//}

//// В таком случае выполнение метода тоже прерывается (не печатаем «3»).
////Новое исключение не имеет никакого отношения к try-catch
////Мы можем даже кинуть тот объект, что у нас есть «на руках»

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw e;}       // и бросили ВТОРОЙ раз ЕГО ЖЕ
//        }
//        System.err.println(" 3");      // пропускаем - опять летит RuntimeException
//    }
//}

//// И мы не попадем в другие секции catch, если они есть
//public static void main(String[] args) {
//    try {
//        System.err.print(" 0");
//        if (true) {throw new RuntimeException();}
//        System.err.print(" 1");
//    } catch (RuntimeException e) {     // перехватили RuntimeException
//        System.err.print(" 2");
//        if (true) {throw new Error();} // и бросили новый Error
//    } catch (Error e) {                 // хотя есть cath по Error "ниже", но мы в него не попадаем
//        System.err.print(" 3");
//    }
//    System.err.println(" 4");   //0 2. Exception in thread "main" java.lang.Error
//}
//}

//// Можно строить вложенные конструкции, но вот пример, «исправляющий» эту ситуацию

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2.1");
//            try {
//                System.err.print(" 2.2");
//                if (true) {throw new Error();} // и бросили новый Error
//                System.err.print(" 2.3");
//            } catch (Throwable t) {            // перехватили Error
//                System.err.print(" 2.4");
//            }
//            System.err.print(" 2.5");
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");           //Результат:  0 2.1 2.2 2.4 2.5 4
//    }
//}
