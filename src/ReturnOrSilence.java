
//
//public class ReturnOrSilence {
//            public static void main(String[] args) {   //1
//            double k=new ReturnOrSilence().sqr(2);
//            System.out.println("Результат: "+k);
//        }
//        public double sqr ( double arg){ // надо double
//            return arg * arg;  // double * double - это double
//        }                               // ok
//}
//    public static void main(String[] args) {              //2
//        double k=new ReturnOrSilence().sqr(2);
//        System.out.println("Результат: "+k);
//    }
//    public double sqr(double arg) { // надо double
//        int k = 1;                  // есть int
//        return k;                   // можно неявно преобразовать int в double
//    }
//}
//
//    public static void main(String[] args) {       //3
//        double k=new ReturnOrSilence().sqr(2);
//        System.out.println("Результат: "+k);
//    }
//        public double sqr ( double arg){ // надо double
//            int k = 1;                  // есть int
//            return (double) k;          // явное преобразование int в double
//        }
//    }
//
//    public static void main(String[] args) {       //4
//        double k = new ReturnOrSilence().sqr(2);
//        System.out.println("Результат: "+k);
//    }
//    public static double sqr(double arg) {
//        return "hello!";        //Другой тип данных.incompatible types: java.lang.String cannot be converted to double
//    }
//}
//
//    public static void main(String[] args) {    //5
//    }
//        public static double sqr ( double arg){
//        }
//    }                   //Нет возврата. missing return statement
//
//    public static void main(String[] args) {                //6
//        double k = sqr(4);
//        System.out.println("Результат: "+k);
//    }
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
//        }
//       else {
//          ////  throw new RuntimeException("Нечётное число!"); }           // а если нечетное, что нам возвращать?
//    }                        // missing return statement
//}
//
//
//
//    public static void main(String[] args) {                 //7
//        double d = sqr(10.0); // ну, и чему равно d?
//        System.out.println(d);
//    }
//    public static double sqr(double arg) {
//        ////return arg * arg;
//    }                            // мы ничего не вернули, за что и получили missing return statement
//}
//
//    public static void main(String[] args) {           //8
//        double k = sqr(3);
//        System.out.println("Результат: "+k);
//    }
//    public static double sqr(double arg) {
//        ////return arg * arg;
//       while (true) ;       // Удивительно, но КОМПИЛИРУЕТСЯ! Не смотря на то, что мы ничего не вернули
//    }
//}
//      public static void main(String[] args) {            //9
//        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
//        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    }
//    public static double sqr(double arg) {
//       //// return arg * arg;
//        while (true); // Вот тут мы на века "повисли", потому что ничего не возвращаем
//    }
//}
//
//    public static void main(String[] args) {         //10
//        double k = sqr(3);
//        System.out.println("Результат: "+k);
//    }
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // ну ладно, вот твой double
//        } else {
//           //// throw new RuntimeException("Нечётая цифра!");
//            while (true) ;     // а тут "виснем" навсегда
//        }
//    }
//}
//
//    public static void main(String[] args) {              //11
//        double k = sqr(3);
//        System.out.println("Результат: "+k);
//    }
//    public static double sqr(double arg) {
//        throw new RuntimeException();  //Ничего не вернули-но компиляция прошла. Получили RuntimeException
//    }
//}
//
//    public static void main(String[] args) {             //12
//        double k = sqr(4);
//        System.out.println("Результат: "+k);
//    }
//    public static double sqr(double arg) {  // согласно объявлению метода ты должен вернуть double
//        long time = System.currentTimeMillis();
//        if (time % 2 == 0) {
//            return arg * arg;             // ок, вот твой double
//        } else if (time % 2 == 1) {
//            while (true) ;                 // не, я решил "повиснуть"
//        } else {
//            throw new RuntimeException(); // или бросить исключение
//        }
//    }
//}
//
//   public static void main(String[] args) {                  //13
//                                // sqr - "сломается" (из него "выскочит" исключение),
//    double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
//                                // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//        System.out.println(d); // и печатать нам ничего не придется!
//}
//    public static double sqr(double arg) {
//        throw new RuntimeException(); // "бросаем" исключение
//    }                                //Exception in thread "main" java.lang.RuntimeException
//}
//
//    public static void main(String[] args) {            //14
//        int result = 0;
//                try {
//                    result = area(2,50);
//                }catch (IllegalArgumentException e){
//                    throw e;
//                }
//
//                System.out.println("Result is - " + result);
//            }
//
//        public static int area ( int width, int height){
//            return width * height;
//            // тут просто перемножаем. Всё ОК
//        }
//    }
//    public static void main(String[] args) {    // 15
//
//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            // у вас плохие аргументы, извините
//        } else {
//            return width * height;
//        }
//    }                           //missing return statement
//
//    public static void main(String[] args) {            //16
//        int result = 0;
//                try {
//                    result = area(-1,-100);
//                }catch (IllegalArgumentException e){
//                    throw e;
//                }
//
//                System.out.println("Result is - " + result);
//            }
//
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.out.println("Bad ...");
//        }
//        return width * height;              //продолжило считать с неправильными данными
//    }
//}
//
//    public static void main(String[] args) {            //17
//        int result = 0;
//                try {
//                    result = area(-1,-100);
//                }catch (IllegalArgumentException e){
//                    throw e;
//                }
//
//                System.out.println("Result is - " + result);
//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            return -1; // специальное "неправильное" значение площади
//        }
//        return width * height;
//    }
//}
//
//    public static void main(String[] args) {            //18
//        int result = 0;
//        try {
//            result = area(-1, -100);
//        } catch (IllegalArgumentException e) {
//            throw e;
//        }
//
//        System.out.println("Result is - " + result);
//    }
//
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.exit(0);          //завершаем прогррамму
//        }
//        return width * height;
//    }
//}
//
//    public static void main(String[] args) {
//        int result = 0;
//        try {
//            result = area(2, 100);
//        } catch (IllegalArgumentException e) {
//            throw e;
//        }
//        System.out.println("Result is - " + result);
//    }
//
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//        }
//        return width * height;
//    }
//}
//}
