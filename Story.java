import java.util.Scanner;

public class Story{

    Scanner stringReader = new Scanner(System.in);
    Scanner numberReader = new Scanner(System.in);

    public class Story(){
	getIntro();
    }
    String Intro;
    String fileSave;
    public void setIntro(){
	System.out.print("Enter the introduction to your story");
	Intro = stringReader.nextLine();//set intro that what the user typed in
    }
	
    public void  getIntro(){
	System.out.print(Intro);
    }
    public void saveStory(String fileName){}
    public String getFileSave(){
	return fileSave;
    }
    public void main(String args[]){}
}
