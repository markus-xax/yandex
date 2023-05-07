import com.yandex.mapkit.mapview.MapView;

public final class StyleCard {

    private static final String style =  "[" +
            "        {" +
            "            \"types\": \"polyline\"," +
            "            \"tags\": {" +
            "                \"all\": [" +
            "                    \"road\"" +
            "                ]" +
            "            }," +
            "            \"stylers\": {" +
            "                \"color\": \"#DADADA\"" +
            "            }" +
            "        }" +
            "    ]";

    private static final String styleLand =  "[" +
            "        {" +
            "            \"tags\": {" +
            "                \"all\": [" +
            "                    \"land\"" +
            "                ]" +
            "            }," +
            "            \"stylers\": {" +
            "                \"color\": \"#E6E7E8\"" +
            "            }" +
            "        }" +
            "    ]";

    public static void setMapStyle(MapView mapView){
        mapView.getMap().setMapStyle(style);
        //mapView.getMap().setLayerStyle(styleLand);
      /* 
      Ошибка имменно в этой строке. Мне нужно как то изменить цвет не только дорог, но и земли
      */
    }

}
