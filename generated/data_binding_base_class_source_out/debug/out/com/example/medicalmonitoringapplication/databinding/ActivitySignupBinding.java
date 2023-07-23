// Generated by view binder compiler. Do not edit!
package com.example.medicalmonitoringapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medicalmonitoringapplication.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText contactno;

  @NonNull
  public final TextInputEditText cpasswd;

  @NonNull
  public final TextInputEditText fname;

  @NonNull
  public final TextInputEditText passwd;

  @NonNull
  public final RadioButton radioButton;

  @NonNull
  public final RadioButton radioButton2;

  @NonNull
  public final Button regs;

  @NonNull
  public final TextInputEditText uemail;

  private ActivitySignupBinding(@NonNull LinearLayout rootView,
      @NonNull TextInputEditText contactno, @NonNull TextInputEditText cpasswd,
      @NonNull TextInputEditText fname, @NonNull TextInputEditText passwd,
      @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull Button regs,
      @NonNull TextInputEditText uemail) {
    this.rootView = rootView;
    this.contactno = contactno;
    this.cpasswd = cpasswd;
    this.fname = fname;
    this.passwd = passwd;
    this.radioButton = radioButton;
    this.radioButton2 = radioButton2;
    this.regs = regs;
    this.uemail = uemail;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contactno;
      TextInputEditText contactno = ViewBindings.findChildViewById(rootView, id);
      if (contactno == null) {
        break missingId;
      }

      id = R.id.cpasswd;
      TextInputEditText cpasswd = ViewBindings.findChildViewById(rootView, id);
      if (cpasswd == null) {
        break missingId;
      }

      id = R.id.fname;
      TextInputEditText fname = ViewBindings.findChildViewById(rootView, id);
      if (fname == null) {
        break missingId;
      }

      id = R.id.passwd;
      TextInputEditText passwd = ViewBindings.findChildViewById(rootView, id);
      if (passwd == null) {
        break missingId;
      }

      id = R.id.radioButton;
      RadioButton radioButton = ViewBindings.findChildViewById(rootView, id);
      if (radioButton == null) {
        break missingId;
      }

      id = R.id.radioButton2;
      RadioButton radioButton2 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton2 == null) {
        break missingId;
      }

      id = R.id.regs;
      Button regs = ViewBindings.findChildViewById(rootView, id);
      if (regs == null) {
        break missingId;
      }

      id = R.id.uemail;
      TextInputEditText uemail = ViewBindings.findChildViewById(rootView, id);
      if (uemail == null) {
        break missingId;
      }

      return new ActivitySignupBinding((LinearLayout) rootView, contactno, cpasswd, fname, passwd,
          radioButton, radioButton2, regs, uemail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
