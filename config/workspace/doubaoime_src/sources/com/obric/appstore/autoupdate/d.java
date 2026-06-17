package com.obric.appstore.autoupdate;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.obric.oui.button.OButton;
import com.obric.oui.selection.OSelectionPanelBtnView;
import com.obric.oui.sheet.OInsetSheet;
import com.obric.oui.sheet.OInsetSheetTitleBar;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class d {
    private Context a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f7513c;

    /* renamed from: d, reason: collision with root package name */
    private String f7514d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7515e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7516f;

    /* renamed from: g, reason: collision with root package name */
    private Bundle f7517g;
    private OInsetSheet h;

    public d(Context context, Bundle bundle) {
        OButton oButton;
        this.a = null;
        this.b = null;
        this.f7513c = 0;
        this.f7514d = null;
        this.f7515e = false;
        this.f7516f = false;
        this.a = context;
        this.b = bundle.getString("auto_update_pkg");
        this.f7513c = bundle.getInt("auto_update_model");
        this.f7517g = bundle;
        this.f7516f = bundle.getBoolean("auto_update_file_exist");
        OInsetSheet oInsetSheet = new OInsetSheet(context);
        this.h = oInsetSheet;
        oInsetSheet.g(OInsetSheet.PanelWidth.BOARD_WIDTH);
        OInsetSheet oInsetSheet2 = this.h;
        OInsetSheetTitleBar oInsetSheetTitleBar = new OInsetSheetTitleBar(this.a);
        oInsetSheetTitleBar.setShowLeftBack(false);
        oInsetSheetTitleBar.setTitleText(this.a.getString(C0838R.string.auto_update_title));
        oInsetSheetTitleBar.a().setTextSize(16.0f);
        if (!this.f7516f && this.f7513c != 2) {
            Context context2 = this.a;
            LinearLayout linearLayout = oInsetSheetTitleBar.a;
            if (linearLayout == null) {
                l.l("mRightContainer");
                throw null;
            }
            l.f(context2, "context");
            l.f(linearLayout, "root");
            l.f(context2, "context");
            l.f(linearLayout, "root");
            l.f(context2, "context");
            l.f(linearLayout, "root");
            if (((OButton) linearLayout.findViewById(C0838R.id.btn_titlebar)) == null) {
                View findViewById = Button.inflate(context2, C0838R.layout.o_widget_titlebar_button_neutral, linearLayout).findViewById(C0838R.id.btn_titlebar);
                l.c(findViewById);
                oButton = (OButton) findViewById;
            } else {
                View inflate = LayoutInflater.from(context2).inflate(C0838R.layout.o_widget_titlebar_button_neutral, (ViewGroup) linearLayout, false);
                Objects.requireNonNull(inflate, "null cannot be cast to non-null type com.obric.oui.button.OButton");
                oButton = (OButton) inflate;
                oButton.setId(-1);
                linearLayout.addView(oButton);
            }
            oButton.setText(C0838R.string.obric_auto_update_ignore);
            oButton.setOnClickListener(new a(this));
        }
        FrameLayout frameLayout = oInsetSheet2.a;
        if (frameLayout == null) {
            l.l("headerContainer");
            throw null;
        }
        oInsetSheet2.e(frameLayout, oInsetSheetTitleBar);
        OInsetSheet oInsetSheet3 = this.h;
        View inflate2 = LayoutInflater.from(this.a).inflate(C0838R.layout.obric_auto_update, (ViewGroup) null);
        ((MaxScrollView) inflate2.findViewById(C0838R.id.scrollView)).setMaxHeight(e.i.a.b.a.c(500));
        ImageView imageView = (ImageView) inflate2.findViewById(C0838R.id.app_icon);
        TextView textView = (TextView) inflate2.findViewById(C0838R.id.app_name);
        try {
            PackageManager packageManager = this.a.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.b, 0);
            if (applicationInfo == null) {
                Log.d("FindNewVersionDialog", "ApplicationInfo is null.");
            } else {
                String charSequence = applicationInfo.loadLabel(packageManager).toString();
                if (charSequence != null) {
                    this.f7514d = charSequence;
                    textView.setText(charSequence);
                } else {
                    Log.d("FindNewVersionDialog", "getLogoDrawable:name is null");
                }
                Drawable loadIcon = applicationInfo.loadIcon(packageManager);
                if (loadIcon != null) {
                    imageView.setImageDrawable(loadIcon);
                } else {
                    Log.d("FindNewVersionDialog", "getLogoDrawable:drawable is null");
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder M = e.a.a.a.a.M("getLogoDrawable:");
            M.append(e2.getMessage());
            Log.d("FindNewVersionDialog", M.toString());
        }
        TextView textView2 = (TextView) inflate2.findViewById(C0838R.id.app_version);
        String string = this.f7517g.getString("auto_update_version_name");
        if (TextUtils.isEmpty(string)) {
            Log.d("FindNewVersionDialog", "no versionName");
        } else {
            textView2.setText(this.a.getString(C0838R.string.auto_update_version, string));
        }
        TextView textView3 = (TextView) inflate2.findViewById(C0838R.id.app_update_log);
        String string2 = this.f7517g.getString("auto_update_log");
        if (TextUtils.isEmpty(string2)) {
            Log.d("FindNewVersionDialog", "no updateLog");
        } else {
            textView3.setText(string2);
        }
        TextView textView4 = (TextView) inflate2.findViewById(C0838R.id.app_update_tip);
        if (this.f7516f) {
            textView4.setText(this.a.getString(C0838R.string.auto_install_tips));
        } else {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f7515e = activeNetworkInfo.getType() == 0;
            } else {
                Log.d("FindNewVersionDialog", "networkInfo is null");
            }
            String formatFileSize = Formatter.formatFileSize(this.a, this.f7517g.getLong("auto_update_size"));
            textView4.setText(this.f7515e ? this.f7513c == 2 ? this.a.getString(C0838R.string.auto_update_tip_mobile_force, formatFileSize) : this.a.getString(C0838R.string.auto_update_tip_mobile, formatFileSize) : this.f7513c == 2 ? this.a.getString(C0838R.string.auto_update_tip_wifi_force, formatFileSize) : this.a.getString(C0838R.string.auto_update_tip_wifi, formatFileSize));
        }
        FrameLayout frameLayout2 = oInsetSheet3.f8010c;
        if (frameLayout2 == null) {
            l.l("contentContainer");
            throw null;
        }
        oInsetSheet3.e(frameLayout2, inflate2);
        OInsetSheet oInsetSheet4 = this.h;
        OSelectionPanelBtnView oSelectionPanelBtnView = new OSelectionPanelBtnView(this.a);
        if (this.f7513c == 2) {
            oSelectionPanelBtnView.g().setText(R.string.cancel);
        } else {
            oSelectionPanelBtnView.g().setText(C0838R.string.auto_update_cancel);
        }
        oSelectionPanelBtnView.g().setOnClickListener(new b(this));
        oSelectionPanelBtnView.h().setText(C0838R.string.auto_update_ok);
        oSelectionPanelBtnView.h().setOnClickListener(new c(this));
        FrameLayout frameLayout3 = oInsetSheet4.b;
        if (frameLayout3 == null) {
            l.l("footerContainer");
            throw null;
        }
        oInsetSheet4.e(frameLayout3, oSelectionPanelBtnView);
        this.h.f(false);
        this.h.setCanceledOnTouchOutside(true);
        this.h.setCancelable(false);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate:");
        sb.append(this.b);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        e.a.a.a.a.z0(sb, this.f7513c, "FindNewVersionDialog");
    }

    static void d(d dVar) {
        Objects.requireNonNull(dVar);
        try {
            OInsetSheet oInsetSheet = dVar.h;
            if (oInsetSheet != null) {
                oInsetSheet.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public void i() {
        try {
            if (!(this.a instanceof Activity)) {
                this.h.getWindow().setType(2038);
            }
            this.h.show();
        } catch (Exception e2) {
            Log.e("FindNewVersionDialog", "show: ", e2);
        }
    }
}
