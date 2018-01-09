import java.util.Scanner;
public class Story{

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);

    String fileSave;
    String Intro;
    String ending;
    int numScenes;

    public Story(){
	setIntro();
	setEnding();
	getIntro();
	getEnding();
    }
    public void setIntro(){
	System.out.println("Enter the introduction to your story: ");
	Intro=stringReader.nextLine();//set intro that what the user typed in
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
    public void saveStory(File fileSave){
	if (!(fileSave.exists())){
	    throw new FileNotFoundException;
	}
    }
    public String getFileSave(){
	return fileSave;
    }
    public static void main(String[] args){
	new Story();
    }
}
