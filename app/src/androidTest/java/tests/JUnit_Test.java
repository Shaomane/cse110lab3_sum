package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.noellin.lab3exercises.MainActivity;
import com.example.noellin.lab3exercises.R;

/**
 * Created by noellin on 4/15/16.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2 <MainActivity> {

    MainActivity mainActivity;
    public JUnit_Test(){
        super (MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.sum);

        int i = mainActivity.sum(1, 2);
        assertEquals (i, 3);

    }

}
