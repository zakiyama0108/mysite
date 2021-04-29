package javaBlockingQueue;

import java.util.concurrent.*;

public class Pipe implements In, Out {
	  private BlockingQueue<Integer> queue;

	  public Pipe() {
	    queue = new ArrayBlockingQueue<Integer>(8);
	  }

	  public int getc(){
	    Integer c;
	    try {
	      c = queue.take();
	    } catch (InterruptedException e) {
	      throw new PipeException(e.getMessage());
	    }

	    if (c == null) throw new PipeException("Can not get");
	    return c.intValue();
	  }

	  public void putc(char c) {
	    try {
	      queue.put((int)c);
	    } catch (InterruptedException e) {
	      throw new PipeException(e.getMessage());
	    }
	  }

	  public void end() {
	    try {
	      queue.put(-1);
	    } catch (InterruptedException e) {
	      throw new PipeException(e.getMessage());
	    }
	  }
}
