package com.bytedance.android.input.editor;

import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import com.bytedance.android.input.r.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SelectionTracker {
    private int a = -1;
    private int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f2283c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f2284d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f2285e = 0;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f2286f = "";

    /* renamed from: g, reason: collision with root package name */
    private int f2287g = -1;
    private boolean h = false;
    private ActionType i;
    private Boolean j;
    private int k;
    private final List<a> l;
    private ActionType m;

    public enum ActionType {
        NOT_INNER,
        INNER_NORMAL,
        INNER_COMMIT,
        INNER_COMMIT_CLEAR,
        INNER_PREEDIT,
        INNER_DELETE,
        INNER_CLEAR,
        INNER_ENTER,
        INNER_SELECT,
        INNER_VOICE_NORMAL,
        INNER_VOICE_COMMIT,
        INNER_VOICE_PREEDIT
    }

    static class a {
        int a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f2288c;

        /* renamed from: d, reason: collision with root package name */
        int f2289d;

        /* renamed from: e, reason: collision with root package name */
        ActionType f2290e;

        a(int i, int i2, int i3, int i4, ActionType actionType) {
            this.a = i;
            this.b = i2;
            this.f2288c = i3;
            this.f2289d = i4;
            this.f2290e = actionType;
        }
    }

    public SelectionTracker() {
        ActionType actionType = ActionType.NOT_INNER;
        this.i = actionType;
        this.j = Boolean.FALSE;
        this.k = 0;
        this.l = new ArrayList();
        this.m = actionType;
    }

    private void a() {
        this.l.add(new a(this.a, this.b, this.f2283c, this.f2284d, this.i));
    }

    public void b(InputConnection inputConnection) {
        if (this.a == -1 || this.b == -1) {
            ExtractedText extractedText = inputConnection.getExtractedText(new ExtractedTextRequest(), 0);
            j.i("SelectionTracker", "checkAndIninit editText = " + extractedText);
            if (extractedText != null) {
                int i = extractedText.selectionStart;
                int i2 = extractedText.selectionEnd;
                this.a = i;
                this.b = i2;
                this.f2287g = i2;
                j.m("SelectionTracker", "checkAndIninit selectStart=" + i + " selectEnd=" + i2);
            }
        }
    }

    public boolean c(CharSequence charSequence, int i) {
        int size = this.l.size();
        d(charSequence, i);
        this.i = ActionType.INNER_COMMIT_CLEAR;
        if (size != this.l.size()) {
            List<a> list = this.l;
            list.get(list.size() - 1).f2290e = this.i;
        }
        return true;
    }

    public boolean d(CharSequence charSequence, int i) {
        int i2;
        int i3;
        boolean z = false;
        int length = charSequence != null ? charSequence.length() : 0;
        int i4 = this.b;
        if (i4 == -1 || (i3 = this.a) == -1) {
            i2 = -1;
        } else {
            i2 = i <= 0 ? Math.abs(i) + length : (length - (this.f2285e + (i - 1))) + Math.min(i3, i4);
        }
        this.a = i2;
        this.b = i2;
        if (this.f2284d != this.f2283c) {
            this.f2284d = -1;
            this.f2283c = -1;
        }
        this.f2287g = i2;
        this.f2285e = 0;
        this.h = true;
        this.i = ActionType.INNER_COMMIT;
        if (charSequence != null && charSequence.length() == 1 && charSequence.charAt(0) == '@') {
            z = true;
        }
        this.j = Boolean.valueOf(z);
        if (charSequence != null && charSequence.length() > 0) {
            a();
        }
        this.k = charSequence.length();
        StringBuilder M = e.a.a.a.a.M("commitText SelectionStart=");
        M.append(this.a);
        M.append(" mSelectionEnd=");
        M.append(this.b);
        M.append(" commitLength=");
        M.append(charSequence.length());
        M.append(", ActionType.INNER_COMMIT size = ");
        M.append(this.l.size());
        j.i("SelectionTracker", M.toString());
        return true;
    }

    public boolean e(CharSequence charSequence, int i) {
        int size = this.l.size();
        d(charSequence, i);
        this.i = ActionType.INNER_VOICE_COMMIT;
        if (size != this.l.size()) {
            List<a> list = this.l;
            list.get(list.size() - 1).f2290e = this.i;
        }
        StringBuilder M = e.a.a.a.a.M("testasr commitVoiceText - mInnerActionFlag=");
        M.append(this.i);
        M.append(", size = ");
        M.append(this.l.size());
        M.append(", text ");
        M.append(charSequence.length());
        j.m("SelectionTracker", M.toString());
        return true;
    }

    public boolean f(int i, int i2) {
        int i3;
        j.m("SelectionTracker", "deleteSurroundingText beforeLength=" + i + " afterLength=" + i2);
        StringBuilder sb = new StringBuilder();
        sb.append("deleteSurroundingText SelectionStart=");
        sb.append(this.a);
        sb.append(" mSelectionEnd=");
        e.a.a.a.a.C0(sb, this.b, "SelectionTracker");
        this.i = ActionType.INNER_CLEAR;
        int i4 = this.a;
        if (i4 != -1 && (i3 = this.b) != -1) {
            if (i3 >= i4) {
                int min = Math.min(i, i4);
                this.a -= min;
                this.b -= min;
            } else {
                int min2 = Math.min(i2, i3);
                this.a -= min2;
                this.b -= min2;
            }
            this.f2287g = this.f2284d;
            this.h = true;
        }
        if (i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE) {
            this.l.clear();
        }
        a();
        StringBuilder M = e.a.a.a.a.M("deleteSurroundingText SelectionStart=");
        M.append(this.a);
        M.append(" mSelectionEnd=");
        M.append(this.b);
        M.append(" size = ");
        M.append(this.l.size());
        j.m("SelectionTracker", M.toString());
        return false;
    }

    public boolean g() {
        int i = this.f2285e;
        boolean z = i != 0;
        this.k = i;
        this.f2285e = 0;
        if (this.f2284d != this.f2283c) {
            this.f2283c = -1;
            this.f2284d = -1;
        }
        this.i = ActionType.INNER_NORMAL;
        if (z) {
            a();
        }
        StringBuilder M = e.a.a.a.a.M("finishComposingText ActionType.INNER_NORMAL size = ");
        M.append(this.l.size());
        j.i("SelectionTracker", M.toString());
        return false;
    }

    public boolean h() {
        int size = this.l.size();
        g();
        this.i = ActionType.INNER_VOICE_NORMAL;
        if (size != this.l.size()) {
            this.l.get(r0.size() - 1).f2290e = this.i;
        }
        StringBuilder M = e.a.a.a.a.M("testasr finishVoiceComposingText - mInnerActionFlag=");
        M.append(this.i);
        M.append(", size = ");
        M.append(this.l.size());
        j.m("SelectionTracker", M.toString());
        return false;
    }

    public boolean i() {
        return this.j.booleanValue();
    }

    public int j() {
        return this.f2285e;
    }

    public String k() {
        return this.f2286f.toString();
    }

    public ActionType l() {
        return this.m;
    }

    public int m() {
        e.a.a.a.a.C0(e.a.a.a.a.M("getCursorPosition = "), this.f2287g, "SelectionTracker");
        return this.f2287g;
    }

    public int n() {
        return this.k;
    }

    public void o() {
        this.f2287g = -1;
        this.a = -1;
        this.b = -1;
        this.f2283c = -1;
        this.f2284d = -1;
        this.f2285e = 0;
        this.h = false;
        ActionType actionType = ActionType.NOT_INNER;
        this.i = actionType;
        this.m = actionType;
        this.l.clear();
    }

    public void p() {
        this.k = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(android.view.KeyEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            int r5 = r5.getKeyCode()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.bytedance.android.doubaoime.KeyboardJni.isLastBackPress = r1
            java.lang.String r1 = "sendKeyEvent action="
            java.lang.String r2 = " keycode="
            java.lang.String r3 = "SelectionTracker"
            e.a.a.a.a.m0(r1, r0, r2, r5, r3)
            r1 = 1
            if (r0 != r1) goto L65
            r0 = 66
            if (r5 == r0) goto L44
            r0 = 67
            if (r5 == r0) goto L21
            goto L65
        L21:
            com.bytedance.android.input.editor.SelectionTracker$ActionType r5 = com.bytedance.android.input.editor.SelectionTracker.ActionType.INNER_DELETE
            r4.i = r5
            int r5 = r4.b
            int r0 = r4.a
            if (r5 != r0) goto L31
            if (r0 <= 0) goto L37
            int r0 = r0 - r1
            r4.a = r0
            goto L37
        L31:
            int r5 = java.lang.Math.min(r5, r0)
            r4.a = r5
        L37:
            int r5 = r4.a
            r4.b = r5
            r4.f2287g = r5
            r4.h = r1
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            com.bytedance.android.doubaoime.KeyboardJni.isLastBackPress = r5
            goto L63
        L44:
            com.bytedance.android.input.editor.SelectionTracker$ActionType r5 = com.bytedance.android.input.editor.SelectionTracker.ActionType.INNER_ENTER
            r4.i = r5
            int r5 = r4.b
            int r0 = r4.a
            if (r5 != r0) goto L54
            if (r0 <= 0) goto L5f
            int r0 = r0 + r1
            r4.a = r0
            goto L5f
        L54:
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 + r1
            r4.a = r5
            com.bytedance.android.input.editor.SelectionTracker$ActionType r5 = com.bytedance.android.input.editor.SelectionTracker.ActionType.INNER_COMMIT
            r4.i = r5
        L5f:
            int r5 = r4.a
            r4.b = r5
        L63:
            r5 = r1
            goto L66
        L65:
            r5 = 0
        L66:
            if (r5 == 0) goto L8b
            r4.a()
            java.lang.String r5 = "sendKeyEvent ActionType = "
            java.lang.StringBuilder r5 = e.a.a.a.a.M(r5)
            com.bytedance.android.input.editor.SelectionTracker$ActionType r0 = r4.i
            r5.append(r0)
            java.lang.String r0 = " size = "
            r5.append(r0)
            java.util.List<com.bytedance.android.input.editor.SelectionTracker$a> r0 = r4.l
            int r0 = r0.size()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.bytedance.android.input.r.j.i(r3, r5)
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.editor.SelectionTracker.q(android.view.KeyEvent):boolean");
    }

    public boolean r(int i, int i2) {
        this.f2285e = i2 - i;
        this.f2283c = i;
        this.f2284d = i2;
        this.i = ActionType.INNER_PREEDIT;
        a();
        StringBuilder M = e.a.a.a.a.M("setComposingRegion ActionType.INNER_PREEDIT size = ");
        M.append(this.l.size());
        j.i("SelectionTracker", M.toString());
        return true;
    }

    public boolean s(CharSequence charSequence, int i) {
        int i2;
        int length = charSequence != null ? charSequence.length() : 0;
        this.i = ActionType.INNER_PREEDIT;
        this.f2286f = charSequence;
        StringBuilder sb = new StringBuilder();
        sb.append("setComposingText text=");
        sb.append((Object) charSequence);
        sb.append(" mSelectionStart=");
        sb.append(this.a);
        sb.append(" mSelectionEnd=");
        sb.append(this.b);
        sb.append(" mComposingLength=");
        sb.append(this.f2285e);
        sb.append(" mCandidateStart=");
        sb.append(this.f2283c);
        sb.append(" mCandidateEnd=");
        e.a.a.a.a.B0(sb, this.f2284d, "SelectionTracker");
        int i3 = this.b;
        if (i3 != -1 && (i2 = this.a) != -1) {
            int abs = i <= 0 ? Math.abs(i) + length : (length - (this.f2285e + (i - 1))) + Math.min(i3, i2);
            this.a = abs;
            this.b = abs;
        }
        boolean z = this.f2285e != length;
        int i4 = this.b;
        this.f2287g = i4;
        this.f2285e = length;
        this.f2284d = i4;
        this.f2283c = i4 - length;
        this.h = true;
        if (z) {
            a();
        }
        j.i("SelectionTracker", "setComposingText text=" + ((Object) charSequence) + " mSelectionStart=" + this.a + " mSelectionEnd=" + this.b + " mComposingLength=" + this.f2285e + " mCandidateStart=" + this.f2283c + " mCandidateEnd=" + this.f2284d + " size = " + this.l.size());
        return true;
    }

    public boolean t(int i, int i2) {
        boolean z = (this.a == i && this.b == i2) ? false : true;
        this.a = i;
        this.b = i2;
        this.f2287g = i2;
        this.i = ActionType.INNER_SELECT;
        this.h = true;
        if (z) {
            a();
        }
        StringBuilder M = e.a.a.a.a.M("setSelection ActionType.INNER_SELECT size = ");
        M.append(this.l.size());
        j.i("SelectionTracker", M.toString());
        return true;
    }

    public boolean u(CharSequence charSequence, int i) {
        int size = this.l.size();
        s(charSequence, i);
        this.i = ActionType.INNER_VOICE_PREEDIT;
        if (size != this.l.size()) {
            List<a> list = this.l;
            list.get(list.size() - 1).f2290e = this.i;
        }
        StringBuilder M = e.a.a.a.a.M("testasr setVoiceComposingText - mInnerActionFlag=");
        M.append(this.i);
        M.append(", size = ");
        M.append(this.l.size());
        j.i("SelectionTracker", M.toString());
        return true;
    }

    public void v(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        StringBuilder O = e.a.a.a.a.O(" updateSelection1 oldSelStart=", i, " oldSelEnd=", i2, " newSelStart=");
        e.a.a.a.a.F0(O, i3, " newSelEnd=", i4, " candidatesStart=");
        e.a.a.a.a.F0(O, i5, " candidatesEnd=", i6, " mSelectionStart=");
        O.append(this.a);
        O.append(" mSelectionEnd=");
        O.append(this.b);
        O.append(" mIsCurorInnerMove=");
        O.append(this.h);
        O.append(" mInnerActionFlag=");
        O.append(this.i);
        j.m("SelectionTracker", O.toString());
        int i8 = 0;
        if (this.i == ActionType.NOT_INNER && ((i7 = this.a) != i3 || this.b != i4)) {
            if (i3 > i) {
                if (i4 > this.b) {
                    this.h = false;
                }
            } else if (i3 < i && i3 < i7) {
                this.h = false;
            }
        }
        if (!this.h || this.a == -1 || this.b == -1) {
            this.a = i3;
            this.b = i4;
            this.f2283c = i5;
            this.f2284d = i6;
        }
        while (i8 < this.l.size()) {
            a aVar = this.l.get(i8);
            if (aVar.a == i3 && aVar.b == i4 && aVar.f2288c == i5 && aVar.f2289d == i6) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 == this.l.size()) {
            i8 = -1;
        }
        e.a.a.a.a.j0("[UpdateSelection] onUpdateSelection index=", i8, "SelectionTracker");
        if (i8 != -1) {
            this.m = this.l.get(i8).f2290e;
            this.l.remove(i8);
        } else {
            this.m = this.i;
        }
        StringBuilder N = e.a.a.a.a.N("find action index = ", i8, ", size now = ");
        N.append(this.l.size());
        j.m("SelectionTracker", N.toString());
        ActionType actionType = this.i;
        ActionType actionType2 = ActionType.NOT_INNER;
        if (actionType != actionType2) {
            if (actionType == ActionType.INNER_VOICE_COMMIT) {
                if (i5 == -1 && i6 == -1) {
                    this.i = actionType2;
                }
            } else if (actionType != ActionType.INNER_VOICE_PREEDIT) {
                this.i = actionType2;
            } else if (i3 == i4 && this.a == i3) {
                this.i = actionType2;
            }
        }
        this.f2287g = i4;
        StringBuilder O2 = e.a.a.a.a.O(" updateSelection1 oldSelStart=", i, " oldSelEnd=", i2, " newSelStart=");
        e.a.a.a.a.F0(O2, i3, " newSelEnd=", i4, " candidatesStart=");
        e.a.a.a.a.F0(O2, i5, " candidatesEnd=", i6, " mSelectionStart=");
        O2.append(this.a);
        O2.append(" mSelectionEnd=");
        O2.append(this.b);
        O2.append(" mIsCurorInnerMove=");
        O2.append(this.h);
        O2.append(" mInnerActionFlag=");
        O2.append(this.i);
        O2.append(" mCurrentUpdateActionCause=");
        O2.append(this.m);
        j.m("SelectionTracker", O2.toString());
    }
}
