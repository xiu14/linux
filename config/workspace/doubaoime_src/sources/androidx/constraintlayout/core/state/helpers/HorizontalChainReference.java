package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes.dex */
public class HorizontalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            State.Chain.values();
            int[] iArr = new int[3];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                State.Chain chain = State.Chain.SPREAD;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$androidx$constraintlayout$core$state$State$Chain;
                State.Chain chain2 = State.Chain.SPREAD_INSIDE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$androidx$constraintlayout$core$state$State$Chain;
                State.Chain chain3 = State.Chain.PACKED;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator<Object> it2 = this.mReferences.iterator();
        while (it2.hasNext()) {
            ((HelperReference) this).mState.constraints(it2.next()).clearHorizontal();
        }
        Iterator<Object> it3 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it3.hasNext()) {
            ConstraintReference constraints = ((HelperReference) this).mState.constraints(it3.next());
            if (constraintReference2 == null) {
                Object obj = this.mStartToStart;
                if (obj != null) {
                    constraints.startToStart(obj).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else {
                    Object obj2 = this.mStartToEnd;
                    if (obj2 != null) {
                        constraints.startToEnd(obj2).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                    } else {
                        Object obj3 = this.mLeftToLeft;
                        if (obj3 != null) {
                            constraints.startToStart(obj3).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                        } else {
                            Object obj4 = this.mLeftToRight;
                            if (obj4 != null) {
                                constraints.startToEnd(obj4).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                            } else {
                                constraints.startToStart(State.PARENT);
                            }
                        }
                    }
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                constraintReference.endToStart(constraints.getKey());
                constraints.startToEnd(constraintReference.getKey());
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj5 = this.mEndToStart;
            if (obj5 != null) {
                constraintReference.endToStart(obj5).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else {
                Object obj6 = this.mEndToEnd;
                if (obj6 != null) {
                    constraintReference.endToEnd(obj6).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
                } else {
                    Object obj7 = this.mRightToLeft;
                    if (obj7 != null) {
                        constraintReference.endToStart(obj7).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                    } else {
                        Object obj8 = this.mRightToRight;
                        if (obj8 != null) {
                            constraintReference.endToEnd(obj8).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
                        } else {
                            constraintReference.endToEnd(State.PARENT);
                        }
                    }
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f2 = this.mBias;
        if (f2 != 0.5f) {
            constraintReference2.horizontalBias(f2);
        }
        int ordinal = this.mStyle.ordinal();
        if (ordinal == 0) {
            constraintReference2.setHorizontalChainStyle(0);
        } else if (ordinal == 1) {
            constraintReference2.setHorizontalChainStyle(1);
        } else {
            if (ordinal != 2) {
                return;
            }
            constraintReference2.setHorizontalChainStyle(2);
        }
    }
}
