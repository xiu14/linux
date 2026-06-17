package com.bytedance.android.input.keyboard.areacontrol;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.constants.KeyboardInputMode;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.KeyboardView;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.WizardSelectChineseBoard;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuView;
import com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer;
import com.bytedance.android.input.keyboard.commonphrase.CustomEditText;
import com.bytedance.android.input.keyboard.component.SpaceButtonKeyComponent;
import com.bytedance.android.input.keyboard.emoji.EmojiLayout;
import com.bytedance.android.input.keyboard.handwriting.HandWritingBoardView;
import com.bytedance.android.input.keyboard.toolbar.container.ImeToolBarContainer;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.bytedance.android.input.popup.BackspaceSwipeWindow;
import com.bytedance.android.input.popup.HandwriteView;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.android.input.speech.view.AsrEditorLayoutView;
import com.bytedance.android.input.speech.view.AsrLongPressView;
import com.bytedance.android.input.speech.view.AsrWaveView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.s.b.s;
import kotlin.s.c.v;
import kotlin.s.c.w;
import kotlin.s.c.y;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InputViewRoot extends FrameLayout implements com.bytedance.android.input.keyboard.t.a.a {
    private static boolean o0;
    private static boolean p0;
    public static final /* synthetic */ int q0 = 0;
    private boolean A;
    private String B;
    private boolean C;
    private InputConnection D;
    private InputConnection E;

    /* renamed from: J, reason: collision with root package name */
    private TextView f2633J;
    private View K;
    private AsrLongPressView L;
    private AsrWaveView M;
    private HandWritingBoardView N;
    private ClipboardCommonPhraseContainer O;
    private boolean P;
    private q Q;
    private boolean R;
    private float S;
    private float T;
    private int U;
    private int V;
    private final int W;
    private ShapeableImageView a;
    private final int a0;
    private ShapeAppearanceModel b;
    private final int b0;

    /* renamed from: c, reason: collision with root package name */
    private ShapeAppearanceModel f2634c;
    private WizardSelectChineseBoard c0;

    /* renamed from: d, reason: collision with root package name */
    private ViewOutlineProvider f2635d;
    private int d0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2636e;
    private int e0;

    /* renamed from: f, reason: collision with root package name */
    private final String f2637f;
    private final ColorDrawable f0;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f2638g;
    private final Handler g0;
    private LinearLayout h;
    private long h0;
    private ViewGroup i;
    private boolean i0;
    private View j;
    private long j0;
    private View k;
    private Character k0;
    private View l;
    private final Handler l0;
    private View m;
    private final Runnable m0;
    private RelativeLayout n;
    private final Runnable n0;
    private KeyboardView o;
    private KeyboardView p;
    private o q;
    private EmojiLayout r;
    private AsrEditorLayoutView s;
    private AiChatMenuView t;
    private StretchView u;
    private RelativeLayout v;
    private CustomEditText w;
    private CustomEditText x;
    private View y;
    private boolean z;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[Editor] currentInputMode=");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            Boolean bool2 = bool;
            kotlin.s.c.l.e(bool2, "isStarted");
            if (bool2.booleanValue()) {
                q qVar = InputViewRoot.this.Q;
                if (qVar != null) {
                    qVar.c(false);
                }
            } else {
                q qVar2 = InputViewRoot.this.Q;
                if (qVar2 != null) {
                    qVar2.c(true);
                }
            }
            return kotlin.o.a;
        }
    }

    public static final class c extends ViewOutlineProvider {
        final /* synthetic */ float a;

        c(float f2) {
            this.a = f2;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.s.c.l.f(view, "view");
            kotlin.s.c.l.f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
        }
    }

    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable != null ? editable.toString() : null;
            String obj2 = obj != null ? kotlin.text.a.U(obj).toString() : null;
            e.a.a.a.a.t0("mOInputViewPhrase afterTextChanged() text = ", obj, ", trimmedtext: ", obj2, InputViewRoot.this.f2637f);
            if (obj2 == null || obj2.length() == 0) {
                TextView textView = InputViewRoot.this.f2633J;
                if (textView != null) {
                    textView.setEnabled(false);
                }
            } else {
                TextView textView2 = InputViewRoot.this.f2633J;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
            }
            KeyboardJni.getKeyboardJni().postPostUpdateSelectionEvent();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable != null ? editable.toString() : null;
            String obj2 = obj != null ? kotlin.text.a.U(obj).toString() : null;
            com.bytedance.android.input.r.j.i(InputViewRoot.this.f2637f, "mOInputViewPhraseCode afterTextChanged() text = " + obj + ", trimmedtext: " + obj2);
            KeyboardJni.getKeyboardJni().postPostUpdateSelectionEvent();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    static final class f implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        f(kotlin.s.b.l lVar) {
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

    static final class g extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        final /* synthetic */ HandWritingBoardView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(HandWritingBoardView handWritingBoardView) {
            super(1);
            this.b = handWritingBoardView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            int intValue = num.intValue();
            AsrManager asrManager = AsrManager.a;
            asrManager.r();
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            com.bytedance.android.input.i.c.c();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        if (asrManager.E()) {
                            KeyboardJni.DoFunctionKey(7);
                        } else {
                            KeyboardJni.getKeyboardJni().setToolbarToastMode(false);
                            this.b.o();
                            if (KeyboardJni.hasPreedit()) {
                                KeyboardJni.markSwitchToEnglishFromHandWrite();
                                com.bytedance.android.input.r.j.i(InputViewRoot.this.f2637f, "reportHandwritingAutoCommit");
                                IAppLog.a aVar = IAppLog.a;
                                JSONObject a0 = e.a.a.a.a.a0("position", "0", "method", "other");
                                a0.put("wordcount", PushClient.DEFAULT_REQUEST_ID);
                                aVar.t("write_real_display", a0);
                            }
                            if (KeyboardJni.hasPreedit()) {
                                String preeditText = KeyboardJni.getPreeditText();
                                com.bytedance.android.input.p.a aVar2 = com.bytedance.android.input.p.a.a;
                                kotlin.s.c.l.e(preeditText, "preeditText");
                                com.bytedance.android.input.p.a.b(preeditText);
                            }
                            KeyboardJni.getKeyboardJni().stopInputAndCommitPinyin();
                            KeyboardJni.finishPreedit(true);
                            InputViewRoot inputViewRoot = InputViewRoot.this;
                            KeyboardView keyboardView = inputViewRoot.o;
                            kotlin.s.c.l.c(keyboardView);
                            inputViewRoot.t0(keyboardView);
                            KeyboardJni.getKeyboardJni().setInputMode(KeyboardInputMode.ENGLISH26.getInputModeValue());
                            InputViewRoot inputViewRoot2 = InputViewRoot.this;
                            Objects.requireNonNull(inputViewRoot2);
                            if (com.bytedance.android.input.common.h.a.c()) {
                                inputViewRoot2.i0(true);
                            }
                        }
                    }
                } else if (asrManager.E()) {
                    KeyboardJni.DoFunctionKey(7);
                } else {
                    InputViewRoot inputViewRoot3 = InputViewRoot.this;
                    KeyboardView keyboardView2 = inputViewRoot3.o;
                    kotlin.s.c.l.c(keyboardView2);
                    inputViewRoot3.t0(keyboardView2);
                    com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                    com.bytedance.android.input.keyboard.areacontrol.k.d0(true);
                    KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
                    KeyboardJni.InputBoardType inputBoardType = KeyboardJni.InputBoardType.kNumber;
                    keyboardJni.switchKeyboard(5);
                }
            } else if (asrManager.E()) {
                KeyboardJni.DoFunctionKey(7);
            } else {
                InputViewRoot inputViewRoot4 = InputViewRoot.this;
                KeyboardView keyboardView3 = inputViewRoot4.o;
                kotlin.s.c.l.c(keyboardView3);
                inputViewRoot4.t0(keyboardView3);
                com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
                com.bytedance.android.input.keyboard.areacontrol.k.d0(true);
                KeyboardJni keyboardJni2 = KeyboardJni.getKeyboardJni();
                KeyboardJni.InputBoardType inputBoardType2 = KeyboardJni.InputBoardType.kSymbol;
                keyboardJni2.switchKeyboard(3);
            }
            return kotlin.o.a;
        }
    }

    static final class h extends kotlin.s.c.m implements kotlin.s.b.p<SpaceButtonKeyComponent, MotionEvent, Boolean> {
        final /* synthetic */ v b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(v vVar, long j) {
            super(2);
            this.b = vVar;
        }

        @Override // kotlin.s.b.p
        public Boolean invoke(SpaceButtonKeyComponent spaceButtonKeyComponent, MotionEvent motionEvent) {
            Boolean preHandleTouchEvent;
            SpaceButtonKeyComponent spaceButtonKeyComponent2 = spaceButtonKeyComponent;
            MotionEvent motionEvent2 = motionEvent;
            kotlin.s.c.l.f(spaceButtonKeyComponent2, "spaceView");
            kotlin.s.c.l.f(motionEvent2, NotificationCompat.CATEGORY_EVENT);
            KeyboardView keyboardView = InputViewRoot.this.o;
            if (keyboardView != null && (preHandleTouchEvent = keyboardView.preHandleTouchEvent(motionEvent2)) != null) {
                spaceButtonKeyComponent2.f(spaceButtonKeyComponent2.a());
                return preHandleTouchEvent;
            }
            if (motionEvent2.getAction() == 0) {
                this.b.a = false;
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.FUNCTION, UserInteractiveManagerNext.KeyVibrate.FUNCTION, VibrationController.VibrationType.KEY_FUNCTION, false);
                AsrManager asrManager = AsrManager.a;
                asrManager.r();
                com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
                com.bytedance.android.input.i.c.c();
                if (asrManager.E()) {
                    this.b.a = true;
                    KeyboardJni.DoFunctionKey(36);
                } else {
                    spaceButtonKeyComponent2.g(spaceButtonKeyComponent2.a());
                    InputViewRoot.this.i0 = false;
                    InputViewRoot.this.l0.postDelayed(InputViewRoot.this.m0, 175L);
                    InputViewRoot.this.z();
                    com.bytedance.android.input.r.j.i(InputViewRoot.this.f2637f, "[hand_write] action down");
                }
                return Boolean.TRUE;
            }
            if (motionEvent2.getAction() != 1) {
                if (motionEvent2.getAction() == 3) {
                    this.b.a = false;
                    spaceButtonKeyComponent2.f(spaceButtonKeyComponent2.a());
                    try {
                        InputViewRoot.this.l0.removeCallbacks(InputViewRoot.this.m0);
                        InputViewRoot.this.l0.removeCallbacks(InputViewRoot.this.n0);
                    } catch (Exception e2) {
                        com.bytedance.android.input.r.j.k(InputViewRoot.this.f2637f, "[hand_write] action cancel error", e2);
                    }
                    com.bytedance.android.input.r.j.i(InputViewRoot.this.f2637f, "[hand_write] action cancel");
                }
                return Boolean.FALSE;
            }
            spaceButtonKeyComponent2.f(spaceButtonKeyComponent2.a());
            InputViewRoot.this.l0.removeCallbacks(InputViewRoot.this.m0);
            boolean booleanValue = ((Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.enable_double_click_space, "IAppGlobals.context.getS…nable_double_click_space)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
            e.a.a.a.a.y0("[hand_write] action up state=", booleanValue, InputViewRoot.this.f2637f);
            if (InputViewRoot.this.i0) {
                return Boolean.TRUE;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - InputViewRoot.this.h0 <= 200) && booleanValue) {
                InputViewRoot.this.l0.removeCallbacks(InputViewRoot.this.n0);
                e.a.a.a.a.y0("[hand_write] double click ", booleanValue, InputViewRoot.this.f2637f);
                Set V = kotlin.collections.g.V(' ', (char) 65292, (char) 12290, (char) 65311, (char) 65281, (char) 65307, (char) 65306, (char) 8220, (char) 8221, (char) 8216, (char) 8217, (char) 65288, (char) 65289, (char) 12304, (char) 12305, (char) 12298, (char) 12299, ',', '.', '?', '!', ';', ':', '\"', '\'', '(', ')', '[', ']', '<', '>');
                boolean z = InputViewRoot.this.k0 != null ? !V.contains(Character.valueOf(r12.charValue())) : true;
                if (z && currentTimeMillis - InputViewRoot.this.j0 <= 200) {
                    com.bytedance.android.input.r.j.i(InputViewRoot.this.f2637f, "[hand_write] handleJavaBackspaceClickEvent");
                    KeyboardJni.getKeyboardJni().handleJavaBackspaceClickEvent();
                    InputViewRoot.this.j0 = 0L;
                }
                KeyboardJni.getKeyboardJni().commitForSpaceDoubleClick(z, true);
                InputViewRoot.this.h0 = 0L;
            } else {
                InputViewRoot.this.h0 = currentTimeMillis;
                if (!this.b.a) {
                    if (booleanValue) {
                        InputViewRoot.this.k0 = kotlin.text.a.x(com.bytedance.android.input.m.a.f());
                    }
                    String str = InputViewRoot.this.f2637f;
                    StringBuilder M = e.a.a.a.a.M("[hand_write] lastCharBeforeSpace ");
                    M.append(InputViewRoot.this.k0);
                    M.append(", commit space");
                    com.bytedance.android.input.r.j.i(str, M.toString());
                    if (KeyboardJni.getKeyboardJni().commitForSpace()) {
                        InputViewRoot.this.j0 = currentTimeMillis;
                    } else if (booleanValue) {
                        InputViewRoot.this.k0 = kotlin.text.a.x(com.bytedance.android.input.m.a.f());
                    }
                }
                this.b.a = false;
            }
            return Boolean.TRUE;
        }
    }

    static final class i extends kotlin.s.c.m implements s<KeyboardJni.EnterActionType, Boolean, Boolean, Boolean, Boolean, kotlin.o> {
        i() {
            super(5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:95:0x0135, code lost:
        
            if ((194560 <= r9 && r9 < 195104) != false) goto L95;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0172 A[LOOP:0: B:42:0x016c->B:44:0x0172, LOOP_END] */
        @Override // kotlin.s.b.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.o k(com.bytedance.android.doubaoime.KeyboardJni.EnterActionType r5, java.lang.Boolean r6, java.lang.Boolean r7, java.lang.Boolean r8, java.lang.Boolean r9) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.areacontrol.InputViewRoot.i.k(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class j implements com.bytedance.android.input.keyboard.handwriting.r.a {
        final /* synthetic */ HandWritingBoardView a;

        j(HandWritingBoardView handWritingBoardView) {
            this.a = handWritingBoardView;
        }

        @Override // com.bytedance.android.input.keyboard.handwriting.r.a
        public void a() {
            this.a.o();
        }
    }

    public static final class k implements HandwriteView.a {
        final /* synthetic */ y b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HandwriteView f2639c;

        k(y yVar, HandwriteView handwriteView) {
            this.b = yVar;
            this.f2639c = handwriteView;
        }

        @Override // com.bytedance.android.input.popup.HandwriteView.a
        public void a() {
            long uptimeMillis = SystemClock.uptimeMillis();
            com.bytedance.android.input.r.j.i(InputViewRoot.this.f2637f, "handwriting: onDrawComplete, upTs: " + uptimeMillis);
            List<PointF> list = (List) kotlin.collections.g.E(this.f2639c.h());
            if (list == null) {
                list = kotlin.collections.l.a;
            }
            if (list.isEmpty()) {
                com.bytedance.android.input.r.j.i(InputViewRoot.this.f2637f, "handwriting: last stroke empty, skip");
                return;
            }
            int[] iArr = new int[list.size() * 2];
            int i = 0;
            for (PointF pointF : list) {
                int i2 = i + 1;
                iArr[i] = (int) (pointF.x / this.f2639c.g());
                i = i2 + 1;
                iArr[i2] = (int) (pointF.y / this.f2639c.g());
            }
            e.a.a.a.a.r0("handwriting result: ", KeyboardJni.getKeyboardJni().getHandWritingResult(iArr, this.b.a, uptimeMillis), InputViewRoot.this.f2637f);
        }

        @Override // com.bytedance.android.input.popup.HandwriteView.a
        public void b() {
            HandWritingBoardView handWritingBoardView = InputViewRoot.this.N;
            if (handWritingBoardView != null) {
                handWritingBoardView.o();
            }
            this.b.a = SystemClock.uptimeMillis();
            String str = InputViewRoot.this.f2637f;
            StringBuilder M = e.a.a.a.a.M("handwriting: onDrawStart, downTs: ");
            M.append(this.b.a);
            com.bytedance.android.input.r.j.i(str, M.toString());
        }
    }

    public static final class l implements View.OnLayoutChangeListener {
        final /* synthetic */ HandwriteView a;
        final /* synthetic */ InputViewRoot b;

        public l(HandwriteView handwriteView, InputViewRoot inputViewRoot) {
            this.a = handwriteView;
            this.b = inputViewRoot;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            kotlin.s.c.l.f(view, "view");
            view.removeOnLayoutChangeListener(this);
            int height = this.a.getHeight();
            int width = this.a.getWidth();
            com.bytedance.android.input.r.j.m(this.b.f2637f, "handwriting area_size: " + height + ", " + width);
            KeyboardJni.getKeyboardJni().setHandWritingAreaSize((int) (((float) height) / this.a.g()), (int) (((float) width) / this.a.g()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputViewRoot(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    private final void A() {
        if (this.L == null) {
            AsrLongPressView asrLongPressView = new AsrLongPressView(C(), null);
            this.L = asrLongPressView;
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout != null) {
                relativeLayout.addView(asrLongPressView, -1, new ViewGroup.LayoutParams(-1, -1));
            } else {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
        }
    }

    private final void B() {
        if (this.M == null) {
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            this.M = new AsrWaveView(context, null);
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            int L = (int) com.bytedance.android.input.keyboard.areacontrol.k.L(com.bytedance.android.input.keyboard.areacontrol.k.o());
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout.addView(this.M, -1, new ViewGroup.LayoutParams(-1, L));
            AsrWaveView asrWaveView = this.M;
            if (asrWaveView == null) {
                return;
            }
            asrWaveView.setVisibility(8);
        }
    }

    private final Context C() {
        if (getContext() == null || getContext().getResources() == null || getContext().getResources().getDisplayMetrics() == null) {
            com.bytedance.android.input.r.j.r("InputViewRoot", "createConfigurationForKeyboardState: context or resources not available");
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            return context;
        }
        try {
            Configuration configuration = new Configuration(getContext().getResources().getConfiguration());
            if (KeyboardJni.isFloatingMode()) {
                configuration.densityDpi = (int) (getContext().getResources().getDisplayMetrics().densityDpi * 0.8f);
                configuration.orientation = 1;
            }
            if (IAppGlobals.a.b()) {
                configuration.uiMode = 32;
            } else {
                configuration.uiMode = 16;
            }
            Context createConfigurationContext = getContext().createConfigurationContext(configuration);
            if (createConfigurationContext.getResources() != null && createConfigurationContext.getResources().getDisplayMetrics() != null) {
                kotlin.s.c.l.e(createConfigurationContext, "configContext");
                return createConfigurationContext;
            }
            com.bytedance.android.input.r.j.r("InputViewRoot", "createConfigurationForKeyboardState: configContext resources invalid");
            Context context2 = getContext();
            kotlin.s.c.l.e(context2, "context");
            return context2;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("createConfigurationForKeyboardState error: ");
            M.append(e2.getMessage());
            com.bytedance.android.input.r.j.k("InputViewRoot", M.toString(), e2);
            Context context3 = getContext();
            kotlin.s.c.l.e(context3, "context");
            return context3;
        }
    }

    private final KeyboardJni.StartInputViewParams D(boolean z) {
        KeyboardJni.StartInputViewParams startInputViewParams = new KeyboardJni.StartInputViewParams();
        int providerIntValue = KeyboardJni.getProviderIntValue(getContext().getString(C0838R.string.input_mode), 0);
        com.bytedance.android.input.basic.a.e.a(this.f2637f, new a(providerIntValue));
        startInputViewParams.restarting = false;
        startInputViewParams.keyboard_type = 0;
        startInputViewParams.input_mode = providerIntValue;
        startInputViewParams.enter_type = 0;
        startInputViewParams.single_line = false;
        startInputViewParams.password_box = false;
        startInputViewParams.verification_box = false;
        startInputViewParams.form_box = false;
        startInputViewParams.number_box = false;
        startInputViewParams.caps_mode = false;
        startInputViewParams.ime_flag_force_ascii = false;
        startInputViewParams.cursorBefore = "";
        startInputViewParams.cursorAfter = "";
        startInputViewParams.app_limit_ruler = 0;
        startInputViewParams.candidate_delay_refresh_ms = -1;
        startInputViewParams.cloud_timeout = -1;
        startInputViewParams.two_refresh_timeout_for_timer = -1;
        startInputViewParams.association_delay_refresh_ms = -1;
        startInputViewParams.three_refresh_timeout = -1;
        startInputViewParams.refresh_mode = -1;
        startInputViewParams.is_associate_enabled = z;
        startInputViewParams.switchBoard = true;
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        startInputViewParams.is_throttle_llm = aVar.g().g();
        startInputViewParams.is_need_switch_send = com.bytedance.android.input.l.b.a();
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        startInputViewParams.target_app_name = aVar2.H();
        Object e2 = SettingsConfigNext.e(C0838R.string.emoji_recommend_enabled);
        kotlin.s.c.l.d(e2, "null cannot be cast to non-null type kotlin.Boolean");
        startInputViewParams.is_sys_emoji_enabled = ((Boolean) e2).booleanValue();
        Object e3 = SettingsConfigNext.e(C0838R.string.kaomoji_recommend_enabled);
        kotlin.s.c.l.d(e3, "null cannot be cast to non-null type kotlin.Boolean");
        startInputViewParams.is_sys_kaomoji_enabled = ((Boolean) e3).booleanValue();
        Objects.requireNonNull(aVar);
        startInputViewParams.is_support_association_opt = aVar.g().e();
        return startInputViewParams;
    }

    private final void E() {
        ClipboardCommonPhraseContainer clipboardCommonPhraseContainer = this.O;
        if (clipboardCommonPhraseContainer != null) {
            F(clipboardCommonPhraseContainer);
        }
        this.O = null;
        AsrEditorLayoutView asrEditorLayoutView = this.s;
        if (asrEditorLayoutView != null) {
            F(asrEditorLayoutView);
            com.bytedance.android.input.speech.view.l.a.c();
            q qVar = this.Q;
            if (qVar != null) {
                qVar.c(true);
            }
        }
        this.s = null;
        AsrLongPressView asrLongPressView = this.L;
        if (asrLongPressView != null) {
            F(asrLongPressView);
        }
        this.L = null;
        com.bytedance.android.input.r.j.i(this.f2637f, "detachFloatingView");
        AsrWaveView asrWaveView = this.M;
        if (asrWaveView != null) {
            F(asrWaveView);
        }
        this.M = null;
        HandWritingBoardView handWritingBoardView = this.N;
        if (handWritingBoardView != null) {
            F(handWritingBoardView);
        }
        this.N = null;
        InputView inputView = ImeService.x;
        if (inputView != null) {
            com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.HINTS, null, 2, null);
        }
        InputView inputView2 = ImeService.x;
        if (inputView2 != null) {
            com.bytedance.android.input.k.b.a.v(inputView2, ToolbarType.CLIPBOARD, null, 2, null);
        }
    }

    private final void F(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    private final boolean U(float f2) {
        return (getY() + ((float) getHeight())) + ((float) this.W) >= f2;
    }

    private final boolean W() {
        return IAppGlobals.a.K() && !KeyboardJni.isFloatingMode();
    }

    public static void X(InputViewRoot inputViewRoot, View view, boolean z) {
        Editable text;
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "mOInputViewPhrase onFocusChanged() v = " + view + ", hasFocus = " + z);
        inputViewRoot.z = z;
        if (z) {
            RelativeLayout relativeLayout = inputViewRoot.v;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                CustomEditText customEditText = inputViewRoot.w;
                String obj = (customEditText == null || (text = customEditText.getText()) == null) ? null : text.toString();
                String obj2 = obj != null ? kotlin.text.a.U(obj).toString() : null;
                if (!(obj2 == null || obj2.length() == 0)) {
                    KeyboardJni.getKeyboardJni().postPostUpdateSelectionEvent();
                }
                KeyboardJni.setCommonPhraseEditorFocused(true);
                return;
            }
        }
        KeyboardJni.setCommonPhraseEditorFocused(false);
    }

    public static void Y(InputViewRoot inputViewRoot) {
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        KeyboardJni.getKeyboardJni().commitForSpace();
        com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "[hand_write] single click");
    }

    public static void Z(InputViewRoot inputViewRoot, View view) {
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        CustomEditText customEditText = inputViewRoot.x;
        if (customEditText != null) {
            customEditText.requestFocus();
        }
    }

    public static boolean a0(InputViewRoot inputViewRoot, View view, int i2, KeyEvent keyEvent) {
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "mOInputViewPhraseCode onKey() v = " + view + "keyCode = " + i2 + "event = " + keyEvent);
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i2 == 66) {
            com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "mOInputViewPhraseCode onKey() KEYCODE_ENTER");
            InputConnection inputConnection = inputViewRoot.E;
            if (inputConnection != null) {
                kotlin.s.c.l.c(inputConnection);
                inputConnection.commitText("\n", 1);
            }
        } else {
            if (i2 != 67) {
                return false;
            }
            com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "mOInputViewPhraseCode onKey() KEYCODE_DEL");
            InputConnection inputConnection2 = inputViewRoot.E;
            if (inputConnection2 != null) {
                kotlin.s.c.l.c(inputConnection2);
                inputConnection2.deleteSurroundingText(1, 0);
            }
        }
        return true;
    }

    public static boolean b0(InputViewRoot inputViewRoot, w wVar, View view, MotionEvent motionEvent) {
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        kotlin.s.c.l.f(wVar, "$containerHeight");
        int action = motionEvent.getAction();
        if (action == 0) {
            View view2 = inputViewRoot.m;
            if (view2 == null) {
                kotlin.s.c.l.l("mDragBar");
                throw null;
            }
            view2.setPressed(true);
            kotlin.s.c.l.d(inputViewRoot.getParent(), "null cannot be cast to non-null type android.view.ViewGroup");
            wVar.a = ((ViewGroup) r8).getHeight();
            inputViewRoot.S = motionEvent.getRawX();
            inputViewRoot.T = motionEvent.getRawY();
            return true;
        }
        if (action == 1) {
            View view3 = inputViewRoot.m;
            if (view3 == null) {
                kotlin.s.c.l.l("mDragBar");
                throw null;
            }
            view3.setPressed(false);
            o oVar = inputViewRoot.q;
            if (oVar == null) {
                return true;
            }
            oVar.b(inputViewRoot.U(wVar.a), (int) inputViewRoot.getX(), (int) inputViewRoot.getY());
            return true;
        }
        if (action != 2) {
            if (action != 3) {
                return false;
            }
            View view4 = inputViewRoot.m;
            if (view4 == null) {
                kotlin.s.c.l.l("mDragBar");
                throw null;
            }
            view4.setPressed(false);
            if (inputViewRoot.U(wVar.a)) {
                inputViewRoot.v(inputViewRoot.getX(), inputViewRoot.getY());
            }
            o oVar2 = inputViewRoot.q;
            if (oVar2 == null) {
                return true;
            }
            oVar2.c();
            return true;
        }
        float rawX = motionEvent.getRawX() - inputViewRoot.S;
        float rawY = motionEvent.getRawY() - inputViewRoot.T;
        if (Math.abs(rawY) > wVar.a) {
            return true;
        }
        inputViewRoot.v(inputViewRoot.getX() + rawX, inputViewRoot.getY() + rawY);
        inputViewRoot.S += rawX;
        inputViewRoot.T += rawY;
        kotlin.s.c.l.d(inputViewRoot.getParent(), "null cannot be cast to non-null type android.view.ViewGroup");
        if (inputViewRoot.U(((ViewGroup) r7).getHeight())) {
            o oVar3 = inputViewRoot.q;
            if (oVar3 == null) {
                return true;
            }
            oVar3.a(true);
            return true;
        }
        o oVar4 = inputViewRoot.q;
        if (oVar4 == null) {
            return true;
        }
        oVar4.a(false);
        return true;
    }

    public static void c0(InputViewRoot inputViewRoot) {
        CharSequence charSequence;
        InputConnection currentInputConnection;
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        ImeService service = KeyboardJni.getService();
        boolean z = false;
        ExtractedText extractedText = (service == null || (currentInputConnection = service.getCurrentInputConnection()) == null) ? null : currentInputConnection.getExtractedText(new ExtractedTextRequest(), 0);
        EmojiLayout emojiLayout = inputViewRoot.r;
        if (emojiLayout != null) {
            if (extractedText != null && (charSequence = extractedText.text) != null) {
                if (charSequence.length() > 0) {
                    z = true;
                }
            }
            emojiLayout.K(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d0(com.bytedance.android.input.keyboard.areacontrol.InputViewRoot r9, android.view.View r10) {
        /*
            java.lang.String r10 = "this$0"
            kotlin.s.c.l.f(r9, r10)
            java.lang.String r10 = r9.f2637f
            java.lang.String r0 = "onClick() rightBtn add common phrase list data"
            com.bytedance.android.input.r.j.i(r10, r0)
            com.bytedance.android.input.speech.AsrManager r10 = com.bytedance.android.input.speech.AsrManager.a
            r0 = 1
            java.lang.String r1 = ""
            r10.p0(r0, r1)
            com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer r10 = r9.O
            if (r10 != 0) goto L21
            java.lang.String r9 = r9.f2637f
            java.lang.String r10 = "onClick() rightBtn, mClipboardCommonPhraseContainer is null"
            com.bytedance.android.input.r.j.j(r9, r10)
            goto Lae
        L21:
            com.bytedance.android.input.keyboard.commonphrase.CustomEditText r10 = r9.w
            r1 = 0
            if (r10 == 0) goto L2b
            android.text.Editable r10 = r10.getText()
            goto L2c
        L2b:
            r10 = r1
        L2c:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r2 = r9.C
            r3 = 0
            if (r2 != 0) goto L45
            java.lang.String r2 = r9.B
            int r2 = r2.length()
            if (r2 <= 0) goto L3f
            r2 = r0
            goto L40
        L3f:
            r2 = r3
        L40:
            if (r2 == 0) goto L45
            java.lang.String r2 = r9.B
            goto L53
        L45:
            com.bytedance.android.input.keyboard.commonphrase.CustomEditText r2 = r9.x
            if (r2 == 0) goto L4e
            android.text.Editable r2 = r2.getText()
            goto L4f
        L4e:
            r2 = r1
        L4f:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L53:
            boolean r4 = r9.P
            java.lang.String r5 = "code"
            java.lang.String r6 = "content"
            java.lang.String r7 = ", code = "
            if (r4 == 0) goto L72
            java.lang.String r4 = r9.f2637f
            java.lang.String r8 = "update common phrase content = "
            e.a.a.a.a.t0(r8, r10, r7, r2, r4)
            com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer r4 = r9.O
            if (r4 == 0) goto L86
            kotlin.s.c.l.e(r10, r6)
            kotlin.s.c.l.e(r2, r5)
            r4.m(r10, r2)
            goto L86
        L72:
            java.lang.String r4 = r9.f2637f
            java.lang.String r8 = "insert common phrase content = "
            e.a.a.a.a.t0(r8, r10, r7, r2, r4)
            com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer r4 = r9.O
            if (r4 == 0) goto L86
            kotlin.s.c.l.e(r10, r6)
            kotlin.s.c.l.e(r2, r5)
            r4.e(r10, r2)
        L86:
            com.bytedance.android.input.basic.applog.api.IAppLog$a r10 = com.bytedance.android.input.basic.applog.api.IAppLog.a
            java.lang.String r2 = "add_source"
            java.lang.String r4 = "add_common"
            java.lang.String r5 = "common_phrase_add"
            e.a.a.a.a.q0(r2, r4, r10, r5)
            r9.P = r3
            java.lang.String[] r10 = new java.lang.String[r3]
            r9.setCommonPhraseEditViewEnabled(r3, r10)
            r9.v0(r0, r0, r0)
            java.lang.String r9 = r9.f2637f
            java.lang.String r10 = "showCommonPhraseView"
            com.bytedance.android.input.r.j.m(r9, r10)
            com.bytedance.android.doubaoime.KeyboardJni r9 = com.bytedance.android.doubaoime.KeyboardJni.getKeyboardJni()
            r9.postPostUpdateSelectionEvent()
            com.bytedance.android.input.speech.x r9 = com.bytedance.android.input.speech.x.a
            com.bytedance.android.input.speech.x.g(r3, r0, r1, r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.areacontrol.InputViewRoot.d0(com.bytedance.android.input.keyboard.areacontrol.InputViewRoot, android.view.View):void");
    }

    public static void e0(InputViewRoot inputViewRoot, View view, boolean z) {
        Editable text;
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "mOInputViewPhraseCode onFocusChanged() v = " + view + "hasFocus = " + z);
        inputViewRoot.A = z;
        View view2 = inputViewRoot.y;
        if (view2 != null) {
            view2.setVisibility(z ? 8 : 0);
        }
        if (z) {
            RelativeLayout relativeLayout = inputViewRoot.v;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                inputViewRoot.C = true;
                CustomEditText customEditText = inputViewRoot.x;
                if (customEditText != null) {
                    customEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(8)});
                }
                if (inputViewRoot.B.length() > 0) {
                    CustomEditText customEditText2 = inputViewRoot.x;
                    if (customEditText2 != null) {
                        customEditText2.setText(inputViewRoot.B);
                    }
                    CustomEditText customEditText3 = inputViewRoot.x;
                    if (customEditText3 != null) {
                        customEditText3.setSelection(inputViewRoot.B.length());
                    }
                }
                CustomEditText customEditText4 = inputViewRoot.w;
                String obj = (customEditText4 == null || (text = customEditText4.getText()) == null) ? null : text.toString();
                String obj2 = obj != null ? kotlin.text.a.U(obj).toString() : null;
                if (!(obj2 == null || obj2.length() == 0)) {
                    KeyboardJni.getKeyboardJni().postPostUpdateSelectionEvent();
                }
                KeyboardJni.setCommonPhraseEditorFocused(true);
                return;
            }
        }
        CustomEditText customEditText5 = inputViewRoot.x;
        if (customEditText5 != null) {
            customEditText5.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(20)});
        }
        KeyboardJni.setCommonPhraseEditorFocused(false);
    }

    public static void f0(InputViewRoot inputViewRoot) {
        kotlin.s.c.l.f(inputViewRoot, "this$0");
        inputViewRoot.i0 = true;
        if (KeyboardJni.hasPreedit()) {
            com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "reportHandwritingCommit");
            IAppLog.a aVar = IAppLog.a;
            JSONObject a0 = e.a.a.a.a.a0("position", "0", "method", "cand_click");
            a0.put("wordcount", PushClient.DEFAULT_REQUEST_ID);
            aVar.t("write_real_display", a0);
            String preeditText = KeyboardJni.getPreeditText();
            com.bytedance.android.input.p.a aVar2 = com.bytedance.android.input.p.a.a;
            kotlin.s.c.l.e(preeditText, "preeditText");
            com.bytedance.android.input.p.a.b(preeditText);
        }
        KeyboardJni.finishPreedit(true);
        String string = inputViewRoot.getResources().getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "resources.getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f2).intValue();
        e.a.a.a.a.j0("[hand_write] long press - start inputMode = ", intValue, inputViewRoot.f2637f);
        if (intValue == 1) {
            KeyboardJni.showOpenFullInputModeAlert(0);
        } else {
            KeyboardJni.StartAsrOnSpaceLPress(0, 0);
            com.bytedance.android.input.r.j.i(inputViewRoot.f2637f, "[hand_write] long press - end");
        }
    }

    private final void m0(boolean z) {
        String str = this.f2637f;
        StringBuilder M = e.a.a.a.a.M("[StretchView]  setAreaLayout InputViewModel.getKeyboardBottomMargin()=");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        M.append(com.bytedance.android.input.keyboard.areacontrol.k.g());
        M.append(" InputViewModel.mCurrentBottomValue=");
        M.append(com.bytedance.android.input.keyboard.areacontrol.k.b());
        M.append(" KeyboardJni.isFloatingMode()=");
        M.append(KeyboardJni.isFloatingMode());
        M.append(" isLand=");
        M.append(z);
        com.bytedance.android.input.r.j.i(str, M.toString());
        LinearLayout linearLayout = this.h;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mKeyboardBoardArea");
            throw null;
        }
        linearLayout.getLayoutParams().height = com.bytedance.android.input.keyboard.areacontrol.k.p();
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout == null) {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
        relativeLayout.getLayoutParams().height = com.bytedance.android.input.keyboard.areacontrol.k.f();
        LinearLayout linearLayout2 = this.h;
        if (linearLayout2 == null) {
            kotlin.s.c.l.l("mKeyboardBoardArea");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = !z ? com.bytedance.android.input.keyboard.areacontrol.k.b() : 0;
            marginLayoutParams.leftMargin = !z ? com.bytedance.android.input.keyboard.areacontrol.k.h() : 0;
            marginLayoutParams.rightMargin = z ? 0 : com.bytedance.android.input.keyboard.areacontrol.k.l();
            LinearLayout linearLayout3 = this.h;
            if (linearLayout3 != null) {
                linearLayout3.setLayoutParams(marginLayoutParams);
            } else {
                kotlin.s.c.l.l("mKeyboardBoardArea");
                throw null;
            }
        }
    }

    private final void n0(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, i2, 0, 0);
            view.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout == null) {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
        for (View view : ViewGroupKt.getChildren(relativeLayout)) {
            if (!(view instanceof AsrWaveView) && !(view instanceof ImeToolBarContainer)) {
                if (kotlin.s.c.l.a(view, viewGroup)) {
                    view.setVisibility(0);
                    com.bytedance.android.input.r.j.i(this.f2637f, "show sub view: " + view);
                } else {
                    view.setVisibility(8);
                    if (view instanceof AsrEditorLayoutView) {
                        com.bytedance.android.input.r.j.i(this.f2637f, "showBoardSubView view is asrEditorLayoutView. set OneHandMode CanCLick");
                        q qVar = this.Q;
                        if (qVar != null) {
                            qVar.c(true);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(float f2, float f3) {
        if (KeyboardJni.isFloatingMode()) {
            ViewParent parent = getParent();
            kotlin.s.c.l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            float width = ((ViewGroup) parent).getWidth();
            ViewParent parent2 = getParent();
            kotlin.s.c.l.d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            float height = ((ViewGroup) parent2).getHeight();
            setX(kotlin.w.h.a(0.0f, kotlin.w.h.c(f2, width - getWidth())));
            setY(kotlin.w.h.a(0.0f, kotlin.w.h.c(f3, (height - getHeight()) - this.W)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r5.getVisibility() != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v0(boolean r4, int r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.areacontrol.InputViewRoot.v0(boolean, int, boolean):void");
    }

    private final int x(boolean z, int i2, int i3, int i4, int i5) {
        if (!z) {
            return i2 != 0 ? i2 != 1 ? Math.max(i3, 0) : Math.max(i3, 0) : i3 < i4 ? Math.max(i3, 0) : Math.max(i3 - i4, 0);
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return Math.max(i3, 0) + i5;
            }
            if (i3 >= 0) {
                return i3;
            }
        } else if (i3 >= 0) {
            return i3;
        }
        return i5;
    }

    public final void A0(boolean z) {
        com.bytedance.android.input.r.j.m(this.f2637f, "showNavigationPaddingView showNavigationPaddingViewBottom show: " + z + " mKeyboardNaviPaddingBottomShow=false");
        if (!z) {
            View view = this.j;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                kotlin.s.c.l.l("mKeyboardNaviPadding");
                throw null;
            }
        }
        View view2 = this.j;
        if (view2 == null) {
            kotlin.s.c.l.l("mKeyboardNaviPadding");
            throw null;
        }
        view2.setVisibility(0);
        View view3 = this.k;
        if (view3 != null) {
            view3.setVisibility(8);
        } else {
            kotlin.s.c.l.l("mKeyboardNaviPaddingBottom");
            throw null;
        }
    }

    public final void B0(boolean z, int i2) {
        com.bytedance.android.input.r.j.m(this.f2637f, "showNavigationPaddingViewBottom show: " + z + ", height = " + i2);
        if (getResources().getConfiguration().orientation == 1) {
            if (i2 < 0) {
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                com.bytedance.android.input.keyboard.areacontrol.k.c0(0);
            } else {
                com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
                com.bytedance.android.input.keyboard.areacontrol.k.c0(i2);
            }
        }
        View view = this.k;
        if (view != null) {
            view.setVisibility(8);
        } else {
            kotlin.s.c.l.l("mKeyboardNaviPaddingBottom");
            throw null;
        }
    }

    public final void C0() {
        com.bytedance.android.input.r.j.i(this.f2637f, "showSmartReplyPage.");
        KeyboardView keyboardView = this.o;
        if (keyboardView != null) {
            keyboardView.setVisibility(4);
        }
        o0(true);
        AiChatMenuView aiChatMenuView = this.t;
        if (aiChatMenuView != null) {
            kotlin.s.c.l.c(aiChatMenuView);
            aiChatMenuView.C(0, true);
        }
    }

    public final void D0(boolean z) {
        if (z && this.u == null) {
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            StretchView stretchView = new StretchView(context, null);
            this.u = stretchView;
            kotlin.s.c.l.c(stretchView);
            LinearLayout linearLayout = this.h;
            if (linearLayout == null) {
                kotlin.s.c.l.l("mKeyboardBoardArea");
                throw null;
            }
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            stretchView.d(linearLayout, relativeLayout);
            RelativeLayout relativeLayout2 = this.n;
            if (relativeLayout2 == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout2.addView(this.u, -1, new ViewGroup.LayoutParams(-1, -1));
        }
        StretchView stretchView2 = this.u;
        if (stretchView2 != null) {
            if (z) {
                q qVar = this.Q;
                if (qVar != null) {
                    qVar.b();
                }
                StretchView stretchView3 = this.u;
                kotlin.s.c.l.c(stretchView3);
                stretchView3.bringToFront();
                StretchView stretchView4 = this.u;
                kotlin.s.c.l.c(stretchView4);
                stretchView4.setVisibility(0);
            } else {
                kotlin.s.c.l.c(stretchView2);
                stretchView2.g();
            }
        }
        if (z) {
            int color = ContextCompat.getColor(getContext(), C0838R.color.system_keyboard_bk);
            View view = this.k;
            if (view == null) {
                kotlin.s.c.l.l("mKeyboardNaviPaddingBottom");
                throw null;
            }
            view.setBackgroundColor(color);
            ShapeableImageView shapeableImageView = this.a;
            if (shapeableImageView != null) {
                shapeableImageView.setImageDrawable(new ColorDrawable(color));
            }
        }
    }

    public void E0(ToolbarType toolbarType, com.bytedance.android.input.keyboard.toolbar.entity.a aVar) {
        kotlin.s.c.l.f(toolbarType, "toolbarType");
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "[WordSegmentationLayoutNew] showToolbar");
        com.bytedance.android.input.keyboard.t.b.a aVar2 = com.bytedance.android.input.keyboard.t.b.a.a;
        Context context = getContext();
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout != null) {
            aVar2.a(toolbarType, context, relativeLayout, aVar);
        } else {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
    }

    public final void F0() {
        WizardSelectChineseBoard wizardSelectChineseBoard = this.c0;
        if (wizardSelectChineseBoard != null) {
            kotlin.s.c.l.c(wizardSelectChineseBoard);
            F(wizardSelectChineseBoard);
        }
        LayoutInflater from = LayoutInflater.from(C());
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout == null) {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
        WizardSelectChineseBoard wizardSelectChineseBoard2 = (WizardSelectChineseBoard) from.inflate(C0838R.layout.wizard_select_chinsee_board, (ViewGroup) relativeLayout, false);
        this.c0 = wizardSelectChineseBoard2;
        kotlin.s.c.l.c(wizardSelectChineseBoard2);
        wizardSelectChineseBoard2.a();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout relativeLayout2 = this.n;
        if (relativeLayout2 != null) {
            relativeLayout2.addView(this.c0, layoutParams);
        } else {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
    }

    public void G(ToolbarType toolbarType, com.bytedance.android.input.keyboard.toolbar.entity.a aVar) {
        kotlin.s.c.l.f(toolbarType, "toolbarType");
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "[WordSegmentationLayoutNew] dismissToolbar toolbarType=" + toolbarType);
        com.bytedance.android.input.keyboard.t.b.a.a.b(toolbarType, getContext());
    }

    public final void G0(WordSegmentationData wordSegmentationData) {
        kotlin.s.c.l.f(wordSegmentationData, RemoteMessageConst.DATA);
        com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "[WordSegmentationLayoutNew] showWordSegmentationPage");
        Context context = getContext();
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout == null) {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
        kotlin.s.c.l.f("candidate_bar", "showFrom");
        kotlin.s.c.l.f(wordSegmentationData, RemoteMessageConst.DATA);
        com.bytedance.android.input.keyboard.word_segmentation.n.f(context, relativeLayout, "candidate_bar", wordSegmentationData, null);
    }

    public final void H(boolean z) {
        E();
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
        kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) g2).intValue();
        e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
        if (KeyboardInputMode.Companion.a(intValue) == KeyboardInputMode.HANDWRITING) {
            int currentKbdType = KeyboardJni.getKeyboardJni().getCurrentKbdType();
            KeyboardJni.InputBoardType inputBoardType = KeyboardJni.InputBoardType.kHandwrite;
            if (currentKbdType == 6) {
                String str = this.f2637f;
                StringBuilder X = e.a.a.a.a.X("floatingInputModeChanged floating = ", z, "--mHandwritingBoardView ==null ? ");
                boolean z2 = false;
                X.append(this.N == null);
                X.append("-- isShow ");
                HandWritingBoardView handWritingBoardView = this.N;
                if (handWritingBoardView != null && handWritingBoardView.getVisibility() == 0) {
                    z2 = true;
                }
                X.append(z2);
                com.bytedance.android.input.r.j.i(str, X.toString());
                z0(true);
                return;
            }
        }
        KeyboardView keyboardView = this.o;
        if (keyboardView != null) {
            t0(keyboardView);
        }
    }

    public final void H0(String str, boolean z, boolean z2, boolean z3) {
        AsrWaveView d2;
        kotlin.s.c.l.f(str, "text");
        if (z2) {
            if (this.M == null) {
                B();
            }
            AsrWaveView asrWaveView = this.M;
            if (asrWaveView != null) {
                asrWaveView.g(str, z, z3);
                return;
            }
            return;
        }
        if (this.L == null) {
            A();
        }
        AsrLongPressView asrLongPressView = this.L;
        if (asrLongPressView == null || (d2 = asrLongPressView.d()) == null) {
            return;
        }
        d2.g(str, z, z3);
    }

    public final AiChatMenuView I() {
        return this.t;
    }

    public final void I0(byte[] bArr) {
        AsrLongPressView asrLongPressView;
        AsrWaveView d2;
        AsrWaveView asrWaveView;
        kotlin.s.c.l.f(bArr, RemoteMessageConst.DATA);
        AsrWaveView asrWaveView2 = this.M;
        if ((asrWaveView2 != null && asrWaveView2.getVisibility() == 0) && (asrWaveView = this.M) != null) {
            asrWaveView.h(bArr);
        }
        AsrLongPressView asrLongPressView2 = this.L;
        if (!(asrLongPressView2 != null && asrLongPressView2.getVisibility() == 0) || (asrLongPressView = this.L) == null || (d2 = asrLongPressView.d()) == null) {
            return;
        }
        d2.h(bArr);
    }

    public final AsrEditorLayoutView J() {
        return this.s;
    }

    public final void J0() {
        EmojiLayout emojiLayout = this.r;
        if (emojiLayout != null && com.obric.oui.common.util.b.e(emojiLayout)) {
            this.g0.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.areacontrol.g
                @Override // java.lang.Runnable
                public final void run() {
                    InputViewRoot.c0(InputViewRoot.this);
                }
            });
        }
    }

    public final InputConnection K() {
        InputConnection inputConnection;
        RelativeLayout relativeLayout = this.v;
        kotlin.s.c.l.c(relativeLayout);
        if (relativeLayout.getVisibility() == 0) {
            com.bytedance.android.input.r.j.i(this.f2637f, "getCommonPhraseIC common phrase edit view visible");
            if (this.z && this.D != null) {
                com.bytedance.android.input.r.j.i(this.f2637f, "getCommonPhraseIC common phrase edit view phrase has focus");
                inputConnection = this.D;
            } else if (this.A && this.E != null) {
                com.bytedance.android.input.r.j.i(this.f2637f, "getCommonPhraseIC common phrase edit view phrase code has focus");
                inputConnection = this.E;
            }
            com.bytedance.android.input.r.j.i(this.f2637f, "getCommonPhraseIC ic:" + inputConnection);
            return inputConnection;
        }
        inputConnection = null;
        com.bytedance.android.input.r.j.i(this.f2637f, "getCommonPhraseIC ic:" + inputConnection);
        return inputConnection;
    }

    public final void K0(boolean z, String str) {
        kotlin.s.c.l.f(str, "from");
        HandWritingBoardView handWritingBoardView = this.N;
        if (handWritingBoardView != null) {
            handWritingBoardView.B(z, str);
        }
    }

    public final boolean L() {
        return this.A;
    }

    public final void L0() {
        HandWritingBoardView handWritingBoardView = this.N;
        if (handWritingBoardView != null) {
            handWritingBoardView.C();
        }
    }

    public final void M() {
        StretchView stretchView = this.u;
        if (stretchView != null && stretchView.getVisibility() == 0) {
            return;
        }
        if (KeyboardJni.isFloatingMode()) {
            com.bytedance.android.input.r.j.i(this.f2637f, "[StretchView]  hideBottomDistance isFloatingMode=true");
            LinearLayout linearLayout = this.h;
            if (linearLayout == null) {
                kotlin.s.c.l.l("mKeyboardBoardArea");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            layoutParams.height = com.bytedance.android.input.keyboard.areacontrol.k.x();
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout.getLayoutParams().height = com.bytedance.android.input.keyboard.areacontrol.k.x();
            LinearLayout linearLayout2 = this.h;
            if (linearLayout2 == null) {
                kotlin.s.c.l.l("mKeyboardBoardArea");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
        } else {
            LinearLayout linearLayout3 = this.h;
            if (linearLayout3 == null) {
                kotlin.s.c.l.l("mKeyboardBoardArea");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = linearLayout3.getLayoutParams();
            com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
            layoutParams3.height = com.bytedance.android.input.keyboard.areacontrol.k.D();
            RelativeLayout relativeLayout2 = this.n;
            if (relativeLayout2 == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout2.getLayoutParams().height = com.bytedance.android.input.keyboard.areacontrol.k.D();
            LinearLayout linearLayout4 = this.h;
            if (linearLayout4 == null) {
                kotlin.s.c.l.l("mKeyboardBoardArea");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams4 = linearLayout4.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = 0;
            }
        }
        LinearLayout linearLayout5 = this.h;
        if (linearLayout5 != null) {
            linearLayout5.requestLayout();
        } else {
            kotlin.s.c.l.l("mKeyboardBoardArea");
            throw null;
        }
    }

    public final void M0(KeyboardJni.EnterActionType enterActionType) {
        kotlin.s.c.l.f(enterActionType, "enterActionType");
        com.bytedance.android.input.r.j.i(this.f2637f, "[hand_write] updateHandwritingEnterText enterActionType=" + enterActionType);
        HandWritingBoardView handWritingBoardView = this.N;
        if (handWritingBoardView != null) {
            handWritingBoardView.D(enterActionType);
        }
    }

    public final void N() {
        if (this.v == null) {
            com.bytedance.android.input.r.j.j(this.f2637f, "set common phrase edit view null");
            return;
        }
        com.bytedance.android.input.r.j.i(this.f2637f, "common phrase edit view gone");
        RelativeLayout relativeLayout = this.v;
        kotlin.s.c.l.c(relativeLayout);
        if (relativeLayout.getVisibility() != 8) {
            RelativeLayout relativeLayout2 = this.v;
            kotlin.s.c.l.c(relativeLayout2);
            relativeLayout2.setVisibility(8);
            ShapeableImageView shapeableImageView = this.a;
            if (shapeableImageView != null) {
                n0(shapeableImageView, 0);
            }
            this.P = false;
        }
    }

    public final void N0(boolean z) {
        HandWritingBoardView handWritingBoardView = this.N;
        if (handWritingBoardView != null) {
            handWritingBoardView.E(z);
        }
    }

    public final void O(boolean z) {
        boolean z2 = false;
        if (!z) {
            if (this.R) {
                KeyboardJni.getKeyboardJni().hideTopExternView(false);
                KeyboardJni.updateInputViewShown();
                this.R = false;
                return;
            }
            return;
        }
        KeyboardView keyboardView = this.p;
        if (keyboardView != null && keyboardView.getVisibility() == 0) {
            z2 = true;
        }
        if (z2) {
            KeyboardJni.getKeyboardJni().hideTopExternView(true);
            KeyboardJni.updateInputViewShown();
            this.R = true;
        }
    }

    public final void O0() {
        q qVar;
        if (this.i == null) {
            kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
            throw null;
        }
        if (getContext() == null || (qVar = this.Q) == null) {
            return;
        }
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
            throw null;
        }
        kotlin.s.c.l.f(context, "contextParent");
        kotlin.s.c.l.f(viewGroup, "boardView");
        qVar.a(context, viewGroup);
    }

    public final void P() {
        WizardSelectChineseBoard wizardSelectChineseBoard = this.c0;
        if (wizardSelectChineseBoard != null) {
            kotlin.s.c.l.c(wizardSelectChineseBoard);
            F(wizardSelectChineseBoard);
            this.c0 = null;
            com.bytedance.android.input.r.j.m(this.f2637f, "hideWizardSelectChineseBoard");
        }
    }

    public final void Q() {
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        this.U = com.bytedance.android.input.keyboard.areacontrol.k.z();
        this.V = com.bytedance.android.input.keyboard.areacontrol.k.x();
        float dimension = getResources().getDimension(C0838R.dimen.float_keyboard_corner);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder().setAllCorners(0, dimension).build();
        kotlin.s.c.l.e(build, "builder()\n            .s…er)\n\n            .build()");
        this.b = build;
        ShapeAppearanceModel build2 = ShapeAppearanceModel.builder().setAllCorners(0, 0.0f).build();
        kotlin.s.c.l.e(build2, "builder()\n            .s… 0f)\n            .build()");
        this.f2634c = build2;
        this.f2635d = new c(dimension);
        View findViewById = findViewById(C0838R.id.keyboard_whole);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.keyboard_whole)");
        this.f2638g = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C0838R.id.keyboard_whole_board_area);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.keyboard_whole_board_area)");
        this.h = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(C0838R.id.keyboard_whole_board_area_bottom);
        kotlin.s.c.l.e(findViewById3, "findViewById(R.id.keyboa…_whole_board_area_bottom)");
        this.l = findViewById3;
        View findViewById4 = findViewById(C0838R.id.keyboard_whole_llm);
        kotlin.s.c.l.e(findViewById4, "findViewById(R.id.keyboard_whole_llm)");
        this.i = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0838R.id.keyboard_navigation_bar_padding);
        kotlin.s.c.l.e(findViewById5, "findViewById(R.id.keyboard_navigation_bar_padding)");
        this.j = findViewById5;
        View findViewById6 = findViewById(C0838R.id.keyboard_navigation_bar_padding_bottom);
        kotlin.s.c.l.e(findViewById6, "findViewById(R.id.keyboa…ation_bar_padding_bottom)");
        this.k = findViewById6;
        View findViewById7 = findViewById(C0838R.id.drag_bar);
        kotlin.s.c.l.e(findViewById7, "findViewById(R.id.drag_bar)");
        this.m = findViewById7;
        final w wVar = new w();
        findViewById7.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.android.input.keyboard.areacontrol.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InputViewRoot.b0(InputViewRoot.this, wVar, view, motionEvent);
            }
        });
        View findViewById8 = findViewById(C0838R.id.keyboard_one_hand_area);
        kotlin.s.c.l.e(findViewById8, "findViewById(R.id.keyboard_one_hand_area)");
        this.n = (RelativeLayout) findViewById8;
        q qVar = new q();
        this.Q = qVar;
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        ViewGroup viewGroup = this.i;
        if (viewGroup == null) {
            kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
            throw null;
        }
        kotlin.s.c.l.f(context, "contextParent");
        kotlin.s.c.l.f(viewGroup, "boardView");
        qVar.a(context, viewGroup);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0838R.id.common_phrase_edit_view);
        this.v = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.onCreateInputConnection(new EditorInfo());
        }
        this.K = findViewById(C0838R.id.btn_common_phrase_edit_left);
        this.f2633J = (TextView) findViewById(C0838R.id.btn_common_phrase_edit_right);
        View view = this.K;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.areacontrol.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InputViewRoot inputViewRoot = InputViewRoot.this;
                    int i2 = InputViewRoot.q0;
                    kotlin.s.c.l.f(inputViewRoot, "this$0");
                    AsrManager.a.p0(true, "");
                    inputViewRoot.setCommonPhraseEditViewEnabled(false, new String[0]);
                    inputViewRoot.x0(true);
                }
            });
        }
        TextView textView = this.f2633J;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f2633J;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.areacontrol.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InputViewRoot.d0(InputViewRoot.this, view2);
                }
            });
        }
        this.y = findViewById(C0838R.id.btn_edit_common_phrase_code);
        this.w = (CustomEditText) findViewById(C0838R.id.edit_view_common_phrase);
        if (this.D == null) {
            com.bytedance.android.input.r.j.i(this.f2637f, "create common phrase content input connection");
            CustomEditText customEditText = this.w;
            this.D = customEditText != null ? customEditText.onCreateInputConnection(new EditorInfo()) : null;
        }
        CustomEditText customEditText2 = this.w;
        if (customEditText2 != null) {
            customEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bytedance.android.input.keyboard.areacontrol.b
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    InputViewRoot.X(InputViewRoot.this, view2, z);
                }
            });
        }
        CustomEditText customEditText3 = this.w;
        if (customEditText3 != null) {
            customEditText3.addTextChangedListener(new d());
        }
        this.x = (CustomEditText) findViewById(C0838R.id.edit_view_common_phrase_code);
        if (this.E == null) {
            com.bytedance.android.input.r.j.i(this.f2637f, "create common phrase code input connection");
            CustomEditText customEditText4 = this.x;
            this.E = customEditText4 != null ? customEditText4.onCreateInputConnection(new EditorInfo()) : null;
        }
        CustomEditText customEditText5 = this.x;
        if (customEditText5 != null) {
            customEditText5.setOnKeyListener(new View.OnKeyListener() { // from class: com.bytedance.android.input.keyboard.areacontrol.e
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i2, KeyEvent keyEvent) {
                    return InputViewRoot.a0(InputViewRoot.this, view2, i2, keyEvent);
                }
            });
        }
        CustomEditText customEditText6 = this.x;
        if (customEditText6 != null) {
            customEditText6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bytedance.android.input.keyboard.areacontrol.i
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    InputViewRoot.e0(InputViewRoot.this, view2, z);
                }
            });
        }
        View view2 = this.y;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.areacontrol.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    InputViewRoot.Z(InputViewRoot.this, view3);
                }
            });
        }
        CustomEditText customEditText7 = this.x;
        if (customEditText7 != null) {
            customEditText7.addTextChangedListener(new e());
        }
        this.a = (ShapeableImageView) findViewById(C0838R.id.input_view_image_bg);
        setInputViewImageBg();
        com.bytedance.android.input.speech.view.l.a.r().observeForever(new f(new b()));
    }

    public final boolean R() {
        return this.f2636e;
    }

    public final boolean S() {
        RelativeLayout relativeLayout = this.v;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public final boolean T() {
        return this.A;
    }

    public final boolean V() {
        AsrLongPressView asrLongPressView = this.L;
        if (asrLongPressView != null) {
            if (asrLongPressView != null && asrLongPressView.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void g0(boolean z) {
        int color = z ? ContextCompat.getColor(getContext(), C0838R.color.asr_long_press_button_press_bk_press) : ContextCompat.getColor(getContext(), C0838R.color.asr_long_press_button_bk_normal);
        View view = this.k;
        if (view == null) {
            kotlin.s.c.l.l("mKeyboardNaviPaddingBottom");
            throw null;
        }
        view.setBackgroundColor(color);
        View view2 = this.l;
        if (view2 == null) {
            kotlin.s.c.l.l("mKeyboardBoardAreaBottom");
            throw null;
        }
        view2.setBackgroundColor(color);
        KeyboardJni.getService().n(ContextCompat.getColor(getContext(), (!IAppGlobals.a.K() || KeyboardJni.isFloatingMode()) ? z ? C0838R.color.asr_long_press_navigation_press : C0838R.color.asr_long_press_navigation_normal : C0838R.color.transparent));
    }

    public final void h0() {
        D0(false);
        y0(false, null, null);
        o0(false);
        x0(false);
        setCommonPhraseEditViewEnabled(false, new String[0]);
        KeyboardJni.setCommonPhraseEditorFocused(false);
        ClipboardCommonPhraseContainer clipboardCommonPhraseContainer = this.O;
        if (clipboardCommonPhraseContainer != null) {
            clipboardCommonPhraseContainer.h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r4 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(boolean r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f2637f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[hand_write] onUpdateInputViewShown isForceUpdate="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.bytedance.android.input.r.j.i(r0, r1)
            r3.y()
            com.bytedance.android.input.keyboard.areacontrol.k r0 = com.bytedance.android.input.keyboard.areacontrol.k.a
            boolean r0 = com.bytedance.android.input.keyboard.areacontrol.k.S()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L59
            r3.D0(r2)
            java.lang.String[] r4 = new java.lang.String[r2]
            r3.setCommonPhraseEditViewEnabled(r2, r4)
            int r4 = com.bytedance.android.input.keyboard.areacontrol.k.m()
            r0 = 2
            if (r4 != r0) goto L55
            android.widget.LinearLayout r4 = r3.h
            r0 = 0
            if (r4 == 0) goto L4f
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            r2 = -2
            r4.height = r2
            android.widget.RelativeLayout r4 = r3.n
            if (r4 == 0) goto L49
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            r4.height = r2
            goto L7c
        L49:
            java.lang.String r4 = "mKeyboardOneHandArea"
            kotlin.s.c.l.l(r4)
            throw r0
        L4f:
            java.lang.String r4 = "mKeyboardBoardArea"
            kotlin.s.c.l.l(r4)
            throw r0
        L55:
            r3.m0(r1)
            goto L7c
        L59:
            com.bytedance.android.input.keyboard.areacontrol.StretchView r0 = r3.u
            if (r0 == 0) goto L68
            kotlin.s.c.l.c(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L68
            if (r4 == 0) goto L7c
        L68:
            r3.m0(r2)
            com.bytedance.android.input.keyboard.areacontrol.StretchView r4 = r3.u
            if (r4 == 0) goto L7c
            kotlin.s.c.l.c(r4)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r0 = com.bytedance.android.input.keyboard.areacontrol.k.f()
            r4.height = r0
        L7c:
            android.content.res.Resources r4 = r3.getResources()
            r0 = 2131820932(0x7f110184, float:1.9274593E38)
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r0 = "resources.getString(R.string.full_base_input_mode)"
            kotlin.s.c.l.e(r4, r0)
            java.lang.Object r4 = com.bytedance.android.input.common.SettingsConfigNext.f(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.s.c.l.d(r4, r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r1) goto La7
            com.bytedance.android.input.keyboard.KeyboardView r4 = r3.p
            kotlin.s.c.l.c(r4)
            r0 = 8
            r4.setVisibility(r0)
        La7:
            r3.setInputViewImageBg()
            com.bytedance.android.input.keyboard.handwriting.HandWritingBoardView r4 = r3.N
            if (r4 == 0) goto Lb4
            if (r4 == 0) goto Lbb
            r4.x()
            goto Lbb
        Lb4:
            java.lang.String r4 = r3.f2637f
            java.lang.String r0 = "mHandwritingBoardView is null..."
            com.bytedance.android.input.r.j.i(r4, r0)
        Lbb:
            com.bytedance.android.input.keyboard.t.b.a r4 = com.bytedance.android.input.keyboard.t.b.a.a
            int r0 = com.bytedance.android.input.keyboard.areacontrol.k.m()
            r4.f(r0)
            com.bytedance.android.input.keyboard.word_segmentation.n.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.areacontrol.InputViewRoot.i0(boolean):void");
    }

    public final void j0() {
        View view = this.k;
        if (view == null) {
            kotlin.s.c.l.l("mKeyboardNaviPaddingBottom");
            throw null;
        }
        view.setBackgroundColor(0);
        View view2 = this.l;
        if (view2 == null) {
            kotlin.s.c.l.l("mKeyboardBoardAreaBottom");
            throw null;
        }
        view2.setBackgroundColor(0);
        ShapeableImageView shapeableImageView = this.a;
        if (shapeableImageView != null) {
            shapeableImageView.setImageDrawable(W() ? null : this.f0);
        }
    }

    public final void k0() {
        KeyboardView keyboardView = this.p;
        o0 = keyboardView != null && keyboardView.getVisibility() == 0;
        RelativeLayout relativeLayout = this.v;
        p0 = relativeLayout != null && relativeLayout.getVisibility() == 0;
        LinearLayout linearLayout = this.f2638g;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
        linearLayout.removeView(this.p);
        RelativeLayout relativeLayout2 = this.n;
        if (relativeLayout2 == null) {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
        relativeLayout2.removeView(this.o);
        this.o = null;
        this.p = null;
    }

    public final void l0() {
        LinearLayout linearLayout = this.h;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mKeyboardBoardArea");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            marginLayoutParams.leftMargin = com.bytedance.android.input.keyboard.areacontrol.k.h();
            marginLayoutParams.rightMargin = com.bytedance.android.input.keyboard.areacontrol.k.l();
            linearLayout.setLayoutParams(marginLayoutParams);
        }
        linearLayout.requestLayout();
    }

    public final void o0(boolean z) {
        if (z && this.t == null) {
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            AiChatMenuView aiChatMenuView = new AiChatMenuView(context, null);
            this.t = aiChatMenuView;
            kotlin.s.c.l.c(aiChatMenuView);
            aiChatMenuView.r(false);
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout.addView(this.t, -1, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f2636e = z;
        ViewGroup viewGroup = this.t;
        if (viewGroup != null) {
            if (!z) {
                viewGroup = this.o;
            }
            kotlin.s.c.l.c(viewGroup);
            t0(viewGroup);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        kotlin.s.c.l.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        String str = this.f2637f;
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged() uimode = ");
        M.append(configuration.uiMode);
        M.append(", old = ");
        M.append(getContext().getResources().getConfiguration().uiMode);
        M.append(", orientation = ");
        M.append(configuration.orientation);
        M.append(", old = ");
        e.a.a.a.a.C0(M, getContext().getResources().getConfiguration().orientation, str);
        boolean z = false;
        boolean z2 = (configuration.uiMode == getContext().getResources().getConfiguration().uiMode || configuration.orientation == getContext().getResources().getConfiguration().orientation) ? false : true;
        getContext().getResources().getConfiguration().orientation = configuration.orientation;
        if (z2) {
            E();
            WizardSelectChineseBoard wizardSelectChineseBoard = this.c0;
            if (wizardSelectChineseBoard != null) {
                if (wizardSelectChineseBoard.getVisibility() == 0) {
                    z = true;
                }
            }
            if (!z) {
                Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
                kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) g2).intValue();
                e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
                if (KeyboardInputMode.Companion.a(intValue) == KeyboardInputMode.HANDWRITING) {
                    com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                    if (!com.bytedance.android.input.keyboard.areacontrol.k.T()) {
                        z0(true);
                    }
                }
                KeyboardView keyboardView = this.o;
                if (keyboardView != null) {
                    t0(keyboardView);
                }
            }
            v(getX(), getY());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        String str = this.f2637f;
        StringBuilder O = e.a.a.a.a.O("onMeasure() widthMode = ", mode, ", widthSize = ", size, ", heightMode = ");
        O.append(mode2);
        O.append(", heightSize = ");
        O.append(size2);
        com.bytedance.android.input.r.j.i(str, O.toString());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        String str = this.f2637f;
        StringBuilder O = e.a.a.a.a.O("onSizeChanged() w = ", i2, ", h = ", i3, ", old_w = ");
        O.append(i4);
        O.append(", old_h = ");
        O.append(i5);
        com.bytedance.android.input.r.j.m(str, O.toString());
        super.onSizeChanged(i2, i3, i4, i5);
    }

    public final void p0(boolean z) {
        com.bytedance.android.input.r.j.m(this.f2637f, "showAsrEditorLayoutView show = " + z);
        if (z && this.s == null) {
            AsrEditorLayoutView asrEditorLayoutView = new AsrEditorLayoutView(getContext());
            this.s = asrEditorLayoutView;
            kotlin.s.c.l.c(asrEditorLayoutView);
            asrEditorLayoutView.o();
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout.addView(this.s, -1, new ViewGroup.LayoutParams(-1, -1));
        }
        q qVar = this.Q;
        if (qVar != null) {
            qVar.c(!z);
        }
        AsrEditorLayoutView asrEditorLayoutView2 = this.s;
        if (asrEditorLayoutView2 != null) {
            boolean z2 = false;
            if (z) {
                KeyboardView keyboardView = this.p;
                if (keyboardView != null && keyboardView.getVisibility() == 0) {
                    z2 = true;
                }
                if (z2) {
                    KeyboardJni.getKeyboardJni().hideTopExternView(true);
                    KeyboardJni.updateInputViewShown();
                    this.R = true;
                }
            } else {
                kotlin.s.c.l.c(asrEditorLayoutView2);
                if (asrEditorLayoutView2.getVisibility() == 0 && this.R) {
                    KeyboardJni.getKeyboardJni().hideTopExternView(false);
                    KeyboardJni.updateInputViewShown();
                    this.R = false;
                }
            }
            if (z) {
                AsrEditorLayoutView asrEditorLayoutView3 = this.s;
                kotlin.s.c.l.c(asrEditorLayoutView3);
                t0(asrEditorLayoutView3);
                return;
            }
            Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
            kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) g2).intValue();
            e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
            if (KeyboardInputMode.Companion.a(intValue) == KeyboardInputMode.HANDWRITING) {
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                if (!com.bytedance.android.input.keyboard.areacontrol.k.T()) {
                    z0(true);
                    return;
                }
            }
            KeyboardView keyboardView2 = this.o;
            kotlin.s.c.l.c(keyboardView2);
            t0(keyboardView2);
        }
    }

    public final void q0(boolean z) {
        if (z && this.L == null) {
            A();
        }
        AsrLongPressView asrLongPressView = this.L;
        if (asrLongPressView != null) {
            if (z) {
                KeyboardView keyboardView = this.p;
                if (keyboardView != null && keyboardView.getVisibility() == 0) {
                    KeyboardJni.getKeyboardJni().hideTopExternView(true);
                    KeyboardJni.updateInputViewShown();
                    this.R = true;
                }
                KeyboardView keyboardView2 = this.o;
                if (keyboardView2 != null) {
                    keyboardView2.setAsrLongPressView(this.L);
                }
                boolean W = W();
                int color = W ? ContextCompat.getColor(getContext(), C0838R.color.transparent) : ContextCompat.getColor(getContext(), C0838R.color.asr_long_press_button_press_bk_press);
                View view = this.k;
                if (view == null) {
                    kotlin.s.c.l.l("mKeyboardNaviPaddingBottom");
                    throw null;
                }
                view.setBackgroundColor(color);
                if (W) {
                    ShapeableImageView shapeableImageView = this.a;
                    if (shapeableImageView != null) {
                        shapeableImageView.setImageDrawable(new ColorDrawable(Color.argb(82, 0, 0, 0)));
                    }
                    ShapeableImageView shapeableImageView2 = this.a;
                    if (shapeableImageView2 != null) {
                        kotlin.s.c.l.c(shapeableImageView2);
                        com.bytedance.common_biz.ui.utils.b bVar = com.bytedance.common_biz.ui.utils.b.a;
                        com.bytedance.common_biz.ui.utils.b.d(shapeableImageView2, 32);
                    }
                } else {
                    ShapeableImageView shapeableImageView3 = this.a;
                    if (shapeableImageView3 != null) {
                        shapeableImageView3.setImageDrawable(ContextCompat.getDrawable(getContext(), C0838R.drawable.speech_long_press_bg));
                    }
                }
                KeyboardJni.getService().n(W ? ContextCompat.getColor(getContext(), C0838R.color.transparent) : ContextCompat.getColor(getContext(), C0838R.color.asr_long_press_navigation_press));
                View view2 = this.l;
                if (view2 == null) {
                    kotlin.s.c.l.l("mKeyboardBoardAreaBottom");
                    throw null;
                }
                view2.setBackgroundColor(color);
            } else {
                kotlin.s.c.l.c(asrLongPressView);
                if (asrLongPressView.getVisibility() == 0 && this.R) {
                    KeyboardJni.getKeyboardJni().hideTopExternView(false);
                    KeyboardJni.updateInputViewShown();
                    this.R = false;
                }
            }
        }
        if (z) {
            AsrLongPressView asrLongPressView2 = this.L;
            kotlin.s.c.l.c(asrLongPressView2);
            t0(asrLongPressView2);
            return;
        }
        Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
        kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) g2).intValue();
        e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
        if (KeyboardInputMode.Companion.a(intValue) == KeyboardInputMode.HANDWRITING) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            if (!com.bytedance.android.input.keyboard.areacontrol.k.T()) {
                z0(true);
                setInputViewImageBg();
            }
        }
        KeyboardView keyboardView3 = this.o;
        kotlin.s.c.l.c(keyboardView3);
        t0(keyboardView3);
        setInputViewImageBg();
    }

    public final void r0(boolean z) {
        int i2;
        AsrWaveView asrWaveView;
        B();
        if (z && (asrWaveView = this.M) != null) {
            asrWaveView.bringToFront();
        }
        AsrWaveView asrWaveView2 = this.M;
        if (asrWaveView2 != null) {
            asrWaveView2.d(z);
        }
        AsrWaveView asrWaveView3 = this.M;
        if (asrWaveView3 == null) {
            return;
        }
        if (z) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            int L = (int) com.bytedance.android.input.keyboard.areacontrol.k.L(com.bytedance.android.input.keyboard.areacontrol.k.o());
            AsrWaveView asrWaveView4 = this.M;
            ViewGroup.LayoutParams layoutParams = asrWaveView4 != null ? asrWaveView4.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = L;
            }
            i2 = 0;
        } else {
            i2 = 8;
        }
        asrWaveView3.setVisibility(i2);
    }

    public final void s0(String str, boolean z) {
        kotlin.s.c.l.f(str, "query");
        com.bytedance.android.input.r.j.i(this.f2637f, "showBaikePage. query: " + str + "isFromTabSwitch: " + z);
        o0(true);
        AiChatMenuView aiChatMenuView = this.t;
        if (aiChatMenuView != null) {
            aiChatMenuView.setTopicQuery(str);
        }
        AiChatMenuView aiChatMenuView2 = this.t;
        if (aiChatMenuView2 != null) {
            kotlin.s.c.l.c(aiChatMenuView2);
            aiChatMenuView2.C(1, z);
        }
    }

    public final void setCommonPhraseEditViewEnabled(boolean z, String... strArr) {
        ViewParent parent;
        ViewParent parent2;
        kotlin.s.c.l.f(strArr, "phrases");
        if (this.v == null) {
            com.bytedance.android.input.r.j.j(this.f2637f, "set common phrase edit view null");
            return;
        }
        com.bytedance.android.input.l.b.d(z);
        if (!z) {
            com.bytedance.android.input.r.j.i(this.f2637f, "common phrase edit view gone");
            RelativeLayout relativeLayout = this.v;
            kotlin.s.c.l.c(relativeLayout);
            if (relativeLayout.getVisibility() != 8) {
                RelativeLayout relativeLayout2 = this.v;
                kotlin.s.c.l.c(relativeLayout2);
                relativeLayout2.setVisibility(8);
                ShapeableImageView shapeableImageView = this.a;
                if (shapeableImageView != null) {
                    n0(shapeableImageView, 0);
                }
                this.P = false;
                KeyboardJni.getKeyboardJni().updateInputViewActionType();
                return;
            }
            return;
        }
        com.bytedance.android.input.r.j.i(this.f2637f, "common phrase edit view enabled");
        RelativeLayout relativeLayout3 = this.v;
        kotlin.s.c.l.c(relativeLayout3);
        relativeLayout3.setVisibility(0);
        ShapeableImageView shapeableImageView2 = this.a;
        if (shapeableImageView2 != null) {
            n0(shapeableImageView2, this.d0 - this.e0);
        }
        CustomEditText customEditText = this.w;
        if (customEditText != null) {
            customEditText.requestFocus();
        }
        CustomEditText customEditText2 = this.w;
        if (customEditText2 != null) {
            customEditText2.setSelection(0);
        }
        Object e2 = SettingsConfigNext.e(C0838R.string.typing_associate_enabled);
        kotlin.s.c.l.d(e2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) e2).booleanValue();
        if (strArr.length == 2) {
            String str = this.f2637f;
            StringBuilder M = e.a.a.a.a.M("set common phrase edit view text, phrase:");
            M.append(strArr[0]);
            M.append(", code:");
            e.a.a.a.a.H0(M, strArr[1], str);
            CustomEditText customEditText3 = this.w;
            if (customEditText3 != null) {
                customEditText3.setText(strArr[0]);
            }
            CustomEditText customEditText4 = this.w;
            if (customEditText4 != null) {
                customEditText4.setSelection(strArr[0].length());
            }
            this.B = strArr[1];
            this.C = false;
            View view = this.y;
            if (view != null) {
                view.setVisibility(0);
            }
            CustomEditText customEditText5 = this.x;
            if (customEditText5 != null) {
                customEditText5.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(20)});
            }
            if (this.B.length() > 0) {
                SpannableString spannableString = new SpannableString(e.a.a.a.a.G(e.a.a.a.a.M("触发词为“"), this.B, (char) 8221));
                int length = this.B.length() + 5;
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), C0838R.color.common_phrase_code_editor_hint_text_color)), 0, 5, 33);
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), C0838R.color.common_phrase_editor_text_color)), 5, length, 33);
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), C0838R.color.common_phrase_code_editor_hint_text_color)), length, spannableString.length(), 33);
                CustomEditText customEditText6 = this.x;
                if (customEditText6 != null) {
                    customEditText6.setText(spannableString);
                }
            } else {
                CustomEditText customEditText7 = this.x;
                if (customEditText7 != null) {
                    customEditText7.setText("");
                }
            }
            this.P = true;
            KeyboardJni.setCurrentEditboxActionType(1073741830);
            KeyboardJni.StartInputViewParams D = D(booleanValue);
            D.cursorBefore = strArr[0];
            D.cursorAfter = "";
            KeyboardJni.getKeyboardJni().startInputView(D);
        } else {
            com.bytedance.android.input.r.j.i(this.f2637f, "set common phrase edit view text new phrase");
            CustomEditText customEditText8 = this.w;
            if (customEditText8 != null) {
                customEditText8.setText("");
            }
            this.B = "";
            this.C = false;
            View view2 = this.y;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            CustomEditText customEditText9 = this.x;
            if (customEditText9 != null) {
                customEditText9.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(20)});
            }
            CustomEditText customEditText10 = this.x;
            if (customEditText10 != null) {
                customEditText10.setText("");
            }
            this.P = false;
            KeyboardJni.setCurrentEditboxActionType(1073741830);
            KeyboardJni.StartInputViewParams D2 = D(booleanValue);
            D2.cursorBefore = "";
            D2.cursorAfter = "";
            KeyboardJni.getKeyboardJni().startInputView(D2);
        }
        KeyboardView keyboardView = this.p;
        kotlin.s.c.l.c(keyboardView);
        keyboardView.setVisibility(8);
        if (!W()) {
            RelativeLayout relativeLayout4 = this.v;
            if (relativeLayout4 != null) {
                relativeLayout4.setBackgroundResource(C0838R.color.system_keyboard_bk);
            }
            CustomEditText customEditText11 = this.w;
            if (customEditText11 == null || (parent = customEditText11.getParent()) == null || !(parent instanceof FrameLayout)) {
                return;
            }
            ((FrameLayout) parent).setBackgroundResource(C0838R.drawable.bg_common_phrase_edit_container);
            return;
        }
        RelativeLayout relativeLayout5 = this.v;
        if (relativeLayout5 != null) {
            relativeLayout5.setBackgroundResource(C0838R.color.system_keyboard_bk_transparent);
        }
        CustomEditText customEditText12 = this.w;
        if (customEditText12 != null && (parent2 = customEditText12.getParent()) != null && (parent2 instanceof FrameLayout)) {
            ((FrameLayout) parent2).setBackgroundResource(C0838R.drawable.bg_common_phrase_edit_container_transparent);
        }
        RelativeLayout relativeLayout6 = this.v;
        if (relativeLayout6 != null) {
            com.bytedance.common_biz.ui.utils.b bVar = com.bytedance.common_biz.ui.utils.b.a;
            kotlin.s.c.l.c(relativeLayout6);
            com.bytedance.common_biz.ui.utils.b.d(relativeLayout6, 32);
        }
    }

    public final void setFloatingInputMode(boolean z) {
        if (!z) {
            ShapeableImageView shapeableImageView = this.a;
            if (shapeableImageView != null) {
                ShapeAppearanceModel shapeAppearanceModel = this.f2634c;
                if (shapeAppearanceModel == null) {
                    kotlin.s.c.l.l("squareShapeAppearanceModel");
                    throw null;
                }
                shapeableImageView.setShapeAppearanceModel(shapeAppearanceModel);
            }
            ShapeableImageView shapeableImageView2 = this.a;
            if (shapeableImageView2 != null) {
                shapeableImageView2.setStrokeWidth(0.0f);
            }
            ShapeableImageView shapeableImageView3 = this.a;
            if (shapeableImageView3 != null) {
                shapeableImageView3.setStrokeColor(null);
            }
            View view = this.m;
            if (view == null) {
                kotlin.s.c.l.l("mDragBar");
                throw null;
            }
            view.setVisibility(8);
            setX(0.0f);
            setY(0.0f);
            setElevation(0.0f);
            setClipToOutline(false);
            setOutlineProvider(null);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            kotlin.s.c.l.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (-1 != layoutParams2.width || -2 != layoutParams2.height) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                setLayoutParams(layoutParams2);
            }
            LinearLayout linearLayout = this.f2638g;
            if (linearLayout == null) {
                kotlin.s.c.l.l("mBoardWhole");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if (-1 != layoutParams3.width || -2 != layoutParams3.height) {
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                LinearLayout linearLayout2 = this.f2638g;
                if (linearLayout2 == null) {
                    kotlin.s.c.l.l("mBoardWhole");
                    throw null;
                }
                linearLayout2.setLayoutParams(layoutParams3);
            }
            ViewGroup viewGroup = this.i;
            if (viewGroup == null) {
                kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
            if (layoutParams4 == null) {
                return;
            }
            if (-1 != layoutParams4.width || -2 != layoutParams4.height) {
                layoutParams4.width = -1;
                layoutParams4.height = -2;
                ViewGroup viewGroup2 = this.i;
                if (viewGroup2 == null) {
                    kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
                    throw null;
                }
                viewGroup2.setLayoutParams(layoutParams4);
            }
            ViewGroup viewGroup3 = this.i;
            if (viewGroup3 == null) {
                kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
                throw null;
            }
            viewGroup3.requestLayout();
            KeyboardView keyboardView = this.p;
            if (keyboardView != null) {
                ViewGroup.LayoutParams layoutParams5 = keyboardView.getLayoutParams();
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                layoutParams5.height = com.bytedance.android.input.keyboard.areacontrol.k.F();
                keyboardView.setLayoutParams(layoutParams5);
                keyboardView.requestLayout();
            }
            if (this.c0 != null) {
                F0();
                return;
            }
            return;
        }
        com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
        IAppGlobals.a aVar = IAppGlobals.a;
        kotlin.g gVar = new kotlin.g(Integer.valueOf(aVar.o().getInt("keyboard_float_window_x", 0)), Integer.valueOf(aVar.o().getInt("keyboard_float_window_y", 0)));
        ShapeableImageView shapeableImageView4 = this.a;
        if (shapeableImageView4 != null) {
            ShapeAppearanceModel shapeAppearanceModel2 = this.b;
            if (shapeAppearanceModel2 == null) {
                kotlin.s.c.l.l("roundShapeAppearanceModel");
                throw null;
            }
            shapeableImageView4.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        ShapeableImageView shapeableImageView5 = this.a;
        if (shapeableImageView5 != null) {
            shapeableImageView5.setStrokeColorResource(C0838R.color.float_keyboard_stroke_color);
        }
        ShapeableImageView shapeableImageView6 = this.a;
        if (shapeableImageView6 != null) {
            shapeableImageView6.setStrokeWidthResource(C0838R.dimen.dp_1);
        }
        setElevation(getResources().getDimension(C0838R.dimen.float_keyboard_elevation));
        setClipToOutline(true);
        ViewOutlineProvider viewOutlineProvider = this.f2635d;
        if (viewOutlineProvider == null) {
            kotlin.s.c.l.l("floatingWinOutline");
            throw null;
        }
        setOutlineProvider(viewOutlineProvider);
        View view2 = this.m;
        if (view2 == null) {
            kotlin.s.c.l.l("mDragBar");
            throw null;
        }
        view2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams6 = getLayoutParams();
        kotlin.s.c.l.d(layoutParams6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
        if (-2 != layoutParams7.width || -2 != layoutParams7.height) {
            layoutParams7.width = -2;
            layoutParams7.height = -2;
            setLayoutParams(layoutParams7);
        }
        LinearLayout linearLayout3 = this.f2638g;
        if (linearLayout3 == null) {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams8 = linearLayout3.getLayoutParams();
        int i2 = this.U;
        if (i2 != layoutParams8.width || -2 != layoutParams8.height) {
            layoutParams8.width = i2;
            layoutParams8.height = -2;
            LinearLayout linearLayout4 = this.f2638g;
            if (linearLayout4 == null) {
                kotlin.s.c.l.l("mBoardWhole");
                throw null;
            }
            linearLayout4.setLayoutParams(layoutParams8);
        }
        ViewGroup viewGroup4 = this.i;
        if (viewGroup4 == null) {
            kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams9 = viewGroup4.getLayoutParams();
        if (layoutParams9 == null) {
            return;
        }
        int i3 = this.U;
        if (i3 != layoutParams9.width || this.V != layoutParams9.height) {
            layoutParams9.width = i3;
            layoutParams9.height = this.V;
            ViewGroup viewGroup5 = this.i;
            if (viewGroup5 == null) {
                kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
                throw null;
            }
            viewGroup5.setLayoutParams(layoutParams9);
        }
        ViewGroup viewGroup6 = this.i;
        if (viewGroup6 == null) {
            kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
            throw null;
        }
        viewGroup6.requestLayout();
        KeyboardView keyboardView2 = this.p;
        if (keyboardView2 != null) {
            ViewGroup.LayoutParams layoutParams10 = keyboardView2.getLayoutParams();
            layoutParams10.height = com.bytedance.android.input.keyboard.areacontrol.k.y();
            keyboardView2.setLayoutParams(layoutParams10);
            keyboardView2.requestLayout();
        }
        if (((Number) gVar.c()).intValue() == 0 && ((Number) gVar.d()).intValue() == 0) {
            LinearLayout linearLayout5 = this.f2638g;
            if (linearLayout5 != null) {
                linearLayout5.addOnLayoutChangeListener(new com.bytedance.android.input.keyboard.areacontrol.l(this));
                return;
            } else {
                kotlin.s.c.l.l("mBoardWhole");
                throw null;
            }
        }
        LinearLayout linearLayout6 = this.f2638g;
        if (linearLayout6 != null) {
            linearLayout6.addOnLayoutChangeListener(new m(this, gVar));
        } else {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
    }

    public final void setInputViewImageBg() {
        ShapeableImageView shapeableImageView = this.a;
        if (shapeableImageView != null) {
            if (W()) {
                shapeableImageView.setImageDrawable(new ColorDrawable(Color.argb(82, 0, 0, 0)));
                com.bytedance.common_biz.ui.utils.b bVar = com.bytedance.common_biz.ui.utils.b.a;
                com.bytedance.common_biz.ui.utils.b.d(shapeableImageView, 32);
                com.bytedance.android.input.r.j.m(this.f2637f, "InputViewRoot setInputViewImageBg transparent");
            } else {
                shapeableImageView.setImageDrawable(this.f0);
                com.bytedance.android.input.r.j.m(this.f2637f, "InputViewRoot setInputViewImageBg not transparent");
            }
        }
        View view = this.K;
        if (view != null) {
            if (W()) {
                view.setBackgroundResource(C0838R.drawable.bg_toolbar_btn_transparent);
            } else {
                view.setBackgroundResource(C0838R.drawable.bg_toolbar_btn);
            }
        }
    }

    public final void setKeyboardState(int i2) {
        EmojiLayout emojiLayout = this.r;
        if (emojiLayout != null) {
            emojiLayout.setKeyboardState(i2);
        }
        ClipboardCommonPhraseContainer clipboardCommonPhraseContainer = this.O;
        if (clipboardCommonPhraseContainer != null) {
            clipboardCommonPhraseContainer.setKeyboardState(i2);
        }
    }

    public final void setMCommonPhraseEditTextConnection(InputConnection inputConnection) {
    }

    public final void setMIsEditPhraseFocused(boolean z) {
        this.z = z;
    }

    public final void setMIsEditPhraseInputCodeFocused(boolean z) {
        this.A = z;
    }

    public final void setOnDragToEdgeListener(o oVar) {
        this.q = oVar;
    }

    public final void setTranslateViewVisibility(int i2) {
        e.a.a.a.a.k0("setTranslateViewVisibility visibility: ", i2, this.f2637f);
        if (i2 == 0) {
            setCommonPhraseEditViewEnabled(false, new String[0]);
            KeyboardJni.getKeyboardJni().hideTopExternView(false);
        }
    }

    public final void setWindowBottomInsetPadding(int i2) {
        LinearLayout linearLayout = this.f2638g;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
        if (linearLayout == null) {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
        int paddingLeft = linearLayout.getPaddingLeft();
        LinearLayout linearLayout2 = this.f2638g;
        if (linearLayout2 == null) {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
        int paddingTop = linearLayout2.getPaddingTop();
        LinearLayout linearLayout3 = this.f2638g;
        if (linearLayout3 == null) {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
        linearLayout.setPadding(paddingLeft, paddingTop, linearLayout3.getPaddingRight(), i2);
        LinearLayout linearLayout4 = this.f2638g;
        if (linearLayout4 != null) {
            linearLayout4.requestLayout();
        } else {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
    }

    public final void u(KeyboardView keyboardView, KeyboardView keyboardView2) {
        kotlin.s.c.l.f(keyboardView, "mainView");
        kotlin.s.c.l.f(keyboardView2, "translateView");
        BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
        BackspaceSwipeWindow.j().t(keyboardView);
        this.o = keyboardView;
        this.p = keyboardView2;
        kotlin.s.c.l.c(keyboardView2);
        keyboardView2.setVisibility(o0 ? 0 : 8);
        LinearLayout linearLayout = this.f2638g;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mBoardWhole");
            throw null;
        }
        KeyboardView keyboardView3 = this.p;
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        linearLayout.addView(keyboardView3, 0, new ViewGroup.LayoutParams(-1, com.bytedance.android.input.keyboard.areacontrol.k.F()));
        String str = this.f2637f;
        StringBuilder M = e.a.a.a.a.M("addKeyboardView() add translate view ");
        M.append(o0);
        M.append(", ");
        KeyboardView keyboardView4 = this.p;
        kotlin.s.c.l.c(keyboardView4);
        M.append(keyboardView4.getVisibility());
        com.bytedance.android.input.r.j.i(str, M.toString());
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout == null) {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
        relativeLayout.addView(this.o, -1, new ViewGroup.LayoutParams(-1, -1));
        KeyboardView keyboardView5 = this.o;
        kotlin.s.c.l.c(keyboardView5);
        keyboardView5.setVisibility(0);
        if (p0) {
            setCommonPhraseEditViewEnabled(true, new String[0]);
        }
    }

    public final void u0(boolean z, int i2, int i3) {
        boolean z2;
        int x;
        int i4;
        StretchView stretchView = this.u;
        if (stretchView != null && stretchView.getVisibility() == 0) {
            return;
        }
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        int r = com.bytedance.android.input.keyboard.areacontrol.k.r();
        int s = com.bytedance.android.input.keyboard.areacontrol.k.s();
        int t = com.bytedance.android.input.keyboard.areacontrol.k.t();
        int u = com.bytedance.android.input.keyboard.areacontrol.k.u();
        String str = this.f2637f;
        StringBuilder sb = new StringBuilder();
        sb.append("[showBottomDistance] show: ");
        sb.append(z);
        sb.append(" height=");
        sb.append(i2);
        sb.append(" heightSet=");
        e.a.a.a.a.C0(sb, i3, str);
        String str2 = this.f2637f;
        StringBuilder X = e.a.a.a.a.X("[showBottomDistance] show: ", z, " InputViewModel.mKeyboardPortHeight: ");
        X.append(com.bytedance.android.input.keyboard.areacontrol.k.p());
        X.append(" InputViewModel.mKeyboardKeyAreaHeight=");
        X.append(com.bytedance.android.input.keyboard.areacontrol.k.f());
        X.append(" InputViewModel.mLastSavePlaceholderNaviHeight=");
        X.append(t);
        X.append(" InputViewModel.mLastSavePlaceholderNaviHeightForHandWrite=");
        X.append(u);
        X.append(" InputViewModel.mKeyboardBottomMargin=");
        X.append(com.bytedance.android.input.keyboard.areacontrol.k.H());
        X.append(" InputViewModel.mLastSaveInputViewState=");
        X.append(r);
        X.append(" InputViewModel.mLastSaveInputViewStateForHandWrite=");
        X.append(s);
        com.bytedance.android.input.r.j.m(str2, X.toString());
        LinearLayout linearLayout = this.h;
        if (linearLayout == null) {
            kotlin.s.c.l.l("mKeyboardBoardArea");
            throw null;
        }
        linearLayout.getLayoutParams().height = com.bytedance.android.input.keyboard.areacontrol.k.f();
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout == null) {
            kotlin.s.c.l.l("mKeyboardOneHandArea");
            throw null;
        }
        relativeLayout.getLayoutParams().height = com.bytedance.android.input.keyboard.areacontrol.k.f();
        boolean z3 = com.bytedance.android.input.keyboard.areacontrol.k.Q() && !com.bytedance.android.input.keyboard.areacontrol.k.T();
        int J2 = com.bytedance.android.input.keyboard.areacontrol.k.J();
        int I = com.bytedance.android.input.keyboard.areacontrol.k.I();
        String str3 = this.f2637f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[showBottomDistance] currentIsHandWrite: ");
        sb2.append(z3);
        sb2.append(" originalNormalBottomMargin=");
        sb2.append(J2);
        sb2.append(" originalHandWriteBottomMargin=");
        e.a.a.a.a.C0(sb2, I, str3);
        LinearLayout linearLayout2 = this.h;
        if (linearLayout2 == null) {
            kotlin.s.c.l.l("mKeyboardBoardArea");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (z) {
                z2 = z3;
                int x2 = x(true, r, J2, t, i3);
                x = x(true, s, I, u, i3);
                com.bytedance.android.input.r.j.m(this.f2637f, "[showBottomDistance] 02 show=" + z + " height=" + i2 + " heightSet=" + i3 + " it.bottomMargin=" + marginLayoutParams.bottomMargin + ' ');
                i4 = x2;
            } else {
                z2 = z3;
                int x3 = x(false, r, J2, t, i3);
                x = x(false, s, I, u, i3);
                com.bytedance.android.input.r.j.m(this.f2637f, "[showBottomDistance] 03 show=" + z + " height=" + i2 + " heightSet=" + i3 + " it.bottomMargin=" + marginLayoutParams.bottomMargin + ' ');
                i4 = x3;
            }
            if (z2) {
                marginLayoutParams.bottomMargin = x;
            } else {
                marginLayoutParams.bottomMargin = i4;
            }
            com.bytedance.android.input.r.j.m(this.f2637f, "[showBottomDistance] last currentIsHandWrite=" + z2 + " tempNormalBottomMargin=" + i4 + " tempHandWriteBottomMargin=" + x);
            com.bytedance.android.input.keyboard.areacontrol.k.Z(x);
            com.bytedance.android.input.keyboard.areacontrol.k.a0(i4);
        }
        LinearLayout linearLayout3 = this.h;
        if (linearLayout3 != null) {
            linearLayout3.requestLayout();
        } else {
            kotlin.s.c.l.l("mKeyboardBoardArea");
            throw null;
        }
    }

    public final void w(boolean z) {
        int i2;
        if (W()) {
            if (z) {
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                i2 = com.bytedance.android.input.keyboard.areacontrol.k.b() + com.bytedance.android.input.keyboard.areacontrol.k.p();
            } else {
                i2 = 0;
            }
            com.bytedance.android.input.r.j.m(this.f2637f, "broadcastKeyboardHeight keyboardHeight=" + i2);
            Intent intent = new Intent("com.bytedance.android.doubaoime.ACTION_KEYBOARD_HEIGHT");
            intent.putExtra("keyboard_height", i2);
            try {
                IAppGlobals.a.getContext().sendBroadcast(intent, "com.bytedance.android.doubaoime.permission.RECEIVE_KEYBOARD_HEIGHT");
            } catch (Exception e2) {
                e.a.a.a.a.f0(e2, e.a.a.a.a.M("broadcastKeyboardHeight error: "), this.f2637f);
            }
        }
    }

    public final void w0(boolean z) {
        v0(z, 0, z);
        com.bytedance.android.input.r.j.m(this.f2637f, "showClipboardHistoryView");
    }

    public final void x0(boolean z) {
        v0(z, 1, true);
        com.bytedance.android.input.r.j.m(this.f2637f, "showCommonPhraseView");
    }

    public final void y() {
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        com.bytedance.android.input.keyboard.areacontrol.k.f0(!com.bytedance.android.input.keyboard.areacontrol.k.U());
        q qVar = this.Q;
        if (qVar != null) {
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            ViewGroup viewGroup = this.i;
            if (viewGroup != null) {
                qVar.a(context, viewGroup);
            } else {
                kotlin.s.c.l.l("mKeyboardBoardAreaLLM");
                throw null;
            }
        }
    }

    public final void y0(boolean z, String str, String str2) {
        com.bytedance.android.input.common.c cVar = new com.bytedance.android.input.common.c();
        if (z && this.r == null) {
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            EmojiLayout emojiLayout = new EmojiLayout(context, null);
            this.r = emojiLayout;
            kotlin.s.c.l.c(emojiLayout);
            emojiLayout.x(this, str, str2);
            cVar.a("init");
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout.addView(this.r, -1, new ViewGroup.LayoutParams(-1, -1));
            String str3 = this.f2637f;
            StringBuilder M = e.a.a.a.a.M("showEmojiView new orientation = ");
            M.append(getContext().getResources().getConfiguration().orientation);
            com.bytedance.android.input.r.j.m(str3, M.toString());
            cVar.a("addView");
        }
        EmojiLayout emojiLayout2 = this.r;
        if (emojiLayout2 != null) {
            boolean z2 = false;
            if (z) {
                KeyboardView keyboardView = this.p;
                if (keyboardView != null && keyboardView.getVisibility() == 0) {
                    z2 = true;
                }
                if (z2) {
                    KeyboardJni.getKeyboardJni().hideTopExternView(true);
                    KeyboardJni.updateInputViewShown();
                    this.R = true;
                }
            } else {
                kotlin.s.c.l.c(emojiLayout2);
                if (emojiLayout2.getVisibility() == 0 && this.R) {
                    KeyboardJni.getKeyboardJni().hideTopExternView(false);
                    KeyboardJni.updateInputViewShown();
                    this.R = false;
                }
            }
            if (z) {
                EmojiLayout emojiLayout3 = this.r;
                kotlin.s.c.l.c(emojiLayout3);
                t0(emojiLayout3);
                EmojiLayout emojiLayout4 = this.r;
                kotlin.s.c.l.c(emojiLayout4);
                emojiLayout4.F(str, str2);
            } else {
                EmojiLayout emojiLayout5 = this.r;
                kotlin.s.c.l.c(emojiLayout5);
                emojiLayout5.E();
                Object g2 = SettingsConfigNext.g(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.input_mode, "IAppGlobals.context.getString(R.string.input_mode)"), Integer.valueOf(KeyboardInputMode.PY9.getInputModeValue()));
                kotlin.s.c.l.d(g2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) g2).intValue();
                e.a.a.a.a.j0("currentSelectKeyboardType value = ", intValue, "KeyboardInputTypeConfigManager");
                if (KeyboardInputMode.Companion.a(intValue) == KeyboardInputMode.HANDWRITING) {
                    com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                    if (!com.bytedance.android.input.keyboard.areacontrol.k.T()) {
                        z0(true);
                    }
                }
                KeyboardView keyboardView2 = this.o;
                kotlin.s.c.l.c(keyboardView2);
                t0(keyboardView2);
            }
            cVar.a("setVisible");
            String str4 = this.f2637f;
            StringBuilder M2 = e.a.a.a.a.M("showEmojiView :");
            M2.append(cVar.c());
            com.bytedance.android.input.r.j.m(str4, M2.toString());
        }
    }

    public final void z() {
        HandwriteView k2;
        HandWritingBoardView handWritingBoardView = this.N;
        boolean z = false;
        if (handWritingBoardView != null && (k2 = handWritingBoardView.k()) != null && k2.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            HandWritingBoardView handWritingBoardView2 = this.N;
            if (handWritingBoardView2 != null) {
                handWritingBoardView2.o();
            }
            HandWritingBoardView handWritingBoardView3 = this.N;
            if (handWritingBoardView3 != null) {
                handWritingBoardView3.i();
            }
        }
    }

    public final void z0(boolean z) {
        com.bytedance.android.input.r.j.i(this.f2637f, "[hand_write] showHandwritingView " + z);
        w(true);
        com.bytedance.android.input.common.c cVar = new com.bytedance.android.input.common.c();
        y yVar = new y();
        com.bytedance.android.input.common.h.a.k(z);
        if (z && this.N == null) {
            Context context = getContext();
            kotlin.s.c.l.e(context, "context");
            HandWritingBoardView handWritingBoardView = new HandWritingBoardView(context, null);
            this.N = handWritingBoardView;
            handWritingBoardView.setOnItemClick(new g(handWritingBoardView));
            handWritingBoardView.setSpaceTouchEvent(new h(new v(), 200L));
            handWritingBoardView.setOnEnterSend(new i());
            KeyboardJni.EnterActionType currentEnterType = KeyboardJni.getCurrentEnterType();
            kotlin.s.c.l.e(currentEnterType, "getCurrentEnterType()");
            handWritingBoardView.D(currentEnterType);
            RelativeLayout relativeLayout = this.n;
            if (relativeLayout == null) {
                kotlin.s.c.l.l("mKeyboardOneHandArea");
                throw null;
            }
            relativeLayout.addView(this.N, -1, new ViewGroup.LayoutParams(-1, -1));
            cVar.a("init+addView");
        }
        HandWritingBoardView handWritingBoardView2 = this.N;
        if (handWritingBoardView2 != null) {
            if (!z && handWritingBoardView2.getVisibility() == 0 && this.R) {
                KeyboardJni.getKeyboardJni().hideTopExternView(false);
                KeyboardJni.updateInputViewShown();
                this.R = false;
            }
            if (z) {
                com.bytedance.android.input.keyboard.handwriting.o.b(new j(handWritingBoardView2));
                KeyboardView keyboardView = this.o;
                kotlin.s.c.l.c(keyboardView);
                t0(keyboardView);
                handWritingBoardView2.setVisibility(getVisibility());
                HandwriteView k2 = handWritingBoardView2.k();
                if (k2 != null) {
                    k2.addOnLayoutChangeListener(new l(k2, this));
                }
                handWritingBoardView2.bringToFront();
            } else {
                com.bytedance.android.input.keyboard.handwriting.o.c();
                handWritingBoardView2.setVisibility(8);
                KeyboardView keyboardView2 = this.o;
                kotlin.s.c.l.c(keyboardView2);
                t0(keyboardView2);
            }
            HandWritingBoardView handWritingBoardView3 = this.N;
            kotlin.s.c.l.c(handWritingBoardView3);
            HandwriteView k3 = handWritingBoardView3.k();
            if (k3 != null) {
                k3.setDrawListener(new k(yVar, k3));
            }
        }
        cVar.a("setVisible");
        String str = this.f2637f;
        StringBuilder M = e.a.a.a.a.M("showHandwritingView :");
        M.append(cVar.c());
        com.bytedance.android.input.r.j.m(str, M.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewRoot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.f2637f = "InputViewRoot";
        this.B = "";
        this.g0 = new Handler(Looper.getMainLooper());
        this.l0 = new Handler(Looper.getMainLooper());
        this.m0 = new Runnable() { // from class: com.bytedance.android.input.keyboard.areacontrol.j
            @Override // java.lang.Runnable
            public final void run() {
                InputViewRoot.f0(InputViewRoot.this);
            }
        };
        this.n0 = new Runnable() { // from class: com.bytedance.android.input.keyboard.areacontrol.c
            @Override // java.lang.Runnable
            public final void run() {
                InputViewRoot.Y(InputViewRoot.this);
            }
        };
        FrameLayout.inflate(context, C0838R.layout.ime_inputview_root, this);
        View findViewById = findViewById(C0838R.id.input_view_root);
        kotlin.s.c.l.c(findViewById);
        this.W = getResources().getDimensionPixelSize(C0838R.dimen.float_keyboard_padding_bottom);
        this.a0 = getResources().getDimensionPixelSize(C0838R.dimen.float_keyboard_padding_right);
        this.b0 = getResources().getDimensionPixelSize(C0838R.dimen.float_keyboard_default_y);
        this.f0 = new ColorDrawable(ContextCompat.getColor(context, C0838R.color.navigation_bar_normal));
        this.d0 = getResources().getDimensionPixelSize(C0838R.dimen.phrase_edit_view_height);
        this.e0 = getResources().getDimensionPixelSize(C0838R.dimen.dp_1);
    }
}
