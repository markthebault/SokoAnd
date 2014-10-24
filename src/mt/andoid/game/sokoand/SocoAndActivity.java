package mt.andoid.game.sokoand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SocoAndActivity extends Activity 
{
	public static String TAG_APP = "SOKO_LOG";
	public static String SAVES_FILE = "SaveSokoAnd";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		

		
		setContentView(new MenuPPView(this) ); 
		
		
		FileInputStream file = null;;
		try
		{
			file = openFileInput(SocoAndActivity.SAVES_FILE);
		} 
		catch (FileNotFoundException e)
		{
			
			
			try
			{
				FileOutputStream fos = openFileOutput(SocoAndActivity.SAVES_FILE, Context.MODE_PRIVATE);
				String mot = "Bonjour";
				fos.write(mot.getBytes());
				fos.close();
				file = openFileInput(SocoAndActivity.SAVES_FILE);
			} 
			catch (Exception e1)
			{
				Log.v(SocoAndActivity.TAG_APP, "error="+e);
			}
						
		}
		
		
		byte buff[] = new byte[255];
		
		try
		{
			file.read(buff);
			Log.v(SocoAndActivity.TAG_APP, "lis="+(new String(buff)) );
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			Log.v(SocoAndActivity.TAG_APP, "error read ="+e);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_menupp, menu);
		return true;
	}

	



} 