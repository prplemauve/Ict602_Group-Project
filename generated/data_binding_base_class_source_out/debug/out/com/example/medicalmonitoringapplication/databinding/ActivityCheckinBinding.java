// Generated by view binder compiler. Do not edit!
package com.example.medicalmonitoringapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medicalmonitoringapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCheckinBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final EditText etAddress;

  @NonNull
  public final EditText etCoordinates;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etName;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView15;

  private ActivityCheckinBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSubmit,
      @NonNull EditText etAddress, @NonNull EditText etCoordinates, @NonNull EditText etEmail,
      @NonNull EditText etName, @NonNull TextView textView12, @NonNull TextView textView15) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.etAddress = etAddress;
    this.etCoordinates = etCoordinates;
    this.etEmail = etEmail;
    this.etName = etName;
    this.textView12 = textView12;
    this.textView15 = textView15;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCheckinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCheckinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_checkin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCheckinBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSubmit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.etAddress;
      EditText etAddress = ViewBindings.findChildViewById(rootView, id);
      if (etAddress == null) {
        break missingId;
      }

      id = R.id.etCoordinates;
      EditText etCoordinates = ViewBindings.findChildViewById(rootView, id);
      if (etCoordinates == null) {
        break missingId;
      }

      id = R.id.etEmail;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.etName;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      return new ActivityCheckinBinding((ConstraintLayout) rootView, btnSubmit, etAddress,
          etCoordinates, etEmail, etName, textView12, textView15);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}