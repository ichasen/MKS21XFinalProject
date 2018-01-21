import java.util.*;
import java.io.*;
import java.nio.file.Files;
public class Play{
    private Scanner t;
    Scanner stringReader = new Scanner(System.in);

    String fileSave;
    String Intro;
    String ending;
    String one,two;
    String run;
    String run2;
    String ans1,ans2;
    String sec1, sec2, sec3, sec4, sec5, sec6, sec7, sec8, sec9, sec10, sec11, sec12, sec13, sec14;
    String play;

    public Play(){
	readFile();
	getSections();
    }

    public static void main(String[] args){
	Play xxx = new Play();
    }

    public void readFile(){
        try{
	    List<String> lines = Files.readAllLines(new File("out.txt").toPath());
	    Intro = lines.get(2);
	    sec1 = lines.get(5);
	    sec2 = lines.get(12);
	    sec3 = lines.get(19);
	    sec4 = lines.get(26);
	    sec5 = lines.get(33);
	    sec6 = lines.get(40);
	    sec7 = lines.get(47);
	    sec8 = lines.get(58);
	    sec9 = lines.get(69);
	    sec10 = lines.get(80);
	    sec11 = lines.get(91);
	    sec12 = lines.get(102);
	    sec13 = lines.get(113);
	    sec14 = lines.get(124);
	}catch (IOException e){
	    System.out.println("File not found");
	}
    }
     public String selectOptions(int section){
	System.out.println("\nSelect the option you would like to pick.Type 'one' or 'two' to select the option you would like.");
	run = stringReader.nextLine();
	ArrayList<String> s1 = new ArrayList<>();
	if (section == 0){
	    if (run.equalsIgnoreCase("one")){
		return "Section 1: "+  sec1;
	    }
	    else if(run.equalsIgnoreCase("two")){
		return "Section 2: " +sec2;
	    }
	}
	if (section == 1){
	    if (run.equalsIgnoreCase("one")){
		return "Section 3: "+ sec3;
	    }
	    else if(run.equalsIgnoreCase("two")){
		return "Section 4: " +sec4;
	    }
	}
	if (section == 2){
	    if (run.equalsIgnoreCase("one")){
		return "Section 5: "+ sec5;
	    }
	    else if(run.equalsIgnoreCase("two")){
		return "Section 6: " +sec6;
	    }
	}
	if (section == 3){
	    if (run.equalsIgnoreCase("one")){
		return "Section 7: "+ sec7;
	    }
	    else if(run.equalsIgnoreCase("two")){
		return "Section 8: "+ sec8;
	    }
	}
	if (section == 4){
	    if (run.equalsIgnoreCase("one")){
		return "Section 9: "+sec9;
	    }
	    else if(run.equalsIgnoreCase("two")){
		return "Section 10: "+sec10;
	    }
	}
	if (section == 5){
	    if (run.equalsIgnoreCase("one")){
		return "Section 11: "+sec11;
	    }
	    else if(run.equalsIgnoreCase("two")){
		return "Section 12: "+sec12;
	    }
	}
	if (section == 6){
	    if (run.equalsIgnoreCase("one")){
		return "Section 13: "+ sec13;
	    }
	    else if(run.equalsIgnoreCase("two")){
		return "Section 14: "+ sec14;
	    }
	}
	else {
	    throw new  IllegalArgumentException("Please type one or two!");
	}
	return "Please type a valid option!";
     }

    public void getSections(){
	String askyesno = "";
	System.out.println("\nDo you want to play your story?Type 'yes' to play, type 'no' if you don't want to play\n");
	askyesno = stringReader.nextLine();
	if (askyesno.equals("yes")){
	    System.out.println(Intro);
	    System.out.println(selectOptions(0));
	    if (run.equals("one")){
		System.out.println(selectOptions(1));
		if (run.equals("one")){
		    System.out.println(selectOptions(3));
		}
		else{
		    System.out.println(selectOptions(4));
		}  
	    }else{
		System.out.println(selectOptions(2));
		if (run.equals("one")){
		    System.out.println(selectOptions(5));
		}
		else{
		    System.out.println(selectOptions(6));
		}
	    }
	}
	else {
	    System.exit(0);
	}
    }
}
