
//public class Keywords {
    //    public static void main (String[]args)
//
//  public static void main (String[]args)throws Throwable {}  //1-no problem
////
// public static void main (String[]args)throws String {} //2-throws String not work
//
//
//   public static void main(String[] args){  //3-catch with Throwable work
//        try {
//        } catch (Throwable t) {}
//    }
//
//   public static void main(String[] args) { // 4
//         try {
//                } catch (String s) {
//                }   //not work. java: incompatible types: java.lang.String cannot be converted to java.lang.Throwable
//            }
//
//        }
//
//
//     public static void main(String[] args) {    //5- Exception in thread "main" java.lang.Error
//                    // Error - потомок Throwable
//                    throw new Error();
//                }
//            }

//      public static void main(String[] args) {                //6- not ok. incompatible types: java.lang.String cannot be converted to java.lang.Throwable
//                throw new String("Hello!");
//            }
//        }
//
//      public static void main(String[] args) {            //7- not ok
//                throw null;
//                        }                               // Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "null" is null
//                }                                       //at com.company.Main.main(Main.java:5)
    //
//
//
//       public static void main(String[] args) {  //8-Exception in thread "main" java.lang.Error
//                Error ref = new Error();              // создаем экземпляр
//                throw ref;                            // "бросаем" его
//            }
//            }
//
//       public static void main(String[] args) {        //9- Передавая null, и, вызывая NullPointerException, ловим его catch. Затем снова вызываем этот метод передавая ему NullPointerException.
//                            f(null);                    //В резултате стек переполняется. Exception in thread "main" java.lang.StackOverflowError
//            }
//       public static void f(NullPointerException e) {
//                try {
//                    throw e;
//                } catch (NullPointerException npe) {
//                    f(npe);
//                }
//            }
//        }

