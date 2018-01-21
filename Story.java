import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Story{

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
    
    public Story(){
	setIntro();
	setOptions(0);
	Section1();
	setOptions(1);
	Section2();
	setOptions(2);
	Section3();
	setOptions(3);
	Section4();
	setOptions(4);
	Section5();
	setOptions(5);
	Section6();
	setOptions(6);
	Section7();
	setOptions(7);
	Section8();
	setOptions(8);
	Section9();
	setOptions(9);
	Section10();
	setOptions(10);
	Section11();
	setOptions(11);
	Section12();
	setOptions(12);
	Section13();
	setOptions(13);
	Section14();
	setOptions(14);
	log("\nIntro:"+Intro + "\nSection 1:" +sec1 + "\nSection 2:"+sec2 + "\n Section 3:"+sec3+"\nSection 4:"+sec4+ "\nSection 5:"+sec5+"\nSection 6:"+sec6+"\nSection 7:"+sec7+"\nSection 8:"+sec8+"\nSection 9:"+sec9+"\nSection 10:"+sec10+"\nSection11:"+sec11+"\nSection12:"+sec12 + "\nSection13:"+sec13 + "\nSection14:"+sec14 );
	getSections();

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

    public void setIntro(){
	System.out.println("How do you want to begin your story?: ");
	Intro=stringReader.nextLine();//set intro that what the user typed in
	System.out.println ("\nYou will  have 2  options for each section to decide how your story will continue.");
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
    public void log(String message){
	try{
	    PrintWriter outputfile = new PrintWriter(new FileWriter("out.txt",false),true);
	    outputfile.write(message + "\n");
	    outputfile.close();
	}catch (IOException e){
	    e.printStackTrace();
	}
	    
    }
    
    public String setOptions(int sect){
	String ans = "";
	if (sect == 0){
	    ans = "Intro";
	}
	if (sect == 1){
	    ans = "Section 1 ";
	}
	if (sect == 2){
	    ans = "Section 2 ";
	}
	if (sect == 3){
	    ans = "Section 3 ";
	}
	if (sect == 4){
	    ans = "Section 4 ";
	}
	if (sect == 5){
	    ans = "Section 5 ";
	}
	if (sect == 6){
	    ans = "Section 6 ";
	}
	if (sect == 7){
	    ans = "Section 7 ";
	}
	if (sect == 8){
	    ans = "Section 8 ";
	}
	if (sect == 9){
	    ans = "Section 9 ";
	}
	if (sect == 10){
	    ans = "Section 10 ";
	}
	if (sect == 11){
	    ans = "Section 11 ";
	}
	if (sect == 12){
	    ans = "Section 12 ";
	}
	if (sect == 13){
	    ans = "Section 13 ";
	}
	if (sect == 14){
	    ans = "Section 14 ";
	}
	if (sect > 0 && sect < 7){
	    System.out.println("\nPlease enter in option 1");
	    one = stringReader.nextLine();
	    System.out.println(">Option 1:" + one);
	    System.out.println("\nPlease enter in option 2");
	    two = stringReader.nextLine();
	    System.out.println(">Option 2:" + two);
	    System.out.println("\n" + ans + "Options:");
	    getOptions();
	}
	if (sect >=7 && sect < 15){
	    System.out.println("\nPlease enter in option 1");
	    one = stringReader.nextLine();
	    System.out.println(">Option 1: " + one);
	    setEnding();
	    getEnding();
	    System.out.println("\nPlease enter in option 2");
	    two = stringReader.nextLine();
	    System.out.println(">Option 2: " + two);
	    System.out.println("\n" + ans + "Options:");
	    getOptions();
	    setEnding();
	    getEnding();
	}
	return "Set options";
    }
    public void getIntro(){
	System.out.println("Intro: " + Intro);
    }
    public void Section1(){
	System.out.println("\nSection 1:Now enter the story for this section based on option 1 of your intro. You may quit at any time by typing 'quit', although your sections will not be saved: ");
	sec1 = stringReader.nextLine();
	if (sec1.equals("quit")){
	    System.exit(0);
	}
        System.out.println("Do you want to play your sections so far? Please type 'yes' or 'no'.");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro  + "\n" + "Section 1: " + sec1);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}  
    }
    public void Section2(){
	System.out.println("\nSection 2:Now enter the alternative to Section 1, based on option 2 of your intro: ");
	sec2 = stringReader.nextLine();
	if (sec2.equals("quit")){
	    System.exit(0);
	}
        System.out.println("Do you want to play your sections so far? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
    }
    public void Section3(){
	System.out.println("\nSection 3:Enter the story for this section based on option 1 of Section 1: ");
	sec3 = stringReader.nextLine();
	if (sec3.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no': ");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
    }
    public void Section4(){
	System.out.println("\nSection 4: Enter the alternative to Section 3, based on option 2 of Section 1:");
	sec4 = stringReader.nextLine();
	if (sec4.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no': ");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section5(){
	System.out.println("\nSection 5:Enter the story for this section based on option 1 of Section 2:");
	sec5 = stringReader.nextLine();
	if (sec5.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section6(){
	System.out.println("\nSection 6:Now enter the alternative to Section 5, based on option 2 of Section 2:");
	sec6 = stringReader.nextLine();
	if (sec6.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section7(){
	System.out.println("\nSection 7:Enter the story for this section based on option 1 of Section 3:");
	sec7 = stringReader.nextLine();
	if (sec7.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section8(){
	System.out.println("\nSection 8:Enter the alternative to Section 7, based on option 2 of Section 3:");
	sec8 = stringReader.nextLine();
	if (sec8.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7 + "\n" + "Section 8: " + sec8);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section9(){
	System.out.println("\nSection 9:Enter the story for this section based on option 1 of Section 4:");
	sec9 = stringReader.nextLine();
	if (sec9.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7 + "\n" + "Section 8: " + sec8 + "\n" + "Section 9: " + sec9);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section10(){
	System.out.println("\nSection 10:Enter the alternative to Section 9, based on option 2 of Section 4:");
	sec10 = stringReader.nextLine();
	if (sec10.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7 + "\n" + "Section 8: " + sec8 + "\n" + "Section 9: " + sec9 + "\n" + "Section 10: " + sec10);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section11(){
	System.out.println("\nSection 11:Enter the story for this section based on option 1 of Section 5:");
	sec11 = stringReader.nextLine();
	if (sec11.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7 + "\n" + "Section 8: " + sec8 + "\n" + "Section 9: " + sec9 + "\n" + "Section 10: " + sec10 + "\n" + "Section 11: " + sec11);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section12(){
	System.out.println("\nSection 12:Enter the alternative to Section 11, based on option 2 of Section 5:");
	sec12 = stringReader.nextLine();
	if (sec12.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7 + "\n" + "Section 8: " + sec8 + "\n" + "Section 9: " + sec9 + "\n" + "Section 10: " + sec10 + "\n" + "Section 11: " + sec11 + "\n" + "Section 12: " + sec12);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section13(){
	System.out.println("\nSection 13:Enter the story for this section based on option 1 of Section 6:");
	sec13 = stringReader.nextLine();
	if (sec13.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7 + "\n" + "Section 8: " + sec8 + "\n" + "Section 9: " + sec9 + "\n" + "Section 10: " + sec10 + "\n" + "Section 11: " + sec11 + "\n" + "Section 12: " + sec12 + "\n" + "Section 13: " + sec13);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void Section14(){
	System.out.println("\nSection 14:Enter the alternative to Section 13 based on option 2 of Section 6:");
	sec14 = stringReader.nextLine();
	if (sec14.equals("quit")){
	    System.exit(0);
	}
	System.out.println("Do you want to play your intro, as well as all of your sections? Please type 'yes' or 'no'");
	play = stringReader.nextLine();
	if (play.equalsIgnoreCase("yes")){
	    System.out.println("Intro: " + Intro + "\n" + "Section 1: " + sec1 + "\n" + "Section 2: " + sec2 + "\n" + "Section 3: " + sec3 + "\n" + "Section 4: " + sec4 + "\n" + "Section 5: " + sec5 + "\n" + "Section 6: " + sec6 + "\n" + "Section 7: " + sec7 + "\n" + "Section 8: " + sec8 + "\n" + "Section 9: " + sec9 + "\n" + "Section 10: " + sec10 + "\n" + "Section 11: " + sec11 + "\n" + "Section 12: " + sec12 + "\n" + "Section 13: " + sec13 + "\n" + "Section 14: " + sec14);
	}
	if (play.equalsIgnoreCase("no")){
	    System.out.println ("On to the next section");
	}
	
    }
    public void setEnding(){
	System.out.println("How do you want your story to end based on your previous sections?");
	ending=stringReader.nextLine();//set ending to what the user typed in
    }
    public void getEnding(){
	System.out.println("Ending:"+ this.ending);
    }
  
    public String getFileSave(){
	return fileSave;
    }
    public void getOptions(){
	System.out.println(">>>>Option 1:" + this.one);
	System.out.println(">>>>Option 2:" + this.two);

    }
    public static void main(String[] args){
	Story example = new Story();
	System.out.println(example);
    }
}
