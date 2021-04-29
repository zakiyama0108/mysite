package javaBlockingQueue;

class StdOut implements Out {

	  public void putc(char c) {
		    System.out.print(c);
		  }

	  public void end() {
	    System.out.flush();
	  }

}
