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

import android.view.View;
import android.view.animation.Animation;
import android.widget.SeekBar;

public class SeekbarAction {

    private Check check = new Check();
    private Colors colors = new Colors();

    private int progressSeekbar;

    public void actionShake(SeekBar seekBar,
                            final Animation animation,
                            final View view_1,
                            final View view_2,
                            final View view_3,
                            final View view_4,
                            final View view_5) {


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = progress / 25;
                progress = progress * 25;
                shakeReaction(progress,
                        animation,
                        view_1,
                        view_2,
                        view_3,
                        view_4,
                        view_5);

                setProgressSeekbar(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }

    private void shakeReaction(int value,
                               Animation animation,
                               View view_bad_small,
                               View view_unhappy_small,
                               View view_natural_small,
                               View view_satisfied_small,
                               View view_amazed_small) {

        check.reactionsAnimate(value,
                animation,
                view_bad_small,
                view_unhappy_small,
                view_natural_small,
                view_satisfied_small,
                view_amazed_small);

    }


    public void actionColored(SeekBar seekBar,
                              final Animation animation,
                              final View view_gray_1,
                              final View view_gray_2,
                              final View view_gray_3,
                              final View view_gray_4,
                              final View view_gray_5,
                              final View view_colored_1,
                              final View view_colored_2,
                              final View view_colored_3,
                              final View view_colored_4,
                              final View view_colored_5,
                              final View reaction_bad,
                              final View reaction_unhappy,
                              final View reaction_natural,
                              final View reaction_satisfied,
                              final View reaction_amazed) {


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = progress / 25;
                progress = progress * 25;
                coloredReaction(progress,
                        animation,
                        view_gray_1,
                        view_gray_2,
                        view_gray_3,
                        view_gray_4,
                        view_gray_5,
                        view_colored_1,
                        view_colored_2,
                        view_colored_3,
                        view_colored_4,
                        view_colored_5);

                check.reactionsAnimate(progress,
                        animation,
                        reaction_bad,
                        reaction_unhappy,
                        reaction_natural,
                        reaction_satisfied,
                        reaction_amazed);

                setProgressSeekbar(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void coloredReaction(int progress,
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

        colors.setColor(progress,
                animation,
                view_gray_1,
                view_gray_2,
                view_gray_3,
                view_gray_4,
                view_gray_5,
                view_colored_1,
                view_colored_2,
                view_colored_3,
                view_colored_4,
                view_colored_5);

    }


    public void actionProgress(SeekBar seekBar,
                              final Animation animation,
                              final View view_gray_1,
                              final View view_gray_2,
                              final View view_gray_3,
                              final View view_gray_4,
                              final View view_gray_5,
                              final View view_colored_1,
                              final View view_colored_2,
                              final View view_colored_3,
                              final View view_colored_4,
                              final View view_colored_5,
                              final View reaction_bad,
                              final View reaction_unhappy,
                              final View reaction_natural,
                              final View reaction_satisfied,
                              final View reaction_amazed) {


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = progress / 25;
                progress = progress * 25;
                coloredReaction(progress,
                        animation,
                        view_gray_1,
                        view_gray_2,
                        view_gray_3,
                        view_gray_4,
                        view_gray_5,
                        view_colored_1,
                        view_colored_2,
                        view_colored_3,
                        view_colored_4,
                        view_colored_5);

                check.reactionsProgress(progress,
                        animation,
                        seekBar,
                        reaction_bad,
                        reaction_unhappy,
                        reaction_natural,
                        reaction_satisfied,
                        reaction_amazed,
                        view_colored_1,
                        view_colored_2,
                        view_colored_3,
                        view_colored_4,
                        view_colored_5);

                setProgressSeekbar(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void reactionVisibility(SeekBar seekBar,
                                   final Animation animation,
                                   final View view_visibility_1,
                                   final View view_visibility_2,
                                   final View view_visibility_3,
                                   final View view_visibility_4,
                                   final View view_visibility_5){

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = progress / 25;
                progress = progress * 25;
                shakeReaction(progress,
                        animation,
                        view_visibility_1,
                        view_visibility_2,
                        view_visibility_3,
                        view_visibility_4,
                        view_visibility_5);

                check.ReactionVisibility(progress,
                        animation,
                        view_visibility_1,
                        view_visibility_2,
                        view_visibility_3,
                        view_visibility_4,
                        view_visibility_5);

                setProgressSeekbar(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public int getProgressSeekbar() {
        return progressSeekbar;
    }

    public void setProgressSeekbar(int progressSeekbar) {
        this.progressSeekbar = progressSeekbar;
    }


}
