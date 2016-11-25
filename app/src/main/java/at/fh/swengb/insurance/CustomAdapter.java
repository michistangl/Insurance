package at.fh.swengb.insurance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.insurance.model.Insurance;

/**
 * Created by Michaela on 24.11.2016.
 */

public class CustomAdapter extends BaseAdapter {

    List<Insurance> insurances;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Insurance> insurances) {
        this.context = applicationContext;
        this.insurances= insurances;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return insurances.size();
    }

    @Override
    public Object getItem(int i) {
        return insurances.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewPolicyholder=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAmount=(TextView)view.findViewById(R.id.textViewListAmount);
        TextView viewPeriodFrom=(TextView)view.findViewById(R.id.textViewListPeriodFrom);
        TextView viewPeriodTo=(TextView)view.findViewById(R.id.textViewListPeriodTo);

        Insurance insurance = insurances.get(i);
        viewPolicyholder.setText(insurance.getPolicyholder());
        viewAmount.setText("€ "+String.valueOf(insurance.getAmount()));
        viewPeriodFrom.setText(insurance.getPeriodFrom());
        viewPeriodTo.setText(insurance.getPeriodTo());

        return view;
    }
}
