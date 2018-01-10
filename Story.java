import java.util.Scanner;
public class Story{

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);

    String fileSave;
    String Intro;
    String ending;
    int numScenes;
    int numOfOptions;

    public Story(){
	setIntro();
	setEnding();
	getIntro();
	getEnding();
    }
    public void setIntro(){
	System.out.println("Enter the introduction to your story: ");
	Intro=stringReader.nextLine();//set intro that what the user typed in
	System.out.println("Enter the number of options you want for this section up to a maximum of 3");
	numOfOptions = numberReader.nextInt();
	if (numOfOptions > 3 || numOfOptions < 0){
	     throw new IllegalArgumentException("Please use a number less than 3");
	}
	else{
	    System.out.println ("You will now have " + numOfOptions + " options to complete this section!");
	}
    }
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
    public void setNumOfOptions(){
	System.out.println("Enter the number of options you want for this section");
	numOfOptions = numberReader.nextInt();
    }
    public void getOptions(){
	System.out.println(numOfOptions);
    }
    public static void main(String[] args){
	new Story();
    }
    public void Section1(){

    }
}
