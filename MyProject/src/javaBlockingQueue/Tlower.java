package javaBlockingQueue;

class Tolower extends Filter {

  public Tolower(In in, Out out) {
	    super(in, out);
	  }

	  public void run() {
	    int c;
	    while ((c = in.getc()) != -1) {
	      out.putc(Character.toLowerCase((char)c));
	    }
	    out.end();
	  }
}
