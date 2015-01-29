package test.Droidlogin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


/**
 * @author robert.hinds
 *
 */
public class SettingsActivity extends Activity implements OnClickListener{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        
        WebView myWebView = (WebView) this.findViewById(R.id.webView11);
        myWebView.loadUrl("http://192.168.1.119/droidlogin/pacientes/adduser.html");
        myWebView.setWebViewClient(new WebViewClient());
        
        
     // Enable JavaScript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        /**
         * set listener on update button
         */
        Button updateBtn = (Button) findViewById(R.id.nextBtn);
		updateBtn.setOnClickListener(this);
		
		/**
		 * Set selected button if saved
		 */
	
		
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}

	
