
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
  String run2;
    String ans1,ans2;
    String sec1, sec2, sec3, sec4, sec5, sec6, sec7, sec8, sec9, sec10, sec11, sec12, sec13, sec14;

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
    getSections();
  }
  public void getSections(){
    String askyesno = "";
    System.out.println("\nDo you want to play your story?Type 'yes' to play, type 'no' if you don't want to play\n");
    askyesno = stringReader.nextLine();
    if (askyesno.equals("yes")){
      System.out.println(Intro);
      System.out.println(selectOptions(0));
      System.out.println(selectOptions(1));
      System.out.println(selectOptions(2));
      System.out.println(selectOptions(3));
      System.out.println(selectOptions(4));
      System.out.println(selectOptions(5));
      System.out.println(selectOptions(6));
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
        return sec1;
      }
	    else if(run.equalsIgnoreCase("two")){
        return sec2;
      }
    }
    if (section == 1){
	    if (run.equalsIgnoreCase("one")){
        return sec3;
      }
	    else if(run.equalsIgnoreCase("two")){
        return sec4;
      }
    }
    if (section == 2){
	    if (run.equalsIgnoreCase("one")){
        return sec5;
      }
	    else if(run.equalsIgnoreCase("two")){
        return sec6;
	    }
    }
    if (section == 3){
	    if (run.equalsIgnoreCase("one")){
        return sec7;
	    }
	    else if(run.equalsIgnoreCase("two")){
        return sec8;
      }
    }
    if (section == 4){
	    if (run.equalsIgnoreCase("one")){
        return sec9;
      }
	    else if(run.equalsIgnoreCase("two")){
        return sec10;
      }
    }
    if (section == 5){
	    if (run.equalsIgnoreCase("one")){
        return sec11;
	    }
	    else if(run.equalsIgnoreCase("two")){
        return sec12;
      }
    }
    if (section == 6){
	    if (run.equalsIgnoreCase("one")){
        return sec13;
      }
	    else if(run.equalsIgnoreCase("two")){
        return sec14;
	    }
    }
    return "Please type a valid option!";
  }
  
  public String setOptions(int sect){
    if (sect == 0){
      System.out.println("Enter in the options for each section\n");
      System.out.println("Please enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nIntro Options:");
      getOptions();
    }
    if (sect == 1){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 1 Options:");
      getOptions();
    }if (sect == 2){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 2 Options:");
      getOptions();
    }if (sect == 3){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 3 Options:");
      getOptions();
    }if (sect == 4){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 4 Options:");
      getOptions();
    }if (sect == 5){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 5 Options:");  
      getOptions();
    }if (sect == 6){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 6 Options:");
      getOptions();
    }if (sect == 7){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 7 Options:");
      getOptions();
      setEnding();
      getEnding();
    }if (sect == 8){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 8 Options:");
      getOptions();
      setEnding();
      getEnding();
    }if (sect == 9){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 9 Options:");
      getOptions();
      setEnding();
      getEnding();
    }if (sect == 10){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 10 Options:");
      getOptions();
      setEnding();
      getEnding();
    }if (sect == 11){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 11 Options:");
      getOptions();
      setEnding();
      getEnding();
    }if (sect == 12){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 12 Options:");
      getOptions();
      setEnding();
      getEnding();
    }if (sect == 13){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      setEnding();
      getEnding();
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 13 Options:");
      getOptions();
      setEnding();
      getEnding();
    }if (sect == 14){
      System.out.println("\nPlease enter in option 1");
      one = stringReader.nextLine();
      System.out.println(">Option 1:" + one);
      setEnding();
      getEnding();
      System.out.println("\nPlease enter in option 2");
      two = stringReader.nextLine();
      System.out.println(">Option 2:" + two);
      System.out.println("\nSection 14 Options:");
      getOptions();
      setEnding();
      getEnding();
    }
    return "Set Options";
  }
  public void getIntro(){
    System.out.println("Intro: " + Intro);
  }
  public void setEnding(){
    System.out.println("How do you want your story to end from this result?");
    ending=stringReader.nextLine();//set ending to what the user typed in
  }
  public void getEnding(){
    System.out.println("Ending:"+ this.ending);
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
    System.out.println(">>>>Option 1:" + this.one);
    System.out.println(">>>>Option 2:" + this.two);

  }
  public static void main(String[] args){
    Story example = new Story();
    System.out.println(example);
  }
  public void Section1(){
    System.out.println("\nSection 1:Now enter the story for this section based on option 1 of your intro: ");
    sec1 = stringReader.nextLine();
    if (sec1.equals("quit")){
      System.exit(0);
    }
  }
  public void Section2(){
    System.out.println("\nSection 2:Now enter the story for the next section based on option 2 of your intro: ");
    sec2 = stringReader.nextLine();
  }
  public void Section3(){
    System.out.println("\nSection 3:Enter the story for this section based on option 1 of Section 1: ");
    sec3 = stringReader.nextLine();
  }
  public void Section4(){
    System.out.println("\nSection 4:Enter the story for this section based on option 2 of Section 1:");
    sec4 = stringReader.nextLine();
  }
  public void Section5(){
    System.out.println("\nSection 5:Enter the story for this section based on option 1 of Section 2:");
    sec5 = stringReader.nextLine();
  }
  public void Section6(){
    System.out.println("\nSection 6:Enter the story for this section based on option 2 of Section 2:");
    sec6 = stringReader.nextLine();
  }
  public void Section7(){
    System.out.println("\nSection 7:Enter the story for this section based on option 1 of Section 3:");
    sec7 = stringReader.nextLine(); 
  }
  public void Section8(){
    System.out.println("\nSection 8:Enter the story for this section based on option 2 of Section 3:");
    sec8 = stringReader.nextLine();
  }
  public void Section9(){
    System.out.println("\nSection 9:Enter the story for this section based on option 1 of Section 4:");
    sec9 = stringReader.nextLine();
  }
  public void Section10(){
    System.out.println("\nSection 10:Enter the story for this section based on option 2 of Section 4:");
    sec10 = stringReader.nextLine();
  }
  public void Section11(){
    System.out.println("\nSection 11:Enter the story for this section based on option 1 of Section 5:");
    sec11 = stringReader.nextLine();
  }
  public void Section12(){
    System.out.println("\nSection 12:Enter the story for this section based on option 2 of Section 5:");
    sec12 = stringReader.nextLine();
  }
  public void Section13(){
    System.out.println("\nSection 13:Enter the story for this section based on option 1 of Section 6:");
    sec13 = stringReader.nextLine();
      }
  public void Section14(){
    System.out.println("\nSection 14:Enter the story for this section based on option 2 of Section 6:");
    sec14 = stringReader.nextLine();
  }
}
