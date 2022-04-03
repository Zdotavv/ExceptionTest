import java.io.EOFException;
import java.io.FileNotFoundException;

//public class OrCatchOrThrows {

//        ////Не надо пугать тем, что вы перехватили
//
//        ////так
//            public static void main(String[] args) {
//                try {
//                    throw new Exception();
//                } catch (Exception e) {
//                    // ...
//                }
//            }
//        }

        ////или так (ставим catch по предку и точно перехватываем)
//
//            public static void main(String[] args) {
//                try {
//                    throw new Exception();
//                } catch (Throwable e) {
//                    // ...
//                }
//            }
//        }
//
//        ////Но если перехватили только потомка, то не выйдет
//
//            public static void main(String[] args) {
//                try {
//                    //throw new Throwable(); //ошибка компиляции
//                } catch (Exception e) {
//                    // ...
//                }
//            }
//        }

//        ////Не годится, естественно, и перехватывание «брата»
//            public static void main(String[] args) {
//                try {
//                    //throw new Exception(); //ошибка компиляции
//                } catch (Error e) {
//                    // ...
//                }
//            }
//        }
//
//       ////Если вы часть перехватили, то можете этим не пугать
//            // EOFException перехватили catch-ом, им не пугаем
//            public static void main(String[] args) throws FileNotFoundException {
//                try {
//                    if (System.currentTimeMillis() % 2 == 0) {
//                        throw new EOFException();
//                    } else {
//                        throw new FileNotFoundException();
//                    }
//                } catch (EOFException e) {
//                    // ...
//                }
//            }
//        }


