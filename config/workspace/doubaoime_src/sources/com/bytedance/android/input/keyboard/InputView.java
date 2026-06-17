package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.keyboard.KeyboardView;
import com.bytedance.android.input.keyboard.WizardSelectChineseBoard;
import com.bytedance.android.input.keyboard.aiwrite.AiPanelView;
import com.bytedance.android.input.keyboard.aiwrite.C0601v;
import com.bytedance.android.input.keyboard.aiwrite.V;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.bytedance.android.input.speech.view.AsrEditorLayoutView;
import com.obric.common.upgrade.UserOperation;
import com.obric.common.upgrade.VersionCheckResponse;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InputView extends FrameLayout implements com.bytedance.android.input.keyboard.t.a.a {
    private KeyboardView a;
    private KeyboardView b;

    /* renamed from: c, reason: collision with root package name */
    private InputViewRoot f2509c;

    /* renamed from: d, reason: collision with root package name */
    private InputViewRoot f2510d;

    /* renamed from: e, reason: collision with root package name */
    private InputViewRoot f2511e;

    /* renamed from: f, reason: collision with root package name */
    private View f2512f;

    /* renamed from: g, reason: collision with root package name */
    private AiPanelView f2513g;
    private int h;
    private AppUpgradeTipsUI i;
    private int j;
    private final int[] k;
    private final Rect l;
    private LottieAnimationView m;
    private KeyboardTipView n;
    private ConstraintLayout o;

    class a implements com.bytedance.android.input.keyboard.areacontrol.o {
        a() {
        }

        @Override // com.bytedance.android.input.keyboard.areacontrol.o
        public void a(boolean z) {
            if (z) {
                InputView.b(InputView.this);
                InputView.c(InputView.this);
            } else {
                InputView.this.f0();
                if (InputView.this.n != null) {
                    InputView.this.n.setVisibility(8);
                }
            }
        }

        @Override // com.bytedance.android.input.keyboard.areacontrol.o
        public void b(boolean z, int i, int i2) {
            InputView.a(InputView.this);
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            IAppGlobals.a.o().edit().putInt("keyboard_float_window_x", i).putInt("keyboard_float_window_y", i2).apply();
            if (z) {
                Objects.requireNonNull(InputView.this);
                KeyboardJni.setFloatingWindow(false);
            }
        }

        @Override // com.bytedance.android.input.keyboard.areacontrol.o
        public void c() {
            InputView.a(InputView.this);
        }
    }

    public InputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.b = null;
        this.f2509c = null;
        this.f2510d = null;
        this.f2511e = null;
        this.f2512f = null;
        this.f2513g = null;
        this.h = 0;
        this.i = null;
        this.j = 0;
        this.k = new int[2];
        this.l = new Rect();
    }

    private void M(Configuration configuration) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.b()) {
            configuration.uiMode = 32;
        } else {
            configuration.uiMode = 17;
        }
        getContext().getResources().getConfiguration().uiMode = configuration.uiMode;
        e.a.a.a.a.C0(e.a.a.a.a.M("setCurrentUiMode = "), getContext().getResources().getConfiguration().uiMode, "InputView");
        KeyboardTipView keyboardTipView = this.n;
        if (keyboardTipView != null) {
            if (keyboardTipView.getParent() != null) {
                ViewParent parent = keyboardTipView.getParent();
                kotlin.s.c.l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(keyboardTipView);
            }
            this.n = null;
        }
    }

    static void a(InputView inputView) {
        inputView.f0();
        KeyboardTipView keyboardTipView = inputView.n;
        if (keyboardTipView != null) {
            keyboardTipView.setVisibility(8);
        }
        inputView.b.updateLocation();
        inputView.a.updateLocation();
    }

    static void b(InputView inputView) {
        LottieAnimationView lottieAnimationView = inputView.m;
        if (lottieAnimationView == null || lottieAnimationView.getVisibility() != 0) {
            LottieAnimationView lottieAnimationView2 = inputView.m;
            if (lottieAnimationView2 == null) {
                LottieAnimationView lottieAnimationView3 = new LottieAnimationView(inputView.getContext());
                inputView.m = lottieAnimationView3;
                lottieAnimationView3.setAnimation("lottie/enter_floating_input_mode.json");
                inputView.m.setRepeatCount(0);
                inputView.m.setImageAssetsFolder("lottie/images");
                inputView.m.setScaleType(ImageView.ScaleType.FIT_END);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                inputView.addView(inputView.m, -1, layoutParams);
            } else {
                lottieAnimationView2.k();
            }
            inputView.m.setVisibility(0);
            inputView.m.q();
            UserInteractiveManagerNext.a.a();
        }
    }

    static void c(InputView inputView) {
        KeyboardTipView keyboardTipView = inputView.n;
        if (keyboardTipView == null || keyboardTipView.getVisibility() != 0) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(inputView.o);
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            int stretchScale = (int) (KeyboardView.getStretchScale() * com.bytedance.android.input.keyboard.areacontrol.k.n());
            if (inputView.b.getVisibility() == 0) {
                stretchScale += inputView.b.getHeight();
            }
            int i = stretchScale;
            KeyboardTipView keyboardTipView2 = inputView.n;
            if (keyboardTipView2 == null) {
                inputView.n = new KeyboardTipView(inputView.o.getContext());
                int generateViewId = View.generateViewId();
                inputView.n.setId(generateViewId);
                inputView.o.addView(inputView.n);
                constraintSet.connect(generateViewId, 6, 0, 6, 0);
                constraintSet.connect(generateViewId, 3, 0, 3, 0);
                constraintSet.connect(generateViewId, 7, 0, 7, 0);
                constraintSet.constrainWidth(generateViewId, 0);
                constraintSet.constrainHeight(generateViewId, i);
            } else {
                constraintSet.constrainHeight(keyboardTipView2.getId(), i);
            }
            constraintSet.applyTo(inputView.o);
        }
        inputView.n.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        LottieAnimationView lottieAnimationView = this.m;
        if (lottieAnimationView == null || lottieAnimationView.getVisibility() != 0) {
            return;
        }
        this.m.k();
        this.m.setVisibility(8);
    }

    private void v() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.b()) {
            if (this.f2510d == null) {
                Objects.requireNonNull(aVar);
                InputViewRoot inputViewRoot = new InputViewRoot(aVar.g(32));
                this.f2510d = inputViewRoot;
                inputViewRoot.Q();
            }
            InputViewRoot inputViewRoot2 = this.f2509c;
            if (inputViewRoot2 == null || inputViewRoot2 != this.f2510d) {
                if (inputViewRoot2 != null) {
                    inputViewRoot2.setVisibility(8);
                    this.f2509c.k0();
                    removeView(this.f2509c);
                }
                this.f2509c = this.f2510d;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                r(false);
                u();
                addView(this.f2509c, -1, layoutParams);
                this.f2509c.u(this.a, this.b);
                this.f2509c.setWindowBottomInsetPadding(this.h);
                this.f2509c.setVisibility(0);
            }
        } else {
            if (this.f2511e == null) {
                Objects.requireNonNull(aVar);
                InputViewRoot inputViewRoot3 = new InputViewRoot(aVar.g(16));
                this.f2511e = inputViewRoot3;
                inputViewRoot3.Q();
            }
            InputViewRoot inputViewRoot4 = this.f2509c;
            if (inputViewRoot4 == null || inputViewRoot4 != this.f2511e) {
                if (inputViewRoot4 != null) {
                    inputViewRoot4.setVisibility(8);
                    this.f2509c.k0();
                    removeView(this.f2509c);
                }
                this.f2509c = this.f2511e;
                ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
                r(false);
                u();
                addView(this.f2509c, -1, layoutParams2);
                this.f2509c.u(this.a, this.b);
                this.f2509c.setWindowBottomInsetPadding(this.h);
                this.f2509c.setVisibility(0);
            }
        }
        this.f2509c.setOnDragToEdgeListener(new a());
        M(getContext().getResources().getConfiguration());
        this.o = (ConstraintLayout) findViewById(C0838R.id.input_view_root);
    }

    public boolean A() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            Objects.requireNonNull(inputViewRoot);
            if (com.bytedance.android.input.keyboard.t.b.a.a.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean B() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            return inputViewRoot.V();
        }
        return false;
    }

    public void C() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            Objects.requireNonNull(inputViewRoot);
        }
    }

    public /* synthetic */ void D() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.z();
        }
    }

    public void E(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.g0(z);
        }
    }

    public void F() {
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        com.bytedance.android.input.keyboard.areacontrol.k.N();
        if (this.a == null) {
            KeyboardView keyboardView = new KeyboardView(getContext());
            this.a = keyboardView;
            keyboardView.setIdName(C0838R.string.soft_view, true);
            this.a.setBackgroundColor(getContext().getColor(C0838R.color.transparent));
            this.a.setListener(new KeyboardView.d() { // from class: com.bytedance.android.input.keyboard.e
                @Override // com.bytedance.android.input.keyboard.KeyboardView.d
                public final void a(int i) {
                    InputView.this.setKeyboadViewVisibility(i);
                }
            });
        }
        if (this.b == null) {
            KeyboardView keyboardView2 = new KeyboardView(getContext());
            this.b = keyboardView2;
            keyboardView2.setIdName(C0838R.string.translate_view, false);
            this.b.setBackgroundColor(getContext().getColor(C0838R.color.transparent));
            this.b.setListener(new KeyboardView.d() { // from class: com.bytedance.android.input.keyboard.d
                @Override // com.bytedance.android.input.keyboard.KeyboardView.d
                public final void a(int i) {
                    InputView.this.setTranslateViewVisibility(i);
                }
            });
        }
        KeyboardJni.getKeyboardJni().ReloadConfig(SettingsConfigNext.a.a(false));
        JSONObject jSONObject = new JSONObject();
        String string = getContext().getString(C0838R.string.enable_gpt2);
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            jSONObject.put(string, aVar.o().getBoolean(string, true));
            KeyboardJni.getKeyboardJni().ReloadConfig(jSONObject.toString());
        } catch (Exception unused) {
        }
        KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
        IEnvironment.a aVar2 = IEnvironment.a;
        Objects.requireNonNull(aVar2);
        String e2 = aVar2.e();
        String i = aVar2.i();
        String a2 = aVar2.a();
        String l = aVar2.l();
        String b = aVar2.b();
        IAppGlobals.a aVar3 = IAppGlobals.a;
        Objects.requireNonNull(aVar3);
        keyboardJni.initKeyboard(e2, i, a2, l, b, "1.3.9", d.a.b.a.c(aVar3), aVar2.k());
        KeyboardJni.getKeyboardJni().loadAsrModifyPairDict(aVar2.a(), aVar2.l());
        v();
        this.f2512f = findViewById(C0838R.id.keyboard_top_border);
        requestLayout();
    }

    public void G() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.h0();
        }
        r(true);
        u();
        InputViewRoot inputViewRoot2 = this.f2509c;
        if (inputViewRoot2 != null) {
            inputViewRoot2.p0(false);
        }
        Q(false);
        if (this.f2509c != null) {
            com.bytedance.android.input.keyboard.word_segmentation.n.a();
        }
        InputViewRoot inputViewRoot3 = this.f2509c;
        if (inputViewRoot3 != null) {
            inputViewRoot3.w(false);
        }
    }

    public void H(Window window) {
        v();
        this.f2509c.i0(false);
        KeyboardJni.setCommonPhraseEditorFocused(false);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        setTopBorderVisible(!aVar.K());
        Objects.requireNonNull(aVar);
        if (aVar.K()) {
            Objects.requireNonNull(aVar);
            this.j = aVar.l(getContext(), C0838R.color.transparent);
        } else {
            Objects.requireNonNull(aVar);
            this.j = aVar.l(getContext(), C0838R.color.navigation_bar_normal);
        }
        KeyboardJni.getService().n(this.j);
        StringBuilder sb = new StringBuilder();
        sb.append("bk_color=");
        sb.append(Integer.toHexString(this.j));
        sb.append(", isDark ");
        Objects.requireNonNull(aVar);
        sb.append(aVar.b());
        sb.append(", ui = ");
        sb.append(getContext().getResources().getConfiguration().uiMode);
        com.bytedance.android.input.r.j.m("InputView", sb.toString());
        Objects.requireNonNull(aVar);
        if (!aVar.b()) {
            window.getDecorView().setSystemUiVisibility(16);
        } else {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    public void I(int i, int i2, int i3, int i4, int i5) {
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        com.bytedance.android.input.keyboard.areacontrol.k.X(i3, i4);
        if (this.a != null) {
            KeyboardJni.getKeyboardJni().updateScreenSize(i, i2, i3, i4);
            KeyboardJni.getKeyboardJni().updateWindowState(i5);
        }
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.i0(false);
            this.f2509c.setKeyboardState(i5);
        }
        KeyboardJni.getKeyboardJni().UpdateQUICConfig(IInputSettings.a.a().h() ? 1 : 0);
        com.bytedance.android.input.r.j.m("InputView", "onUpdateInputViewShown: " + i + ", " + i2 + ", " + i3 + ", " + i4 + ") , set" + com.bytedance.android.input.keyboard.areacontrol.k.G());
        if (i5 == 2) {
            setFloatingInputMode(true);
        } else {
            setFloatingInputMode(false);
        }
        AiPanelView aiPanelView = this.f2513g;
        if (aiPanelView != null) {
            aiPanelView.setKeyboardState(i5);
        }
    }

    public void J() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.j0();
        }
        KeyboardJni.getService().n(this.j);
        View view = this.f2512f;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void K() {
        KeyboardView keyboardView = this.a;
        if (keyboardView != null) {
            keyboardView.removeGlobalLayoutListener();
        }
        KeyboardView keyboardView2 = this.b;
        if (keyboardView2 != null) {
            keyboardView2.removeGlobalLayoutListener();
        }
    }

    public void L() {
        com.bytedance.android.input.r.j.i("InputView", "[StretchView] resetKeyboardMargin");
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.l0();
        }
    }

    public void N(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.o0(z);
        }
    }

    public void O(Boolean bool, Boolean bool2) {
        InputViewRoot inputViewRoot;
        com.bytedance.android.input.r.j.i("InputView", "showAiPanel, isShow=" + bool + ", isAiPanelShow()=" + y() + ", notifyFwk=" + bool2);
        if (bool.booleanValue()) {
            boolean booleanValue = bool2.booleanValue();
            boolean z = true;
            if (booleanValue && !y()) {
                V.i(V.f() ? 2 : 1);
                V.j();
            }
            if (this.f2513g == null) {
                m();
            }
            this.f2513g.setVisibility(0);
            InputViewRoot inputViewRoot2 = this.f2509c;
            if (inputViewRoot2 != null) {
                inputViewRoot2.setVisibility(8);
            }
            ImeService service = KeyboardJni.getService();
            Context context = getContext();
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            service.n(ContextCompat.getColor(context, aVar.b() ? C0838R.color.aiwriting_bk_navigation_night : C0838R.color.aiwriting_bk_navigation));
            Boolean bool3 = Boolean.TRUE;
            C0601v c0601v = C0601v.a;
            if (!bool3.equals(c0601v.h().getValue()) && !bool3.equals(c0601v.i().getValue())) {
                z = false;
            }
            this.f2513g.findViewById(C0838R.id.ai_btn_check).setVisibility(z ? 0 : 8);
        } else {
            KeyboardJni.getService().n(this.j);
            if (bool2.booleanValue() && y()) {
                V.h();
            }
            AiPanelView aiPanelView = this.f2513g;
            if (aiPanelView != null) {
                aiPanelView.setVisibility(8);
            }
            if (!WizardSelectChineseBoard.a.a() && (inputViewRoot = this.f2509c) != null) {
                inputViewRoot.setVisibility(0);
            }
        }
        KeyboardJni.updateInputViewShown();
    }

    public void P(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.p0(z);
        }
    }

    public void Q(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.q0(z);
        }
    }

    public void R(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.r0(z);
        }
    }

    public void S(String str, Boolean bool) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.s0(str, bool.booleanValue());
        }
    }

    public void T(Boolean bool) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.w0(bool.booleanValue());
        }
    }

    public void U(Boolean bool) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.x0(bool.booleanValue());
            if (bool.booleanValue()) {
                this.f2509c.setCommonPhraseEditViewEnabled(false, new String[0]);
            }
        }
    }

    public void V(boolean z, String str, String str2) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.y0(z, str, str2);
        }
    }

    public void W(Boolean bool) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.z0(bool.booleanValue());
        }
    }

    public void X(boolean z) {
        if (this.f2509c != null) {
            com.bytedance.android.input.r.j.m("InputView", "showNavigationPaddingView  show " + z);
            this.f2509c.A0(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Y(int i) {
        if (this.f2509c != null) {
            e.a.a.a.a.k0("showNavigationPaddingViewBottom  set ", i, "InputView");
            if (i < 0) {
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                com.bytedance.android.input.keyboard.areacontrol.k.Y(-1);
                this.f2509c.B0(false, 0);
                this.f2509c.M();
                return;
            }
            com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
            int C = com.bytedance.android.input.keyboard.areacontrol.k.C() - i;
            boolean z = C > 0 ? 1 : 0;
            com.bytedance.android.input.keyboard.areacontrol.k.Y(!z);
            this.f2509c.B0(z, C);
            this.f2509c.u0(z, i, C);
        }
    }

    public void Z() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.C0();
        }
    }

    public void a0(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.D0(z);
            if (!z || this.f2512f == null) {
                return;
            }
            KeyboardJni.getService().n(ContextCompat.getColor(getContext(), C0838R.color.system_keyboard_bk));
            this.f2512f.setVisibility(8);
        }
    }

    public void b0(ToolbarType toolbarType, com.bytedance.android.input.keyboard.toolbar.entity.a aVar) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.E0(toolbarType, aVar);
        }
    }

    public void c0(VersionCheckResponse versionCheckResponse, kotlin.s.b.l<UserOperation, kotlin.o> lVar) {
        StringBuilder M = e.a.a.a.a.M("mKeyboardView h:");
        M.append(this.a.getHeight());
        M.append("w=");
        M.append(this.a.getWidth());
        com.bytedance.android.input.r.j.i("InputView", M.toString());
        if (KeyboardJni.isFloatingMode()) {
            com.bytedance.android.input.r.j.i("InputView", "The upgrade UI should not be displayed in the floating keyboard");
            return;
        }
        AppUpgradeTipsUI appUpgradeTipsUI = this.i;
        if (appUpgradeTipsUI != null) {
            appUpgradeTipsUI.setVisibility(4);
        }
        AppUpgradeTipsUI appUpgradeTipsUI2 = this.i;
        if (appUpgradeTipsUI2 != null && appUpgradeTipsUI2.getParent() != null) {
            ((InputView) this.i.getParent()).removeView(this.i);
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        AppUpgradeTipsUI appUpgradeTipsUI3 = (AppUpgradeTipsUI) aVar.E(getContext(), C0838R.layout.app_upgrade_tips_ui);
        this.i = appUpgradeTipsUI3;
        appUpgradeTipsUI3.g(versionCheckResponse, lVar);
        addView(this.i, new ViewGroup.LayoutParams(-1, -1));
        this.i.setVisibility(0);
    }

    public void d0() {
        StringBuilder M = e.a.a.a.a.M("mKeyboardView h:");
        M.append(this.a.getHeight());
        M.append("w=");
        M.append(this.a.getWidth());
        com.bytedance.android.input.r.j.i("InputView", M.toString());
        this.f2509c.F0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchConfigurationChanged(Configuration configuration) {
        StringBuilder M = e.a.a.a.a.M("dispatchConfigurationChanged ");
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        M.append(aVar.b());
        com.bytedance.android.input.r.j.m("InputView", M.toString());
        M(configuration);
        super.dispatchConfigurationChanged(configuration);
    }

    public void e0(WordSegmentationData wordSegmentationData) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.G0(wordSegmentationData);
        }
    }

    public void f() {
        KeyboardView keyboardView = this.a;
        if (keyboardView != null) {
            keyboardView.addGlobalLayoutListener();
        }
        KeyboardView keyboardView2 = this.b;
        if (keyboardView2 != null) {
            keyboardView2.addGlobalLayoutListener();
        }
    }

    public void g() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.y();
        }
    }

    public boolean g0() {
        if (y()) {
            return false;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        return !aVar.K();
    }

    public void h() {
        post(new Runnable() { // from class: com.bytedance.android.input.keyboard.c
            @Override // java.lang.Runnable
            public final void run() {
                InputView.this.D();
            }
        });
    }

    public void h0(String str, Boolean bool, Boolean bool2, Boolean bool3) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.H0(str, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
        }
    }

    public void i() {
        if (this.f2509c.R()) {
            this.f2509c.I().q();
        }
    }

    public void i0(byte[] bArr) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.I0(bArr);
        }
    }

    public void j(ToolbarType toolbarType, com.bytedance.android.input.keyboard.toolbar.entity.a aVar) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.G(toolbarType, aVar);
        }
    }

    public void j0(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.J0();
        }
    }

    public void k() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot == null || !com.bytedance.android.input.common.h.a.c()) {
            return;
        }
        inputViewRoot.i0(true);
    }

    public void k0(boolean z, String str) {
        e.a.a.a.a.r0("[hand_write] updateHandwritingEnterOkText from=", str, "InputView");
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.K0(z, str);
        }
    }

    public void l(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.H(z);
        }
    }

    public void l0() {
        com.bytedance.android.input.r.j.i("InputView", "[hand_write] updateHandwritingEnterText");
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.L0();
        }
    }

    public AiPanelView m() {
        AiPanelView aiPanelView = this.f2513g;
        if (aiPanelView == null) {
            AiPanelView aiPanelView2 = new AiPanelView(getContext());
            this.f2513g = aiPanelView2;
            aiPanelView2.h();
            this.f2513g.setWindowBottomInsetPadding(this.h);
            this.f2513g.setVisibility(8);
            addView(this.f2513g);
        } else {
            aiPanelView.c();
            this.f2513g.setWindowBottomInsetPadding(this.h);
        }
        return this.f2513g;
    }

    public void m0(KeyboardJni.EnterActionType enterActionType) {
        com.bytedance.android.input.r.j.i("InputView", "[hand_write] updateHandwritingEnterText=" + enterActionType);
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.M0(enterActionType);
        }
    }

    public AsrEditorLayoutView n() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            return inputViewRoot.J();
        }
        return null;
    }

    public void n0(boolean z) {
        com.bytedance.android.input.r.j.i("InputView", "[hand_write] updateHandwritingSpaceStyle");
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.N0(z);
        }
    }

    public InputConnection o() {
        return this.f2509c.K();
    }

    public void o0(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.i0(z);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged() ");
        M.append(configuration.uiMode);
        M.append(", ");
        M.append(configuration.orientation);
        M.append(", ");
        e.a.a.a.a.C0(M, getContext().getResources().getConfiguration().uiMode, "InputView");
        super.onConfigurationChanged(configuration);
        KeyboardView keyboardView = this.a;
        if (keyboardView != null) {
            keyboardView.onConfigurationChanged(configuration);
            if (WizardSelectChineseBoard.a.a()) {
                d0();
            }
        }
        KeyboardView keyboardView2 = this.b;
        if (keyboardView2 != null) {
            keyboardView2.onConfigurationChanged(configuration);
        }
        com.bytedance.android.input.keyboard.t.b.a aVar = com.bytedance.android.input.keyboard.t.b.a.a;
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        aVar.f(com.bytedance.android.input.keyboard.areacontrol.k.m());
        com.bytedance.android.input.keyboard.word_segmentation.n.d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e.a.a.a.a.m0("onLayout() left = ", i, ", top = ", i2, "InputView");
        super.onLayout(z, i, i2, i3, i4);
        com.bytedance.android.input.popup.q.f().o();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        StringBuilder O = e.a.a.a.a.O("onMeasure() widthMode = ", mode, ", widthSize = ", size, ", heightMode = ");
        O.append(mode2);
        O.append(", heightSize = ");
        O.append(size2);
        com.bytedance.android.input.r.j.i("InputView", O.toString());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        StringBuilder O = e.a.a.a.a.O("onSizeChanged() w = ", i, ", h = ", i2, ", old_w = ");
        O.append(i3);
        O.append(", old_h = ");
        O.append(i4);
        com.bytedance.android.input.r.j.m("InputView", O.toString());
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        StringBuilder N = e.a.a.a.a.N("onVisibilityChanged, visibility = ", i, ", width = ");
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        N.append(aVar.v());
        N.append(", changedView = ");
        N.append(view);
        com.bytedance.android.input.r.j.m("InputView", N.toString());
        super.onVisibilityChanged(view, i);
    }

    public KeyboardView p() {
        return this.a;
    }

    public void p0() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.O0();
        }
    }

    public Rect q() {
        this.f2509c.getLocationInWindow(this.k);
        Rect rect = this.l;
        int[] iArr = this.k;
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = this.f2509c.getWidth() + iArr[0];
        this.l.bottom = this.f2509c.getHeight() + this.k[1];
        return this.l;
    }

    public void r(boolean z) {
        com.bytedance.android.input.r.j.m("InputView", "hideAppUpgradeTipsUIAndRemove, ignore = " + z);
        AppUpgradeTipsUI appUpgradeTipsUI = this.i;
        if (appUpgradeTipsUI == null || appUpgradeTipsUI.getVisibility() != 0) {
            return;
        }
        this.i.setVisibility(4);
        removeView(this.i);
        this.i = null;
        if (z) {
            KeyboardJni.getService().B();
        }
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.setVisibility(0);
        }
        com.bytedance.android.input.r.j.m("InputView", "hideAppUpgradeTipsUIAndRemove");
    }

    public void s() {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.N();
        }
    }

    public void setCommonPhraseEditViewEnabled(Boolean bool) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.setCommonPhraseEditViewEnabled(bool.booleanValue(), new String[0]);
        }
    }

    public void setFloatingInputMode(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (-1 != layoutParams2.width || -1 != layoutParams2.height || 80 != layoutParams2.gravity) {
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    setLayoutParams(layoutParams2);
                }
                View view = this.f2512f;
                if (view != null) {
                    view.setVisibility(8);
                }
                r(false);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                if (-1 != layoutParams4.width || -2 != layoutParams4.height || 80 != layoutParams4.gravity) {
                    layoutParams4.width = -1;
                    layoutParams4.height = -2;
                    layoutParams4.gravity = 80;
                    setLayoutParams(layoutParams4);
                }
                View view2 = this.f2512f;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        }
        this.f2509c.setFloatingInputMode(z);
    }

    public void setInputViewImageBg() {
        this.f2509c.setInputViewImageBg();
    }

    public void setKeyboadViewVisibility(int i) {
        if (i != 0) {
            e.a.a.a.a.k0("setKeyboadViewVisibility = ", i, "InputView");
        }
    }

    public void setTopBorderVisible(boolean z) {
        View view = this.f2512f;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
    }

    public void setTranslateViewVisibility(int i) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.setTranslateViewVisibility(i);
        }
    }

    public void setWindowBottomInsetPadding(int i) {
        e.a.a.a.a.j0("setWindowBottomInsetPadding, bottomPadding=", i, "InputView");
        this.h = i;
        setPadding(0, 0, 0, 0);
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.setWindowBottomInsetPadding(i);
        }
        AiPanelView aiPanelView = this.f2513g;
        if (aiPanelView != null) {
            aiPanelView.setWindowBottomInsetPadding(i);
        }
    }

    public void t(boolean z) {
        InputViewRoot inputViewRoot = this.f2509c;
        if (inputViewRoot != null) {
            inputViewRoot.O(z);
        }
    }

    public void u() {
        this.f2509c.P();
        AppUpgradeTipsUI appUpgradeTipsUI = this.i;
        if (appUpgradeTipsUI != null && appUpgradeTipsUI.getVisibility() == 0) {
            return;
        }
        this.f2509c.setVisibility(0);
    }

    public boolean w() {
        return this.f2509c.R();
    }

    public boolean x() {
        return this.f2513g != null && y() && m().g();
    }

    public boolean y() {
        AiPanelView aiPanelView = this.f2513g;
        return aiPanelView != null && aiPanelView.getVisibility() == 0;
    }

    public boolean z() {
        InputViewRoot inputViewRoot = this.f2509c;
        return inputViewRoot != null && inputViewRoot.S() && this.f2509c.T();
    }
}
