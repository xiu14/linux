package com.bytedance.android.input.keyboard.areacontrol;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.KeyboardView;

/* loaded from: classes.dex */
public final class k {
    private static int A = -1;
    private static int B = 0;
    private static int C = 0;
    private static int D = -1;
    private static int E = 0;
    private static int F = 0;
    private static int G = 0;
    private static boolean H = false;
    private static int I = 0;

    /* renamed from: J, reason: collision with root package name */
    private static MutableLiveData<Boolean> f2645J = new MutableLiveData<>(Boolean.FALSE);
    private static int K = 0;
    private static boolean L = false;
    public static final k a = null;
    private static float b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private static int f2646c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f2647d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f2648e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f2649f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static int f2650g = 0;
    private static int h = 0;
    private static int i = 0;
    private static int j = 0;
    private static int k = 0;
    private static int l = 0;
    private static int m = 0;
    private static int n = 0;
    private static int o = 0;
    private static int p = 0;
    private static int q = 0;
    private static int r = 0;
    private static int s = 0;
    private static int t = 0;
    private static int u = 0;
    private static int v = -1;
    private static int w = -1;
    private static int x = -1;
    private static int y = -1;
    private static int z = -1;

    public static final int A() {
        return q;
    }

    public static final int B() {
        return l;
    }

    public static final int C() {
        return m;
    }

    public static final int D() {
        return f2646c;
    }

    public static final float E() {
        return b;
    }

    public static final int F() {
        return f2650g;
    }

    public static final int G() {
        return I;
    }

    public static final int H() {
        StringBuilder M = e.a.a.a.a.M("[hand_write] getKeyboardBottomMargin mIsLandscapeMode = ");
        M.append(H);
        M.append(", isHandWriteMode = ");
        M.append(Q());
        M.append(" isNumberMode() = ");
        M.append(T());
        M.append("mKeyboardBottomMargin ");
        M.append(v);
        M.append(" mKeyboardBottomMarginForHandWrite=");
        M.append(w);
        M.append(" InputViewModel.isLandscapeMode()=");
        e.a.a.a.a.N0(M, H, "InputViewModel");
        if (H) {
            return 0;
        }
        return T() ? v : Q() ? w : v;
    }

    public static final int I() {
        if (H) {
            return 0;
        }
        return w;
    }

    public static final int J() {
        if (H) {
            return 0;
        }
        return v;
    }

    public static final float K() {
        return b;
    }

    public static final float L(int i2) {
        return KeyboardView.getStretchScale() * i2 * b;
    }

    public static final boolean M() {
        return (x == 0 && y == 0) ? false : true;
    }

