public class T {

    public static int TEST = 0;

    public static void main(String[] args) {
        while (true){
            baz();
        }

    }


    static void baz(){
        for (int i = 0; i < 100; i++) {
            bar();
        }
        for (int i = 0; i < 10000; i++) {
            bar();
        }        for (int i = 0; i < 100; i++) {
            bar();
        }
        for (int i = 0; i < 10000; i++) {
            bar();
        }
    }

    /**
     *
     * @param i - some integer
     * @param c - same character
     * @return - constant double
     */
    static Double foo(Integer i, Character c) {
        return 2.0;
    }

    static void bar() {

    }

    static void baZ(){

    }

    static void bAz(){

    }

    static void Baz(){

    }

}
