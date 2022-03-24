package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonObject;

    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        this.jsonObject = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject jsonFormatter = new JSONObject();
        jsonFormatter.put(Book.Metadata.ISBN.value,b.getISBN());

        JSONArray jsonAuthors =new JSONArray();
        for(String author:b.getAuthors()){
            jsonAuthors.add(author);
        }

        jsonFormatter.put(Book.Metadata.AUTHORS.value,jsonAuthors);
        jsonFormatter.put(Book.Metadata.TITLE.value,b.getTitle());
        jsonFormatter.put(Book.Metadata.PUBLISHER.value,b.getPublisher());

        this.jsonObject.add(jsonFormatter);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject jsonMetadata = new JSONObject();
        jsonMetadata.put("Book",jsonObject);
        return jsonMetadata.toString();
    }
}
