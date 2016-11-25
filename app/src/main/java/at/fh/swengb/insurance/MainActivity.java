package at.fh.swengb.insurance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.insurance.model.Insurance;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    private List<Insurance> insurances;
    private ListView myListView;
    private CustomAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myInsurance);


        insurances = new ArrayList<>();
        insurances.add(new Insurance("Michi", 250, "1996-02-13" , "2016-12-31"));
        insurances.add(new Insurance("Nicki", 50, "1999-06-11" , "2016-12-31"));
        insurances.add(new Insurance("Niko", 100, "2008-10-03" , "2016-12-31"));
        insurances.add(new Insurance("Moritz", 25, "2002-05-01" , "2015-03-06"));
        insurances.add(new Insurance("Monika", 250, "2000-01-01" , "2016-12-31"));
        insurances.add(new Insurance("Gerald", 1250, "2000-01-01" , "2016-12-31"));

        myAdapter = new CustomAdapter(this,insurances);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Insurance selectedInsurance = insurances.get(i);
        Intent intent = new Intent(view.getContext(),ShowInsuranceActivity.class);
        intent.putExtra("insurance",selectedInsurance);
        startActivity(intent);

    }
}
