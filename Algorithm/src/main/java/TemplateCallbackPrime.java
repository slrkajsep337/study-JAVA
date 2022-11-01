
//Strategy패턴 적용
interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
//    boolean someOperation(int a, int b) {
//        return a<b;
//    }
//    boolean isPrime(int num) {
//        for(int i=2; someOperation(i, num); i++) {
//            if(num%i==0) return false;
//        }
//        return true;
//    }

    boolean isPrime(int num, StatementStrategy stmt) {
        for(int i=2; stmt.compare(i, num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        //익명 내부 클래스 사용
//        boolean r = tcp.isPrime(17, new StatementStrategy() {
//            @Override
//            public boolean compare(int a, int b) {
//                return a*a<b;
//            }
//        });

        //람다식 사용 : 가독성을 위해 사용
        System.out.println(tcp.isPrime(13, (a, b)-> a*a<b));
        System.out.println(tcp.isPrime(17, (a, b)-> a*a<b));
        System.out.println(tcp.isPrime(19, (a, b)-> a*a<b));
        System.out.println(tcp.isPrime(23, (a, b)-> a*a<b));


//        System.out.println(r);
    }
}
