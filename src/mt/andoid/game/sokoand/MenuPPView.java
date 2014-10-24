package mt.andoid.game.sokoand;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


 
public class MenuPPView extends LinearLayout implements OnClickListener
{
	private Activity activity;
	
	
	/********************************************************/
	/*					CONSTRUCTORS						*/
	/********************************************************/
	public MenuPPView(Activity activity)
	{
		super(activity);
		
		this.activity = activity;
		
		this.loadSheme(activity, R.layout.layout_menupp);
		
	}
	
	public MenuPPView(Activity activity, AttributeSet attrs)
	{
		super(activity, attrs);
		
		this.activity = activity;
		
		this.loadSheme(activity, R.layout.layout_menupp);
		
		
		
	}
	
	
	
	/********************************************************/
	/*					PUBLIC METHODS						*/
	/********************************************************/
	@Override
	public void onClick(View sender)
	{
		if(sender.getId() == R.id.b_newgame)
		{
			Toast.makeText(this.getContext(), "NewGame", Toast.LENGTH_SHORT).show();
			
			
			this.activity.setContentView(R.layout.layout_newgame);
		}
		
	}
	
	
	
	
	
	
	
	/********************************************************/
	/*					PRIVATE METHODS						*/
	/********************************************************/
	private void loadSheme(Context ctx, int idScheme)
	{
		LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(idScheme, null, false);
		this.addView(v);
		
		((Button)findViewById(R.id.b_newgame)).setOnClickListener(this);

	}



}
