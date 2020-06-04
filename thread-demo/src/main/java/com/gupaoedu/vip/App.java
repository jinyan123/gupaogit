package com.gupaoedu.vip;

/**
 * Hello world!
 *
 */
public class App extends Thread{

    /*static IRequestProcessor requestProcessor;

    public void setUp(){
        PrintProcessor printProcessor=new PrintProcessor();
        printProcessor.start();
        SaveProcessor saveProcessor=new SaveProcessor(printProcessor);
        saveProcessor.start();

        requestProcessor=new PrevProcessor(saveProcessor);
        ((PrevProcessor) requestProcessor).start();
    }



    public static void main(String[] args) {
        App app=new App();
        app.setUp();
        Request request=new Request();
        request.setName("Mic");
        requestProcessor.process(request);
    }
*/

    /*  public static void main(String[] args) {
              new App().start();
              new Thread(new App()).start();
      }

      @Override
      public void run() {
          super.run();
      }*/
    static IRequestProcessor requestProcessor;
    public void setUp(){
        PrintProcessor printProcessor = new PrintProcessor();
        printProcessor.start();
        SaveProcessor saveProcessor = new SaveProcessor(printProcessor);
        saveProcessor.start();
        requestProcessor  =  new PrevProcessor(saveProcessor);
        ((PrevProcessor) requestProcessor).start();
    }
    public static void main(String[] args) {
        App app = new App();
        app.setUp();
        Request request = new Request();
        request.setName("Mic");
        requestProcessor.process(request);
    }
}
