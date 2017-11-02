package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
//the import should be delete, because it is not be used
//import com.robotium.solo.Solo;

public class EditTweetActivity extends Activity {
    // change EditText into private, because it is an attribute for for the function
    private EditText fromist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

       fromist = (EditText) findViewById(R.id.ename);
        String input = getIntent().getStringExtra("input");
        fromist.setText(input);
    }

}
