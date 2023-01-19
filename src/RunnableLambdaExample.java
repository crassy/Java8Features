public class RunnableLambdaExample {

    public static void main(String[] args) {
        /**
         * Prior to Java 8.
         */

        Runnable runnableJava7 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable method.");
            }
        };
        new Thread(runnableJava7).start();

        /**
         * Java 8 Lambda
         * () -> {};
         */

        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable method. runnableLambda");
        };

        Runnable runnableSimpleLambda = ()->System.out.println("Inside Runnable method. runnableSimpleLambda");
        new Thread(runnableSimpleLambda).start();

        new Thread(runnableLambda).start();


    }
}
