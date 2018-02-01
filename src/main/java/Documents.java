import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "documents")
@XmlAccessorType (XmlAccessType.FIELD)
public class Documents
{

    public Documents(List<Reader> documents) {
        this.documents = documents;
    }
    public Documents() {
        this.documents = new ArrayList<Reader>();
    }

    @XmlElement(name = "document")
    private List<Reader> documents = null;

    public List<Reader> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Reader> documents) {
        this.documents = documents;
    }
    public void addDocument(Reader doc) {
        this.documents.add(doc);
    }
}

