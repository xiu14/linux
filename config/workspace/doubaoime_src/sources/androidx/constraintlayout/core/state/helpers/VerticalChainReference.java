package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes.dex */
public class VerticalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
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

    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        Iterator<Object> it2 = this.mReferences.iterator();
        while (it2.hasNext()) {
            ((HelperReference) this).mState.constraints(it2.next()).clearVertical();
        }
        Iterator<Object> it3 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it3.hasNext()) {
            ConstraintReference constraints = ((HelperReference) this).mState.constraints(it3.next());
            if (constraintReference2 == null) {
                Object obj = this.mTopToTop;
                if (obj != null) {
                    constraints.topToTop(obj).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    Object obj2 = this.mTopToBottom;
                    if (obj2 != null) {
                        constraints.topToBottom(obj2).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                    } else {
                        constraints.topToTop(State.PARENT);
                    }
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                constraintReference.bottomToTop(constraints.getKey());
                constraints.topToBottom(constraintReference.getKey());
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj3 = this.mBottomToTop;
            if (obj3 != null) {
                constraintReference.bottomToTop(obj3).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                Object obj4 = this.mBottomToBottom;
                if (obj4 != null) {
                    constraintReference.bottomToBottom(obj4).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
                } else {
                    constraintReference.bottomToBottom(State.PARENT);
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f2 = this.mBias;
        if (f2 != 0.5f) {
            constraintReference2.verticalBias(f2);
        }
        int ordinal = this.mStyle.ordinal();
        if (ordinal == 0) {
            constraintReference2.setVerticalChainStyle(0);
        } else if (ordinal == 1) {
            constraintReference2.setVerticalChainStyle(1);
        } else {
            if (ordinal != 2) {
                return;
            }
            constraintReference2.setVerticalChainStyle(2);
        }
    }
}
