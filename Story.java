import java.util.Scanner;
public class Story{

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);

    String fileSave;
    String Intro;

    public Story(){
	setIntro();
	getIntro();
    }
    public void setIntro(){
	System.out.println("Enter the introduction to your story");
	Intro= stringReader.nextLine();//set intro that what the user typed in
    }
    public void getIntro(){
	System.out.print(Intro);
    }
    public void saveStory(String fileName){}
    public String getFileSave(){
	return fileSave;
    }
    public static void main(String[] args){
	new Story();
    }
}

