package at.fh.swengb.insurance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.insurance.model.Insurance;

public class ShowInsuranceActivity extends AppCompatActivity {

    private Insurance insurance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_insurance);

        Intent intent = getIntent();
        insurance = (Insurance)intent.getExtras().get("insurance");

        TextView viewPolicyholder = (TextView) findViewById(R.id.tV_policyholder);
        TextView viewAmount = (TextView) findViewById(R.id.tV_amount);
        TextView viewPeriodFrom = (TextView) findViewById(R.id.tV_periodFrom);
        TextView viewPeriodTo = (TextView) findViewById(R.id.tV_periodTo);

        viewPolicyholder.setText(insurance.getPolicyholder());
        viewAmount.setText("€ "+String.valueOf(insurance.getAmount()));
        viewPeriodFrom.setText(insurance.getPeriodFrom());
        viewPeriodTo.setText(insurance.getPeriodTo());

    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q=Kärntner Straße 442, 8054 Graz");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:01 23 45 67 89");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

}
