import java.util.Scanner;
public class Sections{
    String scene;
    String options;
    boolean checkPoint;
    int numOfOptions;

    Scanner numberReader = new Scanner(System.in);
    Scanner stringReader = new Scanner(System.in);
    public Sections(){
	setNumOfOptions();
	getOptions();
	
    }
    public void setNumOfOptions(){
	System.out.println("Enter the number of options you want for this section");
	numOfOptions = numberReader.nextInt();
    }
    public void getOptions(){
	System.out.println(numOfOptions);
    }
    public String getScene(){
	return scene;
    }
    public boolean isCheckpoint(){
	return checkPoint;
    }
    public String setOption(int num){
    	}
    public void setCheckpoint(){}
    public static void main(String[] args){
	new Sections();
    }
    
}
    
