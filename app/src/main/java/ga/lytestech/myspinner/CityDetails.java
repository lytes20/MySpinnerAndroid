package ga.lytestech.myspinner;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by gideon bamuleseyo on 6/24/17.
 */

public class CityDetails extends Activity {
    TextView myCityName, myCountryName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_details);
        myCityName = findViewById(R.id.tVCityName);
        myCountryName = findViewById(R.id.tVCountryName);
        String selectedCountry = getIntent().getStringExtra("COUNTRY");
        myCityName.setText(selectedCountry);
        switch (selectedCountry){
            case "Kampala":
                myCountryName.setText("Uganda");
                break;
            case "Nairobi":
                myCountryName.setText("Kenya"); break;
            case "Darelslam":
                myCountryName.setText("Tanzania"); break;
            case "Kigali":
                myCountryName.setText("Rwanda"); break;
            case "Bujumbura":
                myCountryName.setText("Burundi"); break;
            default: myCountryName.setText(""); break;
        }

    }
}
