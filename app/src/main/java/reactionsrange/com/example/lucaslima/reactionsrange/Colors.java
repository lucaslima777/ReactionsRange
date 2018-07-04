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

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import android.view.animation.Animation;
import android.widget.SeekBar;

public class Colors {

    private AnimationReactions reactions = new AnimationReactions();


    public void setColor(int value,
                         Animation animation,
                         final View view_gray_1,
                         final View view_gray_2,
                         final View view_gray_3,
                         final View view_gray_4,
                         final View view_gray_5,
                         final View view_colored_1,
                         final View view_colored_2,
                         final View view_colored_3,
                         final View view_colored_4,
                         final View view_colored_5) {

        if (value < 20) {

            view_gray_1.setVisibility(View.INVISIBLE);
            view_colored_1.setVisibility(View.VISIBLE);
            reactions.blink(view_colored_1, animation);
            notColor(view_gray_2,
                    view_gray_3,
                    view_gray_4,
                    view_gray_5,
                    view_colored_2,
                    view_colored_3,
                    view_colored_4,
                    view_colored_5);

        }
        if (value >= 20 && value < 40) {

            view_gray_2.setVisibility(View.INVISIBLE);
            view_colored_2.setVisibility(View.VISIBLE);
            reactions.blink(view_colored_2, animation);
            notColor(view_gray_1,
                    view_gray_3,
                    view_gray_4,
                    view_gray_5,
                    view_colored_1,
                    view_colored_3,
                    view_colored_4,
                    view_colored_5);

        }
        if (value >= 40 && value < 60) {

            view_gray_3.setVisibility(View.INVISIBLE);
            view_colored_3.setVisibility(View.VISIBLE);
            reactions.blink(view_colored_3, animation);
            notColor(view_gray_1,
                    view_gray_2,
                    view_gray_4,
                    view_gray_5,
                    view_colored_1,
                    view_colored_2,
                    view_colored_4,
                    view_colored_5);

        }
        if (value >= 60 && value < 80) {

            view_gray_4.setVisibility(View.INVISIBLE);
            view_colored_4.setVisibility(View.VISIBLE);
            reactions.blink(view_colored_4, animation);
            notColor(view_gray_1,
                    view_gray_2,
                    view_gray_3,
                    view_gray_5,
                    view_colored_1,
                    view_colored_2,
                    view_colored_3,
                    view_colored_5);

        }
        if (value >= 80) {

            view_gray_5.setVisibility(View.INVISIBLE);
            view_colored_5.setVisibility(View.VISIBLE);
            reactions.blink(view_colored_5, animation);
            notColor(view_gray_1,
                    view_gray_2,
                    view_gray_3,
                    view_gray_4,
                    view_colored_1,
                    view_colored_2,
                    view_colored_3,
                    view_colored_4);

        }

    }

    public void notColor(View view_gray_01,
                         View view_gray_02,
                         View view_gray_03,
                         View view_gray_04,
                         View view_colored_01,
                         View view_colored_02,
                         View view_colored_03,
                         View view_colored_04) {

        view_gray_01.setVisibility(View.VISIBLE);
        view_gray_02.setVisibility(View.VISIBLE);
        view_gray_03.setVisibility(View.VISIBLE);
        view_gray_04.setVisibility(View.VISIBLE);

        view_colored_01.setVisibility(View.INVISIBLE);
        view_colored_02.setVisibility(View.INVISIBLE);
        view_colored_03.setVisibility(View.INVISIBLE);
        view_colored_04.setVisibility(View.INVISIBLE);


    }


}
