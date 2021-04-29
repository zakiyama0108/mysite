package javaBlockingQueue;

abstract class Filter implements Runnable {
  protected In in;
  protected Out out;
  
  public Filter(In in, Out out) {
    this.in = in;
    this.out = out;
  }

  public abstract void run(); // runnable
  public void start() {
    (new Thread(this)).start();
  }
}
