package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import e.a.a.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    int activePointerId;

    @Nullable
    private ColorStateList backgroundTint;

    @NonNull
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    float elevation;
    private int expandHalfwayActionId;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    boolean hideable;
    private boolean ignoreEvents;

    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;

    @Nullable
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;

    @Nullable
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    ViewDragHelper viewDragHelper;

    @Nullable
    WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        void onLayout(@NonNull View view) {
        }

        public abstract void onSlide(@NonNull View view, float f2);

        public abstract void onStateChanged(@NonNull View view, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    private class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    ViewDragHelper viewDragHelper = BottomSheetBehavior.this.viewDragHelper;
                    if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        void continueSettlingToState(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            ViewCompat.postOnAnimation(BottomSheetBehavior.this.viewRef.get(), this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return MathUtils.clamp(i, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                if (r7.this$0.shouldExpandOnUpwardDrag(r0, (r9 * 100.0f) / r10.parentHeight) != false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
            
                if (r9 > r7.this$0.halfExpandedOffset) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
            
                if (java.lang.Math.abs(r8.getTop() - r7.this$0.getExpandedOffset()) < java.lang.Math.abs(r8.getTop() - r7.this$0.halfExpandedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
            
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
            
                if (java.lang.Math.abs(r9 - r7.this$0.fitToContentsOffset) < java.lang.Math.abs(r9 - r7.this$0.collapsedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
            
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
            
                if (r7.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instructions count: 302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = bottomSheetBehavior.state;
                if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.activePointerId == i) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    private int addAccessibilityActionForState(V v, @StringRes int i, int i2) {
        return ViewCompat.addAccessibilityAction(v, v.getResources().getString(i), createAccessibilityViewCommandForState(i2));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private int calculatePeekHeight() {
        int i;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom : (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), BasicMeasure.EXACTLY);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.collapsedOffset;
        }
        if (i == 5) {
            return this.parentHeight;
        }
        if (i == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException(a.j("Invalid state to get top offset: ", i));
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isLayouting(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v);
    }

    private void replaceAccessibilityActionForState(V v, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        ViewCompat.replaceAccessibilityAction(v, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v, Runnable runnable) {
        if (isLayouting(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(@NonNull View view) {
        final boolean z = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.ViewUtils.RelativePadding r13) {
                    /*
                        r10 = this;
                        int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
                        androidx.core.graphics.Insets r0 = r12.getInsets(r0)
                        int r1 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
                        androidx.core.graphics.Insets r1 = r12.getInsets(r1)
                        com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r3 = r0.top
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$302(r2, r3)
                        boolean r2 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r11)
                        int r3 = r11.getPaddingBottom()
                        int r4 = r11.getPaddingLeft()
                        int r5 = r11.getPaddingRight()
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r6)
                        if (r6 == 0) goto L41
                        com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r6 = r12.getSystemWindowInsetBottom()
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$502(r3, r6)
                        int r3 = r13.bottom
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$500(r6)
                        int r3 = r3 + r6
                    L41:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$600(r6)
                        if (r6 == 0) goto L53
                        if (r2 == 0) goto L4e
                        int r4 = r13.end
                        goto L50
                    L4e:
                        int r4 = r13.start
                    L50:
                        int r6 = r0.left
                        int r4 = r4 + r6
                    L53:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$700(r6)
                        if (r6 == 0) goto L66
                        if (r2 == 0) goto L60
                        int r13 = r13.start
                        goto L62
                    L60:
                        int r13 = r13.end
                    L62:
                        int r2 = r0.right
                        int r5 = r13 + r2
                    L66:
                        android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                        android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                        com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$800(r2)
                        r6 = 0
                        r7 = 1
                        if (r2 == 0) goto L80
                        int r2 = r13.leftMargin
                        int r8 = r0.left
                        if (r2 == r8) goto L80
                        r13.leftMargin = r8
                        r2 = r7
                        goto L81
                    L80:
                        r2 = r6
                    L81:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$900(r8)
                        if (r8 == 0) goto L92
                        int r8 = r13.rightMargin
                        int r9 = r0.right
                        if (r8 == r9) goto L92
                        r13.rightMargin = r9
                        r2 = r7
                    L92:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$1000(r8)
                        if (r8 == 0) goto La3
                        int r8 = r13.topMargin
                        int r0 = r0.top
                        if (r8 == r0) goto La3
                        r13.topMargin = r0
                        goto La4
                    La3:
                        r7 = r2
                    La4:
                        if (r7 == 0) goto La9
                        r11.setLayoutParams(r13)
                    La9:
                        int r13 = r11.getPaddingTop()
                        r11.setPadding(r4, r13, r5, r3)
                        boolean r11 = r2
                        if (r11 == 0) goto Lbb
                        com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        int r13 = r1.bottom
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$1102(r11, r13)
                    Lbb:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$400(r11)
                        if (r11 != 0) goto Lc7
                        boolean r11 = r2
                        if (r11 == 0) goto Lcc
                    Lc7:
                        com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                        com.google.android.material.bottomsheet.BottomSheetBehavior.access$1200(r11, r6)
                    Lcc:
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass3.onApplyWindowInsets(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.WindowInsetsCompat");
                }
            });
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z) {
        int topOffsetForState = getTopOffsetForState(i);
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (!(viewDragHelper != null && (!z ? !viewDragHelper.smoothSlideViewTo(view, view.getLeft(), topOffsetForState) : !viewDragHelper.settleCapturedViewAt(view.getLeft(), topOffsetForState)))) {
            setStateInternal(i);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i);
        this.stateSettlingTracker.continueSettlingToState(i);
    }

    private void updateAccessibilityActions() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v, 524288);
        ViewCompat.removeAccessibilityAction(v, 262144);
        ViewCompat.removeAccessibilityAction(v, 1048576);
        int i = this.expandHalfwayActionId;
        if (i != -1) {
            ViewCompat.removeAccessibilityAction(v, i);
        }
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionId = addAccessibilityActionForState(v, R.string.bottomsheet_action_expand_halfway, 6);
        }
        if (this.hideable && this.state != 5) {
            replaceAccessibilityActionForState(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i2 = this.state;
        if (i2 == 3) {
            replaceAccessibilityActionForState(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, this.fitToContents ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            replaceAccessibilityActionForState(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, this.fitToContents ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            replaceAccessibilityActionForState(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
            replaceAccessibilityActionForState(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    private void updateDrawableForTargetState(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.isShapeExpanded != z) {
            this.isShapeExpanded = z;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f2, f2);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (z) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            ViewCompat.setImportantForAccessibility(childAt, 4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        ViewCompat.setImportantForAccessibility(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v = this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                setState(4);
            } else {
                v.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    void dispatchOnSlide(int i) {
        float f2;
        float f3;
        V v = this.viewRef.get();
        if (v == null || this.callbacks.isEmpty()) {
            return;
        }
        int i2 = this.collapsedOffset;
        if (i > i2 || i2 == getExpandedOffset()) {
            int i3 = this.collapsedOffset;
            f2 = i3 - i;
            f3 = this.parentHeight - i3;
        } else {
            int i4 = this.collapsedOffset;
            f2 = i4 - i;
            f3 = i4 - getExpandedOffset();
        }
        float f4 = f2 / f3;
        for (int i5 = 0; i5 < this.callbacks.size(); i5++) {
            this.callbacks.get(i5).onSlide(v, f4);
        }
    }

    @Nullable
    @VisibleForTesting
    View findScrollingChild(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    @Px
    public int getMaxHeight() {
        return this.maxHeight;
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @VisibleForTesting
    int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            this.viewRef = new WeakReference<>(v);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float f2 = this.elevation;
                if (f2 == -1.0f) {
                    f2 = ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(f2);
                boolean z = this.state == 3;
                this.isShapeExpanded = z;
                this.materialShapeDrawable.setInterpolation(z ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int i2 = this.parentHeight;
        int i3 = i2 - height;
        int i4 = this.insetTop;
        if (i3 < i4) {
            if (this.paddingTopSystemWindowInsets) {
                this.childHeight = i2;
            } else {
                this.childHeight = i2 - i4;
            }
        }
        this.fitToContentsOffset = Math.max(0, i2 - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i5 = this.state;
        if (i5 == 3) {
            ViewCompat.offsetTopAndBottom(v, getExpandedOffset());
        } else if (i5 == 6) {
            ViewCompat.offsetTopAndBottom(v, this.halfExpandedOffset);
        } else if (this.hideable && i5 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.parentHeight);
        } else if (i5 == 4) {
            ViewCompat.offsetTopAndBottom(v, this.collapsedOffset);
        } else if (i5 == 1 || i5 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        for (int i6 = 0; i6 < this.callbacks.size(); i6++) {
            this.callbacks.get(i6).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f2, float f3) {
        WeakReference<View> weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get()) {
            return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f2, f3);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < getExpandedOffset()) {
                    iArr[1] = top - getExpandedOffset();
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    setStateInternal(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.collapsedOffset;
                if (i4 > i5 && !this.hideable) {
                    iArr[1] = top - i5;
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    setStateInternal(4);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    ViewCompat.offsetTopAndBottom(v, -i2);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v.getTop());
            this.lastNestedScrollDy = i2;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i;
            this.lastStableState = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r4.getTop() <= r2.halfExpandedOffset) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L3a
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L30
            goto Laa
        L30:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto Laa
            goto La9
        L3a:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L4a
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L4a
            r0 = 5
            goto Laa
        L4a:
            int r3 = r2.lastNestedScrollDy
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L68
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L7e
            int r1 = r2.collapsedOffset
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.startSettling(r4, r0, r3)
            r2.nestedScrolled = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i;
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f2;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z) {
        this.hideable = z;
    }

    public void setMaxHeight(@Px int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(@Px int i) {
        this.maxWidth = i;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(a.J(a.M("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.hideable && i == 5) {
            Log.w(TAG, "Cannot set state: " + i);
            return;
        }
        final int i2 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            final V v = this.viewRef.get();
            runAfterLayout(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.startSettling(v, i2, false);
                }
            });
        }
    }

    void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.lastStableState = i;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onStateChanged(v, i);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j, @FloatRange(from = 0.0d, to = 100.0d) float f2) {
        return false;
    }

    boolean shouldHide(@NonNull View view, float f2) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public final void setPeekHeight(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.peekHeightAuto) {
                this.peekHeightAuto = true;
            }
            z2 = false;
        } else {
            if (this.peekHeightAuto || this.peekHeight != i) {
                this.peekHeightAuto = false;
                this.peekHeight = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            updatePeekHeight(z);
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i2, int i22) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return MathUtils.clamp(i2, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i2, int i22, int i3, int i4) {
                BottomSheetBehavior.this.dispatchOnSlide(i22);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(@NonNull View view, float f2, float f3) {
                /*
                    Method dump skipped, instructions count: 302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onViewReleased(android.view.View, float, float):void");
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i22 = bottomSheetBehavior.state;
                if (i22 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i22 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i2 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i4)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i6 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        }
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
