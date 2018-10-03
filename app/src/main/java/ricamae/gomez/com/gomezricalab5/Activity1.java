package ricamae.gomez.com.gomezricalab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId()==R.id.btnact2){
            i = new Intent(this, Activity2.class);
            startActivity(i);
        }else if(v.getId()==R.id.btnmap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.540949, 121.049784"));
            chooser = Intent.createChooser(i, "choose your app");
            startActivity(i);
        }
        /*else if(v.getId()==R.id.btnWeb){
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ust.edu.ph"));
            startActivity(i);
        }*/
    }
}
