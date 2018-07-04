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

public class Util {
    public static int toastTime(String str){
        if (str.length() <= 10){
            return 2000;
        } else {
            int roundedCount = 0;
            int mod = str.length() % 10;
            if (mod >= 5){
                roundedCount = str.length() + 10 - mod;
                return roundedCount*65;
            }
            else{
                roundedCount = str.length() - mod;
                return roundedCount*65;
            }
        }
    }
}