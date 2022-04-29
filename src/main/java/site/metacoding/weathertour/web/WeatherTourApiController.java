package site.metacoding.weathertour.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherTourApiController {

    // 공공데이터 받아오기 (json)
    @RequestMapping(value = "/api/data", method = RequestMethod.GET, produces = "application/json; charset=UTF8")
    public String weather() {
        StringBuilder sb = new StringBuilder();
        StringBuffer uri = new StringBuffer();
        uri.append("http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?");
        uri.append(
                "serviceKey=406lrJVRiqLfSp8HVHaLUY%2Bo3a%2F1DtuHUz%2Fs9waJGTnvPuodbdMnS9eCCmMQFvRJUakGRGcnSaYJtm27C8IcjQ%3D%3D&");
        uri.append("pageNo=1&");
        uri.append("numOfRows=10&");
        uri.append("dataType=JSON&");
        uri.append("CURRENT_DATE=2019122010&");
        uri.append("HOUR=24&");
        uri.append("COURSE_ID=1");

        try {
            URL url = new URL(uri.toString());
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));

            String returnLine;

            while ((returnLine = br.readLine()) != null) {
                sb.append(returnLine);
            }
            urlConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
