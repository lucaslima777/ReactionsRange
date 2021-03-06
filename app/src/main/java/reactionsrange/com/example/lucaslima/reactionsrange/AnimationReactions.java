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

public class AnimationReactions {

    public void Shake(View view , Animation animation){
        view.startAnimation(animation);
    }

    public void blink(View view , Animation animation){
        view.startAnimation(animation);
    }

    public void shake_anim(Animation animation, View view , View view_2 , View view_3 ,View view_4 , View view_5){

        view.startAnimation(animation);
        view_2.clearAnimation();
        view_3.clearAnimation();
        view_4.clearAnimation();
        view_5.clearAnimation();
    }

}
