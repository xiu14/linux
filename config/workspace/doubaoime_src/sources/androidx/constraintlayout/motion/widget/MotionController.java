package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MotionController {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap<String, ViewSpline> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    View mView;
    Rect mTempRect = new Rect();
    boolean mForceMeasure = false;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<Key> mKeyList = new ArrayList<>();

    MotionController(View view) {
        int i = Key.UNSET;
        this.mPathMotionArc = i;
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
    }

    private float getAdjustedPosition(float f2, float[] fArr) {
        float f3 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.mStaggerScale;
            if (f4 != 1.0d) {
                float f5 = this.mStaggerOffset;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && f2 < 1.0d) {
                    f2 = Math.min((f2 - f5) * f4, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f6 = Float.NaN;
        Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
        while (it2.hasNext()) {
            MotionPaths next = it2.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f7 = next.time;
                if (f7 < f2) {
                    easing = easing2;
                    f3 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.time;
                }
            }
        }
        if (easing != null) {
            float f8 = (Float.isNaN(f6) ? 1.0f : f6) - f3;
            double d2 = (f2 - f3) / f8;
            f2 = (((float) easing.get(d2)) * f8) + f3;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d2);
            }
        }
        return f2;
    }

    private static Interpolator getInterpolator(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f2) {
                    return (float) Easing.this.get(f2);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float getPreCycleDistance() {
        char c2;
        float f2;
        float[] fArr = new float[2];
        float f3 = 1.0f / 99;
        double d2 = 0.0d;
        double d3 = 0.0d;
        float f4 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f5 = i * f3;
            double d4 = f5;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            float f6 = Float.NaN;
            float f7 = 0.0f;
            while (it2.hasNext()) {
                MotionPaths next = it2.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f8 = next.time;
                    if (f8 < f5) {
                        easing = easing2;
                        f7 = f8;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d4 = (((float) easing.get((f5 - f7) / r17)) * (f6 - f7)) + f7;
            }
            this.mSpline[0].getPos(d4, this.mInterpolateData);
            float f9 = f4;
            int i2 = i;
            this.mStartMotionPath.getCenter(d4, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i2 > 0) {
                c2 = 0;
                f2 = (float) (Math.hypot(d3 - fArr[1], d2 - fArr[0]) + f9);
            } else {
                c2 = 0;
                f2 = f9;
            }
            d2 = fArr[c2];
            i = i2 + 1;
            f4 = f2;
            d3 = fArr[1];
        }
        return f4;
    }

    private void insertKey(MotionPaths motionPaths) {
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            StringBuilder M = e.a.a.a.a.M(" KeyPath position \"");
            M.append(motionPaths.position);
            M.append("\" outside of range");
            Log.e(TAG, M.toString());
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    void buildBounds(float[] fArr, int i) {
        float f2 = 1.0f / (i - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i2 = 0; i2 < i; i2++) {
            float f3 = i2 * f2;
            float f4 = this.mStaggerScale;
            float f5 = 0.0f;
            if (f4 != 1.0f) {
                float f6 = this.mStaggerOffset;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f6) * f4, 1.0f);
                }
            }
            double d2 = f3;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f7 = Float.NaN;
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            while (it2.hasNext()) {
                MotionPaths next = it2.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f8 = next.time;
                    if (f8 < f3) {
                        easing = easing2;
                        f5 = f8;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d2 = (((float) easing.get((f3 - f5) / r11)) * (f7 - f5)) + f5;
            }
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 2);
        }
    }

    int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            int i = 0;
            while (it2.hasNext()) {
                iArr[i] = it2.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double d2 : timePoints) {
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            int i = 0;
            while (it2.hasNext()) {
                iArr[i] = it2.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < timePoints.length; i3++) {
            this.mSpline[0].getPos(timePoints[i3], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i3], this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    void buildPath(float[] fArr, int i) {
        double d2;
        float f2 = 1.0f;
        float f3 = 1.0f / (i - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float f4 = i2 * f3;
            float f5 = this.mStaggerScale;
            if (f5 != f2) {
                float f6 = this.mStaggerOffset;
                if (f4 < f6) {
                    f4 = 0.0f;
                }
                if (f4 > f6 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f6) * f5, f2);
                }
            }
            float f7 = f4;
            double d3 = f7;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f8 = Float.NaN;
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            float f9 = 0.0f;
            while (it2.hasNext()) {
                MotionPaths next = it2.next();
                Easing easing2 = next.mKeyFrameEasing;
                double d4 = d3;
                if (easing2 != null) {
                    float f10 = next.time;
                    if (f10 < f7) {
                        f9 = f10;
                        easing = easing2;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.time;
                    }
                }
                d3 = d4;
            }
            double d5 = d3;
            if (easing != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d2 = (((float) easing.get((f7 - f9) / r5)) * (f8 - f9)) + f9;
            } else {
                d2 = d5;
            }
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            if (viewOscillator != null) {
                fArr[i3] = viewOscillator.get(f7) + fArr[i3];
            } else if (viewSpline != null) {
                fArr[i3] = viewSpline.get(f7) + fArr[i3];
            }
            if (viewOscillator2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = viewOscillator2.get(f7) + fArr[i5];
            } else if (viewSpline2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = viewSpline2.get(f7) + fArr[i6];
            }
            i2 = i4 + 1;
            f2 = 1.0f;
        }
    }

    void buildRect(float f2, float[] fArr, int i) {
        this.mSpline[0].getPos(getAdjustedPosition(f2, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    void buildRectangles(float[] fArr, int i) {
        float f2 = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.mSpline[0].getPos(getAdjustedPosition(i2 * f2, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 8);
        }
    }

    void endTrigger(boolean z) {
        if (!"button".equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i].conditionallyFire(z ? -100.0f : 100.0f, this.mView);
            i++;
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    int getAttributeValues(String str, float[] fArr, int i) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = viewSpline.get(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d2, dArr);
        this.mSpline[0].getSlope(d2, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    void getDpDt(float f2, float f3, float f4, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f2, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f5 = motionPaths.x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f6 = f5 - motionPaths2.x;
            float f7 = motionPaths.y - motionPaths2.y;
            float f8 = motionPaths.width - motionPaths2.width;
            float f9 = (motionPaths.height - motionPaths2.height) + f7;
            fArr[0] = ((f8 + f6) * f3) + ((1.0f - f3) * f6);
            fArr[1] = (f9 * f4) + ((1.0f - f4) * f7);
            return;
        }
        double d2 = adjustedPosition;
        curveFitArr[0].getSlope(d2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d2, this.mInterpolateData);
        float f10 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * f10;
            i++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d2, dArr2);
            this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int i = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
        while (it2.hasNext()) {
            i = Math.max(i, it2.next().mDrawPath);
        }
        return Math.max(i, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalX() {
        return this.mEndMotionPath.x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.y;
    }

    MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<Key> it2 = this.mKeyList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it2.hasNext()) {
            Key next = it2.next();
            int i4 = next.mType;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                int i5 = i3 + 1;
                iArr[i5] = i4;
                int i6 = i5 + 1;
                int i7 = next.mFramePosition;
                iArr[i6] = i7;
                double d2 = i7 / 100.0f;
                this.mSpline[0].getPos(d2, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i8 = i6 + 1;
                iArr[i8] = Float.floatToIntBits(fArr[0]);
                int i9 = i8 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[1]);
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    int i10 = i9 + 1;
                    iArr[i10] = keyPosition.mPositionType;
                    int i11 = i10 + 1;
                    iArr[i11] = Float.floatToIntBits(keyPosition.mPercentX);
                    i9 = i11 + 1;
                    iArr[i9] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i12 = i9 + 1;
                iArr[i3] = i12 - i3;
                i2++;
                i3 = i12;
            }
        }
        return i2;
    }

    float getKeyFrameParameter(int i, float f2, float f3) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f4 = motionPaths.x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f5 = motionPaths2.x;
        float f6 = f4 - f5;
        float f7 = motionPaths.y;
        float f8 = motionPaths2.y;
        float f9 = f7 - f8;
        float f10 = (motionPaths2.width / 2.0f) + f5;
        float f11 = (motionPaths2.height / 2.0f) + f8;
        float hypot = (float) Math.hypot(f6, f9);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f12 = f2 - f10;
        float f13 = f3 - f11;
        if (((float) Math.hypot(f12, f13)) == 0.0f) {
            return 0.0f;
        }
        float f14 = (f13 * f9) + (f12 * f6);
        if (i == 0) {
            return f14 / hypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((hypot * hypot) - (f14 * f14));
        }
        if (i == 2) {
            return f12 / f6;
        }
        if (i == 3) {
            return f13 / f6;
        }
        if (i == 4) {
            return f12 / f9;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f13 / f9;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<Key> it2 = this.mKeyList.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Key next = it2.next();
            int i3 = next.mFramePosition;
            iArr[i] = (next.mType * 1000) + i3;
            double d2 = i3 / 100.0f;
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    double[] getPos(double d2) {
        this.mSpline[0].getPos(d2, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d2, dArr);
            }
        }
        return this.mInterpolateData;
    }

    KeyPositionBase getPositionKeyframe(int i, int i2, float f2, float f3) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f4 = motionPaths.x;
        rectF.left = f4;
        float f5 = motionPaths.y;
        rectF.top = f5;
        rectF.right = f4 + motionPaths.width;
        rectF.bottom = f5 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f6 = motionPaths2.x;
        rectF2.left = f6;
        float f7 = motionPaths2.y;
        rectF2.top = f7;
        rectF2.right = f6 + motionPaths2.width;
        rectF2.bottom = f7 + motionPaths2.height;
        Iterator<Key> it2 = this.mKeyList.iterator();
        while (it2.hasNext()) {
            Key next = it2.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i, i2, rectF, rectF2, f2, f3)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    void getPostLayoutDvDp(float f2, int i, int i2, float f3, float f4, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f2, this.mVelocity);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
        ViewSpline viewSpline3 = hashMap3 == null ? null : hashMap3.get(Key.ROTATION);
        HashMap<String, ViewSpline> hashMap4 = this.mAttributesMap;
        ViewSpline viewSpline4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, ViewSpline> hashMap5 = this.mAttributesMap;
        ViewSpline viewSpline5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, ViewOscillator> hashMap6 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, ViewOscillator> hashMap7 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, ViewOscillator> hashMap8 = this.mCycleMap;
        ViewOscillator viewOscillator3 = hashMap8 == null ? null : hashMap8.get(Key.ROTATION);
        HashMap<String, ViewOscillator> hashMap9 = this.mCycleMap;
        ViewOscillator viewOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, ViewOscillator> hashMap10 = this.mCycleMap;
        ViewOscillator viewOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d2 = adjustedPosition;
                curveFit.getPos(d2, dArr);
                this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f3, f4, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f5 = motionPaths.x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f6 = f5 - motionPaths2.x;
            ViewOscillator viewOscillator6 = viewOscillator5;
            float f7 = motionPaths.y - motionPaths2.y;
            ViewOscillator viewOscillator7 = viewOscillator4;
            float f8 = motionPaths.width - motionPaths2.width;
            float f9 = (motionPaths.height - motionPaths2.height) + f7;
            fArr[0] = ((f8 + f6) * f3) + ((1.0f - f3) * f6);
            fArr[1] = (f9 * f4) + ((1.0f - f4) * f7);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator7, viewOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f3, f4, i, i2, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f10 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i3 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f3, f4, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f3, f4, i, i2, fArr);
                return;
            } else {
                dArr2[i3] = dArr2[i3] * f10;
                i3++;
            }
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartX() {
        return this.mStartMotionPath.x;
    }

    public float getStartY() {
        return this.mStartMotionPath.y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    boolean interpolate(View view, float f2, long j, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean z;
        double d2;
        float adjustedPosition = getAdjustedPosition(f2, null);
        int i = this.mQuantizeMotionSteps;
        float f3 = 1.0f;
        if (i != Key.UNSET) {
            float f4 = 1.0f / i;
            float floor = ((float) Math.floor(adjustedPosition / f4)) * f4;
            float f5 = (adjustedPosition % f4) / f4;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f5 = (f5 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            if (interpolator != null) {
                f3 = interpolator.getInterpolation(f5);
            } else if (f5 <= 0.5d) {
                f3 = 0.0f;
            }
            adjustedPosition = (f3 * f4) + floor;
        }
        float f6 = adjustedPosition;
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<ViewSpline> it2 = hashMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().setProperty(view, f6);
            }
        }
        HashMap<String, ViewTimeCycle> hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean z2 = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z2 |= viewTimeCycle.setProperty(view, f6, j, keyCache);
                }
            }
            z = z2;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            z = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d3 = f6;
            curveFitArr[0].getPos(d3, this.mInterpolateData);
            this.mSpline[0].getSlope(d3, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d3, dArr);
                    this.mArcSpline.getSlope(d3, this.mInterpolateVelocity);
                }
            }
            if (this.mNoMovement) {
                d2 = d3;
            } else {
                d2 = d3;
                this.mStartMotionPath.setView(f6, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float bottom = (this.mTransformPivotView.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (ViewSpline viewSpline : hashMap3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view, f6, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                z = pathRotate.setPathRotate(view, keyCache, f6, j, dArr3[0], dArr3[1]) | z;
            }
            int i2 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i2 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i2].getPos(d2, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.attributes.get(this.mAttributeNames[i2 - 1]), view, this.mValuesBuff);
                i2++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f6 <= 0.0f) {
                    view.setVisibility(motionConstrainedPoint.visibility);
                } else if (f6 >= 1.0f) {
                    view.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i3 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i3 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i3].conditionallyFire(f6, view);
                    i3++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f7 = motionPaths.x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float a = e.a.a.a.a.a(motionPaths2.x, f7, f6, f7);
            float f8 = motionPaths.y;
            float a2 = e.a.a.a.a.a(motionPaths2.y, f8, f6, f8);
            float f9 = motionPaths.width;
            float f10 = motionPaths2.width;
            float a3 = e.a.a.a.a.a(f10, f9, f6, f9);
            float f11 = motionPaths.height;
            float f12 = motionPaths2.height;
            float f13 = a + 0.5f;
            int i4 = (int) f13;
            float f14 = a2 + 0.5f;
            int i5 = (int) f14;
            int i6 = (int) (f13 + a3);
            int a4 = (int) (f14 + e.a.a.a.a.a(f12, f11, f6, f11));
            int i7 = i6 - i4;
            int i8 = a4 - i5;
            if (f10 != f9 || f12 != f11 || this.mForceMeasure) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i7, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i8, BasicMeasure.EXACTLY));
                this.mForceMeasure = false;
            }
            view.layout(i4, i5, i6, a4);
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, f6, dArr4[0], dArr4[1]);
                } else {
                    viewOscillator.setProperty(view, f6);
                }
            }
        }
        return z;
    }

    String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f2, float f3, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f4 = motionPaths.x;
        rectF.left = f4;
        float f5 = motionPaths.y;
        rectF.top = f5;
        rectF.right = f4 + motionPaths.width;
        rectF.bottom = f5 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f6 = motionPaths2.x;
        rectF2.left = f6;
        float f7 = motionPaths2.y;
        rectF2.top = f7;
        rectF2.right = f6 + motionPaths2.width;
        rectF2.bottom = f7 + motionPaths2.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f2, f3, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    void rotate(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i) {
        this.mStartMotionPath.mDrawPath = i;
    }

    void setEndState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
            rect = this.mTempRect;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(rect, constraintSet, i3, this.mId);
    }

    public void setPathMotionArc(int i) {
        this.mPathMotionArc = i;
    }

    void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i, int i2, int i3) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i2 - ((viewState.height() + i4) / 2);
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.top;
        } else if (i == 2) {
            int i5 = viewState.left + viewState.right;
            rect.left = i3 - ((viewState.width() + (viewState.top + viewState.bottom)) / 2);
            rect.top = (i5 - viewState.height()) / 2;
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.top;
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i, viewState.rotation);
    }

    public void setTransformPivotTarget(int i) {
        this.mTransformPivotTarget = i;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i, int i2, float f2, long j) {
        ArrayList arrayList;
        String[] strArr;
        HashSet<String> hashSet;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle makeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        ViewSpline makeSpline2;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashSet<String> hashSet4 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i3 = this.mPathMotionArc;
        if (i3 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i3;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet3);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<Key> it2 = arrayList2.iterator();
            arrayList = null;
            while (it2.hasNext()) {
                Key next = it2.next();
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    insertKey(new MotionPaths(i, i2, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i4 = keyPosition.mCurveFit;
                    if (i4 != Key.UNSET) {
                        this.mCurveFitType = i4;
                    }
                } else if (next instanceof KeyCycle) {
                    next.getAttributeNames(hashSet4);
                } else if (next instanceof KeyTimeCycle) {
                    next.getAttributeNames(hashSet2);
                } else if (next instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet3);
                }
            }
        } else {
            arrayList = null;
        }
        int i5 = 0;
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c2 = 1;
        if (!hashSet3.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it3 = hashSet3.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[c2];
                    Iterator<Key> it4 = this.mKeyList.iterator();
                    while (it4.hasNext()) {
                        Key next3 = it4.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next3.mCustomConstraints;
                        if (hashMap2 != null && (constraintAttribute3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.mFramePosition, constraintAttribute3);
                        }
                    }
                    makeSpline2 = ViewSpline.makeCustomSpline(next2, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    makeSpline2 = ViewSpline.makeSpline(next2);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                c2 = 1;
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<Key> it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    Key next4 = it5.next();
                    if (next4 instanceof KeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                ViewSpline viewSpline = this.mAttributesMap.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(intValue);
                }
            }
        }
        if (!hashSet2.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                String next5 = it6.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
                        Iterator<Key> it7 = this.mKeyList.iterator();
                        while (it7.hasNext()) {
                            Key next6 = it7.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next6.mCustomConstraints;
                            if (hashMap3 != null && (constraintAttribute2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.mFramePosition, constraintAttribute2);
                            }
                        }
                        makeSpline = ViewTimeCycle.makeCustomSpline(next5, sparseArray2);
                    } else {
                        makeSpline = ViewTimeCycle.makeSpline(next5, j);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                        this.mTimeCycleAttributesMap.put(next5, makeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<Key> it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    Key next7 = it8.next();
                    if (next7 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i6 = 2;
        int size = this.mMotionPaths.size() + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it9 = this.mMotionPaths.iterator();
        int i7 = 1;
        while (it9.hasNext()) {
            motionPathsArr[i7] = it9.next();
            i7++;
        }
        HashSet hashSet5 = new HashSet();
        for (String str5 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str5)) {
                if (!hashSet3.contains("CUSTOM," + str5)) {
                    hashSet5.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet5.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i8 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i8 >= strArr.length) {
                break;
            }
            String str6 = strArr[i8];
            this.mAttributeInterpolatorCount[i8] = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                if (motionPathsArr[i9].attributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i9].attributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i8] = constraintAttribute.numberOfInterpolatedValues() + iArr[i8];
                    break;
                }
                i9++;
            }
            i8++;
        }
        boolean z = motionPathsArr[0].mPathMotionArc != Key.UNSET;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 1; i10 < size; i10++) {
            motionPathsArr[i10].different(motionPathsArr[i10 - 1], zArr, this.mAttributeNames, z);
        }
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                i11++;
            }
        }
        this.mInterpolateVariables = new int[i11];
        int max = Math.max(2, i11);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i13 = 0;
        for (int i14 = 1; i14 < length; i14++) {
            if (zArr[i14]) {
                this.mInterpolateVariables[i13] = i14;
                i13++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i15 = 0; i15 < size; i15++) {
            motionPathsArr[i15].fillStandard(dArr[i15], this.mInterpolateVariables);
            dArr2[i15] = motionPathsArr[i15].time;
        }
        int i16 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i16 >= iArr2.length) {
                break;
            }
            if (iArr2[i16] < MotionPaths.names.length) {
                String J2 = e.a.a.a.a.J(new StringBuilder(), MotionPaths.names[this.mInterpolateVariables[i16]], " [");
                for (int i17 = 0; i17 < size; i17++) {
                    StringBuilder M = e.a.a.a.a.M(J2);
                    M.append(dArr[i17][i16]);
                    J2 = M.toString();
                }
            }
            i16++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i18 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i5 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i5];
            double[] dArr3 = null;
            double[][] dArr4 = null;
            int i19 = i18;
            int i20 = i19;
            while (i18 < size) {
                if (motionPathsArr[i18].hasCustomData(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i6];
                        iArr3[1] = motionPathsArr[i18].getCustomDataCount(str7);
                        iArr3[i20] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) double.class, iArr3);
                    }
                    hashSet = hashSet4;
                    dArr3[i19] = motionPathsArr[i18].time;
                    motionPathsArr[i18].getCustomData(str7, dArr4[i19], 0);
                    i19++;
                } else {
                    hashSet = hashSet4;
                }
                i18++;
                i6 = 2;
                i20 = 0;
                hashSet4 = hashSet;
            }
            i5++;
            this.mSpline[i5] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i19), (double[][]) Arrays.copyOf(dArr4, i19));
            i6 = 2;
            i18 = 0;
            hashSet4 = hashSet4;
        }
        HashSet<String> hashSet6 = hashSet4;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
            for (int i21 = 0; i21 < size; i21++) {
                iArr4[i21] = motionPathsArr[i21].mPathMotionArc;
                dArr5[i21] = motionPathsArr[i21].time;
                dArr6[i21][0] = motionPathsArr[i21].x;
                dArr6[i21][1] = motionPathsArr[i21].y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        float f3 = Float.NaN;
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it10 = hashSet6.iterator();
            while (it10.hasNext()) {
                String next8 = it10.next();
                ViewOscillator makeSpline3 = ViewOscillator.makeSpline(next8);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f3)) {
                        f3 = getPreCycleDistance();
                    }
                    makeSpline3.setType(next8);
                    this.mCycleMap.put(next8, makeSpline3);
                }
            }
            Iterator<Key> it11 = this.mKeyList.iterator();
            while (it11.hasNext()) {
                Key next9 = it11.next();
                if (next9 instanceof KeyCycle) {
                    ((KeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<ViewOscillator> it12 = this.mCycleMap.values().iterator();
            while (it12.hasNext()) {
                it12.next().setup(f3);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M(" start: x: ");
        M.append(this.mStartMotionPath.x);
        M.append(" y: ");
        M.append(this.mStartMotionPath.y);
        M.append(" end: x: ");
        M.append(this.mEndMotionPath.x);
        M.append(" y: ");
        M.append(this.mEndMotionPath.y);
        return M.toString();
    }

    void setStartState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        int i3 = constraintSet.mRotate;
        if (i3 != 0) {
            rotate(rect, this.mTempRect, i3, i, i2);
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(rect, constraintSet, i3, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        this.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = this.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        this.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
