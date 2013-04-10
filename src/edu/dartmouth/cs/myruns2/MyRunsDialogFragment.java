package edu.dartmouth.cs.myruns2;

import edu.dartmouth.cs.myruns2.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

// Handling all the customized dialog boxes in our project.
// Differentiated by dialog id.
public class MyRunsDialogFragment extends DialogFragment {

	// Different dialog IDs
	public static final int DIALOG_ID_ERROR = -1;
	public static final int DIALOG_ID_PHOTO_PICKER = 1;

	// For photo picker selection:
	public static final int ID_PHOTO_PICKER_FROM_CAMERA = 0;
	public static final int ID_PHOTO_PICKER_FROM_GALLERY = 1;

	private static final String DIALOG_ID_KEY = "dialog_id";

	public static MyRunsDialogFragment newInstance(int dialog_id) {

	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
	
}
