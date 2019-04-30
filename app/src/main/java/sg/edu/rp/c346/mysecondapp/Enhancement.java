package sg.edu.rp.c346.mysecondapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Enhancement extends AppCompatActivity {

    private Spinner spinner, statSpinner;
    private ArrayList<String> hseArray = new ArrayList<>();
    private ArrayList<String> statusArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhancement);

        spinner = findViewById(R.id.spinner);
        statSpinner = findViewById(R.id.spinnerMarital);

        addToArray();

        ArrayAdapter hseAdapter = new ArrayAdapter(Enhancement.this, android.R.layout.simple_spinner_dropdown_item, hseArray);
        spinner.setAdapter(hseAdapter);

        ArrayAdapter statAdapter = new ArrayAdapter(Enhancement.this, android.R.layout.simple_spinner_dropdown_item, statusArray);
        statSpinner.setAdapter(statAdapter);

    }

    public void addToArray() {
        hseArray.add("Bungalow");
        hseArray.add("Duplex House");
        hseArray.add("Condo");
        hseArray.add("Mansion");
        hseArray.add("Cottage");

        statusArray.add("Married");
        statusArray.add("Widowed");
        statusArray.add("Single");

    }
}
