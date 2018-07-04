package reactionsrange.com.example.lucaslima.reactionsrange;
//        Copyright 2018 Lucas Lima
//
//        Licensed under the Apache License, Version 2.0 (the "License");
//        you may not use this file except in compliance with the License.
//        You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//        Unless required by applicable law or agreed to in writing, software
//        distributed under the License is distributed on an "AS IS" BASIS,
//        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//        See the License for the specific language governing permissions and
//        limitations under the License.
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class ReactionsToast {
    public static final int LENGTH_LONG = 4000, LENGTH_SHORT = 2000, LENGTH_AUTO = 1000;

    /**
     * Error type toast.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     */
    public static void errorToast(final Activity activity, String message, final int gravity, int duration){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_error_toast, null));

        ((TextView)view.findViewById(R.id.txtErrorToast)).setText(message);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    /**
     * Warning type toast.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     */
    public static void warningToast(final Activity activity, String message, final int gravity, int duration){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_warning_toast, null));

        ((TextView)view.findViewById(R.id.txtWarningToast)).setText(message);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    /**
     * Info type toast.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     */
    public static void infoToast(final Activity activity, String message, final int gravity, int duration){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_info_toast, null));

        ((TextView)view.findViewById(R.id.txtInfoToast)).setText(message);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    /**
     * Success type toast.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     */
    public static void successToast(final Activity activity, String message, final int gravity, int duration){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_success_toast, null));

        ((TextView)view.findViewById(R.id.txtSuccessToast)).setText(message);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    /**
     * Normal type toast.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     */
    public static void normalToast(final Activity activity, String message, final int gravity, int duration){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_normal_toast, null));

        ((TextView)view.findViewById(R.id.txtNormalToast)).setText(message);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    /**
     * Normal type toast with icon.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     * @param icon
     */
    public static void normalToast(final Activity activity, String message, final int gravity, int duration, @DrawableRes int icon){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_normal_toast, null));

        ((TextView)view.findViewById(R.id.txtNormalToast)).setText(message);
        view.findViewById(R.id.normalToastImg).setVisibility(View.VISIBLE);
        ((AppCompatImageView)view.findViewById(R.id.normalToastImg)).setImageResource(icon);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    /**
     * Custom toast background color.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     * @param toastColor
     */
    public static void customColorToast(final Activity activity, String message, final int gravity, int duration, @ColorRes int toastColor){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_custom_toast, null));

        ((TextView)view.findViewById(R.id.txtCustomToast)).setText(message);

        Drawable customBackground = view.getResources().getDrawable(R.drawable.background_custom_toast);
        customBackground.setColorFilter(ContextCompat.getColor(view.getContext(), toastColor), PorterDuff.Mode.ADD);

        view.findViewById(R.id.customToastLyt).setBackground(customBackground);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    /**
     * Custom toast background color and icon.
     * @param activity
     * @param message
     * @param gravity
     * @param duration
     * @param toastColor
     * @param icon
     */
    public static void customColorToast(final Activity activity, String message, final int gravity, int duration, @ColorRes int toastColor, @DrawableRes int icon){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_custom_toast, null));

        ((TextView)view.findViewById(R.id.txtCustomToast)).setText(message);

        Drawable customBackground = view.getResources().getDrawable(R.drawable.background_custom_toast);
        customBackground.setColorFilter(ContextCompat.getColor(view.getContext(), toastColor), PorterDuff.Mode.ADD);

        view.findViewById(R.id.customToastLyt).setBackground(customBackground);

        view.findViewById(R.id.customToastImg).setVisibility(View.VISIBLE);
        ((AppCompatImageView)view.findViewById(R.id.customToastImg)).setImageResource(icon);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }

    public static void customBackgroudToast(final Activity activity, String message, final int gravity, int duration, @DrawableRes int toastBackground, @Nullable @ColorRes Integer textColor){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_custom_toast, null));

        ((TextView)view.findViewById(R.id.txtCustomToast)).setText(message);

        if (textColor != null){
            ((TextView)view.findViewById(R.id.txtCustomToast)).setTextColor(ContextCompat.getColor(view.getContext(), textColor));
        }

        view.findViewById(R.id.customToastLyt).setBackground(view.getResources().getDrawable(toastBackground));

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }


    public static void customBackgroudToast(final Activity activity, String message, final int gravity, int duration, @DrawableRes int toastBackground, @Nullable @ColorRes Integer textColor, @DrawableRes int icon){
        final View view = (activity.getLayoutInflater().inflate(R.layout.layout_custom_toast, null));

        ((TextView)view.findViewById(R.id.txtCustomToast)).setText(message);

        if (textColor != null){
            ((TextView)view.findViewById(R.id.txtCustomToast)).setTextColor(ContextCompat.getColor(view.getContext(), textColor));
        }

        view.findViewById(R.id.customToastLyt).setBackground(view.getResources().getDrawable(toastBackground));

        view.findViewById(R.id.customToastImg).setVisibility(View.VISIBLE);
        ((ImageView) view.findViewById(R.id.customToastImg)).setImageResource(icon);

        if (duration == LENGTH_AUTO){
            duration = Util.toastTime(message);
        }

        new CountDownTimer(Math.max(duration+1000, 1000), 2000){
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long millisUntilFinished) {
                Toast toast = new Toast(activity);
                toast.setGravity(gravity, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(view);
                toast.show();
            }
        }.start();
    }
}