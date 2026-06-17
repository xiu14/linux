package com.bytedance.android.input.keyboard.word_segmentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.o;

/* loaded from: classes.dex */
public final class n {
    private static WordSegmentationLayoutNew a = null;
    private static String b = "";

    /* renamed from: c, reason: collision with root package name */
    private static kotlin.s.b.a<o> f2839c;

    public static final void a() {
        o oVar;
        InputView inputView;
        WordSegmentationLayoutNew wordSegmentationLayoutNew = a;
        if (wordSegmentationLayoutNew != null) {
            e.a.a.a.a.H0(e.a.a.a.a.M("close showFrom = "), b, "WordSegmentationLayoutNew");
            e();
            if (kotlin.s.c.l.a("candidate_bar", b) && (inputView = ImeService.x) != null) {
                inputView.t(false);
            }
            wordSegmentationLayoutNew.setVisibility(8);
            c(wordSegmentationLayoutNew);
            oVar = o.a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "mWordSegmentationLayout is null.");
        }
        a = null;
        kotlin.s.b.a<o> aVar = f2839c;
        if (aVar != null) {
            aVar.invoke();
        }
        f2839c = null;
    }

    public static final void b(ViewGroup viewGroup) {
        InputView inputView;
        kotlin.s.c.l.f(viewGroup, "parent");
        WordSegmentationLayoutNew wordSegmentationLayoutNew = a;
        if (wordSegmentationLayoutNew != null) {
            e();
            if (kotlin.s.c.l.a("candidate_bar", b) && (inputView = ImeService.x) != null) {
                inputView.t(false);
            }
            wordSegmentationLayoutNew.setVisibility(8);
            if (kotlin.s.c.l.a(wordSegmentationLayoutNew.getParent(), viewGroup)) {
                viewGroup.removeView(wordSegmentationLayoutNew);
            }
        }
        a = null;
        kotlin.s.b.a<o> aVar = f2839c;
        if (aVar != null) {
            aVar.invoke();
        }
        f2839c = null;
    }

    private static final void c(View view) {
        ViewParent parent;
        e.a.a.a.a.N0(e.a.a.a.a.M("detachView view is null? "), view == null, "WordSegmentationLayoutNew");
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        kotlin.s.c.l.e(parent, "viewParent");
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static final void d() {
        WordSegmentationLayoutNew wordSegmentationLayoutNew = a;
        if (wordSegmentationLayoutNew != null) {
            wordSegmentationLayoutNew.y();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r5 != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.word_segmentation.n.e():void");
    }

    public static final void f(Context context, ViewGroup viewGroup, String str, WordSegmentationData wordSegmentationData, kotlin.s.b.a<o> aVar) {
        InputView inputView;
        kotlin.s.c.l.f(str, "showFrom");
        kotlin.s.c.l.f(wordSegmentationData, RemoteMessageConst.DATA);
        c(a);
        o oVar = null;
        a = null;
        b = "";
        b = str;
        f2839c = aVar;
        if (viewGroup == null || context == null) {
            return;
        }
        WordSegmentationLayoutNew wordSegmentationLayoutNew = new WordSegmentationLayoutNew(context, null);
        a = wordSegmentationLayoutNew;
        viewGroup.addView(wordSegmentationLayoutNew, -1, new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.android.input.r.j.m("WordSegmentationLayoutNew", "addView");
        if (kotlin.s.c.l.a(str, "candidate_bar") && (inputView = ImeService.x) != null) {
            inputView.t(true);
        }
        WordSegmentationLayoutNew wordSegmentationLayoutNew2 = a;
        if (wordSegmentationLayoutNew2 != null) {
            wordSegmentationLayoutNew2.bringToFront();
            wordSegmentationLayoutNew2.setVisibility(0);
            wordSegmentationLayoutNew2.x(wordSegmentationData);
            oVar = o.a;
        }
        if (oVar == null) {
            com.bytedance.android.input.r.j.m("WordSegmentationLayoutNew", "viewParent is null");
        }
    }
}
