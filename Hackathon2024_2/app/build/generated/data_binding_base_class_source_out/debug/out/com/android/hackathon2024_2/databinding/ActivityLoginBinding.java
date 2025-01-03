// Generated by view binder compiler. Do not edit!
package com.android.hackathon2024_2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.hackathon2024_2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView btnSignUp;

  @NonNull
  public final EditText etId;

  @NonNull
  public final EditText etPw;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imgUnderline;

  @NonNull
  public final AppCompatButton loginNextBtn;

  @NonNull
  public final TextView loginTitle;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvId;

  @NonNull
  public final TextView tvPw;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull TextView btnSignUp,
      @NonNull EditText etId, @NonNull EditText etPw, @NonNull ImageView imageView,
      @NonNull ImageView imgUnderline, @NonNull AppCompatButton loginNextBtn,
      @NonNull TextView loginTitle, @NonNull ConstraintLayout main, @NonNull TextView textView,
      @NonNull TextView tvId, @NonNull TextView tvPw) {
    this.rootView = rootView;
    this.btnSignUp = btnSignUp;
    this.etId = etId;
    this.etPw = etPw;
    this.imageView = imageView;
    this.imgUnderline = imgUnderline;
    this.loginNextBtn = loginNextBtn;
    this.loginTitle = loginTitle;
    this.main = main;
    this.textView = textView;
    this.tvId = tvId;
    this.tvPw = tvPw;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_sign_up;
      TextView btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.et_id;
      EditText etId = ViewBindings.findChildViewById(rootView, id);
      if (etId == null) {
        break missingId;
      }

      id = R.id.et_pw;
      EditText etPw = ViewBindings.findChildViewById(rootView, id);
      if (etPw == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.img_underline;
      ImageView imgUnderline = ViewBindings.findChildViewById(rootView, id);
      if (imgUnderline == null) {
        break missingId;
      }

      id = R.id.login_next_btn;
      AppCompatButton loginNextBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginNextBtn == null) {
        break missingId;
      }

      id = R.id.login_title;
      TextView loginTitle = ViewBindings.findChildViewById(rootView, id);
      if (loginTitle == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tv_id;
      TextView tvId = ViewBindings.findChildViewById(rootView, id);
      if (tvId == null) {
        break missingId;
      }

      id = R.id.tv_pw;
      TextView tvPw = ViewBindings.findChildViewById(rootView, id);
      if (tvPw == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnSignUp, etId, etPw, imageView,
          imgUnderline, loginNextBtn, loginTitle, main, textView, tvId, tvPw);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
