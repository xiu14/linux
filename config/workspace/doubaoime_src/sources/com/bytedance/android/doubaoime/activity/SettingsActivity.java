package com.bytedance.android.doubaoime.activity;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.popup.h;
import com.bytedance.common.wschannel.WsConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class SettingsActivity extends Activity {
    public static final /* synthetic */ int b = 0;
    private a a;

    public static class a extends PreferenceFragment implements Preference.OnPreferenceClickListener, Preference.OnPreferenceChangeListener {
        private int a = 10;
        private Context b;

        /* renamed from: c, reason: collision with root package name */
        private Toast f1939c;

        /* renamed from: d, reason: collision with root package name */
        private HandlerC0048a f1940d;

        /* renamed from: e, reason: collision with root package name */
        private com.bytedance.android.input.popup.h f1941e;

        /* renamed from: f, reason: collision with root package name */
        private com.bytedance.android.input.popup.h f1942f;

        /* renamed from: g, reason: collision with root package name */
        private PreferenceScreen f1943g;
        private SwitchPreference h;
        private PreferenceScreen i;
        private CheckBoxPreference j;

        /* renamed from: com.bytedance.android.doubaoime.activity.SettingsActivity$a$a, reason: collision with other inner class name */
        private static final class HandlerC0048a extends Handler {
            WeakReference<a> a;

            public HandlerC0048a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.a.get() == null) {
                    return;
                }
                a aVar = this.a.get();
                int i = message.what;
                if (i == 0) {
                    String str = (String) message.obj;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    a.j(aVar, str);
                    return;
                }
                if (i != 1) {
                    return;
                }
                if (aVar.a == 0) {
                    a.c(aVar, false);
                } else {
                    aVar.a = 10;
                }
            }
        }

        static void c(a aVar, boolean z) {
            Preference findPreference = aVar.findPreference(aVar.getString(C0838R.string.about_info_hide));
            if (z) {
                findPreference.setTitle("");
                findPreference.setSummary("");
                return;
            }
            findPreference.setTitle("ID");
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append("DeviceId: ");
            sb.append(com.bytedance.applog.a.c());
            sb.append("\n");
            sb.append("Uid: ");
            sb.append(com.bytedance.applog.a.i());
            sb.append("\n");
            findPreference.setSummary(sb);
            StringBuilder sb2 = new StringBuilder();
            try {
                PackageInfo packageInfo = aVar.b.getPackageManager().getPackageInfo(aVar.b.getPackageName(), 0);
                sb2.append("Version: ");
                sb2.append(packageInfo.versionName);
                sb2.append("\n");
            } catch (PackageManager.NameNotFoundException unused) {
            }
            sb2.append("DeviceId: ");
            sb2.append(com.bytedance.applog.a.c());
            sb2.append("\n");
            ((ClipboardManager) aVar.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("input id", sb2));
            Message obtainMessage = aVar.f1940d.obtainMessage(0);
            obtainMessage.obj = aVar.getString(C0838R.string.tip_copy);
            aVar.f1940d.sendMessage(obtainMessage);
        }

        static void f(a aVar) {
            com.bytedance.android.input.popup.h hVar = aVar.f1941e;
            if (hVar == null || !hVar.isShowing()) {
                return;
            }
            aVar.f1941e.dismiss();
        }

        static void g(a aVar) {
            com.bytedance.android.input.common.j.l(aVar.b).m();
            aVar.getPreferenceScreen().removeAll();
            aVar.m();
        }

        static void h(a aVar) {
            com.bytedance.android.input.popup.h hVar = aVar.f1942f;
            if (hVar == null || !hVar.isShowing()) {
                return;
            }
            aVar.f1942f.dismiss();
        }

        static void j(a aVar, CharSequence charSequence) {
            Toast toast = aVar.f1939c;
            if (toast == null) {
                Toast makeText = Toast.makeText(aVar.b, charSequence, 0);
                aVar.f1939c = makeText;
                makeText.setGravity(49, 0, 0);
            } else {
                toast.setText(charSequence);
            }
            aVar.f1939c.show();
        }

        private void m() {
            String str;
            this.a = 10;
            addPreferencesFromResource(C0838R.xml.root_preferences);
            this.h = (SwitchPreference) findPreference(getString(C0838R.string.enable_fuzzy));
            PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference(getString(C0838R.string.fuzzy_screen));
            this.f1943g = preferenceScreen;
            preferenceScreen.setSummary(this.h.isChecked() ? getString(C0838R.string.option_open_status) : getString(C0838R.string.option_close_status));
            this.f1943g.getRootAdapter().registerDataSetObserver(new V(this));
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) findPreference(getString(C0838R.string.shuangpin_screen));
            this.i = preferenceScreen2;
            preferenceScreen2.getRootAdapter().registerDataSetObserver(new W(this));
            n(C0838R.string.click_dict_clear);
            n(C0838R.string.click_reset);
            n(C0838R.string.about_info);
            n(C0838R.string.fuzzy_screen);
            n(C0838R.string.shuangpin_screen);
            n(C0838R.string.about_scree);
            n(C0838R.string.click_feedback);
            Iterator<String> it2 = com.bytedance.android.input.common.j.k.iterator();
            while (it2.hasNext()) {
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(it2.next());
                checkBoxPreference.setOnPreferenceChangeListener(this);
                if (checkBoxPreference.isChecked()) {
                    this.j = checkBoxPreference;
                }
            }
            String str2 = "";
            Preference findPreference = findPreference(getString(C0838R.string.about_info));
            try {
                String str3 = this.b.getPackageManager().getPackageInfo(getActivity().getPackageName(), 0).versionName;
                try {
                    str2 = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128).metaData.getString("releaseTime");
                } catch (PackageManager.NameNotFoundException unused) {
                }
                str = str2;
                str2 = str3;
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "";
            }
            StringBuilder M = e.a.a.a.a.M("\n\n");
            M.append(getString(C0838R.string.str_name));
            M.append(" ");
            M.append(getString(C0838R.string.app_name));
            M.append("\n\n");
            M.append(getString(C0838R.string.str_version));
            M.append(" ");
            M.append(str2);
            M.append("\n\n");
            M.append(getString(C0838R.string.str_build_time));
            M.append(" ");
            M.append(str);
            M.append("\n");
            findPreference.setSummary(M.toString());
            long c2 = com.bytedance.android.input.common.u.c.c() / 1048576;
            int i = SettingsActivity.b;
            com.bytedance.android.input.r.j.m("SettingsActivity", "onCreate size = " + c2);
            if (c2 <= 8) {
                PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(getString(C0838R.string.input_settings_category));
                Preference findPreference2 = findPreference(getString(C0838R.string.enable_offline_asr));
                com.bytedance.android.input.r.j.m("SettingsActivity", "onCreate inputCategory = " + preferenceCategory + ", offlinePreference" + findPreference2);
                if (preferenceCategory == null || findPreference2 == null) {
                    return;
                }
                preferenceCategory.removePreference(findPreference2);
            }
        }

        private void n(int i) {
            findPreference(getString(i)).setOnPreferenceClickListener(this);
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            this.b = aVar.getContext();
            this.f1940d = new HandlerC0048a(this);
            m();
            int i = SettingsActivity.b;
            com.bytedance.android.input.r.j.m("SettingsActivity", "SettingsFragment onCreate");
        }

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            int i = SettingsActivity.b;
            com.bytedance.android.input.r.j.m("SettingsActivity", "SettingsFragment onDestroy");
        }

        @Override // android.preference.Preference.OnPreferenceChangeListener
        public boolean onPreferenceChange(Preference preference, Object obj) {
            if (com.bytedance.android.input.common.j.k.contains(preference.getKey())) {
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
                if (checkBoxPreference.isChecked()) {
                    return false;
                }
                CheckBoxPreference checkBoxPreference2 = this.j;
                if (checkBoxPreference2 != null) {
                    checkBoxPreference2.setChecked(false);
                }
                this.j = checkBoxPreference;
            }
            return true;
        }

        @Override // android.preference.Preference.OnPreferenceClickListener
        public boolean onPreferenceClick(Preference preference) {
            int i = SettingsActivity.b;
            StringBuilder M = e.a.a.a.a.M("onPreferenceClick: key = ");
            M.append(preference.getKey());
            com.bytedance.android.input.r.j.m("SettingsActivity", M.toString());
            if (preference instanceof PreferenceScreen) {
                final PreferenceScreen preferenceScreen = (PreferenceScreen) preference;
                if (preferenceScreen.getDialog() != null && preferenceScreen.getDialog().getActionBar() != null) {
                    preferenceScreen.getDialog().getActionBar().setDisplayOptions(16);
                    preferenceScreen.getDialog().getActionBar().setDisplayShowCustomEnabled(true);
                    preferenceScreen.getDialog().getActionBar().setDisplayShowHomeEnabled(false);
                    preferenceScreen.getDialog().getActionBar().setDisplayShowTitleEnabled(false);
                    preferenceScreen.getDialog().getActionBar().setHomeButtonEnabled(false);
                    preferenceScreen.getDialog().getActionBar().setCustomView(C0838R.layout.layout_toobar);
                    ((TextView) preferenceScreen.getDialog().getActionBar().getCustomView().findViewById(C0838R.id.toolbar_title)).setText(preferenceScreen.getTitle());
                    ImageView imageView = (ImageView) preferenceScreen.getDialog().getActionBar().getCustomView().findViewById(C0838R.id.toolbar_navigation);
                    imageView.setVisibility(0);
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.C
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            preferenceScreen.getDialog().dismiss();
                        }
                    });
                    if (preferenceScreen.getDialog().getActionBar().getCustomView().getParent() instanceof Toolbar) {
                        ((Toolbar) preferenceScreen.getDialog().getActionBar().getCustomView().getParent()).setContentInsetsAbsolute(0, 0);
                    }
                }
                return true;
            }
            if (preference.getKey().equals(getString(C0838R.string.click_reset))) {
                if (this.f1941e == null) {
                    h.b bVar = new h.b(getActivity());
                    bVar.e(getString(C0838R.string.str_reset_to_default));
                    bVar.b(getString(C0838R.string.str_sure_reset_to_default));
                    bVar.c(getString(C0838R.string.option_cancle));
                    bVar.d(getString(C0838R.string.option_ok));
                    com.bytedance.android.input.popup.h a = bVar.a();
                    this.f1941e = a;
                    a.d(new X(this));
                    this.f1941e.f(new Y(this));
                }
                this.f1941e.show();
                return true;
            }
            if (preference.getKey().equals(getString(C0838R.string.click_dict_clear))) {
                if (this.f1942f == null) {
                    h.b bVar2 = new h.b(getActivity());
                    bVar2.e(getString(C0838R.string.str_clear_user_dict));
                    bVar2.b(getString(C0838R.string.str_sure_to_reset_user_dict));
                    bVar2.c(getString(C0838R.string.option_cancle));
                    bVar2.d(getString(C0838R.string.option_ok));
                    com.bytedance.android.input.popup.h a2 = bVar2.a();
                    this.f1942f = a2;
                    a2.d(new Z(this));
                    this.f1942f.f(new a0(this));
                }
                this.f1942f.show();
                return true;
            }
            if (!preference.getKey().equals(getString(C0838R.string.about_info))) {
                if (!preference.getKey().equals(getString(C0838R.string.click_feedback))) {
                    return false;
                }
                com.bytedance.android.input.r.j.f3013f.p(getActivity());
                com.bytedance.android.input.common.j.l(this.b).d();
                return true;
            }
            if (this.a == 10) {
                HandlerC0048a handlerC0048a = this.f1940d;
                handlerC0048a.sendMessageDelayed(handlerC0048a.obtainMessage(1), WsConstants.EXIT_DELAY_TIME);
            }
            int i2 = this.a;
            if (i2 > 0) {
                this.a = i2 - 1;
            }
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActionBar().setDisplayOptions(16);
        getActionBar().setDisplayShowCustomEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(false);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setHomeButtonEnabled(false);
        getActionBar().setCustomView(C0838R.layout.layout_toobar);
        ((TextView) getActionBar().getCustomView().findViewById(C0838R.id.toolbar_title)).setText(getString(C0838R.string.app_name));
        ((ImageView) getActionBar().getCustomView().findViewById(C0838R.id.toolbar_navigation)).setVisibility(8);
        if (getActionBar().getCustomView().getParent() instanceof Toolbar) {
            ((Toolbar) getActionBar().getCustomView().getParent()).setContentInsetsAbsolute(0, 0);
        }
        this.a = new a();
        getFragmentManager().beginTransaction().replace(R.id.content, this.a).commit();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.android.input.r.j.m("SettingsActivity", "onPause");
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        com.bytedance.android.input.common.j.l(aVar.getContext()).f();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.bytedance.android.input.r.j.m("SettingsActivity", "onResume");
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        com.bytedance.android.input.common.j.l(aVar.getContext()).e();
    }
}