    public static final void N() {
        IAppGlobals.a aVar = IAppGlobals.a;
        float min = Math.min(aVar.a(), aVar.v());
        float f2 = aVar.getContext().getResources().getDisplayMetrics().density;
        float integer = min / aVar.getContext().getResources().getInteger(C0838R.integer.ime_1x_screen_height);
        b = integer;
        if (integer > 4.0d) {
            com.bytedance.android.input.r.j.m("InputViewModel", "initConfig mKeyboardState > 4.0, screenHeight = " + min);
            b = f2;
        }
        StringBuilder M = e.a.a.a.a.M("[StretchView] initConfig scaleIme = ");
        M.append(b);
        M.append(" scale = ");
        M.append(f2);
        com.bytedance.android.input.r.j.i("InputViewModel", M.toString());
        f2646c = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_height_land));
        f2647d = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_max_height_port));
        f2648e = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_min_height_port));
        f2649f = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_toolbar));
        f2650g = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_translate_height));
        m = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_bottom_height));
        q = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_one_hand_width));
        i = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_editor_input_mode_less));
        j = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_ai_panel_small_height_less));
        h = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_height_port));
        k = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_hand_write_height_port));
        l = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.ime_ai_writing_big_height_port));
        n = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.float_ime_keyboard_width));
        o = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.float_ime_keyboard_height));
        p = (int) (b * aVar.getContext().getResources().getInteger(C0838R.integer.float_ime_translate_height));
        boolean z2 = aVar.o().getBoolean(aVar.getContext().getResources().getString(C0838R.string.is_reset_default_height), false);
        if (z2) {
            int i2 = h;
            s = i2;
            t = i2;
            int i3 = k;
            r = i3;
            u = i3;
        } else {
            s = aVar.o().getInt(e.a.a.a.a.d(aVar, C0838R.string.input_view_whole_height), h);
            t = aVar.o().getInt(e.a.a.a.a.d(aVar, C0838R.string.input_view_key_area_height), h);
            r = aVar.o().getInt(e.a.a.a.a.d(aVar, C0838R.string.input_view_hand_write_height), k);
            u = aVar.o().getInt(e.a.a.a.a.d(aVar, C0838R.string.input_view_key_hand_write_area_height), k);
        }
        StringBuilder X = e.a.a.a.a.X("[hand_write] --------isResetDefault=", z2, " mKeyboardPortHeight=");
        X.append(s);
        X.append(" mKeyboardKeyAreaHeight=");
        X.append(t);
        X.append(" mKeyboardPortHandWriteHeight=");
        X.append(r);
        X.append(" mKeyboardKeyHandWriteAreaHeight=");
        X.append(u);
        com.bytedance.android.input.r.j.i("InputViewModel", X.toString());
        v = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_bottom_margin), -1);
        w = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_bottom_margin_for_hand_write), -1);
        B = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_last_save_bottom_navi_height), 0);
        int i4 = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_last_save_bottom_navi_height_for_hand_write), 0);
        C = i4;
        if (i4 == 0) {
            C = B;
        }
        z = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_last_save_state), -1);
        int i5 = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_last_save_state_for_hand_write), -1);
        A = i5;
        if (i5 == -1) {
            A = z;
        }
        x = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_left_margin), -1);
        int i6 = aVar.o().getInt(aVar.getContext().getResources().getString(C0838R.string.input_view_right_margin), -1);
        y = i6;
        if (x < 0) {
            x = 0;
        }
        if (i6 < 0) {
            y = 0;
        }
        int v2 = aVar.v();
        H = v2 > aVar.a();
        I = v2;
    }

    public static final boolean O() {
        return T() ? t > h : Q() ? u > h : t > h;
    }

    public static final boolean P() {
        return K == 2;
    }

    public static final boolean Q() {
        boolean isHandwritingMode = KeyboardJni.getKeyboardJni().isHandwritingMode();
        e.a.a.a.a.y0("[hand_write] isHandWriteMode handWriteMode ", isHandwritingMode, "InputViewModel");
        return isHandwritingMode;
    }

    public static final boolean R() {
        return K == 1;
    }

    public static final boolean S() {
        return H;
    }

    public static final boolean T() {
        e.a.a.a.a.N0(e.a.a.a.a.M("[hand_write] isNumberMode "), L, "InputViewModel");
        return L;
    }

    public static final boolean U() {
        Object e2 = SettingsConfigNext.e(C0838R.string.enable_one_hand_input_mode);
        kotlin.s.c.l.d(e2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) e2).booleanValue();
        e.a.a.a.a.y0("[hand_write] checkOneHandInputMode ", booleanValue, "InputViewModel");
        return booleanValue & (!H);
    }

    public static final boolean V() {
        return K == 0;
    }

    public static final boolean W() {
        IAppGlobals.a aVar = IAppGlobals.a;
        return aVar.o().getBoolean(aVar.getContext().getResources().getString(C0838R.string.is_right_one_hand_input_view), true);
    }

    public static final void X(int i2, int i3) {
        H = i2 > i3;
        I = i2;
    }

    public static final void Y(int i2) {
        D = i2;
    }

    public static final void Z(int i2) {
        e.a.a.a.a.j0("[hand_write] setCurrentHandWriteKeyboardBottomValue start bottomValue = ", i2, "InputViewModel");
        G = i2;
    }

    public static final void a(int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        e.a.a.a.a.N0(e.a.a.a.a.O("finishStretch wholeHeight ", i2, " keyAreaHeight ", i3, " isHandWriteMode="), z3, "InputViewModel");
        if (z3) {
            r = i2;
            IAppGlobals.a aVar = IAppGlobals.a;
            aVar.o().edit().putInt(e.a.a.a.a.d(aVar, C0838R.string.input_view_hand_write_height), r).apply();
            u = i3;
            aVar.o().edit().putInt(e.a.a.a.a.d(aVar, C0838R.string.input_view_key_hand_write_area_height), u).apply();
            w = i4;
            aVar.o().edit().putInt(e.a.a.a.a.d(aVar, C0838R.string.input_view_bottom_margin_for_hand_write), w).apply();
            G = i4;
            A = D;
            C = E;
        } else {
            s = e() + i2;
            IAppGlobals.a aVar2 = IAppGlobals.a;
            aVar2.o().edit().putInt(e.a.a.a.a.d(aVar2, C0838R.string.input_view_whole_height), s).apply();
            t = i3 + e();
            aVar2.o().edit().putInt(e.a.a.a.a.d(aVar2, C0838R.string.input_view_key_area_height), t).apply();
            v = i4;
            aVar2.o().edit().putInt(e.a.a.a.a.d(aVar2, C0838R.string.input_view_bottom_margin), v).apply();
            F = i4;
            z = D;
            B = E;
        }
        if (!z3) {
            x = i5;
            IAppGlobals.a aVar3 = IAppGlobals.a;
            aVar3.o().edit().putInt(e.a.a.a.a.d(aVar3, C0838R.string.input_view_left_margin), x).apply();
            y = i6;
            aVar3.o().edit().putInt(e.a.a.a.a.d(aVar3, C0838R.string.input_view_right_margin), y).apply();
        }
        IAppGlobals.a aVar4 = IAppGlobals.a;
        aVar4.o().edit().putInt(e.a.a.a.a.d(aVar4, C0838R.string.input_view_last_save_state), D).apply();
        aVar4.o().edit().putInt(e.a.a.a.a.d(aVar4, C0838R.string.input_view_last_save_bottom_navi_height), E).apply();
        aVar4.o().edit().putBoolean(aVar4.getContext().getResources().getString(C0838R.string.is_reset_default_height), z2);
        n nVar = n.a;
        n.b(i2, i4, i5, i6, z3);
    }

    public static final void a0(int i2) {
        e.a.a.a.a.j0("[hand_write] setCurrentNormalKeyboardBottomValue start bottomValue = ", i2, "InputViewModel");
        F = i2;
    }

    public static final int b() {
        StringBuilder M = e.a.a.a.a.M("[hand_write] getCurrentKeyboardBottomValue mCurrentBottomValue = ");
        M.append(F);
        M.append(" mCurrentBottomValueForHandWrite = ");
        M.append(G);
        com.bytedance.android.input.r.j.i("InputViewModel", M.toString());
        return T() ? F : Q() ? G : F;
    }

    public static final void b0(int i2) {
        K = i2;
    }

    public static final float c(float f2) {
        return KeyboardView.getStretchScale() * f2;
    }

    public static final void c0(int i2) {
        E = i2;
    }

    public static final LiveData<Boolean> d() {
        return f2645J;
    }

    public static final void d0(boolean z2) {
        e.a.a.a.a.y0("[hand_write] setNumberMode isNumberInputMode ", z2, "InputViewModel");
        L = z2;
        if (z2) {
            KeyboardJni.updateInputViewShownForNumberKeyboard();
        }
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.p0();
        }
    }

    private static final int e() {
        if (com.bytedance.android.input.common.h.a.c()) {
            return i;
        }
        return 0;
    }

    public static final void e0(boolean z2) {
        e.a.a.a.a.y0("[hand_write] setNumberModeForStretchView isNumberInputMode ", z2, "InputViewModel");
        L = z2;
        if (Q()) {
            com.bytedance.android.input.r.j.i("InputViewModel", "[hand_write] setNumberModeForStretchView updateInputViewShown");
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.o0(true);
            }
        }
    }

    public static final int f() {
        int i2;
        int e2;
        StringBuilder M = e.a.a.a.a.M("[hand_write] getKeyboardAreaHeight mIsLandscapeMode = ");
        M.append(H);
        M.append(", isHandWriteMode() = ");
        M.append(Q());
        M.append(" isNumberMode() = ");
        M.append(T());
        M.append(" mKeyboardKeyAreaHeight = ");
        M.append(t);
        M.append(" mKeyboardKeyHandWriteAreaHeight = ");
        e.a.a.a.a.B0(M, u, "InputViewModel");
        if (H) {
            return f2646c;
        }
        if (T()) {
            i2 = t;
            e2 = e();
        } else {
            if (Q()) {
                return u;
            }
            i2 = t;
            e2 = e();
        }
        return i2 - e2;
    }

    public static final void f0(boolean z2) {
        f2645J.setValue(Boolean.valueOf(z2));
    }

    public static final int g() {
        StringBuilder M = e.a.a.a.a.M("[hand_write] getKeyboardBottomMargin mIsLandscapeMode = ");
        M.append(H);
        M.append(", isHandWriteMode = ");
        M.append(Q());
        M.append(" isNumberMode() = ");
        M.append(T());
        M.append(" mKeyboardBottomMargin ");
        M.append(v);
        M.append(" mKeyboardBottomMarginForHandWrite=");
        M.append(w);
        M.append(" InputViewModel.isLandscapeMode()=");
        e.a.a.a.a.N0(M, H, "InputViewModel");
        if (H) {
            return 0;
        }
        if (T()) {
            int i2 = v;
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
        if (Q()) {
            int i3 = w;
            if (i3 < 0) {
                return 0;
            }
            return i3;
        }
        int i4 = v;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public static final void g0(boolean z2) {
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.o().edit().putBoolean(aVar.getContext().getResources().getString(C0838R.string.is_right_one_hand_input_view), z2).apply();
    }

    public static final int h() {
        StringBuilder M = e.a.a.a.a.M("[StretchView] getKeyboardLeftMargin mIsLandscapeMode = ");
        M.append(H);
        M.append(", mKeyboardLeftMargin ");
        M.append(x);
        M.append(" InputViewModel.isLandscapeMode()=");
        e.a.a.a.a.N0(M, H, "InputViewModel");
        if (H) {
            return 0;
        }
        int i2 = x;
        if (i2 < 0) {
            i2 = 0;
        }
        if (U()) {
            i2 = 0;
        }
        if (!T() && Q()) {
            return 0;
        }
        return i2;
    }

    public static final int i() {
        return h;
    }

    public static final int j() {
        return com.bytedance.android.input.common.h.a.c() ? f2647d - i : f2647d;
    }

    public static final int k() {
        return com.bytedance.android.input.common.h.a.c() ? f2648e - i : f2648e;
    }

    public static final int l() {
        StringBuilder M = e.a.a.a.a.M("[StretchView] getKeyboardRightMargin mIsLandscapeMode = ");
        M.append(H);
        M.append(", mKeyboardRightMargin ");
        M.append(y);
        M.append(" InputViewModel.isLandscapeMode()=");
        e.a.a.a.a.N0(M, H, "InputViewModel");
        if (H) {
            return 0;
        }
        int i2 = y;
        if (i2 < 0) {
            i2 = 0;
        }
        if (U()) {
            i2 = 0;
        }
        if (!T() && Q()) {
            return 0;
        }
        return i2;
    }

    public static final int m() {
        return K;
    }

    public static final int n() {
        return com.bytedance.android.input.common.h.a.c() ? f2649f - i : f2649f;
    }

    public static final int o() {
        if (!com.bytedance.android.input.common.h.a.c()) {
            return IAppGlobals.a.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_toolbar);
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        return aVar.getContext().getResources().getInteger(C0838R.integer.ime_keyboard_toolbar) - aVar.getContext().getResources().getInteger(C0838R.integer.ime_editor_input_mode_less);
    }

    public static final int p() {
        int i2;
        int e2;
        StringBuilder M = e.a.a.a.a.M("[hand_write] getKeyboardWholeHeight mIsLandscapeMode = ");
        M.append(H);
        M.append(", mKeyboardPortHeight ");
        M.append(s);
        M.append(" mKeyboardPortHandWriteHeight ");
        e.a.a.a.a.B0(M, r, "InputViewModel");
        if (H) {
            return f2646c;
        }
        if (T()) {
            i2 = s;
            e2 = e();
        } else {
            if (Q()) {
                return r;
            }
            i2 = s;
            e2 = e();
        }
        return i2 - e2;
    }

    public static final int q() {
        int i2;
        int e2;
        if (H) {
            return f2646c;
        }
        if (T()) {
            i2 = h;
            e2 = e();
        } else {
            if (Q()) {
                return k;
            }
            i2 = h;
            e2 = e();
        }
        return i2 - e2;
    }

    public static final int r() {
        return z;
    }

    public static final int s() {
        return A;
    }

    public static final int t() {
        return B;
    }

    public static final int u() {
        return C;
    }

    public static final int v() {
        return j;
    }

    public static final int w() {
        return E;
    }

    public static final int x() {
        return o;
    }

    public static final int y() {
        return p;
    }

    public static final int z() {
        return n;
    }
}
