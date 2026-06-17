package com.obric.appstore.autoupdate;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.progress.OProgressView;
import com.obric.oui.selection.OSelectionPanelBtnView;
import com.obric.oui.sheet.OInsetSheet;
import com.obric.oui.sheet.OInsetSheetTitleBar;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class g {
    private Context a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f7519c;

    /* renamed from: d, reason: collision with root package name */
    private b f7520d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private TextView f7521e;

    /* renamed from: f, reason: collision with root package name */
    private OProgressView f7522f;

    /* renamed from: g, reason: collision with root package name */
    private OInsetSheet f7523g;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends Handler {
        b(f fVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 297) {
                int d2 = e.e().d(g.this.a, g.this.b);
                if (d2 < 0) {
                    StringBuilder M = e.a.a.a.a.M("appstore progress: -1");
                    M.append(g.this.b);
                    Log.d("UpdateProgressDialog", M.toString());
                } else if (d2 != 100) {
                    g.this.g(d2);
                    sendEmptyMessageDelayed(297, 300L);
                } else {
                    e.a.a.a.a.i0("appstore progress:", d2, "UpdateProgressDialog");
                    g.this.g(d2);
                    g.this.f();
                }
            }
        }
    }

    public g(Context context, String str, int i) {
        this.f7519c = 0;
        this.a = context;
        this.b = str;
        this.f7519c = i;
        OInsetSheet oInsetSheet = new OInsetSheet(context);
        this.f7523g = oInsetSheet;
        oInsetSheet.g(OInsetSheet.PanelWidth.BOARD_WIDTH);
        OInsetSheet oInsetSheet2 = this.f7523g;
        OInsetSheetTitleBar oInsetSheetTitleBar = new OInsetSheetTitleBar(this.a);
        oInsetSheetTitleBar.setShowLeftBack(false);
        oInsetSheetTitleBar.setTitleText(this.a.getString(C0838R.string.auto_progress_title));
        oInsetSheetTitleBar.a().setTextSize(16.0f);
        FrameLayout frameLayout = oInsetSheet2.a;
        if (frameLayout == null) {
            l.l("headerContainer");
            throw null;
        }
        oInsetSheet2.e(frameLayout, oInsetSheetTitleBar);
        OInsetSheet oInsetSheet3 = this.f7523g;
        View inflate = LayoutInflater.from(this.a).inflate(C0838R.layout.obric_auto_downloading, (ViewGroup) null);
        this.f7521e = (TextView) inflate.findViewById(C0838R.id.auto_downloading_percent);
        this.f7522f = (OProgressView) inflate.findViewById(C0838R.id.auto_progressbar);
        g(0);
        FrameLayout frameLayout2 = oInsetSheet3.f8010c;
        if (frameLayout2 == null) {
            l.l("contentContainer");
            throw null;
        }
        oInsetSheet3.e(frameLayout2, inflate);
        OInsetSheet oInsetSheet4 = this.f7523g;
        OSelectionPanelBtnView oSelectionPanelBtnView = new OSelectionPanelBtnView(this.a);
        oSelectionPanelBtnView.h().setVisibility(8);
        oSelectionPanelBtnView.i().setVisibility(8);
        oSelectionPanelBtnView.g().setText(R.string.cancel);
        oSelectionPanelBtnView.g().setOnClickListener(new f(this));
        FrameLayout frameLayout3 = oInsetSheet4.b;
        if (frameLayout3 == null) {
            l.l("footerContainer");
            throw null;
        }
        oInsetSheet4.e(frameLayout3, oSelectionPanelBtnView);
        this.f7523g.f(false);
        this.f7523g.setCanceledOnTouchOutside(true);
        this.f7523g.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        TextView textView = this.f7521e;
        if (textView != null) {
            textView.setText(String.format("%d%%", Integer.valueOf(i)));
        }
        OProgressView oProgressView = this.f7522f;
        if (oProgressView != null) {
            oProgressView.setProgress(i);
        }
    }

    public void f() {
        try {
            OInsetSheet oInsetSheet = this.f7523g;
            if (oInsetSheet != null) {
                oInsetSheet.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f7520d.removeMessages(297);
    }

    public void h() {
        try {
            if (!(this.a instanceof Activity)) {
                this.f7523g.getWindow().setType(2038);
            }
            this.f7523g.show();
        } catch (Exception e2) {
            Log.e("UpdateProgressDialog", "show: ", e2);
        }
        this.f7520d.sendEmptyMessageDelayed(297, 300L);
    }

    public void i(long j) {
        if (j <= 0) {
            h();
        } else {
            this.f7520d.postDelayed(new a(), j);
        }
    }
}
