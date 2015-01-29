package test.Droidlogin;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;



public class Comenzar extends Activity implements OnClickListener{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comenzar);
        
        WebView myWebView = (WebView) this.findViewById(R.id.webView2);
        myWebView.loadUrl("http://192.168.1.119/droidlogin/QUIZZ/Index.php");
        
     // Enable JavaScript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        /**
         * set listener on update button
         */
    
		
		/**
		 * Set selected button if saved
		 */
	
		
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}