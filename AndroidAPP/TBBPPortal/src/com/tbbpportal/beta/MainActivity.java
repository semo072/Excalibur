package com.tbbpportal.beta;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity {

	Intent i;
    TextView msg;
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
		
		msg = (TextView)findViewById(R.id.tv);
        i = getIntent();
        msg.setText(i.getStringExtra("message"));
		
		
		Button facebook = (Button) findViewById(R.id.facebook);
		facebook.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
			myWebLink.setData(Uri.parse("http://www.fb.com/teknikprogramlama"));
			startActivity(myWebLink);
		
			
		}
				
		});
		
		
		Button sulo = (Button) findViewById(R.id.sulo);
		sulo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent callintent = new Intent(Intent.ACTION_CALL);
				callintent.setData(Uri.parse("tel:05549703787"));
				startActivity(callintent);
			}
			}	);
		

		Button zeyno = (Button) findViewById(R.id.zeyno);
		zeyno.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent callintent = new Intent(Intent.ACTION_CALL);
				callintent.setData(Uri.parse("tel:05340694464"));
				startActivity(callintent);
			}
			}	);
		
		
		Button semo = (Button) findViewById(R.id.semo);
		semo.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent callintent = new Intent(Intent.ACTION_CALL);
				callintent.setData(Uri.parse("tel:05442852020"));
				startActivity(callintent);
			}
			}	);
		
		
		
		
		
		
		
		
		
		Button ekran2 = (Button) findViewById(R.id.ekran2);
		ekran2.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
			myWebLink.setData(Uri.parse("https://docs.google.com/document/d/1-sjag_Ti1vzoME_ei7aqrzEtQAAhgBR_KEHiet2vFII/edit?usp=sharing"));
			startActivity(myWebLink);
		}
			
	}
				);
		
	
	}
	
}
