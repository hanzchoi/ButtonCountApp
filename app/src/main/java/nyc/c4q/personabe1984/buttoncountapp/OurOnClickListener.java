package nyc.c4q.personabe1984.buttoncountapp;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by Hans on 5/8/15.
 */
public class OurOnClickListener implements OnClickListener {

    MainActivity caller;
    private int count;

    public OurOnClickListener(MainActivity activity){
        this.caller = activity;
        this.count = 0;
    }

    public void onClick(View view){
        count++;
        String outputString ="The button got clicked " + count +  " time";
        if(count != 1) {
            outputString += "s";
        }
        caller.theTextView.setText(outputString);
    }
}
