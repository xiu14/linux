package com.obric.oui.sheet;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

@Deprecated
/* loaded from: classes2.dex */
public class OBottomSheetDialog extends AppCompatDialog {
    private BottomSheetBehavior<FrameLayout> a;
    private FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f8004c;

    /* renamed from: d, reason: collision with root package name */
    boolean f8005d;

    /* renamed from: e, reason: collision with root package name */
    boolean f8006e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8007f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8008g;
    private boolean h;

    @NonNull
    private BottomSheetBehavior.BottomSheetCallback i;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OBottomSheetDialog oBottomSheetDialog = OBottomSheetDialog.this;
            if (oBottomSheetDialog.f8006e && oBottomSheetDialog.isShowing() && OBottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                OBottomSheetDialog.this.cancel();
            }
        }
    }

    class b extends View.AccessibilityDelegate {

        class a extends AccessibilityDelegateCompat {
            a(b bVar) {
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, "关闭面板"));
            }
        }

        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            int i = Build.VERSION.SDK_INT;
            view.setImportantForAccessibility(OBottomSheetDialog.this.f8006e ? 1 : 2);
            if (i >= 28) {
                view.setScreenReaderFocusable(OBottomSheetDialog.this.f8006e);
            }
            view.setContentDescription("关闭");
            ViewCompat.setAccessibilityDelegate(view, new a(this));
        }
    }

    class c extends AccessibilityDelegateCompat {
        c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!OBottomSheetDialog.this.f8006e) {
                accessibilityNodeInfoCompat.setDismissable(false);
            } else {
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                OBottomSheetDialog oBottomSheetDialog = OBottomSheetDialog.this;
                if (oBottomSheetDialog.f8006e) {
                    oBottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d(OBottomSheetDialog oBottomSheetDialog) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.BottomSheetCallback {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                OBottomSheetDialog.this.cancel();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OBottomSheetDialog(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.StyleRes int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L19
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = com.google.android.material.R.attr.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L17
            int r5 = r5.resourceId
            goto L19
        L17:
            int r5 = com.google.android.material.R.style.Theme_Design_Light_BottomSheetDialog
        L19:
            r3.<init>(r4, r5)
            r3.f8006e = r0
            r3.f8007f = r0
            r4 = 0
            r3.h = r4
            com.obric.oui.sheet.OBottomSheetDialog$e r4 = new com.obric.oui.sheet.OBottomSheetDialog$e
            r4.<init>()
            r3.i = r4
            r3.supportRequestWindowFeature(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.sheet.OBottomSheetDialog.<init>(android.content.Context, int):void");
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.b == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.b = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) this.b.findViewById(R.id.design_bottom_sheet);
            this.f8004c = frameLayout2;
            if (Build.VERSION.SDK_INT >= 28) {
                frameLayout2.setAccessibilityPaneTitle("");
            }
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(this.f8004c);
            this.a = from;
            from.setBottomSheetCallback(this.i);
            this.a.setHideable(this.f8006e);
            if (this.h) {
                this.a.setPeekHeight((int) (e.i.a.b.a.e(getContext()) * 0.75f));
            }
        }
        return this.b;
    }

    private View wrapInBottomSheet(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        this.f8004c.removeAllViews();
        if (this.h && layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (layoutParams == null) {
            this.f8004c.addView(view);
        } else {
            this.f8004c.addView(view, layoutParams);
        }
        int i2 = R.id.touch_outside;
        coordinatorLayout.findViewById(i2).setOnClickListener(new a());
        coordinatorLayout.findViewById(i2).setAccessibilityDelegate(new b());
        ViewCompat.setAccessibilityDelegate(this.f8004c, new c());
        this.f8004c.setOnTouchListener(new d(this));
        return this.b;
    }

    public void b(boolean z) {
        this.h = z;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.f8005d || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.a == null) {
            ensureContainerAndBehavior();
        }
        return this.a;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.a.setState(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f8006e != z) {
            this.f8006e = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f8006e) {
            this.f8006e = true;
        }
        this.f8007f = z;
        this.f8008g = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.f8008g) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f8007f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f8008g = true;
        }
        return this.f8007f;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }
}
