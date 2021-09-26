  abstract  class parent1{
    public parent1() {
        System.out.println("i am a constrructor");
    }
    public void sayhello(){

    }
        abstract public void greet();
      abstract public void greet2();
    }
class parent2 extends parent1 {
    public void greet() {
        System.out.println("GM");

    }

    public void greet2() {
        System.out.println("GMm");
    }


    abstract class parent3 extends parent2 {
        public void th() {
            System.out.println("yyyy");
        }

    }

    public class abstractjava {
        public static void main(String[] args) {
            parent2 p = new parent2();
            System.out.println("tttt");
        }
    }
}
