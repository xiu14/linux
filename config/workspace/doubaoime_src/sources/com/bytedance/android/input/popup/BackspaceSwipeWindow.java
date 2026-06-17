package com.bytedance.android.input.popup;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.KeyboardView;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.speech.view.AsrEditorLayoutView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class BackspaceSwipeWindow extends PopupWindow {
    public static final BackspaceSwipeWindow w = null;
    private static final kotlin.e<BackspaceSwipeWindow> x = kotlin.a.c(b.a);
    private static boolean y;
    private final Context a;
    private InputView b;

    /* renamed from: c, reason: collision with root package name */
    private View f2890c;

    /* renamed from: d, reason: collision with root package name */
    private View f2891d;

    /* renamed from: e, reason: collision with root package name */
    private float f2892e;

    /* renamed from: f, reason: collision with root package name */
    private float f2893f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f2894g;
    private TextView h;
    private TextView i;
    private View j;
    private boolean k;
    private final kotlin.e l;
    private final kotlin.e m;
    private final kotlin.e n;
    private final kotlin.e o;
    private boolean p;
    private int q;
    private float r;
    private SwipeStatus s;
    private long t;
    private final View.OnLongClickListener u;
    private final View.OnTouchListener v;

    private enum SwipeStatus {
        KUnknown,
        KUpClearNormal,
        KUpClearSelect,
        KUpClearUnshow,
        KDownWithdrawNormal,
        KDownWithdrawSelect,
        KDownWithdrawUnshow
    }

    private static final class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            kotlin.s.c.l.f(message, "msg");
            int i = message.what;
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
                BackspaceSwipeWindow.j().dismiss();
                return;
            }
            if (!KeyboardJni.backspaceClickEvent()) {
                removeMessages(3);
                return;
            }
            if (!kotlin.s.c.l.a(com.bytedance.android.input.m.a.f(), "")) {
                sendMessageDelayed(Message.obtain(this, 3), 50L);
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.DELETE, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
            }
            if (BackspaceSwipeWindow.y) {
                return;
            }
            BackspaceSwipeWindow backspaceSwipeWindow2 = BackspaceSwipeWindow.w;
            BackspaceSwipeWindow.y = true;
            InputView inputView = ImeService.x;
            AsrEditorLayoutView n = inputView != null ? inputView.n() : null;
            if (n == null || n.getVisibility() != 0) {
                return;
            }
            e.a.a.a.a.q0("actiontype", "long_press", IAppLog.a, "voiceinput_panel_delete");
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<BackspaceSwipeWindow> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public BackspaceSwipeWindow invoke() {
            return new BackspaceSwipeWindow(IAppGlobals.a.getContext());
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<Integer> {
        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            Resources resources;
            View view = BackspaceSwipeWindow.this.f2890c;
            if (view == null || (resources = view.getResources()) == null) {
                return null;
            }
            return Integer.valueOf(resources.getDimensionPixelSize(C0838R.dimen.backspace_bg_inset));
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<Integer> {
        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            Resources resources;
            View view = BackspaceSwipeWindow.this.f2890c;
            if (view == null || (resources = view.getResources()) == null) {
                return null;
            }
            return Integer.valueOf(resources.getDimensionPixelSize(C0838R.dimen.backspace_bg_radius));
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.a<a> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public a invoke() {
            return new a();
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.a<Integer> {
        f() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            Resources resources;
            View view = BackspaceSwipeWindow.this.f2890c;
            if (view == null || (resources = view.getResources()) == null) {
                return null;
            }
            return Integer.valueOf(resources.getDimensionPixelSize(C0838R.dimen.backspace_min_swipe_offset));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackspaceSwipeWindow(Context context) {
        super(context);
        kotlin.s.c.l.f(context, "mContext");
        this.a = context;
        this.f2894g = new Rect();
        this.l = kotlin.a.c(new f());
        this.m = kotlin.a.c(new d());
        this.n = kotlin.a.c(new c());
        this.o = kotlin.a.c(e.a);
        this.p = true;
        this.r = 1.0f;
        this.s = SwipeStatus.KUnknown;
        setClippingEnabled(false);
        setInputMethodMode(2);
        setTouchable(false);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setWindowLayoutMode(2038, 8);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        this.k = aVar.b();
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        this.q = com.bytedance.android.input.keyboard.areacontrol.k.m();
        o();
        this.u = new View.OnLongClickListener() { // from class: com.bytedance.android.input.popup.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                BackspaceSwipeWindow.p(BackspaceSwipeWindow.this, view);
                return true;
            }
        };
        this.v = new View.OnTouchListener() { // from class: com.bytedance.android.input.popup.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                BackspaceSwipeWindow.q(BackspaceSwipeWindow.this, view, motionEvent);
                return true;
            }
        };
    }

    private final void f() {
        long uptimeMillis = SystemClock.uptimeMillis() - this.t;
        if (!isShowing() || uptimeMillis >= 50) {
            ((BackspaceSwipeWindow) x.getValue()).dismiss();
        } else {
            k().sendMessageDelayed(Message.obtain(k(), 4), 50 - uptimeMillis);
        }
    }

    private final int g(float f2) {
        return (int) ((f2 * this.a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private final Integer h() {
        return (Integer) this.n.getValue();
    }

    private final Integer i() {
        return (Integer) this.m.getValue();
    }

    public static final BackspaceSwipeWindow j() {
        return (BackspaceSwipeWindow) x.getValue();
    }

    private final Handler k() {
        return (Handler) this.o.getValue();
    }

    private final Integer l() {
        return (Integer) this.l.getValue();
    }

    private final void o() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Configuration configuration = new Configuration(aVar.getContext().getResources().getConfiguration());
        if (this.q == 2) {
            this.r = 0.8f;
            configuration.densityDpi = (int) (r1.getDisplayMetrics().densityDpi * 0.8f);
            configuration.orientation = 1;
        } else {
            this.r = 1.0f;
        }
        configuration.uiMode = this.k ? 32 : 17;
        Context createConfigurationContext = aVar.getContext().createConfigurationContext(configuration);
        kotlin.s.c.l.e(createConfigurationContext, "IAppGlobals.context.crea…figurationContext(config)");
        setContentView(LayoutInflater.from(createConfigurationContext).inflate(C0838R.layout.popup_backspace, (ViewGroup) null));
        View findViewById = getContentView().findViewById(C0838R.id.backspace_container);
        kotlin.s.c.l.e(findViewById, "contentView.findViewById(R.id.backspace_container)");
        this.j = findViewById;
        View findViewById2 = getContentView().findViewById(C0838R.id.textview1);
        kotlin.s.c.l.e(findViewById2, "contentView.findViewById(R.id.textview1)");
        this.h = (TextView) findViewById2;
        View findViewById3 = getContentView().findViewById(C0838R.id.image_view);
        kotlin.s.c.l.e(findViewById3, "contentView.findViewById(R.id.image_view)");
        this.i = (TextView) findViewById3;
    }

    public static boolean p(BackspaceSwipeWindow backspaceSwipeWindow, View view) {
        kotlin.s.c.l.f(backspaceSwipeWindow, "this$0");
        backspaceSwipeWindow.k().sendMessageDelayed(Message.obtain(backspaceSwipeWindow.k(), 3), 1L);
        return true;
    }

    public static boolean q(BackspaceSwipeWindow backspaceSwipeWindow, View view, MotionEvent motionEvent) {
        kotlin.s.c.l.f(backspaceSwipeWindow, "this$0");
        if (view != null && motionEvent != null) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                view.setSelected(true);
            } else if (action == 1) {
                view.setSelected(false);
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            int left = view.getLeft();
            Integer h = backspaceSwipeWindow.h();
            kotlin.s.c.l.c(h);
            int intValue = h.intValue() + left;
            int top = view.getTop();
            Integer h2 = backspaceSwipeWindow.h();
            kotlin.s.c.l.c(h2);
            int intValue2 = h2.intValue() + top;
            int right = view.getRight();
            Integer h3 = backspaceSwipeWindow.h();
            kotlin.s.c.l.c(h3);
            int intValue3 = right - h3.intValue();
            int bottom = view.getBottom();
            Integer h4 = backspaceSwipeWindow.h();
            kotlin.s.c.l.c(h4);
            backspaceSwipeWindow.r(action, x2, y2, eventTime, intValue, intValue2, intValue3, bottom - h4.intValue());
        }
        return true;
    }

    private final void v(boolean z) {
        TextView textView = this.h;
        if (textView == null) {
            kotlin.s.c.l.l("mTextView");
            throw null;
        }
        textView.setSelected(z);
        TextView textView2 = this.i;
        if (textView2 == null) {
            kotlin.s.c.l.l("mImageView");
            throw null;
        }
        textView2.setSelected(z);
        View view = this.j;
        if (view != null) {
            view.setSelected(z);
        } else {
            kotlin.s.c.l.l("mContainer");
            throw null;
        }
    }

    public final void e() {
        k().sendMessageDelayed(Message.obtain(k(), 3), 1L);
    }

    public final View.OnLongClickListener m() {
        return this.u;
    }

    public final View.OnTouchListener n() {
        return this.v;
    }

    public final void r(int i, float f2, float f3, long j, int i2, int i3, int i4, int i5) {
        KeyboardView p;
        KeyboardView p2;
        if (i == 0) {
            y = false;
            this.f2892e = f2;
            this.f2893f = f3;
            k().sendMessageDelayed(Message.obtain(k(), 3), ViewConfiguration.getLongPressTimeout());
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.DELETE, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
            return;
        }
        if (i == 1) {
            InputView inputView = ImeService.x;
            AsrEditorLayoutView n = inputView != null ? inputView.n() : null;
            k().removeMessages(3);
            boolean z = this.p;
            if (z && this.s == SwipeStatus.KUpClearSelect) {
                KeyboardJni.getKeyboardJni().doUpClearAction(1);
                if (n != null && n.getVisibility() == 0) {
                    e.a.a.a.a.q0("actiontype", "up", IAppLog.a, "voiceinput_panel_delete");
                }
            } else if (z && this.s == SwipeStatus.KDownWithdrawSelect) {
                KeyboardJni.getKeyboardJni().doUpClearAction(2);
                if (n != null && n.getVisibility() == 0) {
                    e.a.a.a.a.q0("actiontype", "down", IAppLog.a, "voiceinput_panel_delete");
                }
            } else if (Math.abs(f2 - this.f2892e) <= 20.0f && Math.abs(f3 - this.f2893f) <= 20.0f && j <= 300) {
                KeyboardJni.backspaceClickEvent();
                if (n != null && n.getVisibility() == 0) {
                    e.a.a.a.a.q0("actiontype", "click", IAppLog.a, "voiceinput_panel_delete");
                }
            }
            f();
            this.s = SwipeStatus.KUnknown;
            return;
        }
        if (i != 2) {
            return;
        }
        if (Math.abs(f2 - this.f2892e) > 40.0f || Math.abs(f3 - this.f2893f) > 40.0f) {
            k().removeMessages(3);
        }
        this.f2894g.set(i2, i3, i4, i5);
        int ordinal = this.s.ordinal();
        if (ordinal == 1) {
            float f4 = f3 * (-1);
            kotlin.s.c.l.c(l());
            if (f4 >= r5.intValue()) {
                v(true);
                this.s = SwipeStatus.KUpClearSelect;
                return;
            }
            return;
        }
        if (ordinal == 2) {
            float f5 = f3 * (-1);
            kotlin.s.c.l.c(l());
            if (f5 < r5.intValue()) {
                v(false);
                this.s = SwipeStatus.KUpClearNormal;
                return;
            }
            return;
        }
        if (ordinal == 4) {
            Rect rect = this.f2894g;
            float f6 = f3 - (rect.bottom - rect.top);
            kotlin.s.c.l.c(l());
            if (f6 >= r5.intValue()) {
                v(true);
                this.s = SwipeStatus.KDownWithdrawSelect;
                return;
            }
            return;
        }
        if (ordinal == 5) {
            Rect rect2 = this.f2894g;
            float f7 = f3 - (rect2.bottom - rect2.top);
            kotlin.s.c.l.c(l());
            if (f7 < r5.intValue()) {
                v(false);
                this.s = SwipeStatus.KDownWithdrawNormal;
                return;
            }
            return;
        }
        int upClearCondition = KeyboardJni.getKeyboardJni().getUpClearCondition();
        if ((upClearCondition & 1) == 1) {
            float f8 = (-1) * f3;
            kotlin.s.c.l.c(l());
            if (f8 >= r9.intValue()) {
                int[] iArr = new int[2];
                InputView inputView2 = this.b;
                if (inputView2 != null && (p2 = inputView2.p()) != null) {
                    p2.getLocationInWindow(iArr);
                }
                BackspaceSwipeWindow backspaceSwipeWindow = (BackspaceSwipeWindow) x.getValue();
                SwipeStatus swipeStatus = SwipeStatus.KUpClearSelect;
                int i6 = iArr[0];
                Rect rect3 = this.f2894g;
                int i7 = i6 + rect3.left;
                int i8 = iArr[1] + rect3.top;
                Integer i9 = i();
                kotlin.s.c.l.c(i9);
                backspaceSwipeWindow.w(2, i7, i9.intValue() + i8, this.f2894g.width());
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.DELETE, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.CONFIRM, false);
                return;
            }
        }
        if ((upClearCondition & 2) == 2) {
            Rect rect4 = this.f2894g;
            float f9 = f3 - (rect4.bottom - rect4.top);
            kotlin.s.c.l.c(l());
            if (f9 >= r5.intValue()) {
                int[] iArr2 = new int[2];
                InputView inputView3 = this.b;
                if (inputView3 != null && (p = inputView3.p()) != null) {
                    p.getLocationInWindow(iArr2);
                }
                BackspaceSwipeWindow backspaceSwipeWindow2 = (BackspaceSwipeWindow) x.getValue();
                SwipeStatus swipeStatus2 = SwipeStatus.KDownWithdrawSelect;
                int i10 = iArr2[0];
                Rect rect5 = this.f2894g;
                int i11 = i10 + rect5.left;
                int i12 = iArr2[1] + rect5.bottom;
                Integer i13 = i();
                kotlin.s.c.l.c(i13);
                backspaceSwipeWindow2.w(5, i11, i12 - i13.intValue(), this.f2894g.width());
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.DELETE, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.CONFIRM, false);
            }
        }
    }

    public final void s(boolean z) {
        this.p = z;
    }

    public final void t(View view) {
        this.f2891d = view;
    }

    public final void u(View view, InputView inputView) {
        this.f2890c = view;
        this.b = inputView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r4 != com.bytedance.android.input.keyboard.areacontrol.k.m()) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.popup.BackspaceSwipeWindow.w(int, int, int, int):void");
    }
}
