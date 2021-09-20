package com.sai.MovieBooking;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    private static String dataUrl = "https://ott-details.p.rapidapi.com/getnew?region=IN&page=1";
    private HttpResponse<String> resp;
    private List<ModelData> data = new ArrayList<ModelData>();

    public List<ModelData> getData() {
        return data;
    }

    @PostConstruct
    public void data() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(dataUrl))
                .header("x-rapidapi-host", "ott-details.p.rapidapi.com")
                .header("x-rapidapi-key", "2fc54cddc7mshb63d73edbef96c2p1f210ejsn132208265416")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
         resp = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        JSONObject obj = new JSONObject(resp.body());

        JSONArray array = obj.getJSONArray("results");

        for(int i=0;i<array.length();i++){
            JSONObject ob = array.getJSONObject(i);
            ModelData m = new ModelData();

            m.setImdbid((String)ob.get("imdbid"));
            m.setRuntime((String)ob.get("runtime"));
            m.setTitle((String)ob.get("title"));
            m.setReleased((int)ob.get("released"));
            data.add(m);
        }

    }

}
