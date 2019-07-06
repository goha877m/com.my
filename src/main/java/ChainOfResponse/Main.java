package ChainOfResponse;

public class Main {

	/**
	 * 责任链设计模式实例
	 * @param args
	 */
    public static void main(String[] args) {
        
        Support jzy   = new NoSupport("jzy");
        Support bob     = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana   = new LimitSupport("Diana", 200);
        Support elmo    = new OddSupport("Elmo");
        Support fred    = new LimitSupport("Fred", 300);
        
        jzy.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        
        for(int i=0;i<500;i+=33) {
            jzy.support(new Trouble(i));
        }
    }

}
