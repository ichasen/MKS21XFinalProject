import java.util.Scanner;
import java.util.*;
public class Story{

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);

    String fileSave;
    String Intro;
    String ending;
    int numScenes;
    String one,two;
    String run;
    String ans1,ans2;
    String sec1, sec2, sec3, sec4, sec5, sec6, sec7, sec8, sec9, sec10, sec11, sec12, sec13, sec14;

    public Story(){
	setIntro();
	Section1();
	Section2();
	Section3();
	Section4();
	Section5();
	Section6();
	Section7();
	Section8();
	Section9();
	Section10();
	Section11();
	Section12();
	Section13();
	Section14();
    }
    public String getSections(){
	String ans = Intro + sec1 + sec2 + sec3 + sec4 + sec5 + sec6 + sec7 + sec8 + sec9 + sec10 + sec11 + sec12 + sec13 + sec14;
	return ans;
    }
    public void  setIntro(){
	System.out.println("How do you want to begin your story?: ");
	Intro=stringReader.nextLine();//set intro that what the user typed in
	System.out.println ("You will  have 2  options for each section to decide how your story will continue.");
	setOptions();
	System.out.println("Intro Options:");
	getOptions();
	selectOptions(0);
    }

    public String selectOptions(int section){
	System.out.println("Select the option you would like to pick.Type 'one' or 'two' to select the option you would like.");
	run = stringReader.nextLine();
	ArrayList<String> s1 = new ArrayList<>();
	if (section == 0){
	    if (run.equalsIgnoreCase("one")){
		Section1();
		sec2 = "";
	    }
	    else if(run.equalsIgnoreCase("two")){
		Section2();
		sec1 = "";
	    }
	}
	if (section == 1){
	    if (run.equalsIgnoreCase("one")){
		Section3();
		sec4 = "";
	    }
	    else if(run.equalsIgnoreCase("two")){
		Section4();
		sec3 = "";
	    }
	}
	if (section == 2){
	    if (run.equalsIgnoreCase("one")){
		Section5();
		sec6 = "";
	    }
	    else if(run.equalsIgnoreCase("two")){
		Section6();
		sec5 = "";
	    }
	}
	if (section == 3){
	    if (run.equalsIgnoreCase("one")){
		Section7();
		sec8 = "";
	    }
	    else if(run.equalsIgnoreCase("two")){
		Section8();
		sec7 = "";
	    }
	}
	if (section == 4){
	    if (run.equalsIgnoreCase("one")){
		Section9();
		sec10 = "";
	    }
	    else if(run.equalsIgnoreCase("two")){
		Section10();
		sec9 = "";
	    }
	}
	if (section == 5){
	    if (run.equalsIgnoreCase("one")){
		Section11();
		sec12 = "";
	    }
	    else if(run.equalsIgnoreCase("two")){
		Section12();
		sec11 = "";
	    }
	}
	if (section == 6){
	    if (run.equalsIgnoreCase("one")){
		Section13();
		sec14 = "";
	    }
	    else if(run.equalsIgnoreCase("two")){
		Section14();
		sec13 = "";
	    }
	}
	return "option selected";
    }
  
    public void setOptions(){
	System.out.println("Please enter in option 1");
	one = stringReader.nextLine();
	System.out.println(">Option 1:" + one);
	System.out.println("Please enter in option 2");
	two = stringReader.nextLine();
	System.out.println(">Option 2:" + two);
    }

    //REMEMBER THAT WE MIGHT NEED TO DO THIS.ONE , THIS.TWO, THIS.THREE INSTEAD BECAUSE EACH OPTION COULD CHANGE. IF YOU DO THIS, MIGHT HAVE TO MODIFY GETOPTIONS
  
    public void getIntro(){
	System.out.println("Intro: " + Intro);
    }
    public void setEnding(){
	System.out.println("How do you want your story to end from this result?");
	ending=stringReader.nextLine();//set ending to what the user typed in
    }
    public void getEnding(){
	System.out.println("Ending:"+ending);
    }
    // public void saveStory(File fileSave){
    //if (!(fileSave.exists())){
    //	    throw new FileNotFoundException;
    //	}
    //  }
    // public void saveStory(File fileSave){
    //	if (!(fileSave.exists())){
    //	    throw new FileNotFoundException;
    //	}
    // }

    //  public void saveStory(){
    //	if (!(fileSave.exists())){
    //	    throw new FileNotFoundException();
    //	}
    //}
  
    public String getFileSave(){
	return fileSave;
    }
    //  public void setNumOfOptions(){
    //	System.out.println("Enter the number of options you want for this section");
    //	numOfOptions = numberReader.nextInt();
    // }
    public void getOptions(){
	System.out.println(">>>>Option 1:" + one);
	System.out.println(">>>>Option 2:" + two);

    }
    public static void main(String[] args){
	Story example = new Story();
	System.out.println ("Story: " + example.getSections());
    }
    public void Section1(){
	System.out.println("Now enter the story for this section based on option 1 of your intro: ");
	one=stringReader.nextLine();
	sec1 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 1 Options:");
	getOptions();
	selectOptions(1);
    }
    public void Section2(){
	System.out.println("Now enter the story for the next section based on option 2 of your intro: ");
	two=stringReader.nextLine();
	sec2 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 2 Options:");
	getOptions();
	selectOptions(2);
    }
    public void Section3(){
	System.out.println("Section 3:Enter the story for this section based on option 1 of the previous section: ");
	one=stringReader.nextLine();
	sec3 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 3 Options:");
	getOptions();
	selectOptions(3);
    }
    public void Section4(){
	System.out.println("Section 4:Enter the story for this section based on option 2 of the previous section:");
	two=stringReader.nextLine();
	sec4 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 4 Options:");
	getOptions();
	selectOptions(4);
    }
    public void Section5(){
	System.out.println("Section 5:Enter the story for this section based on option 1 of the previous section:");
	one=stringReader.nextLine();
	sec5 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 5 Options:");
	getOptions();
	selectOptions(5);
    }
    public void Section6(){
	System.out.println("Section 6:Enter the story for this section based on option 2 of the previous section:");
	two=stringReader.nextLine();
	sec6 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 6 Options:");
	getOptions();
	selectOptions(6);
    }
    public void Section7(){
	System.out.println("Section 7:Enter the story for this section based on option 1 of the previous section:");
	one=stringReader.nextLine();
	sec7 = stringReader.nextLine(); 
	setOptions();
	System.out.println("Section 7 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
    public void Section8(){
	System.out.println("Section 8:Enter the story for this section based on option 2 of the previous section:");
	two=stringReader.nextLine();
	sec8 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 8 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
    public void Section9(){
	System.out.println("Section 9:Enter the story for this section based on option 1 of the previous section:");
	one=stringReader.nextLine();
	sec9 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 9 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
    public void Section10(){
	System.out.println("Section 10:Enter the story for this section based on option 2 of the previous section:");
	two=stringReader.nextLine();
	sec10 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 10 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
    public void Section11(){
	System.out.println("Section 11:Enter the story for this section based on option 1 of the previous section:");
	one=stringReader.nextLine();
	sec11 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 11 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
    public void Section12(){
	System.out.println("Section 12:Enter the story for this section based on option 2 of the previous section:");
	two=stringReader.nextLine();
	sec12 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 12 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
    public void Section13(){
	System.out.println("Section 13:Enter the story for this section based on option 1 of the previous section:");
	one=stringReader.nextLine();
	sec13 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 13 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
    public void Section14(){
	System.out.println("Section 14:Enter the story for this section based on option 2 of the previous section:");
	two=stringReader.nextLine();
	sec14 = stringReader.nextLine();
	setOptions();
	System.out.println("Section 14 Options:");
	getOptions();
	setEnding();
	getEnding();
    }
}
