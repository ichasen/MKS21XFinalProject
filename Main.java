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
      try{
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;
        while ((str=br.readLine()) != null){
          out.println(str+"\n");
        }
        br.close();
      }catch (IOException e){
        out.println("File not found");
      }
    }
    if (run.equalsIgnoreCase("play")){
      try{
        File file = new File("test.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw =new PrintWriter(fw);
        pw.println();
        pw.close();
      }catch (IOException e){
        out.println("dsadas");
      }
      
    }
  }
  public static void main(String[] args){
    Main example = new Main();
    System.out.println(example);
  }
}