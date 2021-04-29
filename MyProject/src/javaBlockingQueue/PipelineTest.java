package javaBlockingQueue;

import java.io.*;

class PipelineTest {
  public static void main(String[] args) {
	  
	    if (args.length < 1) {
	      System.err.println("No args.");
	      System.exit(1);
	    }
	    String filename = args[0];
	    FileIn fileIn = null;

	    try {
	      fileIn = new FileIn(filename);
	    } catch (FileNotFoundException e) {
	      System.err.println("File not found.");
	      System.exit(1);
	    }

	    StdOut stdOut = new StdOut();
	    Pipe pipe = new Pipe();
	    Filter word = new Word(fileIn, pipe);
	    Filter tolower = new Tolower(pipe, stdOut);

	    word.start();
	    tolower.start();
	  }
}
