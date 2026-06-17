package com.bytedance.android.input.keyboard.handwriting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.databinding.LayoutHandWritingBoardViewBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.component.ActionButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.NumberButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.SpaceButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.SwitchBoardButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.SymbolButtonKeyComponent;
import com.bytedance.android.input.keyboard.component.style.ImeKeyStyle;
import com.bytedance.android.input.keyboard.custom_symbol.KeyboardCustomSymbolLayout;
import com.bytedance.android.input.popup.HandwriteView;
import com.bytedance.android.input.speech.AsrManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.s.b.s;
import kotlin.s.c.y;

/* loaded from: classes.dex */
public final class HandWritingBoardView extends FrameLayout {
    public static final /* synthetic */ int z = 0;
    private LinearLayout a;
    private LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f2763c;

    /* renamed from: d, reason: collision with root package name */
    private View f2764d;

    /* renamed from: e, reason: collision with root package name */
    private LayoutHandWritingBoardViewBinding f2765e;

    /* renamed from: f, reason: collision with root package name */
    private KeyboardJni.EnterActionType f2766f;

    /* renamed from: g, reason: collision with root package name */
    private HandwriteView f2767g;
    private final Handler h;
    private boolean i;
    private final Runnable j;
    private final j k;
    private kotlin.s.b.l<? super Integer, kotlin.o> l;
    private kotlin.s.b.p<? super SpaceButtonKeyComponent, ? super MotionEvent, Boolean> m;
    private s<? super KeyboardJni.EnterActionType, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, kotlin.o> n;
    private float o;
    private float p;
    private long q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final kotlin.e v;
    private final kotlin.e w;
    private final kotlin.e x;
    private final Handler y;

    public static final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            kotlin.s.c.l.f(message, "msg");
            if (message.what == 1001) {
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.DELETE, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
                HandWritingBoardView.this.w("[delete] handleMessage K_DO_BACKSPACE_EVENT");
                if (KeyboardJni.hasPreedit()) {
                    KeyboardJni.getKeyboardJni().finishPreeditNative(true);
                    HandWritingBoardView.this.A();
                }
                KeyboardJni.getKeyboardJni().handleJavaBackspaceForDoubleClick();
                if (com.bytedance.android.input.m.a.f().length() > 0) {
                    if (!HandWritingBoardView.this.t) {
                        HandWritingBoardView.this.t = true;
                    }
                    sendMessageDelayed(Message.obtain(this, 1001), 60L);
                }
            }
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<Integer> {
        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            return Integer.valueOf(HandWritingBoardView.this.getResources().getDimensionPixelSize(C0838R.dimen.backspace_bg_inset));
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<Integer> {
        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            return Integer.valueOf(HandWritingBoardView.this.getResources().getDimensionPixelSize(C0838R.dimen.backspace_min_swipe_offset));
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<Integer> {
        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Integer invoke() {
            return Integer.valueOf(HandWritingBoardView.this.getResources().getDimensionPixelSize(C0838R.dimen.backspace_bg_radius));
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.l<Rect, kotlin.o> {
        final /* synthetic */ ArrayList<Rect> b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HandwriteView f2768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ArrayList<Rect> arrayList, HandwriteView handwriteView) {
            super(1);
            this.b = arrayList;
            this.f2768c = handwriteView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Rect rect) {
            Rect rect2 = rect;
            kotlin.s.c.l.f(rect2, "rect");
            HandWritingBoardView.this.w("toolbar.rect = " + rect2);
            this.b.add(rect2);
            this.f2768c.setDisableAreas(this.b);
            return kotlin.o.a;
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.l<Rect, kotlin.o> {
        final /* synthetic */ ArrayList<Rect> b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HandwriteView f2769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList<Rect> arrayList, HandwriteView handwriteView) {
            super(1);
            this.b = arrayList;
            this.f2769c = handwriteView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Rect rect) {
            Rect rect2 = rect;
            kotlin.s.c.l.f(rect2, "rect");
            HandWritingBoardView.this.w("symbolLayout.rect = " + rect2);
            this.b.add(rect2);
            this.f2769c.setDisableAreas(this.b);
            return kotlin.o.a;
        }
    }

    static final class g extends kotlin.s.c.m implements kotlin.s.b.l<Rect, kotlin.o> {
        final /* synthetic */ ArrayList<Rect> b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HandwriteView f2770c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList<Rect> arrayList, HandwriteView handwriteView) {
            super(1);
            this.b = arrayList;
            this.f2770c = handwriteView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Rect rect) {
            Rect rect2 = rect;
            kotlin.s.c.l.f(rect2, "rect");
            HandWritingBoardView.this.w("KeyLayout.rect = " + rect2);
            this.b.add(rect2);
            this.f2770c.setDisableAreas(this.b);
            return kotlin.o.a;
        }
    }

    static final class h extends kotlin.s.c.m implements kotlin.s.b.l<Rect, kotlin.o> {
        h() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Rect rect) {
            kotlin.s.c.l.f(rect, "it");
            HandWritingBoardView handWritingBoardView = HandWritingBoardView.this;
            StringBuilder M = e.a.a.a.a.M("handleWritingArea handwriteView?.width = ");
            HandwriteView k = HandWritingBoardView.this.k();
            M.append(k != null ? Integer.valueOf(k.getWidth()) : null);
            M.append("---handwriteView.height = ");
            HandwriteView k2 = HandWritingBoardView.this.k();
            M.append(k2 != null ? Integer.valueOf(k2.getHeight()) : null);
            handWritingBoardView.w(M.toString());
            HandwriteView k3 = HandWritingBoardView.this.k();
            if (k3 != null) {
                int height = k3.getHeight();
                int width = k3.getWidth();
                com.bytedance.android.input.r.j.m("HandWritingBoardView", "handleWritingArea area_size: " + height + ", " + width);
                KeyboardJni.getKeyboardJni().setHandWritingAreaSize((int) (((float) height) / k3.g()), (int) (((float) width) / k3.g()));
            }
            return kotlin.o.a;
        }
    }

    static final class i extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        i() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            HandWritingBoardView.this.y();
            return kotlin.o.a;
        }
    }

