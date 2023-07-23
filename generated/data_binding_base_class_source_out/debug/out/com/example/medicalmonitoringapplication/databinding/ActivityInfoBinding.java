// Generated by view binder compiler. Do not edit!
package com.example.medicalmonitoringapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medicalmonitoringapplication.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInfoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView group;

  @NonNull
  public final ConstraintLayout info;

  @NonNull
  public final CircleImageView profile;

  @NonNull
  public final CircleImageView profile2;

  @NonNull
  public final CircleImageView profile3;

  @NonNull
  public final CircleImageView profile4;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  private ActivityInfoBinding(@NonNull ConstraintLayout rootView, @NonNull TextView group,
      @NonNull ConstraintLayout info, @NonNull CircleImageView profile,
      @NonNull CircleImageView profile2, @NonNull CircleImageView profile3,
      @NonNull CircleImageView profile4, @NonNull TextView textView11, @NonNull TextView textView13,
      @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16,
      @NonNull TextView textView17, @NonNull TextView textView18) {
    this.rootView = rootView;
    this.group = group;
    this.info = info;
    this.profile = profile;
    this.profile2 = profile2;
    this.profile3 = profile3;
    this.profile4 = profile4;
    this.textView11 = textView11;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView16 = textView16;
    this.textView17 = textView17;
    this.textView18 = textView18;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.group;
      TextView group = ViewBindings.findChildViewById(rootView, id);
      if (group == null) {
        break missingId;
      }

      ConstraintLayout info = (ConstraintLayout) rootView;

      id = R.id.profile;
      CircleImageView profile = ViewBindings.findChildViewById(rootView, id);
      if (profile == null) {
        break missingId;
      }

      id = R.id.profile2;
      CircleImageView profile2 = ViewBindings.findChildViewById(rootView, id);
      if (profile2 == null) {
        break missingId;
      }

      id = R.id.profile3;
      CircleImageView profile3 = ViewBindings.findChildViewById(rootView, id);
      if (profile3 == null) {
        break missingId;
      }

      id = R.id.profile4;
      CircleImageView profile4 = ViewBindings.findChildViewById(rootView, id);
      if (profile4 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      return new ActivityInfoBinding((ConstraintLayout) rootView, group, info, profile, profile2,
          profile3, profile4, textView11, textView13, textView14, textView15, textView16,
          textView17, textView18);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
