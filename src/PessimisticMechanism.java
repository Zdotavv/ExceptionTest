
//public class PessimisticMechanism {
//
////Мы не можем бросать, но не предупредить
//        public static void main(String[] args) {
//            throw new Exception(); // тут ошибка компиляции
//        }
//    }
////Мы не можем бросать, но предупредить о «меньшем»
//        public static void main(String[] args) {
//            //throw new Exception(); // тут ошибка компиляции
//        }
//    }
//
////Мы можем предупредить точно о том, что бросаем
//        public static void main(String[] args)  throws Exception {
//            throw new Exception(); // и кидаем Exception
//        }
//    }
//
////Мы можем предупредить о большем, чем мы бросаем
//        public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
//            throw new Exception(); // а кидаем только Exception
//        }
//    }
//
////Можем даже предупредить о том, чего вообще нет
//        public static void main(String[] args) throws Exception { // пугаем
//            // но ничего не бросаем
//        }
//    }
//
////Даже если предупреждаем о том, чего нет — все обязаны бояться
//        public static void main(String[] args) {
//            //f(); // тут ошибка компиляции
//        }
//
//        public static void f() throws Exception {
//        }
//    }
//
////Хотя они (испугавшиеся) могут перепугать остальных еще больше
//        // они пугают целым Throwable
//        public static void main(String[] args) throws Throwable {
//            f();
//        }
//        // хотя мы пугали всего-лишь Exception
//        public static void f() throws Exception {
//        }
//    }


