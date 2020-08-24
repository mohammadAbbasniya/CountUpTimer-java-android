import android.os.CountDownTimer;

public class CountUp extends CountDownTimer {
    public interface OnTickListener {
        void onTick(double currentVal);
    }

    public interface OnFinishListener {
        void onFinish(double endValue);
    }

    OnTickListener onTickListener;
    OnFinishListener onFinishListener;

    private double currentValue;
    private int precision;
    private double endValue;
    private double eachStepValue;

    public static CountUp getInstance(double startValue, double endValue, double eachStepValue, int precision, long stepDelay) {
        return new CountUp((long) ((endValue - startValue) / eachStepValue) * stepDelay + stepDelay, stepDelay, startValue, endValue, eachStepValue, precision);
    }

    public CountUp setOnTickListener(OnTickListener onTickListener) {
        this.onTickListener = onTickListener;
        return this;
    }

    public CountUp setOnFinishListener(OnFinishListener onFinishListener) {
        this.onFinishListener = onFinishListener;
        return this;
    }


    private CountUp(long millisInFuture, long countDownInterval, double startValue, double endValue, double eachStepValue, int precision) {
        super(millisInFuture, countDownInterval);
        this.endValue = endValue;
        this.eachStepValue = eachStepValue;
        currentValue = startValue;
        int i = 1;
        while (precision > 0) {
            i *= 10;
            precision--;
        }
        this.precision = i;
    }

    @Override
    public void onTick(long l) {
        if (onTickListener != null)
            onTickListener.onTick(currentValue);
        currentValue += eachStepValue;
        currentValue = (double)((int)(precision*currentValue))/precision;
    }

    @Override
    public void onFinish() {
        if (onFinishListener != null)
            onFinishListener.onFinish(endValue);
    }
}
