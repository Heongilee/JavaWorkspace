package p01;

import java.io.*;
import java.net.*;

// https://black-whisker.tistory.com/29 참고

public class Main {
    public static String solution(String _pageNo, String _numOfRows, String _type, String _startCreateDt,
            String _endCreateDt) {
        String urlPrefix = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson?serviceKey=53%2BVGqHRUDSOrCV%2FwXCt%2BxN5qubVlN5yNl%2BgDtEt%2B7uyT%2FKCBB07j0iiZPsXlQvI4zEOUgA7JoCJXmE3Y2AvSw%3D%3D";
        String pageNo = "&pageNo=" + _pageNo;
        String numOfRows = "&numOfRows=" + _numOfRows;
        String type = "&_type=" + _type;
        String startCreateDt = "&startCreateDt=" + _startCreateDt;
        String endCreateDt = "&endCreateDt" + _endCreateDt;

        String url = urlPrefix + pageNo + numOfRows + type + startCreateDt + endCreateDt;
        try {
            URL urlObject = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObject.openConnection();

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }
    public static void main(String[] args) {
        String res;
        res = solution("1", "10", "json", "20200120", "20200122");

    }
}