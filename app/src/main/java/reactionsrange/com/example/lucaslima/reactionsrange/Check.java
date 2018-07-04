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
import android.view.View;
import android.view.animation.Animation;
import android.widget.SeekBar;
import android.widget.TextView;

public class Check {

    private AnimationReactions reactions = new AnimationReactions();

    public void ReactionVisibility(int value,
                                   Animation animation,
                                   View view_1,
                                   View view_2,
                                   View view_3,
                                   View view_4,
                                   View view_5) {

        if (value < 20) {

            view_1.setVisibility(View.VISIBLE);
            reactions.shake_anim(animation, view_1,view_2,view_3,view_4,view_5);
            DisableReaction(view_2,
                    view_3,
                    view_4,
                    view_5);

        }
        if (value >= 20 && value < 40) {

            view_2.setVisibility(View.VISIBLE);
            reactions.shake_anim(animation, view_2,view_1,view_3,view_4,view_5);
            DisableReaction(view_1,
                    view_3,
                    view_4,
                    view_5);

        }
        if (value >= 40 && value < 60) {

            view_3.setVisibility(View.VISIBLE);
            reactions.shake_anim(animation, view_3,view_1,view_2,view_4,view_5);
            DisableReaction(view_1,
                    view_2,
                    view_4,
                    view_5);

        }
        if (value >= 60 && value < 80) {

            view_4.setVisibility(View.VISIBLE);
            reactions.shake_anim(animation, view_4,view_1,view_2,view_3,view_5);
            DisableReaction(view_1,
                    view_2,
                    view_3,
                    view_5);

        }
        if (value >= 80) {

            view_5.setVisibility(View.VISIBLE);
            reactions.shake_anim(animation, view_5,view_1,view_2,view_3,view_4);
            DisableReaction(view_1,
                    view_2,
                    view_3,
                    view_4);

        }
    }

    public void DisableReaction(View view_01,
                                View view_02,
                                View view_03,
                                View view_04) {

        view_01.setVisibility(View.INVISIBLE);
        view_02.setVisibility(View.INVISIBLE);
        view_03.setVisibility(View.INVISIBLE);
        view_04.setVisibility(View.INVISIBLE);

    }

    public void reactionsAnimate(int value,
                               Animation animation,
                               View view_1,
                               View view_2,
                               View view_3,
                               View view_4,
                               View view_5) {

        if (value < 20) {

            reactions.Shake(view_1, animation);
            BlockedReaction(view_2,
                    view_3,
                    view_4,
                    view_5);

        }
        if (value >= 20 && value < 40) {

            reactions.Shake(view_2, animation);
            BlockedReaction(view_1,
                    view_3,
                    view_4,
                    view_5);

        }
        if (value >= 40 && value < 60) {

            reactions.Shake(view_3, animation);
            BlockedReaction(view_1,
                    view_2,
                    view_4,
                    view_5);

        }
        if (value >= 60 && value < 80) {

            reactions.Shake(view_4, animation);
            BlockedReaction(view_1,
                    view_2,
                    view_3,
                    view_5);

        }
        if (value >= 80) {

            reactions.Shake(view_5, animation);
            BlockedReaction(view_1,
                    view_2,
                    view_3,
                    view_4);

        }
    }

    public void BlockedReaction(View view_01,
                                View view_02,
                                View view_03,
                                View view_04) {

        view_01.clearAnimation();
        view_02.clearAnimation();
        view_03.clearAnimation();
        view_04.clearAnimation();


    }

    public void reactionsProgress(int value,
                                  Animation animation,
                                  SeekBar seekBar,
                                  View view_1,
                                  View view_2,
                                  View view_3,
                                  View view_4,
                                  View view_5,
                                  View view_01,
                                  View view_02,
                                  View view_03,
                                  View view_04,
                                  View view_05){

        if (value < 20) {

            reactions.Shake(view_1, animation);
            blockedReactionProgress(view_2,
                    view_3,
                    view_4,
                    view_5,
                    view_02,
                    view_03,
                    view_04,
                    view_05);

            seekBar.getProgressDrawable().setColorFilter(
                    Color.rgb(192, 72, 72), android.graphics.PorterDuff.Mode.SRC_IN);

        }
        if (value >= 20 && value < 40) {

            reactions.Shake(view_2, animation);
            blockedReactionProgress(view_1,
                    view_3,
                    view_4,
                    view_5,
                    view_01,
                    view_03,
                    view_04,
                    view_05);

            seekBar.getProgressDrawable().setColorFilter(
                    Color.rgb(240, 152, 25), android.graphics.PorterDuff.Mode.SRC_IN);

        }
        if (value >= 40 && value < 60) {

            reactions.Shake(view_3, animation);
            blockedReactionProgress(view_1,
                    view_2,
                    view_4,
                    view_5,
                    view_01,
                    view_02,
                    view_04,
                    view_05);

            seekBar.getProgressDrawable().setColorFilter(
                    Color.rgb(255, 226, 89), android.graphics.PorterDuff.Mode.SRC_IN);

        }
        if (value >= 60 && value < 80) {

            reactions.Shake(view_4, animation);
            blockedReactionProgress(view_1,
                    view_2,
                    view_3,
                    view_5,
                    view_01,
                    view_02,
                    view_03,
                    view_05);

            seekBar.getProgressDrawable().setColorFilter(
                    Color.rgb(255, 252, 0), android.graphics.PorterDuff.Mode.SRC_IN);

        }
        if (value >= 80) {

            reactions.Shake(view_5, animation);
            blockedReactionProgress(view_1,
                    view_2,
                    view_3,
                    view_4,
                    view_01,
                    view_02,
                    view_03,
                    view_04);

            seekBar.getProgressDrawable().setColorFilter(
                    Color.rgb(56, 239, 125), android.graphics.PorterDuff.Mode.SRC_IN);

        }

    }

    public void blockedReactionProgress(View view_01,
                                        View view_02,
                                        View view_03,
                                        View view_04,
                                        View view_001,
                                        View view_002,
                                        View view_003,
                                        View view_004) {

        view_01.clearAnimation();
        view_02.clearAnimation();
        view_03.clearAnimation();
        view_04.clearAnimation();
        view_001.clearAnimation();
        view_002.clearAnimation();
        view_003.clearAnimation();
        view_004.clearAnimation();


    }

}
