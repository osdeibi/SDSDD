package test.Droidlogin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;



public class Archivopdf extends Activity implements OnClickListener{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        

        Uri uri = Uri.parse("http://192.168.1.119/droidlogin/manual.html");
		 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);

		 
        
    
		
		/**
		 * Set selected button if saved
		 */
	
		
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}