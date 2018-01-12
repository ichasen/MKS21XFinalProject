import java.util.Scanner;
public class Story{

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);

    String fileSave;
    String Intro;
    String ending;
    int numScenes;
    String one,two,three;
    String run;
    String ans1,ans2,ans3;

    public Story(){
	setIntro();
	setEnding();
	getIntro();
	getOptions();
	getEnding();
    }
    public void setIntro(){
	System.out.println("Enter the introduction to your story: ");
	Intro=stringReader.nextLine();//set intro that what the user typed in
	System.out.println ("You will  have 2  options for each section!");
	setOptions();
	selectOptions();
    }

    public void selectOptions(){
	System.out.println("Select the option you would like to pick.Type 'one' or 'two' to select the option you would like.");
	run = stringReader.nextLine();
    
	if (run.equalsIgnoreCase("one")){
	    Section1();
	}
	else if(run.equalsIgnoreCase("two")){
	    Section2();
	}
    }
  
  
    public void setOptions(){
	getIntro();
	System.out.println("Please enter in the options");
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
	System.out.println("How do you want your story to end?: ");
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
	System.out.println("Option 1:" + one);
	System.out.println("Option 2:" + two);

    }
    public static void main(String[] args){
	new Story();
    }
    public void Section1(){
	System.out.println("Enter the story for this section");
	one=stringReader.nextLine();
    }

    }
    public static void main(String[] args){
	new Story();
    }
    public void Section1(){
	System.out.println("Enter the story for this section");
	one=stringReader.nextLine();
    }

    public void Section2(){
    }
}
