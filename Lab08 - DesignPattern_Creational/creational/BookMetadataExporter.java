package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public abstract BookMetadataFormatter createFormatter();

    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.

        BookMetadataFormatter formatter = createFormatter();
        for(Book book : books){
            formatter.append(book);
        }

        stream.print(formatter.getMetadataString());
    }
}
