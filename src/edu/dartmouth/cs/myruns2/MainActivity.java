/**
 * ActivityMainPortal.java
 * 
 * Created by Xiaochao Yang on Dec 9, 2011 10:16:59 PM
 * 
 */

package edu.dartmouth.cs.myruns2;

import edu.dartmouth.cs.myruns2.R;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


// The main activity of the application. 
// Three tab fragments reside in this activity.
public class MainActivity extends Activity {

	private static final String TAB_INDEX_KEY = "tab_index";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
	
	}

	// Pretty standard stuff for TabListener.
	public static class TabListener<T extends Fragment> implements
			ActionBar.TabListener {
		private Fragment mFragment;
		private final Activity mActivity;
		private final String mTag;
		private final Class<T> mClass;

		/**
		 * Constructor used each time a new tab is created.
		 * 
		 * @param activity
		 *            The host Activity, used to instantiate the fragment
		 * @param tag
		 *            The identifier tag for the fragment
		 * @param clz
		 *            The fragment's Class, used to instantiate the fragment
		 */
		public TabListener(Activity activity, String tag, Class<T> clz) {
			mActivity = activity;
			mTag = tag;
			mClass = clz;

				}
		}

		/* The following are each of the ActionBar.TabListener callbacks */
		public void onTabSelected(Tab tab, FragmentTransaction ft) {

		}

		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	
		}

		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// User selected the already selected tab. Usually do nothing.
		}
	}

}
