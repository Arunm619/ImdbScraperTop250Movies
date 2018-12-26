import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        String url = "https://www.imdb.com/chart/top";
        Document doc = Jsoup.connect(url).get();



        for (Element row : doc.select("table.chart.full-width tr")) {

            final String title = row.select(".titleColumn a").text();
            final String rating = row.select(".imdbRating").text();
            if(title!=null && rating !=null && rating.length()!=0)
            {
                Movie currMovie = new Movie(title,Double.parseDouble(rating));
                currMovie.print();
            }
        }
    }


}
