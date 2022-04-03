//public class SystemErrAandOut {
//    public static void main (String[]args) {
//        System.out.println("sout");
//        throw new Error();
//    }
//}
// Если выводим сообщение в System.out, то на это тратится каке-то время для буферизации,
//а , если, в System.err, то сообщение сразу выводится в консоль,
// из-за чего System.err может обогнать System.out