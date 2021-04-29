package javaBlockingQueue;

import java.util.concurrent.*;

public class PipeException extends RuntimeException {
	  public PipeException(String msg) {
		    super(msg);
		  }
}
