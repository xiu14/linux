package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintReference implements Reference {
    private Object key;
    private float mCircularAngle;
    private float mCircularDistance;
    private ConstraintWidget mConstraintWidget;
    private HashMap<String, Integer> mCustomColors;
    private HashMap<String, Float> mCustomFloats;
    Dimension mHorizontalDimension;
    final State mState;
    Dimension mVerticalDimension;
    private Object mView;
    String mTag = null;
    Facade mFacade = null;
    int mHorizontalChainStyle = 0;
    int mVerticalChainStyle = 0;
    float mHorizontalChainWeight = -1.0f;
    float mVerticalChainWeight = -1.0f;
    float mHorizontalBias = 0.5f;
    float mVerticalBias = 0.5f;
    protected int mMarginLeft = 0;
    protected int mMarginRight = 0;
    protected int mMarginStart = 0;
    protected int mMarginEnd = 0;
    protected int mMarginTop = 0;
    protected int mMarginBottom = 0;
    protected int mMarginLeftGone = 0;
    protected int mMarginRightGone = 0;
    protected int mMarginStartGone = 0;
    protected int mMarginEndGone = 0;
    protected int mMarginTopGone = 0;
    protected int mMarginBottomGone = 0;
    int mMarginBaseline = 0;
    int mMarginBaselineGone = 0;
    float mPivotX = Float.NaN;
    float mPivotY = Float.NaN;
    float mRotationX = Float.NaN;
    float mRotationY = Float.NaN;
    float mRotationZ = Float.NaN;
    float mTranslationX = Float.NaN;
    float mTranslationY = Float.NaN;
    float mTranslationZ = Float.NaN;
    float mAlpha = Float.NaN;
    float mScaleX = Float.NaN;
    float mScaleY = Float.NaN;
    int mVisibility = 0;
    protected Object mLeftToLeft = null;
    protected Object mLeftToRight = null;
    protected Object mRightToLeft = null;
    protected Object mRightToRight = null;
    protected Object mStartToStart = null;
    protected Object mStartToEnd = null;
    protected Object mEndToStart = null;
    protected Object mEndToEnd = null;
    protected Object mTopToTop = null;
    protected Object mTopToBottom = null;
    protected Object mBottomToTop = null;
    protected Object mBottomToBottom = null;
    Object mBaselineToBaseline = null;
    Object mBaselineToTop = null;
    Object mBaselineToBottom = null;
    Object mCircularConstraint = null;
    State.Constraint mLast = null;

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;

        static {
            State.Constraint.values();
            int[] iArr = new int[18];
            $SwitchMap$androidx$constraintlayout$core$state$State$Constraint = iArr;
            try {
                State.Constraint constraint = State.Constraint.LEFT_TO_LEFT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint2 = State.Constraint.LEFT_TO_RIGHT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint3 = State.Constraint.RIGHT_TO_LEFT;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint4 = State.Constraint.RIGHT_TO_RIGHT;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint5 = State.Constraint.START_TO_START;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint6 = State.Constraint.START_TO_END;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint7 = State.Constraint.END_TO_START;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint8 = State.Constraint.END_TO_END;
                iArr8[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint9 = State.Constraint.TOP_TO_TOP;
                iArr9[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint10 = State.Constraint.TOP_TO_BOTTOM;
                iArr10[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint11 = State.Constraint.BOTTOM_TO_TOP;
                iArr11[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint12 = State.Constraint.BOTTOM_TO_BOTTOM;
                iArr12[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint13 = State.Constraint.BASELINE_TO_BOTTOM;
                iArr13[14] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint14 = State.Constraint.BASELINE_TO_TOP;
                iArr14[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint15 = State.Constraint.BASELINE_TO_BASELINE;
                iArr15[12] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr16 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint16 = State.Constraint.CIRCULAR_CONSTRAINT;
                iArr16[17] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                int[] iArr17 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint17 = State.Constraint.CENTER_HORIZONTALLY;
                iArr17[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                int[] iArr18 = $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
                State.Constraint constraint18 = State.Constraint.CENTER_VERTICALLY;
                iArr18[16] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    static class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder M = e.a.a.a.a.M("IncorrectConstraintException: ");
            M.append(this.mErrors.toString());
            return M.toString();
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.mHorizontalDimension = Dimension.Fixed(obj);
        this.mVerticalDimension = Dimension.Fixed(obj);
        this.mCustomColors = new HashMap<>();
        this.mCustomFloats = new HashMap<>();
        this.mState = state;
    }

    private void applyConnection(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget target = getTarget(obj);
        if (target == null) {
        }
        int i = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()];
        int ordinal = constraint.ordinal();
        if (ordinal == 17) {
            constraintWidget.connectCircularConstraint(target, this.mCircularAngle, (int) this.mCircularDistance);
            return;
        }
        switch (ordinal) {
            case 0:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type).connect(target.getAnchor(type), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 1:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 2:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 3:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type2).connect(target.getAnchor(type2), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 4:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type3).connect(target.getAnchor(type3), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 5:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(target.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 6:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(target.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 7:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type4).connect(target.getAnchor(type4), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 8:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.getAnchor(type5).connect(target.getAnchor(type5), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 9:
                constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).connect(target.getAnchor(ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 10:
                constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(target.getAnchor(ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 11:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.getAnchor(type6).connect(target.getAnchor(type6), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 12:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.immediateConnect(type7, target, type7, this.mMarginBaseline, this.mMarginBaselineGone);
                break;
            case 13:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, target, ConstraintAnchor.Type.TOP, this.mMarginBaseline, this.mMarginBaselineGone);
                break;
            case 14:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, target, ConstraintAnchor.Type.BOTTOM, this.mMarginBaseline, this.mMarginBaselineGone);
                break;
        }
    }

    private void dereference() {
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
        this.mBaselineToTop = get(this.mBaselineToTop);
        this.mBaselineToBottom = get(this.mBaselineToBottom);
    }

    private Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.mState.reference(obj) : obj;
    }

    private ConstraintWidget getTarget(Object obj) {
        if (obj instanceof Reference) {
            return ((Reference) obj).getConstraintWidget();
        }
        return null;
    }

    public void addCustomColor(String str, int i) {
        this.mCustomColors.put(str, Integer.valueOf(i));
    }

    public void addCustomFloat(String str, float f2) {
        if (this.mCustomFloats == null) {
            this.mCustomFloats = new HashMap<>();
        }
        this.mCustomFloats.put(str, Float.valueOf(f2));
    }

    public ConstraintReference alpha(float f2) {
        this.mAlpha = f2;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.mConstraintWidget == null) {
            return;
        }
        Facade facade = this.mFacade;
        if (facade != null) {
            facade.apply();
        }
        this.mHorizontalDimension.apply(this.mState, this.mConstraintWidget, 0);
        this.mVerticalDimension.apply(this.mState, this.mConstraintWidget, 1);
        dereference();
        applyConnection(this.mConstraintWidget, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mStartToStart, State.Constraint.START_TO_START);
        applyConnection(this.mConstraintWidget, this.mStartToEnd, State.Constraint.START_TO_END);
        applyConnection(this.mConstraintWidget, this.mEndToStart, State.Constraint.END_TO_START);
        applyConnection(this.mConstraintWidget, this.mEndToEnd, State.Constraint.END_TO_END);
        applyConnection(this.mConstraintWidget, this.mTopToTop, State.Constraint.TOP_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, State.Constraint.BASELINE_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBaselineToTop, State.Constraint.BASELINE_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBaselineToBottom, State.Constraint.BASELINE_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mCircularConstraint, State.Constraint.CIRCULAR_CONSTRAINT);
        int i = this.mHorizontalChainStyle;
        if (i != 0) {
            this.mConstraintWidget.setHorizontalChainStyle(i);
        }
        int i2 = this.mVerticalChainStyle;
        if (i2 != 0) {
            this.mConstraintWidget.setVerticalChainStyle(i2);
        }
        float f2 = this.mHorizontalChainWeight;
        if (f2 != -1.0f) {
            this.mConstraintWidget.setHorizontalWeight(f2);
        }
        float f3 = this.mVerticalChainWeight;
        if (f3 != -1.0f) {
            this.mConstraintWidget.setVerticalWeight(f3);
        }
        this.mConstraintWidget.setHorizontalBiasPercent(this.mHorizontalBias);
        this.mConstraintWidget.setVerticalBiasPercent(this.mVerticalBias);
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        WidgetFrame widgetFrame = constraintWidget.frame;
        widgetFrame.pivotX = this.mPivotX;
        widgetFrame.pivotY = this.mPivotY;
        widgetFrame.rotationX = this.mRotationX;
        widgetFrame.rotationY = this.mRotationY;
        widgetFrame.rotationZ = this.mRotationZ;
        widgetFrame.translationX = this.mTranslationX;
        widgetFrame.translationY = this.mTranslationY;
        widgetFrame.translationZ = this.mTranslationZ;
        widgetFrame.scaleX = this.mScaleX;
        widgetFrame.scaleY = this.mScaleY;
        widgetFrame.alpha = this.mAlpha;
        int i3 = this.mVisibility;
        widgetFrame.visibility = i3;
        constraintWidget.setVisibility(i3);
        HashMap<String, Integer> hashMap = this.mCustomColors;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.mConstraintWidget.frame.setCustomAttribute(str, TypedValues.Custom.TYPE_COLOR, this.mCustomColors.get(str).intValue());
            }
        }
        HashMap<String, Float> hashMap2 = this.mCustomFloats;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.mConstraintWidget.frame.setCustomAttribute(str2, TypedValues.Custom.TYPE_FLOAT, this.mCustomFloats.get(str2).floatValue());
            }
        }
    }

    public ConstraintReference baseline() {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        this.mBaselineToBaseline = obj;
        return this;
    }

    public ConstraintReference baselineToBottom(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_BOTTOM;
        this.mBaselineToBottom = obj;
        return this;
    }

    public ConstraintReference baselineToTop(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_TOP;
        this.mBaselineToTop = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference bias(float f2) {
        State.Constraint constraint = this.mLast;
        if (constraint == null) {
            return this;
        }
        int ordinal = constraint.ordinal();
        if (ordinal != 15) {
            if (ordinal != 16) {
                switch (ordinal) {
                }
            }
            this.mVerticalBias = f2;
            return this;
        }
        this.mHorizontalBias = f2;
        return this;
    }

    public ConstraintReference bottom() {
        if (this.mBottomToTop != null) {
            this.mLast = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        Object obj2 = get(obj);
        this.mStartToStart = obj2;
        this.mEndToEnd = obj2;
        this.mLast = State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        Object obj2 = get(obj);
        this.mTopToTop = obj2;
        this.mBottomToBottom = obj2;
        this.mLast = State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object obj, float f2, float f3) {
        this.mCircularConstraint = get(obj);
        this.mCircularAngle = f2;
        this.mCircularDistance = f3;
        this.mLast = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference clear() {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            int ordinal = constraint.ordinal();
            if (ordinal != 17) {
                switch (ordinal) {
                    case 0:
                    case 1:
                        this.mLeftToLeft = null;
                        this.mLeftToRight = null;
                        this.mMarginLeft = 0;
                        this.mMarginLeftGone = 0;
                        break;
                    case 2:
                    case 3:
                        this.mRightToLeft = null;
                        this.mRightToRight = null;
                        this.mMarginRight = 0;
                        this.mMarginRightGone = 0;
                        break;
                    case 4:
                    case 5:
                        this.mStartToStart = null;
                        this.mStartToEnd = null;
                        this.mMarginStart = 0;
                        this.mMarginStartGone = 0;
                        break;
                    case 6:
                    case 7:
                        this.mEndToStart = null;
                        this.mEndToEnd = null;
                        this.mMarginEnd = 0;
                        this.mMarginEndGone = 0;
                        break;
                    case 8:
                    case 9:
                        this.mTopToTop = null;
                        this.mTopToBottom = null;
                        this.mMarginTop = 0;
                        this.mMarginTopGone = 0;
                        break;
                    case 10:
                    case 11:
                        this.mBottomToTop = null;
                        this.mBottomToBottom = null;
                        this.mMarginBottom = 0;
                        this.mMarginBottomGone = 0;
                        break;
                    case 12:
                        this.mBaselineToBaseline = null;
                        break;
                }
            } else {
                this.mCircularConstraint = null;
            }
        } else {
            this.mLeftToLeft = null;
            this.mLeftToRight = null;
            this.mMarginLeft = 0;
            this.mRightToLeft = null;
            this.mRightToRight = null;
            this.mMarginRight = 0;
            this.mStartToStart = null;
            this.mStartToEnd = null;
            this.mMarginStart = 0;
            this.mEndToStart = null;
            this.mEndToEnd = null;
            this.mMarginEnd = 0;
            this.mTopToTop = null;
            this.mTopToBottom = null;
            this.mMarginTop = 0;
            this.mBottomToTop = null;
            this.mBottomToBottom = null;
            this.mMarginBottom = 0;
            this.mBaselineToBaseline = null;
            this.mCircularConstraint = null;
            this.mHorizontalBias = 0.5f;
            this.mVerticalBias = 0.5f;
            this.mMarginLeftGone = 0;
            this.mMarginRightGone = 0;
            this.mMarginStartGone = 0;
            this.mMarginEndGone = 0;
            this.mMarginTopGone = 0;
            this.mMarginBottomGone = 0;
        }
        return this;
    }

    public ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(getWidth().getValue(), getHeight().getValue());
    }

    public ConstraintReference end() {
        if (this.mEndToStart != null) {
            this.mLast = State.Constraint.END_TO_START;
        } else {
            this.mLast = State.Constraint.END_TO_END;
        }
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        this.mLast = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        this.mLast = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.mConstraintWidget == null) {
            ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.mConstraintWidget = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.mView);
        }
        return this.mConstraintWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return this.mFacade;
    }

    public Dimension getHeight() {
        return this.mVerticalDimension;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public float getHorizontalChainWeight() {
        return this.mHorizontalChainWeight;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.key;
    }

    public float getPivotX() {
        return this.mPivotX;
    }

    public float getPivotY() {
        return this.mPivotY;
    }

    public float getRotationX() {
        return this.mRotationX;
    }

    public float getRotationY() {
        return this.mRotationY;
    }

    public float getRotationZ() {
        return this.mRotationZ;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public String getTag() {
        return this.mTag;
    }

    public float getTranslationX() {
        return this.mTranslationX;
    }

    public float getTranslationY() {
        return this.mTranslationY;
    }

    public float getTranslationZ() {
        return this.mTranslationZ;
    }

    public int getVerticalChainStyle(int i) {
        return this.mVerticalChainStyle;
    }

    public float getVerticalChainWeight() {
        return this.mVerticalChainWeight;
    }

    public Object getView() {
        return this.mView;
    }

    public Dimension getWidth() {
        return this.mHorizontalDimension;
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f2) {
        this.mHorizontalBias = f2;
        return this;
    }

    public ConstraintReference left() {
        if (this.mLeftToLeft != null) {
            this.mLast = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.mLast = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        return margin(this.mState.convertDimension(obj));
    }

    public ConstraintReference marginGone(Object obj) {
        return marginGone(this.mState.convertDimension(obj));
    }

    public ConstraintReference pivotX(float f2) {
        this.mPivotX = f2;
        return this;
    }

    public ConstraintReference pivotY(float f2) {
        this.mPivotY = f2;
        return this;
    }

    public ConstraintReference right() {
        if (this.mRightToLeft != null) {
            this.mLast = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public ConstraintReference rotationX(float f2) {
        this.mRotationX = f2;
        return this;
    }

    public ConstraintReference rotationY(float f2) {
        this.mRotationY = f2;
        return this;
    }

    public ConstraintReference rotationZ(float f2) {
        this.mRotationZ = f2;
        return this;
    }

    public ConstraintReference scaleX(float f2) {
        this.mScaleX = f2;
        return this;
    }

    public ConstraintReference scaleY(float f2) {
        this.mScaleY = f2;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.mConstraintWidget = constraintWidget;
        constraintWidget.setCompanionWidget(this.mView);
    }

    public void setFacade(Facade facade) {
        this.mFacade = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.mVerticalDimension = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalChainWeight(float f2) {
        this.mHorizontalChainWeight = f2;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.key = obj;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalChainWeight(float f2) {
        this.mVerticalChainWeight = f2;
    }

    public void setView(Object obj) {
        this.mView = obj;
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.mHorizontalDimension = dimension;
        return this;
    }

    public ConstraintReference start() {
        if (this.mStartToStart != null) {
            this.mLast = State.Constraint.START_TO_START;
        } else {
            this.mLast = State.Constraint.START_TO_END;
        }
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        this.mLast = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        this.mLast = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        if (this.mTopToTop != null) {
            this.mLast = State.Constraint.TOP_TO_TOP;
        } else {
            this.mLast = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        this.mLast = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        this.mLast = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public ConstraintReference translationX(float f2) {
        this.mTranslationX = f2;
        return this;
    }

    public ConstraintReference translationY(float f2) {
        this.mTranslationY = f2;
        return this;
    }

    public ConstraintReference translationZ(float f2) {
        this.mTranslationZ = f2;
        return this;
    }

    public void validate() throws IncorrectConstraintException {
        ArrayList arrayList = new ArrayList();
        if (this.mLeftToLeft != null && this.mLeftToRight != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.mRightToLeft != null && this.mRightToRight != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.mStartToStart != null && this.mStartToEnd != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.mEndToStart != null && this.mEndToEnd != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.mLeftToLeft != null || this.mLeftToRight != null || this.mRightToLeft != null || this.mRightToRight != null) && (this.mStartToStart != null || this.mStartToEnd != null || this.mEndToStart != null || this.mEndToEnd != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    public ConstraintReference verticalBias(float f2) {
        this.mVerticalBias = f2;
        return this;
    }

    public ConstraintReference visibility(int i) {
        this.mVisibility = i;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference margin(int i) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            int ordinal = constraint.ordinal();
            if (ordinal != 17) {
                switch (ordinal) {
                    case 0:
                    case 1:
                        this.mMarginLeft = i;
                        break;
                    case 2:
                    case 3:
                        this.mMarginRight = i;
                        break;
                    case 4:
                    case 5:
                        this.mMarginStart = i;
                        break;
                    case 6:
                    case 7:
                        this.mMarginEnd = i;
                        break;
                    case 8:
                    case 9:
                        this.mMarginTop = i;
                        break;
                    case 10:
                    case 11:
                        this.mMarginBottom = i;
                        break;
                    case 12:
                    case 13:
                    case 14:
                        this.mMarginBaseline = i;
                        break;
                }
            } else {
                this.mCircularDistance = i;
            }
        } else {
            this.mMarginLeft = i;
            this.mMarginRight = i;
            this.mMarginStart = i;
            this.mMarginEnd = i;
            this.mMarginTop = i;
            this.mMarginBottom = i;
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference marginGone(int i) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (constraint.ordinal()) {
                case 0:
                case 1:
                    this.mMarginLeftGone = i;
                    break;
                case 2:
                case 3:
                    this.mMarginRightGone = i;
                    break;
                case 4:
                case 5:
                    this.mMarginStartGone = i;
                    break;
                case 6:
                case 7:
                    this.mMarginEndGone = i;
                    break;
                case 8:
                case 9:
                    this.mMarginTopGone = i;
                    break;
                case 10:
                case 11:
                    this.mMarginBottomGone = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mMarginBaselineGone = i;
                    break;
            }
        } else {
            this.mMarginLeftGone = i;
            this.mMarginRightGone = i;
            this.mMarginStartGone = i;
            this.mMarginEndGone = i;
            this.mMarginTopGone = i;
            this.mMarginBottomGone = i;
        }
        return this;
    }
}
