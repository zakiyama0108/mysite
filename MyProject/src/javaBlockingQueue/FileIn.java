package javaBlockingQueue;

import java.io.*;

class FileIn implements In {
	  private Reader reader;
	  public FileIn(String filename) throws FileNotFoundException {
	    reader = new FileReader(filename);
	  }

	  public int getc() {
	    try {
	      return reader.read();
	    } catch (IOException e) {
	      throw new RuntimeException(e);
	    }
	  }
}
