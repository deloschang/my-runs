package edu.dartmouth.cs.myruns2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import edu.dartmouth.cs.myruns2.R;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends Activity {

	public static final int REQUEST_CODE_TAKE_FROM_CAMERA = 0;
	public static final int REQUEST_CODE_SELECT_FROM_GALLERY = 1;
	public static final int REQUEST_CODE_CROP_PHOTO = 2;

	private static final String IMAGE_UNSPECIFIED = "image/*";
	private static final String URI_INSTANCE_STATE_KEY = "saved_uri";

	private Uri mImageCaptureUri;
	private ImageView mImageView;
	private boolean isTakenFromCamera;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		}

		// Load the previously saved profile if there is one
		loadProfile();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
	}

	// ****************** button click callbacks ***************************//

	public void onSaveClicked(View v) {
		// Save profile
		saveProifle();
		// Making a "toast" informing the user the profile is saved.
		Toast.makeText(getApplicationContext(),
				getString(R.string.ui_profile_toast_save_text),
				Toast.LENGTH_SHORT).show();
		// Close the activity
		finish();
	}

	public void onCancelClicked(View v) {
		// Making a "toast" informing the user changes are canceled.
		Toast.makeText(getApplicationContext(),
				getString(R.string.ui_profile_toast_cancel_text),
				Toast.LENGTH_SHORT).show();
		// Close the activity
		finish();
	}

	public void onChangePhotoClicked(View v) {
		// changing the profile image, show the dialog asking the user
		// to choose between taking a picture and picking from gallery
		// Go to MyRunsDialogFragment for details.
	
	}

	// Handle data after activity returns.
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
	}

	// ******* Photo picker dialog related functions ************//

	public void displayDialog(int id) {
		DialogFragment fragment = MyRunsDialogFragment.newInstance(id);
		fragment.show(getFragmentManager(),
				getString(R.string.dialog_fragment_tag_photo_picker));
	}

	public void onPhotoPickerItemSelected(int item) {
		Intent intent;

		switch (item) {

	}

	// ****************** private helper functions ***************************//

	private void loadProfile() {

	}

	private void saveProifle() {

	
	}

	// Crop and resize the image for profile
	private void cropImage() {
		// Use existing crop activity.
	}

}