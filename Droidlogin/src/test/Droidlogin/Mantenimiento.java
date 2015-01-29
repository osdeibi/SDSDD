package test.Droidlogin;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Mantenimiento extends Activity implements OnClickListener{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantenimiento);
        
        WebView myWebView = (WebView) this.findViewById(R.id.webView3);
        myWebView.loadUrl("http://192.168.1.119/droidlogin/pacientes/mantenimiento.php");
        myWebView.setWebViewClient(new WebViewClient());
        
        // Enable JavaScript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        myWebView.getSettings().setBuiltInZoomControls(true);
     
        /**
         * abrir webs
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