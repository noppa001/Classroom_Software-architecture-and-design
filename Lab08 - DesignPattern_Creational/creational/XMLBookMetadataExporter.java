package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    BookMetadataFormatter formatter = null;

    @Override
    public BookMetadataFormatter createFormatter(){
        try {
            formatter = new XMLBookMetadataFormatter();
        }
        catch (ParserConfigurationException e){
            e.printStackTrace();
        }

        return formatter;
    }
}
