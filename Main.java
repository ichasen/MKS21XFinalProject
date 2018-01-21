import java.util.Scanner;
import java.io.*;

import static java.lang.System.*;
public class Main{
  Scanner stringReader = new Scanner(System.in);
  String run;
  public Main(){
    System.out.println("Type 'read' to read a story, 'write' to create a story, and 'play' to play a story.\n");
    run = stringReader.nextLine();
    if (run.equalsIgnoreCase("write")){
      Story writing = new Story();
    }
    if (run.equalsIgnoreCase("read")){
	Reading r = new Reading();
	r.openFile();
	r.readFile();
	r.closeFile();
    }
    if (run.equalsIgnoreCase("play")){
	Reading r = new Reading();
	r.openFile();
	r.readFile();
	r.closeFile();
    }
  }
  public static void main(String[] args){
    Main example = new Main();
    System.out.println(example);
  }
}
