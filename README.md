# CountUpTimer-java-android
this is reverse version of `CountDownTimer` from `android.os` package.

this class simply provides a functionality to count step by step with a fixed delay on each step from a defined start to a defined end.

## Installation
Easy as pie, just download `CountUp.java` file and place it in your project source.

## Usage
#### Get Object
use `getInstance` function to get a CountUp object.

#### Parameters
1. `startValue` =>  represent the minimum value of counter, that is start value.
2. `endValue` =>  represent the maximum value of counter, that is end value.
3. `eachStepValue`  =>  represent the steps length, for example if start is 10 and step is 0.2, first value is 10 and second is 10.2 and third is 10.4.
4. `presion`  =>  represent accuracy of increment, in simple words you should specify how many digits after point are in use. for example if you want to count numbers                      with 5 digits after point you should set presion to 5.
5. `stepDelay`  =>  represent the value of rest between each counting, it's an interval time in milliseconds. 

#### Sample
Sample usage of this class is as below:
![](resources/usage2.PNG?raw=true)
