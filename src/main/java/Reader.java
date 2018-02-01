import java.io.*;
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "add")
@XmlAccessorType(XmlAccessType.FIELD)

public class Reader {
	
	private Scanner file;
	private int contentI;
	private String contentT;
	private String contentB;
	private String contentA;
	private String contentN;
	private String contentX;
	
	
	public void loadFile(){
		try{
			file = new Scanner(new File("cacm.all"));
		}
		catch(Exception e){
			System.out.println("could not find file.");
		}
	}
		
	public void readFile(){
		while(file.hasNext()){
			if(file.equals(".I")){
				while(file.next()!=".T"){
					contentI = file.nextInt();
				}
			}if(file.equals(".T")){
				while(file.next()!=".B"){
					contentT = file.next();
				}
			}if(file.equals(".B")){
				while(file.next()!=".A"){
					contentB = file.next();
				}
			}if(file.equals(".A")){
				while(file.next()!=".N"){
					contentA = file.next();
				}
			}if(file.equals(".N")){
				while(file.next()!=".X"){
					contentN = file.next();
				}
			}if(file.equals(".X")){
				while(file.next()!=".I"){
					contentX = file.next();
				}
			}
		}
	}
		
		
	public void closeFile(){
		file.close();
	}

	public int getContentI() {
		return contentI;
	}

	public void setContentI(int contentI) {
		this.contentI = contentI;
	}

	public String getContentT() {
		return contentT;
	}

	public void setContentT(String contentT) {
		this.contentT = contentT;
	}

	public String getContentB() {
		return contentB;
	}

	public void setContentB(String contentB) {
		this.contentB = contentB;
	}

	public String getContentA() {
		return contentA;
	}

	public void setContentA(String contentA) {
		this.contentA = contentA;
	}

	public String getContentN() {
		return contentN;
	}

	public void setContentN(String contentN) {
		this.contentN = contentN;
	}

	public String getContentX() {
		return contentX;
	}

	public void setContentX(String contentX) {
		this.contentX = contentX;
	}
		

}
