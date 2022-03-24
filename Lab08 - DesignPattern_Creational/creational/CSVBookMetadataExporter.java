package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    BookMetadataFormatter formatter = null;

    @Override
    public BookMetadataFormatter createFormatter(){
        try {
            formatter = new CSVBookMetadataFormatter();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return formatter;
    }
}
