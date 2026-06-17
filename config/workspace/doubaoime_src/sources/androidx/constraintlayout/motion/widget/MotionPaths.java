package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;
    float x;
    float y;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mAnimateRelativeTo = i;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) != Float.isNaN(f3) : Math.abs(f2 - f3) > 1.0E-6f;
    }

    private static final float xRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return (((f6 - f4) * f3) - ((f7 - f5) * f2)) + f4;
    }

    private static final float yRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return ((f7 - f5) * f3) + ((f6 - f4) * f2) + f5;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController motionController) {
        motionController.getPos(this.mProgress);
    }

    void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        boolean diff = diff(this.x, motionPaths.x);
        boolean diff2 = diff(this.y, motionPaths.y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z2 = diff | diff2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.x, this.y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = fArr[iArr[i2]];
                i++;
            }
        }
    }

    void getBounds(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f2 = this.width;
        float f3 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        fArr[i] = f2;
        fArr[i + 1] = f3;
    }

    void getCenter(double d2, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.width;
        float f5 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f3 = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d2, fArr2, new float[2]);
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            double d3 = f7;
            double d4 = f2;
            double d5 = f3;
            f2 = (float) (((Math.sin(d5) * d4) + d3) - (f4 / 2.0f));
            f3 = (float) ((f8 - (Math.cos(d5) * d4)) - (f5 / 2.0f));
        }
        fArr[i] = (f4 / 2.0f) + f2 + 0.0f;
        fArr[i + 1] = (f5 / 2.0f) + f3 + 0.0f;
    }

    void getCenterVelocity(double d2, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.width;
        float f5 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f3 = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d2, fArr2, new float[2]);
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            double d3 = f7;
            double d4 = f2;
            double d5 = f3;
            f2 = (float) (((Math.sin(d5) * d4) + d3) - (f4 / 2.0f));
            f3 = (float) ((f8 - (Math.cos(d5) * d4)) - (f5 / 2.0f));
        }
        fArr[i] = (f4 / 2.0f) + f2 + 0.0f;
        fArr[i + 1] = (f5 / 2.0f) + f3 + 0.0f;
    }

    int getCustomData(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i2 < numberOfInterpolatedValues) {
            dArr[i] = r2[i2];
            i2++;
            i++;
        }
        return numberOfInterpolatedValues;
    }

    int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.width;
        float f5 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f3 = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d2 = f2;
            double d3 = f3;
            float sin = (float) (((Math.sin(d3) * d2) + centerX) - (f4 / 2.0f));
            f3 = (float) ((centerY - (Math.cos(d3) * d2)) - (f5 / 2.0f));
            f2 = sin;
        }
        float f7 = f4 + f2;
        float f8 = f5 + f3;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f2 + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f3 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f7 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f3 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f7 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f8 + 0.0f;
        fArr[i9] = f2 + 0.0f;
        fArr[i9 + 1] = f8 + 0.0f;
    }

    boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.width;
        float f6 = motionPaths.width;
        float f7 = f5 - f6;
        float f8 = motionPaths2.height;
        float f9 = motionPaths.height;
        float f10 = f8 - f9;
        this.position = this.time;
        float f11 = motionPaths.x;
        float f12 = motionPaths.y;
        float f13 = ((f5 / 2.0f) + motionPaths2.x) - ((f6 / 2.0f) + f11);
        float f14 = ((f8 / 2.0f) + motionPaths2.y) - ((f9 / 2.0f) + f12);
        float f15 = (f7 * f3) / 2.0f;
        this.x = (int) (((f13 * f2) + f11) - f15);
        float f16 = (f14 * f2) + f12;
        float f17 = (f10 * f4) / 2.0f;
        this.y = (int) (f16 - f17);
        this.width = (int) (f6 + r9);
        this.height = (int) (f9 + r12);
        float f18 = Float.isNaN(keyPosition.mPercentX) ? f2 : keyPosition.mPercentX;
        float f19 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f2 = keyPosition.mPercentY;
        }
        float f20 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.x = (int) (((f20 * f14) + ((f18 * f13) + motionPaths.x)) - f15);
        this.y = (int) (((f14 * f2) + ((f13 * f19) + motionPaths.y)) - f17);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.width - motionPaths.width;
        float f6 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f2 = keyPosition.mPercentX;
        }
        float f7 = motionPaths.x;
        float f8 = motionPaths.width;
        float f9 = motionPaths.y;
        float f10 = motionPaths.height;
        float f11 = ((motionPaths2.width / 2.0f) + motionPaths2.x) - ((f8 / 2.0f) + f7);
        float f12 = ((motionPaths2.height / 2.0f) + motionPaths2.y) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f2;
        float f14 = (f5 * f3) / 2.0f;
        this.x = (int) ((f7 + f13) - f14);
        float f15 = f2 * f12;
        float f16 = (f6 * f4) / 2.0f;
        this.y = (int) ((f9 + f15) - f16);
        this.width = (int) (f8 + r7);
        this.height = (int) (f10 + r8);
        float f17 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f18 = (int) ((motionPaths.x + f13) - f14);
        this.x = f18;
        float f19 = (int) ((motionPaths.y + f15) - f16);
        this.y = f19;
        this.x = f18 + ((-f12) * f17);
        this.y = f19 + (f11 * f17);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPolar(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float min;
        float f2;
        float f3 = keyPosition.mFramePosition / 100.0f;
        this.time = f3;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f3 : keyPosition.mPercentWidth;
        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f3 : keyPosition.mPercentHeight;
        float f6 = motionPaths2.width;
        float f7 = motionPaths.width;
        float f8 = motionPaths2.height;
        float f9 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (((f6 - f7) * f4) + f7);
        this.height = (int) (((f8 - f9) * f5) + f9);
        int i3 = keyPosition.mPositionType;
        if (i3 == 1) {
            float f10 = Float.isNaN(keyPosition.mPercentX) ? f3 : keyPosition.mPercentX;
            float f11 = motionPaths2.x;
            float f12 = motionPaths.x;
            this.x = e.a.a.a.a.a(f11, f12, f10, f12);
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f3 = keyPosition.mPercentY;
            }
            float f13 = motionPaths2.y;
            float f14 = motionPaths.y;
            this.y = e.a.a.a.a.a(f13, f14, f3, f14);
        } else if (i3 != 2) {
            float f15 = Float.isNaN(keyPosition.mPercentX) ? f3 : keyPosition.mPercentX;
            float f16 = motionPaths2.x;
            float f17 = motionPaths.x;
            this.x = e.a.a.a.a.a(f16, f17, f15, f17);
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f3 = keyPosition.mPercentY;
            }
            float f18 = motionPaths2.y;
            float f19 = motionPaths.y;
            this.y = e.a.a.a.a.a(f18, f19, f3, f19);
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f20 = motionPaths2.x;
                float f21 = motionPaths.x;
                min = e.a.a.a.a.a(f20, f21, f3, f21);
            } else {
                min = Math.min(f5, f4) * keyPosition.mPercentX;
            }
            this.x = min;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f22 = motionPaths2.y;
                float f23 = motionPaths.y;
                f2 = e.a.a.a.a.a(f22, f23, f3, f23);
            } else {
                f2 = keyPosition.mPercentY;
            }
            this.y = f2;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initScreen(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = keyPosition.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = keyPosition.mDrawPath;
        float f3 = Float.isNaN(keyPosition.mPercentWidth) ? f2 : keyPosition.mPercentWidth;
        float f4 = Float.isNaN(keyPosition.mPercentHeight) ? f2 : keyPosition.mPercentHeight;
        float f5 = motionPaths2.width;
        float f6 = f5 - motionPaths.width;
        float f7 = motionPaths2.height;
        float f8 = f7 - motionPaths.height;
        this.position = this.time;
        float f9 = motionPaths.x;
        float f10 = motionPaths.y;
        float f11 = (f5 / 2.0f) + motionPaths2.x;
        float f12 = (f7 / 2.0f) + motionPaths2.y;
        float f13 = f6 * f3;
        this.x = (int) ((((f11 - ((r8 / 2.0f) + f9)) * f2) + f9) - (f13 / 2.0f));
        float f14 = f8 * f4;
        this.y = (int) ((((f12 - ((r11 / 2.0f) + f10)) * f2) + f10) - (f14 / 2.0f));
        this.width = (int) (r8 + f13);
        this.height = (int) (r11 + f14);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.x = (int) (keyPosition.mPercentX * ((int) (i - this.width)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.y = (int) (keyPosition.mPercentY * ((int) (i2 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void setBounds(float f2, float f3, float f4, float f5) {
        this.x = f2;
        this.y = f3;
        this.width = f4;
        this.height = f5;
    }

    void setDpDt(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f8 = (float) dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f4 = f8;
            } else if (i2 == 2) {
                f6 = f8;
            } else if (i2 == 3) {
                f5 = f8;
            } else if (i2 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((0.0f * f5) / 2.0f);
        float f10 = f6 - ((0.0f * f7) / 2.0f);
        fArr[0] = (((f5 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
        fArr[1] = (((f7 * 1.0f) + f10) * f3) + ((1.0f - f3) * f10) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void setView(float f2, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f3;
        boolean z2;
        boolean z3;
        float f4;
        float f5 = this.x;
        float f6 = this.y;
        float f7 = this.width;
        float f8 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.mTempValue[iArr[i2]] = dArr[i2];
            this.mTempDelta[iArr[i2]] = dArr2[i2];
        }
        float f9 = Float.NaN;
        int i3 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (true) {
            double[] dArr4 = this.mTempValue;
            if (i3 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i3]) && (dArr3 == null || dArr3[i3] == 0.0d)) {
                f4 = f9;
            } else {
                double d2 = dArr3 != null ? dArr3[i3] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i3])) {
                    d2 = this.mTempValue[i3] + d2;
                }
                f4 = f9;
                float f14 = (float) d2;
                float f15 = (float) this.mTempDelta[i3];
                if (i3 == 1) {
                    f9 = f4;
                    f10 = f15;
                    f5 = f14;
                } else if (i3 == 2) {
                    f9 = f4;
                    f11 = f15;
                    f6 = f14;
                } else if (i3 == 3) {
                    f9 = f4;
                    f12 = f15;
                    f7 = f14;
                } else if (i3 == 4) {
                    f9 = f4;
                    f13 = f15;
                    f8 = f14;
                } else if (i3 == 5) {
                    f9 = f14;
                }
                i3++;
            }
            f9 = f4;
            i3++;
        }
        float f16 = f9;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f2, fArr, fArr2);
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr2[0];
            float f20 = fArr2[1];
            double d3 = f5;
            double d4 = f6;
            float sin = (float) (((Math.sin(d4) * d3) + f17) - (f7 / 2.0f));
            float cos = (float) ((f18 - (Math.cos(d4) * d3)) - (f8 / 2.0f));
            double d5 = f10;
            double d6 = f11;
            float cos2 = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + f19);
            f3 = f8;
            float sin2 = (float) ((Math.sin(d4) * d3 * d6) + (f20 - (Math.cos(d4) * d5)));
            if (dArr2.length >= 2) {
                z2 = false;
                dArr2[0] = cos2;
                z3 = true;
                dArr2[1] = sin2;
            } else {
                z2 = false;
                z3 = true;
            }
            if (!Float.isNaN(f16)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2(sin2, cos2)) + f16));
            }
            f5 = sin;
            f6 = cos;
        } else {
            f3 = f8;
            z2 = false;
            z3 = true;
            if (!Float.isNaN(f16)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2((f13 / 2.0f) + f11, (f12 / 2.0f) + f10)) + f16 + 0.0f));
            }
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f5, f6, f7 + f5, f6 + f3);
            return;
        }
        float f21 = f5 + 0.5f;
        int i4 = (int) f21;
        float f22 = f6 + 0.5f;
        int i5 = (int) f22;
        int i6 = (int) (f21 + f7);
        int i7 = (int) (f22 + f3);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight()) {
            z3 = z2;
        }
        if (z3 || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i8, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i9, BasicMeasure.EXACTLY));
        }
        view.layout(i4, i5, i6, i7);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d2 = (((this.width / 2.0f) + this.x) - motionPaths.x) - (motionPaths.width / 2.0f);
        double d3 = (((this.height / 2.0f) + this.y) - motionPaths.y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motionController;
        this.x = (float) Math.hypot(d3, d2);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.y = (float) (Math.atan2(d3, d2) + 1.5707963267948966d);
        } else {
            this.y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i3 = Key.UNSET;
        this.mPathMotionArc = i3;
        this.mAnimateRelativeTo = i3;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i, i2, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i4 = keyPosition.mPositionType;
        if (i4 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i4 != 2) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i2, keyPosition, motionPaths, motionPaths2);
        }
    }

    void getCenter(double d2, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.width;
        float f5 = this.height;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d2, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            double d3 = f2;
            double d4 = f3;
            float sin = (float) (((Math.sin(d4) * d3) + f15) - (f4 / 2.0f));
            f3 = (float) ((f16 - (Math.cos(d4) * d3)) - (f5 / 2.0f));
            double d5 = f6;
            double d6 = f8;
            float cos = (float) ((Math.cos(d4) * d6) + (Math.sin(d4) * d5) + f17);
            f14 = (float) ((Math.sin(d4) * d6) + (f18 - (Math.cos(d4) * d5)));
            f13 = cos;
            f2 = sin;
            f12 = 2.0f;
        }
        fArr[0] = (f4 / f12) + f2 + 0.0f;
        fArr[1] = (f5 / f12) + f3 + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }
}
