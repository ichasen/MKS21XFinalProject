import java.io.*;
import java.util.*;
public class Reading{
    private Scanner x;
    public void openFile(){
	try{
	    x = new Scanner(new File("out.txt"));
	}
	catch (IOException e){
	    System.out.println("File not found");
	}
    }
    public void readFile(){
	while(x.hasNext()){
	    String text = x.nextLine();
	    System.out.println(text);
	}
    }
    public void closeFile(){
	x.close();
    }
}
