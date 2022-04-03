//public class tryFinally {

    ///finally-секция получает управление, если try-блок завершился успешно
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}

////finally-секция получает управление, даже если try-блок завершился исключением
//public static void main(String[] args) {
//    try {
//        throw new RuntimeException();
//    } finally {
//        System.err.println("finally");
//    }
//}                               //Вывод: finally
//}                               //       Exception in thread "main" java.lang.RuntimeException

////finally-секция получает управление, даже если try-блок завершился директивой выхода из метода
//public static void main(String[] args) {
//    try {
//        throw new RuntimeException();
//    } finally {
//        System.err.println("finally");
//    }
//}
//}
////finally-секция получает управление, даже если try-блок завершился директивой выхода из метода
//    public static void main(String[] args) {
//        try {
//            return;
//        } finally {
//            System.err.println("finally");
//        }
//    }
//}

////finally-секция НЕ вызывается только если мы «прибили» JVM
//public static void main(String[] args) {
//    try {
//        System.exit(42);
//    } finally {
//        System.err.println("finally");
//    }
//}
//}                       //Process finished with exit code 42

////System.exit(42) и Runtime.getRuntime().exit(42) — это синонимы
//public static void main(String[] args) {
//    try {
//        Runtime.getRuntime().exit(42);
//    } finally {
//        System.err.println("finally");
//    }
//}
//}                   //Process finished with exit code 42

////И при Runtime.getRuntime().halt(42) — тоже не успевает зайти в finally
//public static void main(String[] args) {
//    try {
//        Runtime.getRuntime().halt(42);
//    } finally {
//        System.err.println("finally");
//    }
//}
//}                   //Process finished with exit code 42

////exit() vs halt()
////finally-секция не может «починить» try-блок завершившийся исключение
//// ( «more» — не выводится в консоль)
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
//}

////Трюк с «if (true) {...}» требуется,
//// так как иначе компилятор обнаруживает недостижимый код (последняя строка) и отказывается его компилировать
//
//    public static void main(String[] args) {
//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
//}
//
////И finally-секция не может «предотвратить» выход из метода,
//// если try-блок вызвал return («more» — не выводится в консоль)
//public static void main(String[] args) {
//    try {
//        System.err.println("try");
//        if (true) {return;}
//    } finally {
//        System.err.println("finally");
//    }
//    System.err.println("more");
//}
//}
//
////Однако finally-секция может «перебить» throw/return при помощи другого throw/return
//public static void main(String[] args) {
//    System.err.println(f());
//}
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            return 1;
//        }
//    }
//}
////
//public static void main(String[] args) {
//    System.err.println(f());
//}
//    public static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 1;
//        }
//    }
//}
////
//public static void main(String[] args) {
//    System.err.println(f());
//}
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            throw new RuntimeException();
//        }
//    }
//}               //Exception in thread "main" java.lang.RuntimeException
////
//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new Error();
//        } finally {
//            throw new RuntimeException();
//        }
//    }
//}                   //Exception in thread "main" java.lang.RuntimeException
//
////finally-секция может быть использована для завершающего действия, которое гарантированно будет вызвано
//// (даже если было брошено исключение или автор использовал return) по окончании работы
////В finally-секция нельзя стандартно узнать было ли исключение.
////           Конечно, можно постараться написать свой «велосипед»

//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        long rnd = System.currentTimeMillis();
//        boolean finished = false;
//        try {
//            if (rnd % 3 == 0) {
//                throw new Error();
//            } else if (rnd % 3 == 1) {
//                throw new RuntimeException();
//            } else {
//                // nothing
//            }
//            finished = true;
//        } finally {
//            if (finished) {
//                // не было исключений
//            } else {
//                // было исключение, но какое?
//            }
//        }
//    }
//}
