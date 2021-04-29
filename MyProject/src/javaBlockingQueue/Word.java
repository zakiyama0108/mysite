package javaBlockingQueue;

class Word extends Filter {

	  public Word(In in, Out out) {
		    super(in, out);
	  }

	  public void run() {
	    boolean inWord = false;
	    int c;
	    while ((c = in.getc()) != -1) {
	      if (Character.isLetterOrDigit((char)c)) {
	        inWord = true;
	        out.putc((char)c);
	      } else {
	        if (inWord) {
	          out.putc('\n');
	        }
	        inWord = false;
	      }
	    }
	    out.end();
	  }
}
