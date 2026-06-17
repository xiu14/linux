package com.bytedance.android.doubaoime.activity;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.lego.init.model.InitPeriod;
import com.vivo.push.PushClient;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ImeGuideActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    private static b f1914g;
    public static final /* synthetic */ int h = 0;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f1915c;

    /* renamed from: d, reason: collision with root package name */
    private d f1916d;
    private ViewGroup a = null;
    private ViewGroup b = null;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f1917e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1918f = false;

    private class b extends Handler {
        b(a aVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                ImeGuideActivity.f1914g.removeMessages(1);
            } else if (com.bytedance.android.input.common.u.c.g(ImeGuideActivity.this.getApplicationContext())) {
                ImeGuideActivity.b(ImeGuideActivity.this);
            } else {
                ImeGuideActivity.f1914g.sendMessageDelayed(Message.obtain(ImeGuideActivity.f1914g, 1), 200L);
            }
        }
    }

    private final class c extends BroadcastReceiver {
        c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (com.bytedance.android.input.common.u.c.h(ImeGuideActivity.this.getApplicationContext())) {
                ImeGuideActivity.a(ImeGuideActivity.this);
                ImeGuideActivity imeGuideActivity = ImeGuideActivity.this;
                Objects.requireNonNull(imeGuideActivity);
                com.bytedance.android.input.r.j.i("LauncherActivity", "finishImeGuide");
                Intent intent2 = new Intent(imeGuideActivity, (Class<?>) SettingsActivityNext.class);
                intent2.addFlags(67108864);
                String stringExtra = imeGuideActivity.getIntent().getStringExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE);
                if (stringExtra != null) {
                    intent2.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, stringExtra);
                }
                imeGuideActivity.startActivity(intent2);
                imeGuideActivity.finish();
            }
        }
    }

    private class d extends ContentObserver {
        d(a aVar) {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            int i = ImeGuideActivity.h;
            com.bytedance.android.input.r.j.m("LauncherActivity", "onChange: InputMethodContentObserver");
        }
    }

    static /* synthetic */ boolean a(ImeGuideActivity imeGuideActivity) {
        imeGuideActivity.d();
        return false;
    }

    static void b(ImeGuideActivity imeGuideActivity) {
        Objects.requireNonNull(imeGuideActivity);
        f1914g.removeMessages(1);
        Intent intent = new Intent(imeGuideActivity, (Class<?>) ImeGuideActivity.class);
        intent.addFlags(603979776);
        imeGuideActivity.startActivity(intent);
    }

    private boolean d() {
        boolean booleanValue = ((Boolean) SettingsConfigNext.f(getString(C0838R.string.activity_launcher_has_shown))).booleanValue();
        boolean g2 = com.bytedance.android.input.common.u.c.g(getApplicationContext());
        if (!booleanValue || g2) {
            this.f1917e.setVisibility(8);
        } else {
            this.f1917e.setVisibility(0);
        }
        if (g2 && com.bytedance.android.input.common.u.c.h(getApplicationContext())) {
            this.a.setVisibility(8);
            this.b.setVisibility(8);
            this.f1918f = true;
        } else {
            this.a.setVisibility(0);
            this.b.setVisibility(0);
            if (g2) {
                e(this.a, false);
                e(this.b, true);
                this.f1918f = true;
            } else {
                e(this.a, true);
                e(this.b, false);
                this.f1918f = false;
            }
        }
        return false;
    }

    private void e(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        viewGroup.setEnabled(z);
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setEnabled(z);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finishAffinity();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != C0838R.id.rl_ime_guide_step_one) {
            if (id == C0838R.id.rl_ime_guide_step_two) {
                com.bytedance.android.input.s.f.a.a("guidepage_change_click", null);
                ((InputMethodManager) getApplicationContext().getSystemService("input_method")).showInputMethodPicker();
                Toast.makeText(this, getString(C0838R.string.ime_guide_toast_choose_ime), 0).show();
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.INPUT_METHOD_SETTINGS");
        startActivityForResult(intent, 2);
        startActivity(new Intent(this, (Class<?>) GuideAnimationActivity.class));
        f1914g.sendMessageDelayed(Message.obtain(f1914g, 1), 200L);
        f1914g.sendEmptyMessageDelayed(2, 120000L);
        com.bytedance.android.input.s.f.a.a("guidepage_start_click", null);
    }

    @Override // com.bytedance.android.doubaoime.activity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.activity_launcher);
        this.a = (ViewGroup) findViewById(C0838R.id.rl_ime_guide_step_one);
        this.b = (ViewGroup) findViewById(C0838R.id.rl_ime_guide_step_two);
        this.f1917e = (LinearLayout) findViewById(C0838R.id.ll_security_promise);
        this.a.setOnClickListener(this);
        this.b.setOnClickListener(this);
        d();
        f1914g = new b(null);
        this.f1915c = new c(null);
        this.f1916d = new d(null);
        registerReceiver(this.f1915c, new IntentFilter("android.intent.action.INPUT_METHOD_CHANGED"));
        d dVar = this.f1916d;
        ContentResolver contentResolver = ImeGuideActivity.this.getApplicationContext().getContentResolver();
        contentResolver.registerContentObserver(Settings.Secure.getUriFor("default_input_method"), false, dVar);
        contentResolver.registerContentObserver(Settings.Secure.getUriFor("enabled_input_methods"), false, dVar);
        contentResolver.registerContentObserver(Settings.Secure.getUriFor("selected_input_method_subtype"), false, dVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_state", this.f1918f ? PushClient.DEFAULT_REQUEST_ID : "0");
            com.bytedance.android.input.s.f.a.a("guidepage_show", jSONObject);
        } catch (JSONException e2) {
            com.bytedance.android.input.r.j.k("LauncherActivity", "Failed to create event params for ime_guide_show", e2);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        f1914g.removeMessages(1);
        f1914g.removeMessages(2);
        getContentResolver().unregisterContentObserver(this.f1916d);
        unregisterReceiver(this.f1915c);
        this.f1915c = null;
    }

    @Override // android.app.Activity
    protected void onResume() {
        InitPeriod initPeriod = InitPeriod.SPLASH_ONRESUME2SUPER;
        InitScheduler.onPeriodStart(initPeriod);
        InitScheduler.onPeriodEnd(initPeriod);
        super.onResume();
        InitPeriod initPeriod2 = InitPeriod.SPLASH_SUPER2ONRESUMEEND;
        InitScheduler.onPeriodStart(initPeriod2);
        InitScheduler.onPeriodEnd(initPeriod2);
        d();
        SettingsConfigNext.l(getString(C0838R.string.activity_launcher_has_shown), Boolean.TRUE);
    }
}
