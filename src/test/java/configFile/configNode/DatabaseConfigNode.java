package configFile.configNode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DatabaseConfigNode {

    @XmlElement(name="Port")
    public String Port;
    @XmlElement(name="DatabaseName")
    public String DatabaseName;
    @XmlElement(name="Username")
    public String Username;
    @XmlElement(name="Password")
    public String Password;
}
