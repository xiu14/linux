package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MotionKeyPosition extends MotionKey {
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    public MotionKeyPosition() {
        int i = MotionKey.UNSET;
        this.mCurveFit = i;
        this.mTransitionEasing = null;
        this.mPathMotionArc = i;
        this.mDrawPath = 0;
        this.mPercentWidth = Float.NaN;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = Float.NaN;
        this.mPercentY = Float.NaN;
        this.mAltPercentX = Float.NaN;
        this.mAltPercentY = Float.NaN;
        this.mPositionType = 0;
        this.mCalculatedPositionX = Float.NaN;
        this.mCalculatedPositionY = Float.NaN;
        this.mType = 2;
    }

    private void calcCartesianPosition(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        float f8 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f9 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f10 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (((Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f7) + (f8 * f6) + f2);
        this.mCalculatedPositionY = (int) ((f7 * f10) + (f6 * f9) + f3);
    }

    private void calcPathPosition(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        float f8 = this.mPercentX;
        float f9 = (f6 * f8) + f2;
        float f10 = this.mPercentY;
        this.mCalculatedPositionX = ((-f7) * f10) + f9;
        this.mCalculatedPositionY = (f6 * f10) + (f7 * f8) + f3;
    }

    private void calcScreenPosition(int i, int i2) {
        float f2 = this.mPercentX;
        float f3 = 0;
        this.mCalculatedPositionX = ((i - 0) * f2) + f3;
        this.mCalculatedPositionY = ((i2 - 0) * f2) + f3;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    void calcPosition(int i, int i2, float f2, float f3, float f4, float f5) {
        int i3 = this.mPositionType;
        if (i3 == 1) {
            calcPathPosition(f2, f3, f4, f5);
        } else if (i3 != 2) {
            calcCartesianPosition(f2, f3, f4, f5);
        } else {
            calcScreenPosition(i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return TypedValues.PositionType.getId(str);
    }

    float getPositionX() {
        return this.mCalculatedPositionX;
    }

    float getPositionY() {
        return this.mCalculatedPositionY;
    }

    public boolean intersects(int i, int i2, FloatRect floatRect, FloatRect floatRect2, float f2, float f3) {
        calcPosition(i, i2, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        return Math.abs(f2 - this.mCalculatedPositionX) < SELECTION_SLOPE && Math.abs(f3 - this.mCalculatedPositionY) < SELECTION_SLOPE;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f2, float f3, String[] strArr, float[] fArr) {
        int i = this.mPositionType;
        if (i == 1) {
            positionPathAttributes(floatRect, floatRect2, f2, f3, strArr, fArr);
        } else if (i != 2) {
            positionCartAttributes(floatRect, floatRect2, f2, f3, strArr, fArr);
        } else {
            positionScreenAttributes(motionWidget, floatRect, floatRect2, f2, f3, strArr, fArr);
        }
    }

    void positionCartAttributes(FloatRect floatRect, FloatRect floatRect2, float f2, float f3, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        if (strArr[0] == null) {
            strArr[0] = "percentX";
            fArr[0] = (f2 - centerX) / centerX2;
            strArr[1] = "percentY";
            fArr[1] = (f3 - centerY) / centerY2;
            return;
        }
        if ("percentX".equals(strArr[0])) {
            fArr[0] = (f2 - centerX) / centerX2;
            fArr[1] = (f3 - centerY) / centerY2;
        } else {
            fArr[1] = (f2 - centerX) / centerX2;
            fArr[0] = (f3 - centerY) / centerY2;
        }
    }

    void positionPathAttributes(FloatRect floatRect, FloatRect floatRect2, float f2, float f3, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f4 = centerX2 / hypot;
        float f5 = centerY2 / hypot;
        float f6 = f3 - centerY;
        float f7 = f2 - centerX;
        float f8 = ((f4 * f6) - (f7 * f5)) / hypot;
        float f9 = ((f5 * f6) + (f4 * f7)) / hypot;
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f9;
                fArr[1] = f8;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f9;
        fArr[1] = f8;
    }

    void positionScreenAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f2, float f3, String[] strArr, float[] fArr) {
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        if (strArr[0] == null) {
            strArr[0] = "percentX";
            fArr[0] = f2 / width;
            strArr[1] = "percentY";
            fArr[1] = f3 / height;
            return;
        }
        if ("percentX".equals(strArr[0])) {
            fArr[0] = f2 / width;
            fArr[1] = f3 / height;
        } else {
            fArr[1] = f2 / width;
            fArr[0] = f3 / height;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 100) {
            this.mFramePosition = i2;
            return true;
        }
        if (i == 508) {
            this.mCurveFit = i2;
            return true;
        }
        if (i != 510) {
            return super.setValue(i, i2);
        }
        this.mPositionType = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo3clone() {
        return new MotionKeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f2) {
        switch (i) {
            case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                this.mPercentWidth = f2;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                this.mPercentHeight = f2;
                return true;
            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
                this.mPercentWidth = f2;
                this.mPercentHeight = f2;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                this.mPercentX = f2;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                this.mPercentY = f2;
                return true;
            default:
                return super.setValue(i, f2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i != 501) {
            return super.setValue(i, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }
}
