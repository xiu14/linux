package com.bytedance.android.input.speech.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.android.input.speech.view.AsrNormalBackgroundSpan;
import com.bytedance.android.input.speech.view.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AsrTextView extends AppCompatTextView {
    public static final /* synthetic */ int s = 0;
    private final String a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f3163c;

    /* renamed from: d, reason: collision with root package name */
    private int f3164d;

    /* renamed from: e, reason: collision with root package name */
    private int f3165e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3166f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3167g;
    private float h;
    private float i;
    private boolean j;
    private final RectF k;
    private final RectF l;
    private float m;
    private float n;
    private HotZoneMoveStatus o;
    private CustomScrollView p;
    private boolean q;
    private final Runnable r;

    public enum HotZoneMoveStatus {
        NONE,
        BEGIN,
        END
    }

    public static final class a {
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f3168c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.f3168c = i3;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.f3168c;
        }

        public final int c() {
            return this.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(String str) {
            String str2 = str;
            if (AsrTextView.this.m()) {
                kotlin.s.c.l.e(str2, "it");
                if (str2.length() > 0) {
                    AsrTextView.this.b = str2.length() - l.a.l().length();
                    AsrTextView asrTextView = AsrTextView.this;
                    asrTextView.f3163c = asrTextView.b;
                } else {
                    if (str2.length() == 0) {
                        AsrTextView.this.setText("");
                        AsrTextView.this.b = 0;
                        AsrTextView.this.f3163c = 0;
                    }
                }
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(String str) {
            String str2 = str;
            if (!AsrTextView.this.m()) {
                e.a.a.a.a.r0("[correct] update long asr text ", str2, AsrTextView.this.a);
                AsrTextView.this.setText(str2);
            }
            return kotlin.o.a;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.l<l.a, kotlin.o> {
        d() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
        
            if (r0 <= r3) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[ADDED_TO_REGION] */
        @Override // kotlin.s.b.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.o invoke(com.bytedance.android.input.speech.view.l.a r8) {
            /*
                r7 = this;
                com.bytedance.android.input.speech.view.l$a r8 = (com.bytedance.android.input.speech.view.l.a) r8
                com.bytedance.android.input.speech.view.AsrTextView r0 = com.bytedance.android.input.speech.view.AsrTextView.this
                java.lang.String r0 = com.bytedance.android.input.speech.view.AsrTextView.e(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[correct] observeForever selectInEditor "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                com.bytedance.android.input.r.j.i(r0, r1)
                com.bytedance.android.input.speech.view.AsrTextView r0 = com.bytedance.android.input.speech.view.AsrTextView.this
                java.lang.CharSequence r0 = r0.getText()
                java.lang.String r1 = "text"
                kotlin.s.c.l.e(r0, r1)
                int r0 = r0.length()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L31
                r0 = r1
                goto L32
            L31:
                r0 = r2
            L32:
                if (r0 == 0) goto L36
                goto Lda
            L36:
                int r0 = r8.a()
                int r3 = r8.b()
                if (r0 < r3) goto Lc0
                int r0 = r8.b()
                com.bytedance.android.input.speech.view.l r3 = com.bytedance.android.input.speech.view.l.a
                int r4 = r3.h()
                int r0 = r0 - r4
                int r8 = r8.a()
                int r4 = r3.h()
                int r8 = r8 - r4
                androidx.lifecycle.LiveData r3 = r3.n()
                java.lang.Object r3 = r3.getValue()
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L65
                int r3 = r3.length()
                goto L66
            L65:
                r3 = r2
            L66:
                com.bytedance.android.input.speech.view.AsrTextView r4 = com.bytedance.android.input.speech.view.AsrTextView.this
                java.lang.String r4 = com.bytedance.android.input.speech.view.AsrTextView.e(r4)
                java.lang.String r5 = "[correct] observeForever selectInEditor startOff = "
                java.lang.String r6 = ", endOff = "
                e.a.a.a.a.m0(r5, r0, r6, r8, r4)
                r4 = -1
                if (r0 != r8) goto L7b
                if (r0 < 0) goto L8b
                if (r0 <= r3) goto L8d
                goto L8b
            L7b:
                if (r0 >= r3) goto L81
                if (r8 <= 0) goto L81
                r5 = r1
                goto L82
            L81:
                r5 = r2
            L82:
                if (r5 == 0) goto L8b
                if (r0 >= 0) goto L87
                r0 = r2
            L87:
                if (r8 <= r3) goto L8d
                r8 = r3
                goto L8d
            L8b:
                r8 = r4
                r0 = r8
            L8d:
                com.bytedance.android.input.speech.view.AsrTextView r3 = com.bytedance.android.input.speech.view.AsrTextView.this
                int r3 = com.bytedance.android.input.speech.view.AsrTextView.d(r3)
                if (r3 != r0) goto L9d
                com.bytedance.android.input.speech.view.AsrTextView r3 = com.bytedance.android.input.speech.view.AsrTextView.this
                int r3 = com.bytedance.android.input.speech.view.AsrTextView.c(r3)
                if (r3 == r8) goto Lda
            L9d:
                com.bytedance.android.input.speech.view.AsrTextView r3 = com.bytedance.android.input.speech.view.AsrTextView.this
                com.bytedance.android.input.speech.view.AsrTextView.k(r3, r0, r8, r2)
                if (r0 == r4) goto Lda
                if (r8 == r4) goto Lda
                if (r0 == r8) goto Lda
                com.bytedance.android.input.basic.applog.api.IAppLog$a r2 = com.bytedance.android.input.basic.applog.api.IAppLog.a
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                java.lang.String r4 = "edittext"
                r3.put(r4, r1)
                int r8 = r8 - r0
                java.lang.String r0 = "manuallyselect_words"
                r3.put(r0, r8)
                java.lang.String r8 = "voiceinput_panel_selected"
                r2.t(r8, r3)
                goto Lda
            Lc0:
                com.bytedance.android.input.speech.view.AsrTextView r0 = com.bytedance.android.input.speech.view.AsrTextView.this
                java.lang.String r0 = com.bytedance.android.input.speech.view.AsrTextView.e(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[correct] observeForever select selectInEditor "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                com.bytedance.android.input.r.j.j(r0, r8)
            Lda:
                kotlin.o r8 = kotlin.o.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.view.AsrTextView.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e extends GestureDetector.SimpleOnGestureListener {
        e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            kotlin.s.c.l.f(motionEvent, "e");
            int offsetForPosition = AsrTextView.this.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
            AsrTextView.this.f3164d = offsetForPosition;
            AsrTextView.this.f3165e = offsetForPosition + 1;
            AsrTextView asrTextView = AsrTextView.this;
            AsrTextView.s(asrTextView, asrTextView.f3164d, AsrTextView.this.f3165e, false, 4);
            AsrTextView.this.f3166f = true;
            String str = AsrTextView.this.a;
            StringBuilder M = e.a.a.a.a.M("[correct] onDoubleTap ");
            M.append(AsrTextView.this.f3164d);
            M.append(", ");
            M.append(AsrTextView.this.f3165e);
            com.bytedance.android.input.r.j.i(str, M.toString());
            return false;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrTextView(Context context) {
        super(context);
        kotlin.s.c.l.f(context, "context");
        this.a = "Asr-AsrText";
        this.b = -1;
        this.f3163c = -1;
        this.f3164d = -1;
        this.f3165e = -1;
        this.k = new RectF();
        this.l = new RectF();
        this.o = HotZoneMoveStatus.NONE;
        this.r = new Runnable() { // from class: com.bytedance.android.input.speech.view.d
            @Override // java.lang.Runnable
            public final void run() {
                AsrTextView asrTextView = AsrTextView.this;
                int i = AsrTextView.s;
                kotlin.s.c.l.f(asrTextView, "this$0");
                asrTextView.invalidate();
            }
        };
        o();
    }

    private final List<a> l(int i, int i2) {
        int lineForOffset;
        int lineForOffset2;
        ArrayList arrayList = new ArrayList();
        Layout layout = getLayout();
        if (layout != null && (lineForOffset = layout.getLineForOffset(i)) <= (lineForOffset2 = layout.getLineForOffset(i2 - 1))) {
            int i3 = lineForOffset;
            while (true) {
                int i4 = 0;
                int lineStart = layout.getLineStart(i3);
                int lineEnd = layout.getLineEnd(i3);
                if (i3 == lineForOffset) {
                    i4 = i - lineStart;
                    lineStart = i;
                }
                if (i3 == lineForOffset2) {
                    lineEnd = i2;
                }
                arrayList.add(new a(lineStart, lineEnd, i4));
                if (i3 == lineForOffset2) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    private final int n(float f2, float f3) {
        int i;
        Layout layout = getLayout();
        if (layout == null) {
            return -1;
        }
        int lineForVertical = layout.getLineForVertical((int) f3);
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f2);
        float lineWidth = layout.getLineWidth(lineForVertical) + getLeftPaddingOffset();
        if (f2 >= lineWidth) {
            int lineEnd = layout.getLineEnd(lineForVertical);
            CharSequence text = getText();
            if (text != null && lineEnd - 1 >= 0) {
                if (text.charAt(i) == '\n') {
                    com.bytedance.android.input.r.j.i(this.a, "[correct] getOffsetForPositionInner is enter");
                    lineEnd = i;
                }
                offsetForHorizontal = lineEnd;
            }
        }
        com.bytedance.android.input.r.j.i(this.a, "[correct] getOffsetForPositionInner ----------- " + offsetForHorizontal + ", x = " + f2 + ", width = " + lineWidth + ", " + layout.getOffsetForHorizontal(lineForVertical, f2) + ", " + layout.getLineEnd(lineForVertical));
        return offsetForHorizontal;
    }

    private final void o() {
        setMovementMethod(LinkMovementMethod.getInstance());
        setClickable(true);
        IAppGlobals.a aVar = IAppGlobals.a;
        this.h = aVar.getContext().getResources().getDimension(C0838R.dimen.dp_2);
        this.i = aVar.getContext().getResources().getDimension(C0838R.dimen.dp_22);
        this.m = aVar.getContext().getResources().getDimension(C0838R.dimen.dp_24);
        this.n = aVar.getContext().getResources().getDimension(C0838R.dimen.dp_15);
        l lVar = l.a;
        lVar.n().observeForever(new f(new b()));
        lVar.p().observeForever(new f(new c()));
        lVar.j().observeForever(new f(new d()));
        final GestureDetector gestureDetector = new GestureDetector(aVar.getContext(), new e());
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.android.input.speech.view.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                GestureDetector gestureDetector2 = gestureDetector;
                int i = AsrTextView.s;
                kotlin.s.c.l.f(gestureDetector2, "$gestureDetector");
                return gestureDetector2.onTouchEvent(motionEvent);
            }
        });
    }

    private final int p(float f2, float f3) {
        float paddingLeft = getPaddingLeft() + f2;
        if (this.k.contains(paddingLeft, f3)) {
            com.bytedance.android.input.r.j.i(this.a, "isInBeginBarHotZone ----------- true. x=" + f2 + ",y=" + f3 + ",realX=" + paddingLeft);
            return 1;
        }
        if (this.l.contains(paddingLeft, f3)) {
            com.bytedance.android.input.r.j.i(this.a, "isInEndBarHotZone ----------- true. x=" + f2 + ",y=" + f3 + ",realX=" + paddingLeft);
            return 2;
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("new button down. ");
        M.append(this.k);
        M.append(", ");
        M.append(this.l);
        M.append(", x=");
        M.append(f2);
        M.append(", y=");
        M.append(f3);
        M.append(", realX=");
        M.append(f2);
        com.bytedance.android.input.r.j.i(str, M.toString());
        return 0;
    }

    private final void q(int i) {
        if (this.p != null) {
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            CustomScrollView customScrollView = this.p;
            if (customScrollView != null) {
                customScrollView.getLocationInWindow(iArr2);
            }
            int i2 = iArr[1] - iArr2[1];
            int lineTop = getLayout().getLineTop(i);
            int lineBottom = getLayout().getLineBottom(i);
            int i3 = lineBottom + i2;
            int i4 = lineTop + i2;
            CustomScrollView customScrollView2 = this.p;
            kotlin.s.c.l.c(customScrollView2);
            int scrollY = customScrollView2.getScrollY();
            CustomScrollView customScrollView3 = this.p;
            kotlin.s.c.l.c(customScrollView3);
            int height = customScrollView3.getHeight();
            CustomScrollView customScrollView4 = this.p;
            kotlin.s.c.l.c(customScrollView4);
            int paddingBottom = (height - customScrollView4.getPaddingBottom()) - (getLineHeight() / 2);
            if (i3 > paddingBottom) {
                CustomScrollView customScrollView5 = this.p;
                kotlin.s.c.l.c(customScrollView5);
                customScrollView5.smoothScrollTo(0, getLineHeight() + scrollY);
            } else {
                CustomScrollView customScrollView6 = this.p;
                kotlin.s.c.l.c(customScrollView6);
                if (i4 < customScrollView6.getPaddingTop()) {
                    CustomScrollView customScrollView7 = this.p;
                    kotlin.s.c.l.c(customScrollView7);
                    customScrollView7.smoothScrollTo(0, scrollY - getLineHeight());
                }
            }
            String str = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("点击位置在 ScrollView 中的坐标: (line = ");
            sb.append(i);
            sb.append(", ");
            sb.append(lineTop);
            sb.append(' ');
            e.a.a.a.a.F0(sb, lineBottom, ", scrollPos = ", scrollY, ", offset,{");
            CustomScrollView customScrollView8 = this.p;
            sb.append(customScrollView8 != null ? Integer.valueOf(customScrollView8.getPaddingTop()) : null);
            sb.append(',');
            CustomScrollView customScrollView9 = this.p;
            sb.append(customScrollView9 != null ? Integer.valueOf(customScrollView9.getPaddingBottom()) : null);
            sb.append(' ');
            sb.append(i2);
            sb.append("}, ");
            e.a.a.a.a.F0(sb, i3, ", ", i4, ", ");
            sb.append(paddingBottom);
            sb.append(')');
            com.bytedance.android.input.r.j.i(str, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int i, int i2, boolean z) {
        if (this.j && getLayout() != null) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            int i3 = this.b;
            if (min == i3 && max == this.f3163c) {
                return;
            }
            int i4 = this.f3163c;
            this.b = min;
            this.f3163c = max;
            l lVar = l.a;
            lVar.z(lVar.h() + min, lVar.h() + max, z);
            SpannableString spannableString = new SpannableString(getText());
            AsrNormalBackgroundSpan[] asrNormalBackgroundSpanArr = (AsrNormalBackgroundSpan[]) spannableString.getSpans(0, spannableString.length(), AsrNormalBackgroundSpan.class);
            kotlin.s.c.l.e(asrNormalBackgroundSpanArr, "spans");
            for (AsrNormalBackgroundSpan asrNormalBackgroundSpan : asrNormalBackgroundSpanArr) {
                spannableString.removeSpan(asrNormalBackgroundSpan);
            }
            n[] nVarArr = (n[]) spannableString.getSpans(0, spannableString.length(), n.class);
            kotlin.s.c.l.e(nVarArr, "spansUnder");
            for (n nVar : nVarArr) {
                nVar.a(false);
            }
            setText(spannableString);
            if (i == -1 || i2 == -1 || i == i2) {
                return;
            }
            e.a.a.a.a.m0("[correct] updateSelection ----------- ", min, ", ", max, this.a);
            List<a> l = l(min, max);
            if (!l.isEmpty()) {
                SpannableString spannableString2 = new SpannableString(getText());
                Iterator it2 = ((ArrayList) l).iterator();
                while (it2.hasNext()) {
                    a aVar = (a) it2.next();
                    AsrSelectBackgroundSpan asrSelectBackgroundSpan = new AsrSelectBackgroundSpan(this);
                    if (aVar.c() >= aVar.a() || aVar.a() > getText().length() || aVar.c() < 0) {
                        String str = this.a;
                        StringBuilder M = e.a.a.a.a.M("[correct] updateSelection error offset ");
                        M.append(aVar.c());
                        M.append(", ");
                        M.append(aVar.a());
                        com.bytedance.android.input.r.j.j(str, M.toString());
                    } else {
                        asrSelectBackgroundSpan.j(aVar.c());
                        asrSelectBackgroundSpan.g(aVar.a());
                        asrSelectBackgroundSpan.i(aVar.b());
                        spannableString2.setSpan(asrSelectBackgroundSpan, aVar.c(), aVar.a(), 33);
                    }
                }
                if (min != 0) {
                    Iterator it3 = ((ArrayList) l(0, min)).iterator();
                    while (it3.hasNext()) {
                        a aVar2 = (a) it3.next();
                        AsrNormalBackgroundSpan asrNormalBackgroundSpan2 = new AsrNormalBackgroundSpan(this);
                        if (aVar2.c() >= aVar2.a() || aVar2.a() > getText().length() || aVar2.c() < 0) {
                            String str2 = this.a;
                            StringBuilder M2 = e.a.a.a.a.M("[correct] updateSelection normal start error offset ");
                            M2.append(aVar2.c());
                            M2.append(", ");
                            M2.append(aVar2.a());
                            com.bytedance.android.input.r.j.j(str2, M2.toString());
                        } else {
                            asrNormalBackgroundSpan2.j(aVar2.c());
                            asrNormalBackgroundSpan2.g(aVar2.a());
                            asrNormalBackgroundSpan2.i(aVar2.b());
                            spannableString2.setSpan(asrNormalBackgroundSpan2, aVar2.c(), aVar2.a(), 33);
                        }
                    }
                }
                if (max != getText().length()) {
                    Iterator it4 = ((ArrayList) l(max, getText().length())).iterator();
                    while (it4.hasNext()) {
                        a aVar3 = (a) it4.next();
                        AsrNormalBackgroundSpan asrNormalBackgroundSpan3 = new AsrNormalBackgroundSpan(this);
                        if (aVar3.c() >= aVar3.a() || aVar3.a() > getText().length() || aVar3.c() < 0) {
                            String str3 = this.a;
                            StringBuilder M3 = e.a.a.a.a.M("[correct] updateSelection normal end error offset ");
                            M3.append(aVar3.c());
                            M3.append(", ");
                            M3.append(aVar3.a());
                            com.bytedance.android.input.r.j.j(str3, M3.toString());
                        } else {
                            asrNormalBackgroundSpan3.j(aVar3.c());
                            asrNormalBackgroundSpan3.g(aVar3.a());
                            asrNormalBackgroundSpan3.i(aVar3.b());
                            spannableString2.setSpan(asrNormalBackgroundSpan3, aVar3.c(), aVar3.a(), 33);
                        }
                    }
                }
                setText(spannableString2);
            }
            if (i3 != this.b) {
                q(getLayout().getLineForOffset(this.b));
                return;
            }
            if (i4 != this.f3163c) {
                int lineForOffset = getLayout().getLineForOffset(this.f3163c);
                if (getLayout().getLineStart(lineForOffset) == this.f3163c && lineForOffset > 0) {
                    lineForOffset--;
                }
                q(lineForOffset);
            }
        }
    }

    static /* synthetic */ void s(AsrTextView asrTextView, int i, int i2, boolean z, int i3) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        asrTextView.r(i, i2, z);
    }

    public final boolean m() {
        return this.j;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        float f3;
        SpannableString spannableString = new SpannableString(getText());
        AsrSelectBackgroundSpan[] asrSelectBackgroundSpanArr = (AsrSelectBackgroundSpan[]) spannableString.getSpans(0, spannableString.length(), AsrSelectBackgroundSpan.class);
        kotlin.s.c.l.e(asrSelectBackgroundSpanArr, "spans");
        if (asrSelectBackgroundSpanArr.length == 0) {
            super.onDraw(canvas);
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            AsrNormalBackgroundSpan[] asrNormalBackgroundSpanArr = (AsrNormalBackgroundSpan[]) spannableString.getSpans(0, spannableString.length(), AsrNormalBackgroundSpan.class);
            kotlin.s.c.l.e(asrNormalBackgroundSpanArr, "spansNormal");
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (AsrNormalBackgroundSpan asrNormalBackgroundSpan : asrNormalBackgroundSpanArr) {
                if (asrNormalBackgroundSpan instanceof AsrSelectBackgroundSpan) {
                    CharSequence text = getText();
                    kotlin.s.c.l.e(text, "text");
                    TextPaint paint = getPaint();
                    kotlin.s.c.l.e(paint, "paint");
                    AsrNormalBackgroundSpan.a e2 = asrNormalBackgroundSpan.e(text, paint, getPaddingLeft());
                    if (e2 != null) {
                        f4 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0 ? e2.c().x : Float.min(f4, e2.c().x);
                        f5 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0 ? e2.b().x : Float.max(f5, e2.b().x);
                    }
                } else {
                    CharSequence text2 = getText();
                    TextPaint paint2 = getPaint();
                    kotlin.s.c.l.e(paint2, "paint");
                    asrNormalBackgroundSpan.a(canvas, text2, paint2, getPaddingLeft());
                }
            }
            f2 = f4;
            f3 = f5;
        }
        for (AsrSelectBackgroundSpan asrSelectBackgroundSpan : asrSelectBackgroundSpanArr) {
            CharSequence text3 = getText();
            TextPaint paint3 = getPaint();
            kotlin.s.c.l.e(paint3, "paint");
            asrSelectBackgroundSpan.k(canvas, text3, paint3, getPaddingLeft(), f2, f3);
        }
        int length = asrSelectBackgroundSpanArr.length;
        if (length == 0) {
            this.k.setEmpty();
            this.l.setEmpty();
            this.o = HotZoneMoveStatus.NONE;
        }
        AsrSelectBackgroundSpan asrSelectBackgroundSpan2 = length > 0 ? asrSelectBackgroundSpanArr[0] : null;
        AsrSelectBackgroundSpan asrSelectBackgroundSpan3 = length > 0 ? asrSelectBackgroundSpanArr[length - 1] : null;
        if (asrSelectBackgroundSpan2 != null) {
            CharSequence text4 = getText();
            TextPaint paint4 = getPaint();
            kotlin.s.c.l.e(paint4, "paint");
            asrSelectBackgroundSpan2.m(canvas, text4, paint4, getPaddingLeft());
            CharSequence text5 = getText();
            if (text5 != null) {
                kotlin.s.c.l.e(text5, "text");
                CharSequence text6 = getText();
                kotlin.s.c.l.e(text6, "text");
                TextPaint paint5 = getPaint();
                kotlin.s.c.l.e(paint5, "paint");
                AsrNormalBackgroundSpan.a e3 = asrSelectBackgroundSpan2.e(text6, paint5, getPaddingLeft());
                if (e3 != null) {
                    this.k.left = e3.c().x - this.m;
                    this.k.top = e3.c().y;
                    this.k.right = e3.c().x + this.m;
                    this.k.bottom = e3.b().y + this.n;
                }
            }
        }
        if (asrSelectBackgroundSpan3 != null) {
            CharSequence text7 = getText();
            TextPaint paint6 = getPaint();
            kotlin.s.c.l.e(paint6, "paint");
            asrSelectBackgroundSpan3.n(canvas, text7, paint6, getPaddingLeft());
            CharSequence text8 = getText();
            if (text8 != null) {
                kotlin.s.c.l.e(text8, "text");
                CharSequence text9 = getText();
                kotlin.s.c.l.e(text9, "text");
                TextPaint paint7 = getPaint();
                kotlin.s.c.l.e(paint7, "paint");
                AsrNormalBackgroundSpan.a e4 = asrSelectBackgroundSpan3.e(text9, paint7, getPaddingLeft());
                if (e4 != null) {
                    this.l.left = e4.b().x - this.m;
                    this.l.top = e4.c().y;
                    this.l.bottom = e4.b().y + this.n;
                    this.l.right = e4.b().x + this.m;
                }
            }
        }
        if (this.j) {
            int i = this.f3163c;
            int i2 = this.b;
            if (i != i2 || i2 < 0) {
                return;
            }
            CharSequence text10 = getText();
            kotlin.s.c.l.e(text10, "text");
            if (text10.length() > 0) {
                Paint paint8 = new Paint();
                paint8.setColor(IAppGlobals.a.getContext().getResources().getColor(C0838R.color.asr_text_cursor));
                RectF rectF = new RectF();
                if (getLayout() != null && this.b >= 0) {
                    int lineForOffset = getLayout().getLineForOffset(this.b);
                    float primaryHorizontal = getLayout().getPrimaryHorizontal(this.b) + getPaddingLeft();
                    rectF.left = primaryHorizontal;
                    rectF.right = primaryHorizontal + this.h;
                    float lineHeight = ((getLineHeight() - getLineSpacingExtra()) - this.i) / 2;
                    rectF.bottom = getLayout().getLineBottom(lineForOffset) - lineHeight;
                    if (lineForOffset != getLineCount() - 1) {
                        rectF.bottom -= getLineSpacingExtra();
                    }
                    rectF.top = getLayout().getLineTop(lineForOffset) + lineHeight;
                }
                if (!rectF.isEmpty()) {
                    if (this.q) {
                        this.q = false;
                    } else {
                        if (canvas != null) {
                            canvas.drawRect(rectF.left, rectF.top, rectF.right, rectF.bottom, paint8);
                        }
                        this.q = true;
                    }
                    removeCallbacks(this.r);
                    postDelayed(this.r, 500L);
                }
                if (AsrManager.a.G()) {
                    return;
                }
                q(getLayout().getLineForOffset(this.b));
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CustomScrollView customScrollView;
        kotlin.s.c.l.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX() - getPaddingLeft();
            float y = motionEvent.getY();
            if (this.f3166f) {
                this.f3166f = false;
            } else {
                this.f3167g = true;
                if (p(x, y) == 1) {
                    int i = this.f3164d;
                    int i2 = this.f3165e;
                    if (i < i2) {
                        this.o = HotZoneMoveStatus.BEGIN;
                    } else if (i > i2) {
                        this.o = HotZoneMoveStatus.END;
                    }
                    String str = this.a;
                    StringBuilder M = e.a.a.a.a.M("[correct] handleTouchDown 1, hotZoneStatus=");
                    M.append(this.o);
                    com.bytedance.android.input.r.j.m(str, M.toString());
                } else if (p(x, y) == 2) {
                    int i3 = this.f3164d;
                    int i4 = this.f3165e;
                    if (i3 < i4) {
                        this.o = HotZoneMoveStatus.END;
                    } else if (i3 > i4) {
                        this.o = HotZoneMoveStatus.BEGIN;
                    }
                    String str2 = this.a;
                    StringBuilder M2 = e.a.a.a.a.M("[correct] handleTouchDown 2, hotZoneStatus=");
                    M2.append(this.o);
                    com.bytedance.android.input.r.j.m(str2, M2.toString());
                } else {
                    this.k.setEmpty();
                    this.l.setEmpty();
                    this.o = HotZoneMoveStatus.NONE;
                    int n = n(x, y);
                    this.f3164d = n;
                    this.f3165e = n;
                    this.q = false;
                    String str3 = this.a;
                    StringBuilder M3 = e.a.a.a.a.M("[correct] handleTouchDown, ");
                    M3.append(this.f3164d);
                    M3.append(", ");
                    M3.append(this.f3165e);
                    M3.append(", x = ");
                    M3.append(x);
                    M3.append(", y = ");
                    M3.append(y);
                    com.bytedance.android.input.r.j.i(str3, M3.toString());
                    r(this.f3164d, this.f3165e, true);
                }
            }
        } else if (action == 1) {
            this.f3167g = false;
            CustomScrollView customScrollView2 = this.p;
            if (customScrollView2 != null) {
                customScrollView2.requestDisallowInterceptTouchEvent(false);
            }
            String str4 = this.a;
            StringBuilder M4 = e.a.a.a.a.M("[correct] handleTouchUp ");
            M4.append(this.f3164d);
            M4.append(", ");
            e.a.a.a.a.B0(M4, this.f3165e, str4);
            int abs = Math.abs(this.f3165e - this.f3164d);
            if (abs > 0) {
                l lVar = l.a;
                String str5 = kotlin.s.c.l.a(lVar.t().getValue(), Boolean.TRUE) ? "panel" : "edittext";
                lVar.y(false);
                IAppLog.a aVar = IAppLog.a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("manuallyselect_words", abs);
                jSONObject.put(str5, 1);
                aVar.t("voiceinput_panel_selected", jSONObject);
            }
        } else if (action == 2) {
            float x2 = motionEvent.getX() - getPaddingLeft();
            float y2 = motionEvent.getY();
            if (this.f3167g) {
                int n2 = n(x2, y2);
                int i5 = n2 >= 0 ? n2 : 0;
                String str6 = this.a;
                StringBuilder M5 = e.a.a.a.a.M("handleTouchMove mBarHotZoneMoveStatus = ");
                M5.append(this.o);
                M5.append(", actionStart = ");
                M5.append(this.f3164d);
                M5.append(", actionEnd = ");
                e.a.a.a.a.F0(M5, this.f3165e, ", endOffset=", i5, ", x = ");
                M5.append(x2);
                M5.append(", y = ");
                M5.append(y2);
                com.bytedance.android.input.r.j.i(str6, M5.toString());
                if (i5 != Math.min(this.f3164d, this.f3165e)) {
                    int ordinal = this.o.ordinal();
                    if (ordinal == 1) {
                        this.f3164d = i5;
                        com.bytedance.android.input.r.j.i(this.a, "[correct] handleTouchMove beginHotZone move");
                    } else if (ordinal != 2) {
                        this.f3165e = i5;
                        com.bytedance.android.input.r.j.i(this.a, "[correct] handleTouchMove normal move");
                    } else {
                        this.f3165e = i5;
                        com.bytedance.android.input.r.j.i(this.a, "[correct] handleTouchMove endHotZone move");
                    }
                    String str7 = this.a;
                    StringBuilder M6 = e.a.a.a.a.M("[correct] handleTouchMove ");
                    M6.append(this.f3164d);
                    M6.append(", ");
                    e.a.a.a.a.B0(M6, this.f3165e, str7);
                    if (this.f3164d != this.f3165e && (customScrollView = this.p) != null) {
                        customScrollView.requestDisallowInterceptTouchEvent(true);
                    }
                    r(this.f3164d, this.f3165e, true);
                }
            }
        }
        return onTouchEvent;
    }

    public final void setMUnderline(boolean z) {
        this.j = z;
    }

    public final void setScrollViewListener(CustomScrollView customScrollView) {
        kotlin.s.c.l.f(customScrollView, "scrollView");
        this.p = customScrollView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(attributeSet, "attrs");
        this.a = "Asr-AsrText";
        this.b = -1;
        this.f3163c = -1;
        this.f3164d = -1;
        this.f3165e = -1;
        this.k = new RectF();
        this.l = new RectF();
        this.o = HotZoneMoveStatus.NONE;
        this.r = new Runnable() { // from class: com.bytedance.android.input.speech.view.d
            @Override // java.lang.Runnable
            public final void run() {
                AsrTextView asrTextView = AsrTextView.this;
                int i = AsrTextView.s;
                kotlin.s.c.l.f(asrTextView, "this$0");
                asrTextView.invalidate();
            }
        };
        o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(attributeSet, "attrs");
        this.a = "Asr-AsrText";
        this.b = -1;
        this.f3163c = -1;
        this.f3164d = -1;
        this.f3165e = -1;
        this.k = new RectF();
        this.l = new RectF();
        this.o = HotZoneMoveStatus.NONE;
        this.r = new Runnable() { // from class: com.bytedance.android.input.speech.view.d
            @Override // java.lang.Runnable
            public final void run() {
                AsrTextView asrTextView = AsrTextView.this;
                int i2 = AsrTextView.s;
                kotlin.s.c.l.f(asrTextView, "this$0");
                asrTextView.invalidate();
            }
        };
        o();
    }
}
