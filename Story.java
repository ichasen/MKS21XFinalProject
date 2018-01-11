import java.util.Scanner;
public class Story{

  Scanner stringReader = new Scanner(System.in);
  Scanner numberReader = new Scanner(System.in);

  String fileSave;
  String Intro;
  String ending;
  int numScenes;
  int numOfOptions;
  String one,two,three;

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
    System.out.println("Enter the number of options you want for this section up to a maximum of 3");
    numOfOptions = numberReader.nextInt();
    if (numOfOptions > 3 || numOfOptions < 0){
      throw new IllegalArgumentException("Please use a number less than 3");
    }
    else{
	    System.out.println ("You will now have " + numOfOptions + " options to complete this section!");
    }
    setOptions();
  }

  public void setOptions(){
    getIntro();
    System.out.println("Please enter in the options");
    if (numOfOptions == 1){
      System.out.println("Please enter in option 1");
      one = stringReader.next();
      System.out.println("Option 1:" + one);
    }
    if (numOfOptions == 2){
      System.out.println("Please enter in option 1");
      one = stringReader.next();
      System.out.println("Option 1:" + one);
      System.out.println("Please enter in option 2");
      two = stringReader.next();
      System.out.println("Option 2:" + two);
    }
    else {
      System.out.println("Please enter in option 1");
      one = stringReader.next();
      System.out.println("Option 1:" + one);

      System.out.println("Please enter in option 2");
      two = stringReader.next();
      System.out.println("Option 2:" + two);

      System.out.println("Please enter in option 3");
      three= stringReader.next();
      System.out.println("Option 3:" + three);
    }
  }
  //REMEMBER THAT WE MIGHT NEED TO DO THIS.ONE , THIS.TWO, THIS.THREE INSTEAD BECAUSE EACH OPTION COULD CHANGE. IF YOU DO THIS, MIGHT HAVE TO MODIFY GETOPTIONS
  
  public void getIntro(){
    System.out.println("Intro: " + Intro);
  }
  public void setEnding(){
    System.out.println("How do you want your story to end?: ");
    ending=stringReader.next();//set ending to what the user typed in
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
    if (numOfOptions == 1){
      System.out.println("Option 1:" + one);
    }
    if (numOfOptions == 2){
      System.out.println("Option 1:" + one);
      System.out.println("Option 2:" + two);
    }else{
      System.out.println("Option 1:" + one);
      System.out.println("Option 2:" + two);
      System.out.println("Option 3:" + three);
    }
  }
  public static void main(String[] args){
    new Story();
  }
  public void Section1(){
  }
}
