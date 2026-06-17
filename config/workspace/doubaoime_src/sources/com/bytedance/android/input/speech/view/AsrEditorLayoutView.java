package com.bytedance.android.input.speech.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.popup.BackspaceSwipeWindow;
import com.bytedance.android.input.speech.AsrConvertInfo;
import com.bytedance.android.input.speech.AsrManager;
import com.obric.oui.text.OTextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AsrEditorLayoutView extends LinearLayout implements View.OnClickListener, View.OnTouchListener {

    @SuppressLint({"ClickableViewAccessibility"})
    private final View.OnTouchListener A;
    private final View.OnLongClickListener B;
    private final String a;
    private ImageButton b;

    /* renamed from: c, reason: collision with root package name */
    private ImageButton f3147c;

    /* renamed from: d, reason: collision with root package name */
    private LottieAnimationView f3148d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f3149e;

    /* renamed from: f, reason: collision with root package name */
    private LottieAnimationView f3150f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f3151g;
    private ImageButton h;
    private ImageButton i;
    private OTextView j;
    private int k;
    private CustomScrollView l;
    private View m;
    private View n;
    private View o;
    private LinearLayout p;
    private ImageButton q;
    private boolean r;
    private C0603x s;
    private boolean t;
    private final boolean u;
    private final String[] v;
    private int w;
    private int x;
    private int y;
    private String z;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            com.bytedance.android.input.r.j.m(AsrEditorLayoutView.this.a, "set asr_first_in_editor_panel = false");
            AsrEditorLayoutView.this.s = null;
            IAppGlobals.a.o().edit().putBoolean(this.b, false).apply();
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
        final /* synthetic */ LinearLayout a;
        final /* synthetic */ AsrEditorLayoutView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LinearLayout linearLayout, AsrEditorLayoutView asrEditorLayoutView) {
            super(1);
            this.a = linearLayout;
            this.b = asrEditorLayoutView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(String str) {
            String str2 = str;
            kotlin.s.c.l.e(str2, "it");
            if (str2.length() > 0) {
                LinearLayout linearLayout = this.a;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView = this.b.f3150f;
                if (lottieAnimationView != null) {
                    lottieAnimationView.p();
                }
                if (AsrManager.a.H()) {
                    AsrEditorLayoutView asrEditorLayoutView = this.b;
                    AsrEditorLayoutView.h(asrEditorLayoutView, asrEditorLayoutView.f3147c, true);
                } else {
                    AsrEditorLayoutView asrEditorLayoutView2 = this.b;
                    AsrEditorLayoutView.h(asrEditorLayoutView2, asrEditorLayoutView2.f3147c, false);
                }
            } else {
                if (str2.length() == 0) {
                    View view = this.b.o;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (AsrManager.a.H()) {
                        LinearLayout linearLayout2 = this.a;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                        LottieAnimationView lottieAnimationView2 = this.b.f3150f;
                        if (lottieAnimationView2 != null) {
                            lottieAnimationView2.q();
                        }
                        AsrEditorLayoutView asrEditorLayoutView3 = this.b;
                        AsrEditorLayoutView.h(asrEditorLayoutView3, asrEditorLayoutView3.f3147c, false);
                    }
                }
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            if (bool.booleanValue()) {
                String value = l.a.n().getValue();
                if (value != null && value.length() == 0) {
                    AsrEditorLayoutView.this.t(true);
                    LottieAnimationView lottieAnimationView = AsrEditorLayoutView.this.f3150f;
                    if (lottieAnimationView != null) {
                        lottieAnimationView.q();
                    }
                    LinearLayout linearLayout = AsrEditorLayoutView.this.f3151g;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    AsrEditorLayoutView asrEditorLayoutView = AsrEditorLayoutView.this;
                    AsrEditorLayoutView.h(asrEditorLayoutView, asrEditorLayoutView.f3147c, false);
                } else {
                    AsrEditorLayoutView asrEditorLayoutView2 = AsrEditorLayoutView.this;
                    AsrEditorLayoutView.h(asrEditorLayoutView2, asrEditorLayoutView2.f3147c, true);
                }
                OTextView oTextView = AsrEditorLayoutView.this.j;
                if (oTextView != null) {
                    oTextView.setVisibility(0);
                }
                View view = AsrEditorLayoutView.this.o;
                if (view != null) {
                    view.setVisibility(8);
                }
                CustomScrollView customScrollView = AsrEditorLayoutView.this.l;
                if (customScrollView != null) {
                    customScrollView.setBottomFadingEdgeEnabled(false);
                }
                AsrEditorLayoutView.this.setKeepScreenOn(true);
            } else {
                AsrEditorLayoutView.this.t(false);
                LottieAnimationView lottieAnimationView2 = AsrEditorLayoutView.this.f3150f;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.p();
                }
                LinearLayout linearLayout2 = AsrEditorLayoutView.this.f3151g;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                OTextView oTextView2 = AsrEditorLayoutView.this.j;
                if (oTextView2 != null) {
                    oTextView2.setVisibility(8);
                }
                AsrEditorLayoutView asrEditorLayoutView3 = AsrEditorLayoutView.this;
                AsrEditorLayoutView.h(asrEditorLayoutView3, asrEditorLayoutView3.f3147c, false);
                CustomScrollView customScrollView2 = AsrEditorLayoutView.this.l;
                if (customScrollView2 != null) {
                    customScrollView2.setBottomFadingEdgeEnabled(true);
                }
                AsrEditorLayoutView.this.setKeepScreenOn(false);
                if (com.obric.oui.common.util.b.e(AsrEditorLayoutView.this)) {
                    AsrEditorLayoutView.this.l();
                }
            }
            return kotlin.o.a;
        }
    }

    static final class d implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        d(kotlin.s.b.l lVar) {
            kotlin.s.c.l.f(lVar, "function");
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.s.c.h)) {
                return kotlin.s.c.l.a(this.a, ((kotlin.s.c.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.s.c.h
        public final kotlin.b<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrEditorLayoutView(Context context) {
        super(context);
        kotlin.s.c.l.c(context);
        this.a = "AsrEditorLayoutView";
        this.r = true;
        this.u = KeyboardJni.isFloatingMode();
        this.v = new String[]{"😊", "👍", "😂", "😄", "😎", "🙏", "😭", "🥺", "🤣", "✨", "😍"};
        this.z = "";
        LinearLayout.inflate(m(), C0838R.layout.layout_asr_editor, this);
        this.A = new View.OnTouchListener() { // from class: com.bytedance.android.input.speech.view.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                AsrEditorLayoutView.r(AsrEditorLayoutView.this, view, motionEvent);
                return true;
            }
        };
        this.B = new View.OnLongClickListener() { // from class: com.bytedance.android.input.speech.view.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                AsrEditorLayoutView.p(AsrEditorLayoutView.this, view);
                return true;
            }
        };
    }

    public static final void h(AsrEditorLayoutView asrEditorLayoutView, ImageButton imageButton, boolean z) {
        com.bytedance.android.input.r.j.i(asrEditorLayoutView.a, "setBtnStatus " + imageButton + ", enable: " + z);
        if (imageButton != null) {
            imageButton.setEnabled(z);
            imageButton.setAlpha(z ? 1.0f : 0.4f);
        }
    }

    private final void k(LinearLayout linearLayout) {
        View view;
        if (linearLayout != null) {
            IAppGlobals.a aVar = IAppGlobals.a;
            view = aVar.z(aVar.getContext(), C0838R.layout.llm_candidate_item, linearLayout, false);
        } else {
            view = null;
        }
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        final LinearLayout linearLayout2 = (LinearLayout) view;
        linearLayout.addView(linearLayout2);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.speech.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AsrEditorLayoutView.q(AsrEditorLayoutView.this, linearLayout2, view2);
            }
        });
    }

    private final Context m() {
        Configuration configuration = new Configuration(getResources().getConfiguration());
        if (this.u) {
            configuration.densityDpi = (int) (getResources().getDisplayMetrics().densityDpi * 0.8f);
        }
        Context createConfigurationContext = getContext().createConfigurationContext(configuration);
        kotlin.s.c.l.e(createConfigurationContext, "context.createConfigurationContext(config)");
        return createConfigurationContext;
    }

    private final String[] n(String str, boolean z) {
        String[] candliste;
        String[] i = l.a.i(str);
        this.w = i.length;
        AsrConvertInfo convertResult = KeyboardJni.getKeyboardJni().getConvertResult(str, i, z);
        String str2 = this.a;
        StringBuilder M = e.a.a.a.a.M("nBestListResult: ");
        M.append(kotlin.collections.g.f0(i));
        M.append(", inAsr = ");
        M.append(z);
        M.append(", result = ");
        M.append(convertResult != null ? Integer.valueOf(convertResult.getHighFrequencyCount()) : null);
        M.append(' ');
        M.append((convertResult == null || (candliste = convertResult.getCandliste()) == null) ? null : kotlin.collections.g.f0(candliste));
        com.bytedance.android.input.r.j.i(str2, M.toString());
        if (convertResult == null) {
            this.w = 0;
            return null;
        }
        this.x = convertResult.getHighFrequencyCount();
        return convertResult.getCandliste();
    }

    public static boolean p(AsrEditorLayoutView asrEditorLayoutView, View view) {
        kotlin.s.c.l.f(asrEditorLayoutView, "this$0");
        com.bytedance.android.input.r.j.i(asrEditorLayoutView.a, "onBackspaceLongClick v: " + view + ". v-left: " + view.getLeft() + "v-top: " + view.getTop() + ", v-right: " + view.getRight() + ", v-bottom: " + view.getBottom());
        AsrManager.a.p0(true, "backsapceLong");
        BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
        BackspaceSwipeWindow.j().e();
        return true;
    }

    public static void q(AsrEditorLayoutView asrEditorLayoutView, LinearLayout linearLayout, View view) {
        String str;
        kotlin.s.c.l.f(asrEditorLayoutView, "this$0");
        kotlin.s.c.l.f(linearLayout, "$candidateItemLayout");
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
        if (asrEditorLayoutView.r && linearLayout.getTag() != null) {
            KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
            Object tag = linearLayout.getTag();
            kotlin.s.c.l.d(tag, "null cannot be cast to non-null type kotlin.Int");
            keyboardJni.directCommitCandByEngine(((Integer) tag).intValue());
        }
        OTextView oTextView = (OTextView) linearLayout.findViewById(C0838R.id.llm_candidate);
        if (!asrEditorLayoutView.t) {
            KeyboardJni.getKeyboardJni().addAsrModifyPairInfo(com.bytedance.android.input.common.g.c().toString(), oTextView.getText().toString(), IAppGlobals.a.H());
        }
        KeyboardJni.DoCommit(oTextView.getText().toString(), 0);
        if (linearLayout.getTag() != null) {
            Object tag2 = linearLayout.getTag();
            kotlin.s.c.l.d(tag2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag2).intValue();
            int i = intValue < 9 ? intValue + 1 : 10;
            String str2 = new kotlin.text.i("\\p{P}").d(String.valueOf(oTextView.getText().toString().charAt(0))) ? "symbol" : kotlin.collections.g.g(asrEditorLayoutView.v, oTextView.getText().toString()) ? "emoji" : "other";
            if (asrEditorLayoutView.t) {
                IAppLog.a aVar = IAppLog.a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("index", i);
                jSONObject.put("type", str2);
                aVar.t("voiceinput_association_click", jSONObject);
            } else {
                IAppLog.a aVar2 = IAppLog.a;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("index", i);
                aVar2.t("voiceinput_error_cand_click", jSONObject2);
            }
            if (asrEditorLayoutView.z.length() > 0) {
                int i2 = asrEditorLayoutView.w;
                if (intValue < i2) {
                    str = "nbest";
                } else {
                    int i3 = i2 + asrEditorLayoutView.x;
                    str = intValue < i3 ? "highwords" : intValue < i3 + asrEditorLayoutView.y ? "userwords" : "";
                }
                if (str.length() > 0) {
                    IAppLog.a aVar3 = IAppLog.a;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("iskeyboard", false);
                    jSONObject3.put("choosetype", asrEditorLayoutView.z);
                    jSONObject3.put("clicktype", str);
                    aVar3.t("recommendwords_click", jSONObject3);
                }
            }
        }
    }

    public static boolean r(AsrEditorLayoutView asrEditorLayoutView, View view, MotionEvent motionEvent) {
        kotlin.s.c.l.f(asrEditorLayoutView, "this$0");
        com.bytedance.android.input.r.j.i(asrEditorLayoutView.a, "onBackspaceTouch v: " + view + ". v-left: " + view.getLeft() + "v-top: " + view.getTop() + ", v-right: " + view.getRight() + ", v-bottom: " + view.getBottom());
        AsrManager asrManager = AsrManager.a;
        if (asrManager.H()) {
            e.a.a.a.a.q0("stoptype", "backspace", IAppLog.a, "voiceinput_panel_stop");
        }
        asrManager.p0(true, "backspace");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        asrEditorLayoutView.getLocationOnScreen(iArr2);
        if (motionEvent != null) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                view.setSelected(true);
            } else if (action == 1) {
                view.setSelected(false);
            }
            BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
            BackspaceSwipeWindow.j().r(action, motionEvent.getX(), motionEvent.getY(), motionEvent.getEventTime() - motionEvent.getDownTime(), view.getLeft(), (view.getTop() + iArr[1]) - iArr2[1], view.getRight(), (view.getBottom() + iArr[1]) - iArr2[1]);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(boolean z) {
        e.a.a.a.a.y0("setBtnVoiceStatus isStarted=", z, this.a);
        if (z) {
            LottieAnimationView lottieAnimationView = this.f3148d;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.q();
            }
            ImageView imageView = this.f3149e;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        LottieAnimationView lottieAnimationView2 = this.f3148d;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.p();
            lottieAnimationView2.setVisibility(8);
        }
        ImageView imageView2 = this.f3149e;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    private final void v(Context context) {
        Resources resources = context.getResources();
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        boolean R = com.bytedance.android.input.keyboard.areacontrol.k.R();
        int i = R ? C0838R.dimen.asr_editor_text_container_padding_horizontal_land : C0838R.dimen.asr_editor_text_container_padding_horizontal;
        int i2 = R ? C0838R.dimen.asr_editor_candidate_container_padding_horizontal_land : C0838R.dimen.asr_editor_candidate_container_padding_horizontal;
        int i3 = R ? C0838R.dimen.asr_editor_button_container_padding_horizontal_land : C0838R.dimen.asr_editor_button_container_padding_horizontal;
        CustomScrollView customScrollView = this.l;
        kotlin.s.c.l.e(resources, "newResources");
        w(customScrollView, resources, i);
        w(this.m, resources, i2);
        w(this.n, resources, i3);
    }

    private final void w(View view, Resources resources, int i) {
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        if (view != null) {
            view.setPadding(dimensionPixelSize, view.getPaddingTop(), dimensionPixelSize, view.getPaddingBottom());
        }
    }

    public final void l() {
        String value = l.a.n().getValue();
        if ((value != null ? value.length() : 0) > 0) {
            com.bytedance.android.input.r.j.m(this.a, "textAsr > 0");
            IAppGlobals.a aVar = IAppGlobals.a;
            String e2 = e.a.a.a.a.e(aVar, C0838R.string.asr_first_in_editor_panel, "IAppGlobals.context.getS…sr_first_in_editor_panel)");
            if (aVar.o().getBoolean(e2, true)) {
                com.bytedance.android.input.r.j.m(this.a, "asr_first_in_editor_panel = true");
                a aVar2 = new a(e2);
                kotlin.s.c.l.f(aVar2, "actionEnd");
                String string = aVar.getContext().getResources().getString(C0838R.string.asr_first_in_editor_panel_tip);
                kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(msgId)");
                C0603x c0603x = new C0603x(string, aVar2);
                C0603x.d(c0603x, -1, -1, 159, C0838R.color.tip_background_color, C0838R.color.asr_text_color, 0L, 32);
                this.s = c0603x;
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void o() {
        com.bytedance.android.input.r.j.i(this.a, "initView");
        setOnClickListener(this);
        setOnTouchListener(this);
        this.b = (ImageButton) findViewById(C0838R.id.btn_asr_back);
        this.f3147c = (ImageButton) findViewById(C0838R.id.btn_asr_rollback);
        this.f3148d = (LottieAnimationView) findViewById(C0838R.id.btn_asr_voice);
        this.f3149e = (ImageView) findViewById(C0838R.id.btn_asr_voice_paused);
        this.f3150f = (LottieAnimationView) findViewById(C0838R.id.asr_listening_animation);
        this.f3151g = (LinearLayout) findViewById(C0838R.id.asr_listening);
        this.h = (ImageButton) findViewById(C0838R.id.btn_asr_backspace);
        this.i = (ImageButton) findViewById(C0838R.id.btn_asr_send);
        this.j = (OTextView) findViewById(C0838R.id.tip_stop_asr);
        this.l = (CustomScrollView) findViewById(C0838R.id.asr_editor_text_container);
        this.m = findViewById(C0838R.id.asr_candidate_container);
        this.n = findViewById(C0838R.id.asr_editor_button_container);
        this.o = findViewById(C0838R.id.asr_candidate_box);
        this.p = (LinearLayout) findViewById(C0838R.id.asr_candidate_list);
        this.q = (ImageButton) findViewById(C0838R.id.asr_candidate_close);
        ImageButton imageButton = this.b;
        kotlin.s.c.l.c(imageButton);
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = this.f3147c;
        kotlin.s.c.l.c(imageButton2);
        imageButton2.setOnClickListener(this);
        LottieAnimationView lottieAnimationView = this.f3148d;
        kotlin.s.c.l.c(lottieAnimationView);
        lottieAnimationView.setOnClickListener(this);
        ImageView imageView = this.f3149e;
        kotlin.s.c.l.c(imageView);
        imageView.setOnClickListener(this);
        ImageButton imageButton3 = this.h;
        kotlin.s.c.l.c(imageButton3);
        imageButton3.setOnTouchListener(this.A);
        ImageButton imageButton4 = this.h;
        kotlin.s.c.l.c(imageButton4);
        imageButton4.setOnLongClickListener(this.B);
        ImageButton imageButton5 = this.i;
        kotlin.s.c.l.c(imageButton5);
        imageButton5.setOnClickListener(this);
        View view = this.m;
        kotlin.s.c.l.c(view);
        view.setOnClickListener(this);
        ImageButton imageButton6 = this.q;
        kotlin.s.c.l.c(imageButton6);
        imageButton6.setOnClickListener(this);
        for (int i = 0; i < 9; i++) {
            k(this.p);
        }
        TextView textView = (TextView) findViewById(C0838R.id.asr_listening_text);
        TextPaint paint = textView.getPaint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, paint.measureText(textView.getText().toString()), textView.getTextSize(), new int[]{-41505, -22200}, (float[]) null, Shader.TileMode.CLAMP));
        textView.invalidate();
        LinearLayout linearLayout = this.f3151g;
        l lVar = l.a;
        lVar.n().observeForever(new d(new b(linearLayout, this)));
        AsrTextView asrTextView = (AsrTextView) findViewById(C0838R.id.asr_text_show);
        asrTextView.setMUnderline(true);
        CustomScrollView customScrollView = this.l;
        if (customScrollView != null) {
            kotlin.s.c.l.c(customScrollView);
            asrTextView.setScrollViewListener(customScrollView);
        }
        lVar.r().observeForever(new d(new c()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (kotlin.s.c.l.a(view, this.b)) {
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
            AsrManager asrManager = AsrManager.a;
            if (asrManager.H()) {
                e.a.a.a.a.q0("stoptype", "back", IAppLog.a, "voiceinput_panel_stop");
            }
            asrManager.p0(true, "editBackToKeyboard");
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.P(false);
            }
            IAppLog.a.i("voiceinput_panel_close");
            return;
        }
        if (kotlin.s.c.l.a(view, this.f3147c)) {
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
            com.bytedance.android.input.r.j.i(this.a, "rollback click. doUndo");
            IAppLog.a aVar = IAppLog.a;
            aVar.i("voiceinput_panel_rollback");
            AsrManager asrManager2 = AsrManager.a;
            if (asrManager2.H()) {
                e.a.a.a.a.q0("stoptype", "rollback", aVar, "voiceinput_panel_stop");
            }
            asrManager2.u();
            return;
        }
        if (kotlin.s.c.l.a(view, this.m) ? true : kotlin.s.c.l.a(view, this.f3148d)) {
            AsrManager asrManager3 = AsrManager.a;
            if (asrManager3.H()) {
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.SPEECH_STOP, false);
                com.bytedance.android.input.r.j.i(this.a, "voice click.  Stop Asr");
                e.a.a.a.a.q0("stoptype", kotlin.s.c.l.a(view, this.f3148d) ? "button" : "tips", IAppLog.a, "voiceinput_panel_stop");
                asrManager3.p0(false, "");
                t(false);
                LottieAnimationView lottieAnimationView = this.f3150f;
                if (lottieAnimationView != null) {
                    lottieAnimationView.p();
                }
                LinearLayout linearLayout = this.f3151g;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                OTextView oTextView = this.j;
                if (oTextView == null) {
                    return;
                }
                oTextView.setVisibility(8);
                return;
            }
            return;
        }
        if (kotlin.s.c.l.a(view, this.f3149e)) {
            AsrManager asrManager4 = AsrManager.a;
            if (asrManager4.H()) {
                return;
            }
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.SPEECH_START, false);
            com.bytedance.android.input.r.j.i(this.a, "voice click. Start Asr");
            if (!asrManager4.n0("panel")) {
                com.bytedance.android.input.r.j.j(this.a, "doStartAsr startAsr failed");
                return;
            }
            t(true);
            LottieAnimationView lottieAnimationView2 = this.f3150f;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.q();
            }
            OTextView oTextView2 = this.j;
            if (oTextView2 != null) {
                oTextView2.setVisibility(0);
            }
            View view2 = this.o;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        if (kotlin.s.c.l.a(view, this.i)) {
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
            e.a.a.a.a.B0(e.a.a.a.a.M("onClick, enterActionType: "), this.k, this.a);
            AsrManager asrManager5 = AsrManager.a;
            if (asrManager5.H()) {
                e.a.a.a.a.q0("stoptype", "enter", IAppLog.a, "voiceinput_panel_stop");
            }
            asrManager5.t(this.k, System.currentTimeMillis());
            IAppLog.a aVar2 = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sendtype", KeyboardJni.getActionTypeName(this.k));
            aVar2.t("voiceinput_panel_commit", jSONObject);
            return;
        }
        if (kotlin.s.c.l.a(view, this.q)) {
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
            com.bytedance.android.input.editor.a q = KeyboardJni.getService().q();
            if (q != null) {
                q.setSelection(q.d(), q.d());
            }
            View view3 = this.o;
            if (view3 == null) {
                return;
            }
            view3.setVisibility(8);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        kotlin.s.c.l.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        v(m());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r1 == 2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onVisibilityChanged(android.view.View r5, int r6) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.view.AsrEditorLayoutView.onVisibilityChanged(android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.view.AsrEditorLayoutView.s(java.lang.String):void");
    }

    public final void u(String[] strArr, boolean z) {
        boolean z2 = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z2 = false;
            }
        }
        if (z2) {
            View view = this.o;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        this.r = z;
        OTextView oTextView = this.j;
        if (oTextView != null) {
            oTextView.setVisibility(8);
        }
        View view2 = this.o;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        int length = strArr.length;
        LinearLayout linearLayout = this.p;
        kotlin.s.c.l.c(linearLayout);
        int childCount = length - linearLayout.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                k(this.p);
            }
        }
        Object e2 = SettingsConfigNext.e(C0838R.string.enable_nbest_mark);
        kotlin.s.c.l.d(e2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) e2).booleanValue();
        LinearLayout linearLayout2 = this.p;
        kotlin.s.c.l.c(linearLayout2);
        int childCount2 = linearLayout2.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            LinearLayout linearLayout3 = this.p;
            if (linearLayout3 != null) {
                View view3 = ViewGroupKt.get(linearLayout3, i2);
                kotlin.s.c.l.d(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout4 = (LinearLayout) view3;
                linearLayout4.setVisibility(8);
                OTextView oTextView2 = (OTextView) linearLayout4.findViewById(C0838R.id.llm_candidate);
                IAppGlobals.a aVar = IAppGlobals.a;
                Context context = getContext();
                kotlin.s.c.l.e(context, "context");
                oTextView2.setTextColor(aVar.l(context, C0838R.color.oui_text_1));
            }
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("mNbestCandidateCount: ");
        M.append(this.w);
        M.append(", mHighFrequencyWordCount: ");
        M.append(this.x);
        M.append(", mark = ");
        M.append(booleanValue);
        com.bytedance.android.input.r.j.i(str, M.toString());
        int length2 = strArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            LinearLayout linearLayout5 = this.p;
            if (linearLayout5 != null) {
                View view4 = ViewGroupKt.get(linearLayout5, i3);
                kotlin.s.c.l.d(view4, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout6 = (LinearLayout) view4;
                OTextView oTextView3 = (OTextView) linearLayout6.findViewById(C0838R.id.llm_candidate);
                oTextView3.setText(strArr[i3]);
                linearLayout6.setVisibility(0);
                linearLayout6.setTag(Integer.valueOf(i3));
                if (booleanValue) {
                    int i4 = this.w;
                    if (i3 < i4) {
                        oTextView3.setTextColor(IAppGlobals.a.getContext().getColor(C0838R.color.blue_100));
                    } else if (i3 < i4 + this.x) {
                        oTextView3.setTextColor(IAppGlobals.a.getContext().getColor(C0838R.color.yellow_100));
                    }
                }
            }
        }
    }
}