    public static final class j extends SettingsConfigNext.b {
        final /* synthetic */ Context a;
        final /* synthetic */ HandWritingBoardView b;

        j(Context context, HandWritingBoardView handWritingBoardView) {
            this.a = context;
            this.b = handWritingBoardView;
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public void onReset() {
            final HandWritingBoardView handWritingBoardView = this.b;
            handWritingBoardView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.handwriting.i
                @Override // java.lang.Runnable
                public final void run() {
                    HandWritingBoardView handWritingBoardView2 = HandWritingBoardView.this;
                    kotlin.s.c.l.f(handWritingBoardView2, "this$0");
                    handWritingBoardView2.h();
                }
            });
        }

        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public <T> void onSettingsConfigChanged(String str, T t) {
            kotlin.s.c.l.f(str, "key");
            if (kotlin.s.c.l.a(str, this.a.getString(C0838R.string.lang_switch_key_position))) {
                final HandWritingBoardView handWritingBoardView = this.b;
                handWritingBoardView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.handwriting.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        HandWritingBoardView handWritingBoardView2 = HandWritingBoardView.this;
                        kotlin.s.c.l.f(handWritingBoardView2, "this$0");
                        handWritingBoardView2.h();
                    }
                });
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandWritingBoardView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        com.bytedance.android.input.r.j.i("HandWritingBoardView", "reportDeletePreeditEvent");
        e.a.a.a.a.q0("keyboard_position", "key_write", IAppLog.a, "write_predel_click");
    }

    private final void g(float f2) {
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
        if (layoutHandWritingBoardViewBinding != null) {
            layoutHandWritingBoardViewBinding.i.setTextSize(f2);
            layoutHandWritingBoardViewBinding.f2009f.setTextSize(f2);
            layoutHandWritingBoardViewBinding.f2008e.setTextSize(f2);
            layoutHandWritingBoardViewBinding.f2010g.setTextSize(f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        LinearLayout linearLayout;
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
        if (layoutHandWritingBoardViewBinding == null || (linearLayout = this.b) == null) {
            return;
        }
        SymbolButtonKeyComponent symbolButtonKeyComponent = layoutHandWritingBoardViewBinding.i;
        kotlin.s.c.l.e(symbolButtonKeyComponent, "b.handWritingKeySymbol");
        NumberButtonKeyComponent numberButtonKeyComponent = layoutHandWritingBoardViewBinding.f2009f;
        kotlin.s.c.l.e(numberButtonKeyComponent, "b.handWritingKeyNumber");
        SpaceButtonKeyComponent spaceButtonKeyComponent = layoutHandWritingBoardViewBinding.f2010g;
        kotlin.s.c.l.e(spaceButtonKeyComponent, "b.handWritingKeySpace");
        SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent = layoutHandWritingBoardViewBinding.h;
        kotlin.s.c.l.e(switchBoardButtonKeyComponent, "b.handWritingKeySwitch");
        ActionButtonKeyComponent actionButtonKeyComponent = layoutHandWritingBoardViewBinding.f2008e;
        kotlin.s.c.l.e(actionButtonKeyComponent, "b.handWritingKeyAction");
        z(linearLayout, kotlin.collections.g.G(symbolButtonKeyComponent, numberButtonKeyComponent, spaceButtonKeyComponent, switchBoardButtonKeyComponent, actionButtonKeyComponent));
        String string = getContext().getString(C0838R.string.lang_switch_key_position);
        kotlin.s.c.l.e(string, "context.getString(R.stri…lang_switch_key_position)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) f2).intValue() == 0) {
            SymbolButtonKeyComponent symbolButtonKeyComponent2 = layoutHandWritingBoardViewBinding.i;
            kotlin.s.c.l.e(symbolButtonKeyComponent2, "b.handWritingKeySymbol");
            SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent2 = layoutHandWritingBoardViewBinding.h;
            kotlin.s.c.l.e(switchBoardButtonKeyComponent2, "b.handWritingKeySwitch");
            SpaceButtonKeyComponent spaceButtonKeyComponent2 = layoutHandWritingBoardViewBinding.f2010g;
            kotlin.s.c.l.e(spaceButtonKeyComponent2, "b.handWritingKeySpace");
            NumberButtonKeyComponent numberButtonKeyComponent2 = layoutHandWritingBoardViewBinding.f2009f;
            kotlin.s.c.l.e(numberButtonKeyComponent2, "b.handWritingKeyNumber");
            ActionButtonKeyComponent actionButtonKeyComponent2 = layoutHandWritingBoardViewBinding.f2008e;
            kotlin.s.c.l.e(actionButtonKeyComponent2, "b.handWritingKeyAction");
            z(linearLayout, kotlin.collections.g.G(symbolButtonKeyComponent2, switchBoardButtonKeyComponent2, spaceButtonKeyComponent2, numberButtonKeyComponent2, actionButtonKeyComponent2));
        }
    }

    private final int j() {
        return ((Number) this.w.getValue()).intValue();
    }

    private final void l() {
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        int i2 = com.bytedance.android.input.keyboard.areacontrol.k.i();
        float f2 = 3;
        int n = ((i2 - com.bytedance.android.input.keyboard.areacontrol.k.n()) / 4) - ((int) e.a.a.a.a.m("Resources.getSystem()", 1, f2));
        w(e.a.a.a.a.l("handleKeyLayout defaultKeyboardHeightNotHandWrite = ", i2, "---portraitLayoutHeight = ", n));
        if (com.bytedance.android.input.keyboard.areacontrol.k.V()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, this.b, null, Integer.valueOf(n), null, null, null, null, 122);
            LinearLayout linearLayout = this.b;
            if (linearLayout != null) {
                linearLayout.setPadding(0, 0, 0, (int) e.a.a.a.a.m("Resources.getSystem()", 1, 5));
            }
        } else if (com.bytedance.android.input.keyboard.areacontrol.k.P()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, this.b, null, Integer.valueOf((int) (n * 0.77d)), null, null, null, null, 122);
            LinearLayout linearLayout2 = this.b;
            if (linearLayout2 != null) {
                linearLayout2.setPadding(0, 0, 0, (int) e.a.a.a.a.m("Resources.getSystem()", 1, f2));
            }
        } else if (com.bytedance.android.input.keyboard.areacontrol.k.R()) {
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, this.b, null, Integer.valueOf((int) (n * 0.86d)), null, null, null, null, 122);
            LinearLayout linearLayout3 = this.b;
            if (linearLayout3 != null) {
                linearLayout3.setPadding(0, 0, 0, (int) e.a.a.a.a.m("Resources.getSystem()", 1, 4));
            }
        }
        h();
    }

    private final void m() {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            int m = com.bytedance.android.input.keyboard.areacontrol.k.P() ? (int) e.a.a.a.a.m("Resources.getSystem()", 1, 46) : com.bytedance.android.input.keyboard.areacontrol.k.n();
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = m;
            linearLayout.setLayoutParams(layoutParams);
            w("handleTranslateToolbarLayout toolBarHeight = " + m);
        }
    }

    private final void n() {
        HandwriteView handwriteView = this.f2767g;
        if (handwriteView != null) {
            ArrayList arrayList = new ArrayList();
            LinearLayout linearLayout = this.a;
            if (linearLayout != null) {
                com.bytedance.android.input.basic.d.c.a.b(linearLayout, new e(arrayList, handwriteView));
            }
            LinearLayout linearLayout2 = this.f2763c;
            if (linearLayout2 != null) {
                com.bytedance.android.input.basic.d.c.a.b(linearLayout2, new f(arrayList, handwriteView));
            }
            LinearLayout linearLayout3 = this.b;
            if (linearLayout3 != null) {
                com.bytedance.android.input.basic.d.c.a.b(linearLayout3, new g(arrayList, handwriteView));
            }
            com.bytedance.android.input.basic.d.c.a.b(handwriteView, new h());
        }
    }

    public static void p(HandWritingBoardView handWritingBoardView) {
        ActionButtonKeyComponent actionButtonKeyComponent;
        kotlin.s.c.l.f(handWritingBoardView, "this$0");
        handWritingBoardView.i = false;
        handWritingBoardView.w("[hand_write] onEnterSend long click");
        KeyboardJni.EnterActionType enterActionType = handWritingBoardView.f2766f;
        if (enterActionType == KeyboardJni.EnterActionType.kIME_ACTION_SEND || enterActionType == KeyboardJni.EnterActionType.kIME_ACTION_SEND_EXPRESSION) {
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = handWritingBoardView.f2765e;
            if (kotlin.s.c.l.a((layoutHandWritingBoardViewBinding == null || (actionButtonKeyComponent = layoutHandWritingBoardViewBinding.f2008e) == null) ? null : actionButtonKeyComponent.j(), "发送")) {
                handWritingBoardView.i = true;
                s<? super KeyboardJni.EnterActionType, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, kotlin.o> sVar = handWritingBoardView.n;
                if (sVar != null) {
                    KeyboardJni.EnterActionType enterActionType2 = handWritingBoardView.f2766f;
                    Boolean bool = Boolean.TRUE;
                    Boolean bool2 = Boolean.FALSE;
                    sVar.k(enterActionType2, bool, bool2, bool2, bool);
                }
            }
        }
    }

    public static boolean q(ActionButtonKeyComponent actionButtonKeyComponent, HandWritingBoardView handWritingBoardView, View view, MotionEvent motionEvent) {
        kotlin.s.c.l.f(actionButtonKeyComponent, "$this_apply");
        kotlin.s.c.l.f(handWritingBoardView, "this$0");
        if (!com.bytedance.android.input.common.u.c.f()) {
            C0603x.f2629e.b("当前输入法无法使用");
            actionButtonKeyComponent.e("[hand_write] enter interceptor");
            handWritingBoardView.C();
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return false;
                }
                handWritingBoardView.C();
                handWritingBoardView.h.removeCallbacks(handWritingBoardView.j);
                return true;
            }
            handWritingBoardView.h.removeCallbacks(handWritingBoardView.j);
            if (!handWritingBoardView.i) {
                actionButtonKeyComponent.e("[hand_write] onEnterSend click");
                s<? super KeyboardJni.EnterActionType, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, kotlin.o> sVar = handWritingBoardView.n;
                if (sVar != null) {
                    sVar.k(handWritingBoardView.f2766f, Boolean.FALSE, Boolean.valueOf(kotlin.s.c.l.a(actionButtonKeyComponent.j(), "确定")), Boolean.valueOf(kotlin.s.c.l.a(actionButtonKeyComponent.j(), "换行")), Boolean.valueOf(kotlin.s.c.l.a(actionButtonKeyComponent.j(), "发送")));
                }
            }
            handWritingBoardView.C();
            return true;
        }
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.FUNCTION, UserInteractiveManagerNext.KeyVibrate.FUNCTION, VibrationController.VibrationType.KEY_FUNCTION, false);
        if (kotlin.s.c.l.a(actionButtonKeyComponent.j(), "发送")) {
            if (com.bytedance.android.input.m.a.m(true).length() > 0) {
                if (com.bytedance.android.input.m.a.k(true).length() > 0) {
                    actionButtonKeyComponent.g(ImeKeyStyle.GRAY_UN_CLICKABLE);
                }
            }
            actionButtonKeyComponent.g(ImeKeyStyle.BLUE_CLICKABLE);
            actionButtonKeyComponent.setTextColor(C0838R.color.ime_key_text_clickable_color);
        } else if (kotlin.s.c.l.a(actionButtonKeyComponent.j(), "换行") || kotlin.s.c.l.a(actionButtonKeyComponent.j(), "确定")) {
            actionButtonKeyComponent.g(ImeKeyStyle.GRAY_CLICKABLE);
        } else {
            actionButtonKeyComponent.g(ImeKeyStyle.BLUE_CLICKABLE);
            actionButtonKeyComponent.setTextColor(C0838R.color.ime_key_text_clickable_color);
        }
        handWritingBoardView.i = false;
        handWritingBoardView.h.postDelayed(handWritingBoardView.j, 500L);
        return true;
    }

    public static boolean r(HandWritingBoardView handWritingBoardView, SpaceButtonKeyComponent spaceButtonKeyComponent, View view, MotionEvent motionEvent) {
        kotlin.s.c.l.f(handWritingBoardView, "this$0");
        kotlin.s.c.l.f(spaceButtonKeyComponent, "$this_apply");
        kotlin.s.b.p<? super SpaceButtonKeyComponent, ? super MotionEvent, Boolean> pVar = handWritingBoardView.m;
        if (pVar == null) {
            return false;
        }
        kotlin.s.c.l.e(motionEvent, NotificationCompat.CATEGORY_EVENT);
        return pVar.invoke(spaceButtonKeyComponent, motionEvent).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r5 != 3) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(com.bytedance.android.input.keyboard.handwriting.HandWritingBoardView r17, android.widget.ImageView r18, java.lang.Runnable r19, kotlin.s.c.y r20, long r21, android.view.View r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.handwriting.HandWritingBoardView.s(com.bytedance.android.input.keyboard.handwriting.HandWritingBoardView, android.widget.ImageView, java.lang.Runnable, kotlin.s.c.y, long, android.view.View, android.view.MotionEvent):boolean");
    }

    public static void t(HandWritingBoardView handWritingBoardView, View view) {
        kotlin.s.c.l.f(handWritingBoardView, "this$0");
        kotlin.s.b.l<? super Integer, kotlin.o> lVar = handWritingBoardView.l;
        if (lVar != null) {
            lVar.invoke(2);
        }
    }

    public static void u(HandWritingBoardView handWritingBoardView, View view) {
        kotlin.s.c.l.f(handWritingBoardView, "this$0");
        kotlin.s.b.l<? super Integer, kotlin.o> lVar = handWritingBoardView.l;
        if (lVar != null) {
            lVar.invoke(1);
        }
    }

    public static void v(HandWritingBoardView handWritingBoardView, View view) {
        kotlin.s.c.l.f(handWritingBoardView, "this$0");
        kotlin.s.b.l<? super Integer, kotlin.o> lVar = handWritingBoardView.l;
        if (lVar != null) {
            lVar.invoke(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String str) {
        IAppGlobals.a.j("HandWritingBoardView", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        ImageView imageView;
        SpaceButtonKeyComponent spaceButtonKeyComponent;
        SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent;
        ImageView imageView2;
        SpaceButtonKeyComponent spaceButtonKeyComponent2;
        SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent2;
        KeyboardCustomSymbolLayout keyboardCustomSymbolLayout;
        ImageView imageView3;
        SpaceButtonKeyComponent spaceButtonKeyComponent3;
        SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent3;
        w("realToAdjustLayout");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        if (com.bytedance.android.input.keyboard.areacontrol.k.V()) {
            w("onUpdateInputViewShown isPortrait");
            g(14.0f);
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
            if (layoutHandWritingBoardViewBinding != null && (switchBoardButtonKeyComponent3 = layoutHandWritingBoardViewBinding.h) != null) {
                float f2 = 24;
                switchBoardButtonKeyComponent3.setImageSize((int) e.a.a.a.a.m("Resources.getSystem()", 1, f2), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f2));
            }
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding2 = this.f2765e;
            if (layoutHandWritingBoardViewBinding2 != null && (spaceButtonKeyComponent3 = layoutHandWritingBoardViewBinding2.f2010g) != null) {
                spaceButtonKeyComponent3.setImageSize((int) e.a.a.a.a.m("Resources.getSystem()", 1, 36), (int) e.a.a.a.a.m("Resources.getSystem()", 1, 20));
            }
            com.bytedance.android.input.basic.d.c cVar = com.bytedance.android.input.basic.d.c.a;
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding3 = this.f2765e;
            com.bytedance.android.input.basic.d.c.a(cVar, layoutHandWritingBoardViewBinding3 != null ? layoutHandWritingBoardViewBinding3.a() : null, null, null, 0, 0, null, null, 96);
            com.bytedance.android.input.basic.d.c.a(cVar, this.f2764d, null, null, 0, 0, null, null, 96);
            com.bytedance.android.input.basic.d.c.a(cVar, this.f2763c, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 38)), null, null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 8)), null, null, 108);
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding4 = this.f2765e;
            if (layoutHandWritingBoardViewBinding4 != null && (imageView3 = layoutHandWritingBoardViewBinding4.f2007d) != null) {
                com.bytedance.android.input.basic.d.c.a(cVar, imageView3, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 34)), Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 46)), null, null, null, null, 120);
                float f3 = 5;
                float f4 = 11;
                imageView3.setPadding((int) e.a.a.a.a.m("Resources.getSystem()", 1, f3), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f4), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f3), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f4));
            }
        } else if (com.bytedance.android.input.keyboard.areacontrol.k.P()) {
            w("showFloatingUIState");
            g(11.2f);
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding5 = this.f2765e;
            if (layoutHandWritingBoardViewBinding5 != null && (switchBoardButtonKeyComponent2 = layoutHandWritingBoardViewBinding5.h) != null) {
                float f5 = (float) 19.2d;
                switchBoardButtonKeyComponent2.setImageSize((int) e.a.a.a.a.m("Resources.getSystem()", 1, f5), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f5));
            }
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding6 = this.f2765e;
            if (layoutHandWritingBoardViewBinding6 != null && (spaceButtonKeyComponent2 = layoutHandWritingBoardViewBinding6.f2010g) != null) {
                spaceButtonKeyComponent2.setImageSize((int) e.a.a.a.a.m("Resources.getSystem()", 1, (float) 28.8d), (int) e.a.a.a.a.m("Resources.getSystem()", 1, 16));
            }
            com.bytedance.android.input.basic.d.c cVar2 = com.bytedance.android.input.basic.d.c.a;
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding7 = this.f2765e;
            com.bytedance.android.input.basic.d.c.a(cVar2, layoutHandWritingBoardViewBinding7 != null ? layoutHandWritingBoardViewBinding7.a() : null, null, null, 0, 0, null, null, 96);
            com.bytedance.android.input.basic.d.c.a(cVar2, this.f2764d, null, null, 0, 0, null, null, 96);
            com.bytedance.android.input.basic.d.c.a(cVar2, this.f2763c, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 34)), null, null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, (float) 2.82d)), null, null, 108);
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding8 = this.f2765e;
            if (layoutHandWritingBoardViewBinding8 != null && (imageView2 = layoutHandWritingBoardViewBinding8.f2007d) != null) {
                com.bytedance.android.input.basic.d.c.a(cVar2, imageView2, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 32)), Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 42)), null, null, null, null, 120);
                float f6 = 4;
                float f7 = 9;
                imageView2.setPadding((int) e.a.a.a.a.m("Resources.getSystem()", 1, f6), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f7), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f6), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f7));
            }
        } else if (com.bytedance.android.input.keyboard.areacontrol.k.R()) {
            w("showLandscapeUIState");
            g(14.0f);
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding9 = this.f2765e;
            if (layoutHandWritingBoardViewBinding9 != null && (switchBoardButtonKeyComponent = layoutHandWritingBoardViewBinding9.h) != null) {
                float f8 = 24;
                switchBoardButtonKeyComponent.setImageSize((int) e.a.a.a.a.m("Resources.getSystem()", 1, f8), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f8));
            }
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding10 = this.f2765e;
            if (layoutHandWritingBoardViewBinding10 != null && (spaceButtonKeyComponent = layoutHandWritingBoardViewBinding10.f2010g) != null) {
                spaceButtonKeyComponent.setImageSize((int) e.a.a.a.a.m("Resources.getSystem()", 1, 36), (int) e.a.a.a.a.m("Resources.getSystem()", 1, 20));
            }
            com.bytedance.android.input.basic.d.c cVar3 = com.bytedance.android.input.basic.d.c.a;
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding11 = this.f2765e;
            float f9 = 75;
            com.bytedance.android.input.basic.d.c.a(cVar3, layoutHandWritingBoardViewBinding11 != null ? layoutHandWritingBoardViewBinding11.a() : null, null, null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, f9)), Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, f9)), null, null, 98);
            float f10 = 5;
            com.bytedance.android.input.basic.d.c.a(cVar3, this.f2764d, null, null, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, f10)), Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, f10)), null, null, 96);
            float f11 = 34;
            com.bytedance.android.input.basic.d.c.a(cVar3, this.f2763c, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, f11)), null, null, 8, null, null, 108);
            LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding12 = this.f2765e;
            if (layoutHandWritingBoardViewBinding12 != null && (imageView = layoutHandWritingBoardViewBinding12.f2007d) != null) {
                com.bytedance.android.input.basic.d.c.a(cVar3, imageView, Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, f11)), Integer.valueOf((int) e.a.a.a.a.m("Resources.getSystem()", 1, 24)), null, null, null, null, 120);
                imageView.setPadding((int) e.a.a.a.a.m("Resources.getSystem()", 1, f10), (int) e.a.a.a.a.m("Resources.getSystem()", 1, 0), (int) e.a.a.a.a.m("Resources.getSystem()", 1, f10), 0);
            }
        }
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding13 = this.f2765e;
        if (layoutHandWritingBoardViewBinding13 != null && (keyboardCustomSymbolLayout = layoutHandWritingBoardViewBinding13.b) != null) {
            keyboardCustomSymbolLayout.d();
        }
        m();
        l();
        n();
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding14 = this.f2765e;
        if (layoutHandWritingBoardViewBinding14 != null) {
            int i2 = IAppGlobals.a.K() ? C0838R.color.ime_color_white : C0838R.color.ime_key_text_clickable_color;
            SymbolButtonKeyComponent symbolButtonKeyComponent = layoutHandWritingBoardViewBinding14.i;
            symbolButtonKeyComponent.h(symbolButtonKeyComponent.a());
            symbolButtonKeyComponent.setTextColor(i2);
            NumberButtonKeyComponent numberButtonKeyComponent = layoutHandWritingBoardViewBinding14.f2009f;
            numberButtonKeyComponent.h(numberButtonKeyComponent.a());
            numberButtonKeyComponent.setTextColor(i2);
            SpaceButtonKeyComponent spaceButtonKeyComponent4 = layoutHandWritingBoardViewBinding14.f2010g;
            spaceButtonKeyComponent4.h(spaceButtonKeyComponent4.a());
            spaceButtonKeyComponent4.setTextColor(C0838R.color.ime_space_button_text_color);
            SwitchBoardButtonKeyComponent switchBoardButtonKeyComponent4 = layoutHandWritingBoardViewBinding14.h;
            switchBoardButtonKeyComponent4.h(switchBoardButtonKeyComponent4.a());
            switchBoardButtonKeyComponent4.setTextColor(i2);
        }
    }

    private final void z(LinearLayout linearLayout, List<? extends View> list) {
        for (View view : list) {
            if (view.getParent() == linearLayout) {
                linearLayout.removeView(view);
            }
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            linearLayout.addView((View) obj, i2);
            i2 = i3;
        }
    }

    public final void B(boolean z2, String str) {
        ActionButtonKeyComponent actionButtonKeyComponent;
        kotlin.s.c.l.f(str, "from");
        w("[hand_write] updateEnterOkText isSpeeching=" + z2 + " currentEnterActionType=" + this.f2766f + " from=" + str);
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
        if (layoutHandWritingBoardViewBinding == null || (actionButtonKeyComponent = layoutHandWritingBoardViewBinding.f2008e) == null) {
            return;
        }
        kotlin.s.c.l.f(str, "from");
        actionButtonKeyComponent.e("[hand_write] updateEnterOkText from=" + str);
        if (kotlin.s.c.l.a("space", str)) {
            return;
        }
        actionButtonKeyComponent.setText("确定");
        actionButtonKeyComponent.e("[hand_write]  样式1：黑色文本、灰色底 for ok from=" + str);
        if (IAppGlobals.a.K()) {
            actionButtonKeyComponent.h(ImeKeyStyle.TRANSPARENT_WITH_BORDER);
            actionButtonKeyComponent.setTextColor(C0838R.color.ime_color_white);
        } else {
            actionButtonKeyComponent.h(ImeKeyStyle.GRAY_CLICKABLE);
            actionButtonKeyComponent.setTextColor(C0838R.color.ime_key_text_clickable_color);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002d. Please report as an issue. */
    public final void C() {
        ActionButtonKeyComponent actionButtonKeyComponent;
        boolean z2;
        boolean z3;
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
        if (layoutHandWritingBoardViewBinding == null || (actionButtonKeyComponent = layoutHandWritingBoardViewBinding.f2008e) == null) {
            return;
        }
        KeyboardJni.EnterActionType enterActionType = this.f2766f;
        kotlin.s.c.l.f(enterActionType, "enterActionType");
        com.bytedance.android.input.r.j.i("InputView", "[hand_write] updateEnterText in component , enterActionType=" + enterActionType);
        switch (enterActionType.ordinal()) {
            case 2:
                actionButtonKeyComponent.setText("前往");
                z2 = false;
                z3 = true;
                break;
            case 3:
                actionButtonKeyComponent.setText("搜索");
                z2 = false;
                z3 = true;
                break;
            case 4:
                actionButtonKeyComponent.setText("发送");
                z3 = true;
                z2 = z3;
                break;
            case 5:
                actionButtonKeyComponent.setText("继续");
                z2 = false;
                z3 = true;
                break;
            case 6:
                actionButtonKeyComponent.setText("完成");
                z2 = false;
                z3 = true;
                break;
            case 7:
                actionButtonKeyComponent.setText("后退");
                z2 = false;
                z3 = true;
                break;
            case 8:
                actionButtonKeyComponent.setText("发送");
                z3 = true;
                z2 = z3;
                break;
            default:
                actionButtonKeyComponent.setText("换行");
                z3 = false;
                z2 = z3;
                break;
        }
        if (KeyboardJni.getKeyboardJni().isTypingInput() || AsrManager.a.E()) {
            actionButtonKeyComponent.e("[hand_write]  样式1：黑色文本、灰色底");
            actionButtonKeyComponent.setText("确定");
            if (IAppGlobals.a.K()) {
                actionButtonKeyComponent.h(ImeKeyStyle.TRANSPARENT_WITH_BORDER);
                actionButtonKeyComponent.setTextColor(C0838R.color.ime_color_white);
                return;
            } else {
                actionButtonKeyComponent.h(ImeKeyStyle.GRAY_CLICKABLE);
                actionButtonKeyComponent.setTextColor(C0838R.color.ime_key_text_clickable_color);
                return;
            }
        }
        if (!z3) {
            actionButtonKeyComponent.e("[hand_write]  样式1：兜底-->黑色文本、灰色底");
            if (IAppGlobals.a.K()) {
                actionButtonKeyComponent.h(ImeKeyStyle.TRANSPARENT_WITH_BORDER);
                actionButtonKeyComponent.setTextColor(C0838R.color.ime_color_white);
                return;
            } else {
                actionButtonKeyComponent.h(ImeKeyStyle.GRAY_CLICKABLE);
                actionButtonKeyComponent.setTextColor(C0838R.color.ime_key_text_clickable_color);
                return;
            }
        }
        if (z2) {
            if (com.bytedance.android.input.m.a.f().length() == 0) {
                if (com.bytedance.android.input.m.a.e().length() == 0) {
                    if (IAppGlobals.a.K()) {
                        actionButtonKeyComponent.h(ImeKeyStyle.TRANSPARENT_WITH_BORDER);
                        actionButtonKeyComponent.setTextColor(C0838R.color.ime_color_white);
                        return;
                    } else {
                        actionButtonKeyComponent.e("[hand_write]  样式2：灰色文本、灰色底");
                        actionButtonKeyComponent.h(ImeKeyStyle.GRAY_UN_CLICKABLE);
                        actionButtonKeyComponent.setTextColor(C0838R.color.ime_key_text_un_clickable_color);
                        return;
                    }
                }
            }
        }
        actionButtonKeyComponent.e("[hand_write]  样式1：兜底-->黑色文本、灰色底");
        actionButtonKeyComponent.h(ImeKeyStyle.BLUE_CLICKABLE);
        actionButtonKeyComponent.setTextColor(C0838R.color.ime_key_text_white_enter_send_up_color);
    }

    public final void D(KeyboardJni.EnterActionType enterActionType) {
        kotlin.s.c.l.f(enterActionType, "enterActionType");
        com.bytedance.android.input.r.j.i("HandWritingBoardView", "[hand_write] updateEnterText in hand_view , enterActionType=" + enterActionType);
        this.f2766f = enterActionType;
        C();
    }

    public final void E(boolean z2) {
        SpaceButtonKeyComponent spaceButtonKeyComponent;
        e.a.a.a.a.y0("[hand_write] updateSpaceStyle showText=", z2, "HandWritingBoardView");
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
        if (layoutHandWritingBoardViewBinding == null || (spaceButtonKeyComponent = layoutHandWritingBoardViewBinding.f2010g) == null) {
            return;
        }
        spaceButtonKeyComponent.k(z2);
    }

    public final void i() {
        HandwriteView handwriteView = this.f2767g;
        if (handwriteView != null) {
            handwriteView.e();
        }
        KeyboardJni.getKeyboardJni().clearHandWritingPoints();
    }

    public final HandwriteView k() {
        return this.f2767g;
    }

    public final void o() {
        ToolBarTipsLayout toolBarTipsLayout;
        w("hideToolBarTips");
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
        if (layoutHandWritingBoardViewBinding == null || (toolBarTipsLayout = layoutHandWritingBoardViewBinding.l) == null) {
            return;
        }
        toolBarTipsLayout.d();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w("onConfigurationChanged newConfig = " + configuration);
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        SettingsConfigNext.a.p(this.k);
        super.onDetachedFromWindow();
    }

    public final void setHandwriteView(HandwriteView handwriteView) {
        this.f2767g = handwriteView;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnEnterSend(s<? super KeyboardJni.EnterActionType, ? super Boolean, ? super Boolean, ? super Boolean, ? super Boolean, kotlin.o> sVar) {
        kotlin.s.c.l.f(sVar, "listener");
        this.n = sVar;
    }

    public final void setOnItemClick(kotlin.s.b.l<? super Integer, kotlin.o> lVar) {
        kotlin.s.c.l.f(lVar, "listener");
        this.l = lVar;
    }

    public final void setSpaceTouchEvent(kotlin.s.b.p<? super SpaceButtonKeyComponent, ? super MotionEvent, Boolean> pVar) {
        kotlin.s.c.l.f(pVar, NotificationCompat.CATEGORY_EVENT);
        this.m = pVar;
    }

    public final void x() {
        StringBuilder M = e.a.a.a.a.M("onUpdateInputViewShown currentState = ");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        M.append(com.bytedance.android.input.keyboard.areacontrol.k.m());
        w(M.toString());
        y();
        com.bytedance.android.input.basic.d.c cVar = com.bytedance.android.input.basic.d.c.a;
        LayoutHandWritingBoardViewBinding layoutHandWritingBoardViewBinding = this.f2765e;
        cVar.c(layoutHandWritingBoardViewBinding != null ? layoutHandWritingBoardViewBinding.a() : null, new i());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandWritingBoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.f2766f = KeyboardJni.EnterActionType.kUnknow;
        this.h = new Handler(Looper.getMainLooper());
        this.j = new Runnable() { // from class: com.bytedance.android.input.keyboard.handwriting.a
            @Override // java.lang.Runnable
            public final void run() {
                HandWritingBoardView.p(HandWritingBoardView.this);
            }
        };
        j jVar = new j(context, this);
        this.k = jVar;
        LayoutHandWritingBoardViewBinding b2 = LayoutHandWritingBoardViewBinding.b(LayoutInflater.from(context), this, true);
        kotlin.s.c.l.e(b2, "inflate(LayoutInflater.from(context), this, true)");
        this.f2765e = b2;
        this.a = b2.m;
        this.b = b2.f2006c;
        this.f2763c = b2.j;
        this.f2767g = b2.k;
        this.f2764d = b2.n;
        b2.i.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.handwriting.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HandWritingBoardView.u(HandWritingBoardView.this, view);
            }
        });
        b2.f2009f.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.handwriting.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HandWritingBoardView.t(HandWritingBoardView.this, view);
            }
        });
        b2.h.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.handwriting.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HandWritingBoardView.v(HandWritingBoardView.this, view);
            }
        });
        final SpaceButtonKeyComponent spaceButtonKeyComponent = b2.f2010g;
        spaceButtonKeyComponent.setHapticFeedbackEnabled(false);
        spaceButtonKeyComponent.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.android.input.keyboard.handwriting.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return HandWritingBoardView.r(HandWritingBoardView.this, spaceButtonKeyComponent, view, motionEvent);
            }
        });
        final ActionButtonKeyComponent actionButtonKeyComponent = b2.f2008e;
        actionButtonKeyComponent.setHapticFeedbackEnabled(false);
        actionButtonKeyComponent.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.android.input.keyboard.handwriting.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return HandWritingBoardView.q(ActionButtonKeyComponent.this, this, view, motionEvent);
            }
        });
        final ImageView imageView = b2.f2007d;
        kotlin.s.c.l.e(imageView, "binding.handWritingIvDelete");
        final y yVar = new y();
        final Runnable runnable = new Runnable() { // from class: com.bytedance.android.input.keyboard.handwriting.g
            @Override // java.lang.Runnable
            public final void run() {
                ImageView imageView2 = imageView;
                int i2 = HandWritingBoardView.z;
                kotlin.s.c.l.f(imageView2, "$backspaceView");
                imageView2.setImageResource(C0838R.drawable.ic_keyboard_delete);
                imageView2.setPressed(false);
                imageView2.setSelected(false);
            }
        };
        final long j2 = 60;
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.android.input.keyboard.handwriting.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                HandWritingBoardView.s(HandWritingBoardView.this, imageView, runnable, yVar, j2, view, motionEvent);
                return true;
            }
        });
        m();
        l();
        h();
        n();
        com.bytedance.android.input.keyboard.areacontrol.n nVar = com.bytedance.android.input.keyboard.areacontrol.n.a;
        com.bytedance.android.input.keyboard.areacontrol.n.a(new n(this));
        SettingsConfigNext.a.j(jVar);
        this.v = kotlin.a.c(new c());
        this.w = kotlin.a.c(new d());
        this.x = kotlin.a.c(new b());
        this.y = new a(Looper.getMainLooper());
    }
}
