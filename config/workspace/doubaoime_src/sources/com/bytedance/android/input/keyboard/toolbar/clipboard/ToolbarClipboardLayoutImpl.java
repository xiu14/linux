package com.bytedance.android.input.keyboard.toolbar.clipboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.databinding.LayoutToolbarClipboardBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.constants.ImeScreenOrientation;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.areacontrol.k;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.bytedance.android.input.r.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ToolbarClipboardLayoutImpl extends FrameLayout implements com.bytedance.android.input.keyboard.t.a.b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2789f = 0;
    private LayoutToolbarClipboardBinding a;
    private ToolbarClipboardAdapter b;

    /* renamed from: c, reason: collision with root package name */
    private WordSegmentationData f2790c;

    /* renamed from: d, reason: collision with root package name */
    private ImeScreenOrientation f2791d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2792e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarClipboardLayoutImpl(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    public static void f(ToolbarClipboardLayoutImpl toolbarClipboardLayoutImpl, View view) {
        InputView inputView;
        l.f(toolbarClipboardLayoutImpl, "this$0");
        j.i("WordSegmentationLayoutNew", "[WordSegmentationLayoutNew] click word segmentation");
        WordSegmentationData wordSegmentationData = toolbarClipboardLayoutImpl.f2790c;
        o oVar = null;
        if (wordSegmentationData != null && (inputView = ImeService.x) != null) {
            inputView.e0(wordSegmentationData);
            oVar = o.a;
        }
        if (oVar == null) {
            j.i("WordSegmentationLayoutNew", "[WordSegmentationLayoutNew] mWordSegmentationData is null");
        }
    }

    private final void g() {
        LinearLayout a;
        LinearLayout a2;
        if (!IAppGlobals.a.K() || KeyboardJni.isFloatingMode()) {
            LayoutToolbarClipboardBinding layoutToolbarClipboardBinding = this.a;
            if (layoutToolbarClipboardBinding == null || (a = layoutToolbarClipboardBinding.a()) == null) {
                return;
            }
            a.setBackgroundResource(C0838R.color.navigation_bar_normal);
            return;
        }
        LayoutToolbarClipboardBinding layoutToolbarClipboardBinding2 = this.a;
        if (layoutToolbarClipboardBinding2 != null && (a2 = layoutToolbarClipboardBinding2.a()) != null) {
            a2.setBackgroundResource(C0838R.color.navigation_bar_transparent);
        }
        LayoutToolbarClipboardBinding layoutToolbarClipboardBinding3 = this.a;
        if ((layoutToolbarClipboardBinding3 != null ? layoutToolbarClipboardBinding3.a() : null) != null) {
            com.bytedance.common_biz.ui.utils.b bVar = com.bytedance.common_biz.ui.utils.b.a;
            LayoutToolbarClipboardBinding layoutToolbarClipboardBinding4 = this.a;
            LinearLayout a3 = layoutToolbarClipboardBinding4 != null ? layoutToolbarClipboardBinding4.a() : null;
            l.c(a3);
            com.bytedance.common_biz.ui.utils.b.d(a3, 32);
        }
    }

    private final void h(ImeScreenOrientation imeScreenOrientation) {
        LinearLayout a;
        LinearLayout a2;
        LinearLayout a3;
        LinearLayout a4;
        if (com.bytedance.android.input.common.h.a.c()) {
            int m = (int) e.a.a.a.a.m("Resources.getSystem()", 1, 14);
            if (imeScreenOrientation == ImeScreenOrientation.LANDSCAPE) {
                LayoutToolbarClipboardBinding layoutToolbarClipboardBinding = this.a;
                if (layoutToolbarClipboardBinding == null || (a4 = layoutToolbarClipboardBinding.a()) == null) {
                    return;
                }
                a4.setPadding(0, m, 0, 0);
                return;
            }
            LayoutToolbarClipboardBinding layoutToolbarClipboardBinding2 = this.a;
            if (layoutToolbarClipboardBinding2 == null || (a3 = layoutToolbarClipboardBinding2.a()) == null) {
                return;
            }
            a3.setPadding(0, 0, 0, 0);
            return;
        }
        int m2 = (int) e.a.a.a.a.m("Resources.getSystem()", 1, 20);
        int m3 = (int) e.a.a.a.a.m("Resources.getSystem()", 1, 6);
        if (imeScreenOrientation == ImeScreenOrientation.FLOATING) {
            LayoutToolbarClipboardBinding layoutToolbarClipboardBinding3 = this.a;
            if (layoutToolbarClipboardBinding3 == null || (a2 = layoutToolbarClipboardBinding3.a()) == null) {
                return;
            }
            a2.setPadding(0, (int) (m2 * 0.8d), 0, (int) (m3 * 0.8d));
            return;
        }
        LayoutToolbarClipboardBinding layoutToolbarClipboardBinding4 = this.a;
        if (layoutToolbarClipboardBinding4 == null || (a = layoutToolbarClipboardBinding4.a()) == null) {
            return;
        }
        a.setPadding(0, m2, 0, m3);
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public View a() {
        return this;
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public ToolbarType b() {
        return ToolbarType.CLIPBOARD;
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    @SuppressLint({"NotifyDataSetChanged"})
    public void c(ImeScreenOrientation imeScreenOrientation) {
        l.f(imeScreenOrientation, "orientation");
        j.i("ImeToolBarClipboardLayoutImpl", "onScreenChange orientation = " + imeScreenOrientation);
        h(imeScreenOrientation);
        if (imeScreenOrientation != this.f2791d) {
            j.i("ImeToolBarClipboardLayoutImpl", "orientation != currentOrientation prepare change ui");
            this.f2791d = imeScreenOrientation;
            ToolbarClipboardAdapter toolbarClipboardAdapter = this.b;
            if (toolbarClipboardAdapter != null) {
                toolbarClipboardAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    @SuppressLint({"NotifyDataSetChanged"})
    public void d(com.bytedance.android.input.keyboard.toolbar.entity.a aVar) {
        StringBuilder M = e.a.a.a.a.M("[WordSegmentationLayoutNew] show clipboard toolbar viewData is null ? ");
        M.append(aVar == null);
        M.append("---adapter = null ? ");
        e.a.a.a.a.N0(M, this.b == null, "ImeToolBarClipboardLayoutImpl");
        g();
        if (IAppGlobals.a.K() && !KeyboardJni.isFloatingMode()) {
            this.f2792e = true;
            KeyboardJni.getKeyboardJni().showToolbar(false);
        }
        o oVar = null;
        i iVar = aVar instanceof i ? (i) aVar : null;
        if (iVar != null) {
            WordSegmentationData a = iVar.a();
            this.f2790c = a;
            ArrayList<f> arrayList = new ArrayList<>();
            arrayList.add(new f(a.getOriginText(), true));
            Iterator<T> it2 = a.getPreview().iterator();
            while (it2.hasNext()) {
                arrayList.add(new f((String) it2.next(), false));
            }
            j.i("ImeToolBarClipboardLayoutImpl", "[WordSegmentationLayoutNew] dataList = " + arrayList);
            ToolbarClipboardAdapter toolbarClipboardAdapter = this.b;
            if (toolbarClipboardAdapter != null) {
                toolbarClipboardAdapter.c(arrayList);
            }
            ToolbarClipboardAdapter toolbarClipboardAdapter2 = this.b;
            if (toolbarClipboardAdapter2 != null) {
                toolbarClipboardAdapter2.notifyDataSetChanged();
            }
        }
        ImeScreenOrientation imeScreenOrientation = this.f2791d;
        if (imeScreenOrientation != null) {
            h(imeScreenOrientation);
            oVar = o.a;
        }
        if (oVar == null) {
            k kVar = k.a;
            Integer valueOf = Integer.valueOf(k.m());
            h((valueOf != null && valueOf.intValue() == 0) ? ImeScreenOrientation.PORTRAIT : (valueOf != null && valueOf.intValue() == 1) ? ImeScreenOrientation.LANDSCAPE : (valueOf != null && valueOf.intValue() == 2) ? ImeScreenOrientation.FLOATING : ImeScreenOrientation.PORTRAIT);
        }
    }

    @Override // com.bytedance.android.input.keyboard.t.a.b
    public void dismiss() {
        j.i("ImeToolBarClipboardLayoutImpl", "[WordSegmentationLayoutNew] dismiss clipboard toolbar");
        this.f2790c = null;
        if (this.f2792e) {
            KeyboardJni.getKeyboardJni().showToolbar(true);
            this.f2792e = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f2792e) {
            KeyboardJni.getKeyboardJni().showToolbar(true);
            this.f2792e = false;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarClipboardLayoutImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RecyclerView recyclerView;
        l.f(context, "context");
        this.a = LayoutToolbarClipboardBinding.b(LayoutInflater.from(context), this, true);
        j.i("ImeToolBarClipboardLayoutImpl", "[WordSegmentationLayoutNew] initView");
        LayoutToolbarClipboardBinding layoutToolbarClipboardBinding = this.a;
        if (layoutToolbarClipboardBinding != null) {
            layoutToolbarClipboardBinding.b.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.toolbar.clipboard.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ToolbarClipboardLayoutImpl.f2789f;
                    j.i("ImeToolBarClipboardLayoutImpl", "[WordSegmentationLayoutNew] click close clipboard toolbar");
                    InputView inputView = ImeService.x;
                    if (inputView != null) {
                        com.bytedance.android.input.k.b.a.v(inputView, ToolbarType.CLIPBOARD, null, 2, null);
                    }
                }
            });
            layoutToolbarClipboardBinding.f2014d.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.toolbar.clipboard.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToolbarClipboardLayoutImpl.f(ToolbarClipboardLayoutImpl.this, view);
                }
            });
        }
        g();
        j.i("ImeToolBarClipboardLayoutImpl", "[WordSegmentationLayoutNew] prepareAdapter");
        this.b = new ToolbarClipboardAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        LayoutToolbarClipboardBinding layoutToolbarClipboardBinding2 = this.a;
        if (layoutToolbarClipboardBinding2 != null && (recyclerView = layoutToolbarClipboardBinding2.f2013c) != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.b);
        }
        ToolbarClipboardAdapter toolbarClipboardAdapter = this.b;
        if (toolbarClipboardAdapter != null) {
            toolbarClipboardAdapter.d(g.a);
        }
        SettingsConfigNext.a.j(new h(this));
        k kVar = k.a;
        Integer valueOf = Integer.valueOf(k.m());
        c((valueOf != null && valueOf.intValue() == 0) ? ImeScreenOrientation.PORTRAIT : (valueOf != null && valueOf.intValue() == 1) ? ImeScreenOrientation.LANDSCAPE : (valueOf != null && valueOf.intValue() == 2) ? ImeScreenOrientation.FLOATING : ImeScreenOrientation.PORTRAIT);
    }
}
