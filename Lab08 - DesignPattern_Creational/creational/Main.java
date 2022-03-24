package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Expected usage
        BookMetadataExporter exporter = new XMLBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);

        // new usage : Design pattern
        BookMetadataExporter newExporter;
        // Define type of exporter
        String exportType = "CSV";
        if (exportType.equals("CSV")){
            newExporter = new CSVBookMetadataExporter();
        }
        else if(exportType.equals("JSON")){
            newExporter = new JSONBookMetadataExporter();
        }
        else{
            newExporter = new XMLBookMetadataExporter();
        }

        newExporter.add(TestData.sailboatBook);
        newExporter.add(TestData.GoFBook);
        newExporter.export(System.out);
    }
}
