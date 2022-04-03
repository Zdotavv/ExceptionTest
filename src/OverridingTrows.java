import java.io.FileNotFoundException;
import java.io.IOException;

//public class OverridingTrows {
    ////При переопределении (overriding) список исключений потомка не обязан совпадать с таковым у предка.
////Но он должен быть «не сильнее» списка предка:
//    public static void main(String[] args) {
//    }
//        public class Parent {
//            // предок пугает IOException и InterruptedException
//            public void f() throws IOException, InterruptedException {}
//        }
//    class Child extends Parent {
//        // а потомок пугает только потомком IOException
//        @Override
//        public void f() throws FileNotFoundException {}
//    }
//
//    }
//
////Однако тут мы попытались «расширить тип» бросаемых исключений
//    public static void main(String[] args) {
//    }

    //    public class Parent {
//        public void f() throws IOException, InterruptedException {
//        }
//    }
//
//    class ChildB extends Parent {
//        @Override
//        public void f() throws Exception {
//        }
//    }
//}
//
////Почему можно сужать тип, но не расширять?
////Рассмотрим следующую ситуацию:
//    public static void main(String[] args) {
//    }
//
//    public class Parent {
//        // предок пугает Exception
//        public void f() throws Exception {
//        }
//    }
//}

    //////
////// тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
//
//    public static void main(String[] args) {
//    }
//    public class Child extends Parent {
//        // потомок расширил Exception до Throwable
//        public void f() throws Throwable {
//        }
//    }
//}
//////
//    public static void main(String[] args) {
//    }
//    public class Parent {
//        // предок пугает Exception
//        public void f() throws Exception {
//        }
//    }
//
//    public class Demo {
//        public static void test(Parent ref) {
//            // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
//            try {
//                ref.f();
//            } catch (Exception e) {
//            }
//        }
//    }
//}
////
//public static void main(String[] args) {
//    Demo.test(new Child()); }
//    public class Parent {
//        // предок пугает Exception
//        public void f() throws Exception {
//        }
//    }
//
//    public class Demo {
//        public static void test(Parent ref) {
//            // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
//            try {
//                ref.f();
//            } catch (Exception e) {
//            }
//        }
//    }
//}
