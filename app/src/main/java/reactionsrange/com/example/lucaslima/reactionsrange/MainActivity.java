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

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*View include_seekbar, view_bad, view_unhappy, view_natural, view_satisfied, view_amazed;
    SeekBar seekBar;
    TextView textView;
    Check check = new Check();
    Animation animation;*/


    View view_bad_small, view_unhappy_small, view_natural_small, view_satisfied_small, view_amazed_small;
    View include_bad_gray, include_unhappy_gray, include_natural_gray, include_satisfied_gray, include_amazed_gray;
    View include_bad_visibility, include_unhappy_visibility, include_natural_visibility, include_satisfied_visibility, include_amazed_visibility;
    ImageView bad_gray, unhappy_gray, natural_gray, satisfied_gray, amazed_gray, bad_color, unhappy_color, natural_color, satisfied_color, amazed_color;
    ImageView reaction_bad_img, reaction_unhappy_img, reaction_natural_img,reaction_satisfied_img, reaction_amazed_img;
    View include_seekbar_1, include_seekbar_2, include_seekbar_3, include_seekbar_4;
    SeekBar seekBar_1, seekBar_2, seekBar_3, seekBar_4;
    Animation shake,
            blink,
            bounce,
            fade_in,
            fade_out,
            move,
            rotate,
            sequential,
            slide_down,
            slide_up,
            zoom_in,
            zoom_out,
            flip,
            together,
            translate,
            grow_spin;
    Arrows arrows = new Arrows();
    ImageView arrow_down_1, arrow_up_1, arrow_down_2, arrow_up_2, arrow_down_3, arrow_up_3, arrow_down_4, arrow_up_4;
    SeekbarAction seekbarAction = new SeekbarAction();
    Check check = new Check();
    Button expand_button_1, expand_button_2, expand_button_3, expand_button_4;

    private String message;

    private int color;

    private int reaction;

    //private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        /*imageView = findViewById(R.id.imageview);
        final Animatable front = (Animatable) imageView.getDrawable();
        final Drawable backDrawable = null;


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null == backDrawable) {
                    front.start();
                } else {
                    if (null == imageView.getTag()) {
                        imageView.setImageDrawable((Drawable) front);
                        front.start();
                        imageView.setTag(0);
                    } else {
                        imageView.setImageDrawable(backDrawable);
                        ((Animatable) backDrawable).start();
                        imageView.setTag(null);
                    }
                }
            }
        });*/


        expandArrows();

        declarationViews();

        declarationAnim();

        seekbarShake();

        seekbarColored();

        seekbarProgress();

        seekbarVisibility();

        pressButton();

    }

    public void expandArrows() {

        arrow_down_1 = findViewById(R.id.arrow_down_1);
        arrow_up_1 = findViewById(R.id.arrow_up_1);
        final CardExpand expandableLayout_1 =  this.findViewById(R.id.expanded_layout_1);
        arrows.ActiveArrows(arrow_down_1, arrow_up_1, expandableLayout_1);

        arrow_down_2 = findViewById(R.id.arrow_down_2);
        arrow_up_2 = findViewById(R.id.arrow_up_2);
        final CardExpand expandableLayout_2 =  this.findViewById(R.id.expanded_layout_2);
        arrows.ActiveArrows(arrow_down_2, arrow_up_2, expandableLayout_2);

        arrow_down_3 = findViewById(R.id.arrow_down_3);
        arrow_up_3 = findViewById(R.id.arrow_up_3);
        final CardExpand expandableLayout_3 =  this.findViewById(R.id.expanded_layout_3);
        arrows.ActiveArrows(arrow_down_3, arrow_up_3, expandableLayout_3);

        arrow_down_4 = findViewById(R.id.arrow_down_4);
        arrow_up_4 = findViewById(R.id.arrow_up_4);
        final CardExpand expandableLayout_4 =  this.findViewById(R.id.expanded_layout_4);
        arrows.ActiveArrows(arrow_down_4, arrow_up_4, expandableLayout_4);

    }

    public void declarationViews() {

        //seekbarShake
        view_bad_small = findViewById(R.id.reaction_bad_small);
        view_unhappy_small = findViewById(R.id.reaction_unhappy_small);
        view_natural_small = findViewById(R.id.reaction_natural_small);
        view_satisfied_small = findViewById(R.id.reaction_satisfied_small);
        view_amazed_small = findViewById(R.id.reaction_amazed_small);

        //seekbarVisibility
        include_bad_visibility = findViewById(R.id.reaction_bad_visibility);
        include_unhappy_visibility = findViewById(R.id.reaction_unhappy_visibility);
        include_natural_visibility = findViewById(R.id.reaction_natural_visibility);
        include_satisfied_visibility = findViewById(R.id.reaction_satisfied_visibility);
        include_amazed_visibility = findViewById(R.id.reaction_amazed_visibility);

        //button
        expand_button_1 = findViewById(R.id.expand_button_1);
        expand_button_2 = findViewById(R.id.expand_button_2);
        expand_button_3 = findViewById(R.id.expand_button_3);
        expand_button_4 = findViewById(R.id.expand_button_4);

    }

    public void declarationAnim() {

        shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
        blink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_animation);
        fade_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_animation);
        fade_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out_animation);
        move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
        rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
        sequential = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential_animation);
        slide_down = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down_animation);
        slide_up = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up_animation);
        zoom_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_animation);
        zoom_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out_animation);
        flip = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.flip_animation);
        together = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together_animation);
        translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_animation);
        grow_spin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.grow_spin_animation);
    }

    public void seekbarShake() {

        include_seekbar_1 = findViewById(R.id.seekbar_1);
        seekBar_1 = include_seekbar_1.findViewById(R.id.seekBar_seek);

        seekbarAction.actionShake(seekBar_1,
                shake,
                view_bad_small,
                view_unhappy_small,
                view_natural_small,
                view_satisfied_small,
                view_amazed_small);
    }

    public void seekbarColored() {

        include_seekbar_2 = findViewById(R.id.seekbar_2);
        seekBar_2 = include_seekbar_2.findViewById(R.id.seekBar_seek);

        include_bad_gray = findViewById(R.id.reaction_bad_gray);
        bad_gray = include_bad_gray.findViewById(R.id.circle_bad_gray);
        bad_color = include_bad_gray.findViewById(R.id.circle_bad_color);
        reaction_bad_img = include_bad_gray.findViewById(R.id.bad_img);

        include_unhappy_gray = findViewById(R.id.reaction_unhappy_gray);
        unhappy_gray = include_unhappy_gray.findViewById(R.id.circle_unhappy_gray);
        unhappy_color = include_unhappy_gray.findViewById(R.id.circle_unhappy_color);
        reaction_unhappy_img = include_unhappy_gray.findViewById(R.id.unhappy_img);

        include_natural_gray = findViewById(R.id.reaction_natural_gray);
        natural_gray = include_natural_gray.findViewById(R.id.circle_natural_gray);
        natural_color = include_natural_gray.findViewById(R.id.circle_natural_color);
        reaction_natural_img = include_natural_gray.findViewById(R.id.natural_img);

        include_satisfied_gray = findViewById(R.id.reaction_satisfied_gray);
        satisfied_gray = include_satisfied_gray.findViewById(R.id.circle_satisfied_gray);
        satisfied_color = include_satisfied_gray.findViewById(R.id.circle_satisfied_color);
        reaction_satisfied_img = include_satisfied_gray.findViewById(R.id.satisfied_img);

        include_amazed_gray = findViewById(R.id.reaction_amazed_gray);
        amazed_gray = include_amazed_gray.findViewById(R.id.circle_amazed_gray);
        amazed_color = include_amazed_gray.findViewById(R.id.circle_amazed_color);
        reaction_amazed_img = include_amazed_gray.findViewById(R.id.amazed_img);

        seekbarAction.actionColored(seekBar_2,
                together,
                bad_gray,
                unhappy_gray,
                natural_gray,
                satisfied_gray,
                amazed_gray,
                bad_color,
                unhappy_color,
                natural_color,
                satisfied_color,
                amazed_color,
                reaction_bad_img,
                reaction_unhappy_img,
                reaction_natural_img,
                reaction_satisfied_img,
                reaction_amazed_img);

    }

    public void seekbarProgress(){


        include_seekbar_3 = findViewById(R.id.seekbar_3);
        seekBar_3 = include_seekbar_3.findViewById(R.id.seekBar_seek);

        include_bad_gray = findViewById(R.id.reaction_bad_gray_2);
        bad_gray = include_bad_gray.findViewById(R.id.circle_bad_gray);
        bad_color = include_bad_gray.findViewById(R.id.circle_bad_color);
        reaction_bad_img = include_bad_gray.findViewById(R.id.bad_img);

        include_unhappy_gray = findViewById(R.id.reaction_unhappy_gray_2);
        unhappy_gray = include_unhappy_gray.findViewById(R.id.circle_unhappy_gray);
        unhappy_color = include_unhappy_gray.findViewById(R.id.circle_unhappy_color);
        reaction_unhappy_img = include_unhappy_gray.findViewById(R.id.unhappy_img);

        include_natural_gray = findViewById(R.id.reaction_natural_gray_2);
        natural_gray = include_natural_gray.findViewById(R.id.circle_natural_gray);
        natural_color = include_natural_gray.findViewById(R.id.circle_natural_color);
        reaction_natural_img = include_natural_gray.findViewById(R.id.natural_img);

        include_satisfied_gray = findViewById(R.id.reaction_satisfied_gray_2);
        satisfied_gray = include_satisfied_gray.findViewById(R.id.circle_satisfied_gray);
        satisfied_color = include_satisfied_gray.findViewById(R.id.circle_satisfied_color);
        reaction_satisfied_img = include_satisfied_gray.findViewById(R.id.satisfied_img);

        include_amazed_gray = findViewById(R.id.reaction_amazed_gray_2);
        amazed_gray = include_amazed_gray.findViewById(R.id.circle_amazed_gray);
        amazed_color = include_amazed_gray.findViewById(R.id.circle_amazed_color);
        reaction_amazed_img = include_amazed_gray.findViewById(R.id.amazed_img);

        seekbarAction.actionProgress(seekBar_3,
                shake,
                bad_gray,
                unhappy_gray,
                natural_gray,
                satisfied_gray,
                amazed_gray,
                bad_color,
                unhappy_color,
                natural_color,
                satisfied_color,
                amazed_color,
                reaction_bad_img,
                reaction_unhappy_img,
                reaction_natural_img,
                reaction_satisfied_img,
                reaction_amazed_img);

    }

    public void seekbarVisibility(){

        include_seekbar_4 = findViewById(R.id.seekbar_4);
        seekBar_4 = include_seekbar_4.findViewById(R.id.seekBar_seek);

        seekbarAction.reactionVisibility(seekBar_4,
                shake,
                include_bad_visibility,
                include_unhappy_visibility,
                include_natural_visibility,
                include_satisfied_visibility,
                include_amazed_visibility);

    }

    public void pressButton(){

        expand_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMsg();
                ReactionsToast.customColorToast(MainActivity.this, getMessage(), Gravity.BOTTOM, ReactionsToast.LENGTH_SHORT, getColor(), getReaction());
            }
        });

        expand_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMsg();
                ReactionsToast.customColorToast(MainActivity.this, getMessage(), Gravity.BOTTOM, ReactionsToast.LENGTH_SHORT, getColor(), getReaction());
            }
        });

        expand_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMsg();
                ReactionsToast.customColorToast(MainActivity.this, getMessage(), Gravity.BOTTOM, ReactionsToast.LENGTH_SHORT, getColor(), getReaction());
            }
        });

        expand_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMsg();
                ReactionsToast.customColorToast(MainActivity.this, getMessage(), Gravity.BOTTOM, ReactionsToast.LENGTH_SHORT, getColor(), getReaction());
            }
        });

    }

    public void setMsg(){


        int progress = seekbarAction.getProgressSeekbar();

        if (progress < 20) {

            setMessage("Bad");
            setColor(R.color.bad);
            setReaction(R.drawable.bad);

        }
        if (progress >= 20 && progress < 40) {

            setMessage("Unhappy");
            setColor(R.color.unhappy);
            setReaction(R.drawable.unhappy);

        }
        if (progress >= 40 && progress < 60) {

            setMessage("Natural");
            setColor(R.color.natural);
            setReaction(R.drawable.natural);

        }
        if (progress >= 60 && progress < 80) {

            setMessage("Satisfied");
            setColor(R.color.satisfied);
            setReaction(R.drawable.satisfied);

        }
        if (progress >= 80) {

            setMessage("Amazed");
            setColor(R.color.amazed);
            setReaction(R.drawable.amazed);

        }

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

}
