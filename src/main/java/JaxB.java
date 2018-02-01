import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxB {
	
	public static void main(String[] args) throws JAXBException{
		
		Reader readfile = new Reader();
		readfile.loadFile();
		readfile.readFile();
		readfile.closeFile();
		
		Documents documents = new Documents();
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Documents.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        
        jaxbMarshaller.marshal(documents, System.out);
		
	}

}
