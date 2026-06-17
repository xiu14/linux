package com.obric.oui.panel;

import android.R;
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
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.panel.BottomSheetBehavior;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BottomSheetDialog extends AppCompatDialog {
    private BottomSheetBehavior<FrameLayout> a;
    private FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f7885c;

    /* renamed from: d, reason: collision with root package name */
    boolean f7886d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7887e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7888f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7889g;
    private final List<BottomSheetBehavior.d> h;

    @NonNull
    private BottomSheetBehavior.d i;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.f7886d && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                BottomSheetDialog.this.cancel();
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
            view.setImportantForAccessibility(BottomSheetDialog.this.f7886d ? 1 : 2);
            if (i >= 28) {
                view.setScreenReaderFocusable(BottomSheetDialog.this.f7886d);
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
            if (!BottomSheetDialog.this.f7886d) {
                accessibilityNodeInfoCompat.setDismissable(false);
            } else {
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.f7886d) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.d {
        e() {
        }

        @Override // com.obric.oui.panel.BottomSheetBehavior.d
        public void a(@NonNull View view, float f2) {
            Iterator it2 = BottomSheetDialog.this.h.iterator();
            while (it2.hasNext()) {
                ((BottomSheetBehavior.d) it2.next()).a(view, f2);
            }
        }

        @Override // com.obric.oui.panel.BottomSheetBehavior.d
        public void b(@NonNull View view, int i) {
            Iterator it2 = BottomSheetDialog.this.h.iterator();
            while (it2.hasNext()) {
                ((BottomSheetBehavior.d) it2.next()).b(view, i);
            }
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomSheetDialog(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.StyleRes int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968718(0x7f04008e, float:1.7546098E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2131887193(0x7f120459, float:1.9408986E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f7886d = r0
            r3.f7887e = r0
            r4 = 0
            r3.f7889g = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.h = r4
            com.obric.oui.panel.BottomSheetDialog$e r4 = new com.obric.oui.panel.BottomSheetDialog$e
            r4.<init>()
            r3.i = r4
            r3.supportRequestWindowFeature(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.panel.BottomSheetDialog.<init>(android.content.Context, int):void");
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.b == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0838R.layout.o_bottom_sheet_dialog, null);
            this.b = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) this.b.findViewById(C0838R.id.design_bottom_sheet);
            this.f7885c = frameLayout2;
            if (Build.VERSION.SDK_INT >= 28) {
                frameLayout2.setAccessibilityPaneTitle("");
            }
            ViewGroup.LayoutParams layoutParams = this.f7885c.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (!(behavior instanceof BottomSheetBehavior)) {
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = (BottomSheetBehavior) behavior;
            this.a = bottomSheetBehavior;
            bottomSheetBehavior.g(this.i);
            this.a.l = this.f7886d;
        }
        return this.b;
    }

    private View wrapInBottomSheet(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b.findViewById(C0838R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        this.f7885c.removeAllViews();
        if (this.f7889g && layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        if (layoutParams == null) {
            this.f7885c.addView(view);
        } else {
            this.f7885c.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0838R.id.touch_outside).setOnClickListener(new a());
        coordinatorLayout.findViewById(C0838R.id.touch_outside).setAccessibilityDelegate(new b());
        ViewCompat.setAccessibilityDelegate(this.f7885c, new c());
        this.f7885c.setOnTouchListener(new d(this));
        return this.b;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> c() {
        if (this.a == null) {
            ensureContainerAndBehavior();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        c();
        super.cancel();
    }

    public FrameLayout d() {
        if (this.f7885c == null) {
            ensureContainerAndBehavior();
        }
        return this.f7885c;
    }

    public void e(boolean z) {
        this.f7889g = z;
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
        if (bottomSheetBehavior == null || bottomSheetBehavior.o != 5) {
            return;
        }
        if (this.f7889g) {
            bottomSheetBehavior.setState(4);
        } else {
            bottomSheetBehavior.setState(3);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f7886d != z) {
            this.f7886d = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.l = z;
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f7886d) {
            this.f7886d = true;
        }
        this.f7887e = z;
        this.f7888f = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.f7888f) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f7887e = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f7888f = true;
        }
        return this.f7887e;
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
