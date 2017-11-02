package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListView;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }
//       public void testStart() throws Exception{
// delete testStart() because  activity is never be used
//        Activity activity = getActivity();
//    }

    public void testTweet(){
        solo.assertCurrentActivity("Wrong activity", LonelyTwitterActivity.class);
        solo.enterText((EditText)solo.getView(R.id.body),"Test Tweet");
        solo. clickOnButton("Save");
        solo.enterText((EditText) solo.getView(R.id.body),"");

        assertTrue(solo.waitForText("Test Tweet"));

        solo.clickOnButton("Clear");
    }

    public void testClickTweetList(){
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body),"Test Tweet");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);
    }

    public void testClickListView(){
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body),"Test Tweet");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);
        assertTrue(solo.waitForText("Test Tweet"));
    }


    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }


}