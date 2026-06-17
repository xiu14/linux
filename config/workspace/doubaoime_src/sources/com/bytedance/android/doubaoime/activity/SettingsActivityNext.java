package com.bytedance.android.doubaoime.activity;

import android.app.ActionBar;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.preference.PreferenceManager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.fragment.message.MessageCenterFragment;
import com.bytedance.android.input.fragment.settings.AboutFragment;
import com.bytedance.android.input.fragment.settings.AiChatAssistantFragment;
import com.bytedance.android.input.fragment.settings.ClipboardFragment;
import com.bytedance.android.input.fragment.settings.DesktopFragment;
import com.bytedance.android.input.fragment.settings.FuzzyFragment;
import com.bytedance.android.input.fragment.settings.InputModeFragment;
import com.bytedance.android.input.fragment.settings.InputRecommendFragment;
import com.bytedance.android.input.fragment.settings.KbdLayoutFragment;
import com.bytedance.android.input.fragment.settings.KeyAuxiliaryInputFragment;
import com.bytedance.android.input.fragment.settings.KeyCustomSymbolFragment;
import com.bytedance.android.input.fragment.settings.KeyDoubleInputFragment;
import com.bytedance.android.input.fragment.settings.KeyFeedbackFragment;
import com.bytedance.android.input.fragment.settings.KeyMultipleInputTypeFragment;
import com.bytedance.android.input.fragment.settings.LexiconManagementFragment;
import com.bytedance.android.input.fragment.settings.MainFragment;
import com.bytedance.android.input.fragment.settings.SmartInputSettingsFragment;
import com.bytedance.android.input.fragment.settings.SystemPermissionFragment;
import com.bytedance.android.input.fragment.settings.VoiceInputActionFragment;
import com.bytedance.android.input.fragment.settings.VoiceInputOfflineDownloadFragment;
import com.bytedance.android.input.fragment.settings.VoiceInputSettingsFragment;
import com.bytedance.android.input.framework.activity.BaseImeActivity;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.lego.init.model.InitPeriod;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SettingsActivityNext extends BaseImeActivity {
    public static final String APP_SETTINGS_START_EVENT = "appsettings_start";
    public static final String CUSTOM_SYMBOL_NUMBER9 = "number9";
    public static final String CUSTOM_SYMBOL_PY9 = "py9";
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_FONT_SCALE = 1.0f;
    public static final String EXTRA_FRAGMENT_TYPE = "EXTRA_FRAGMENT_TYPE";
    public static final String EXTRA_KEY_CUSTOM_SYMBOL = "EXTRA_KEY_CUSTOM_SYMBOL";
    public static final String EXTRA_MESSAGE_ID = "EXTRA_MESSAGE_ID";
    public static final String EXTRA_OFFLINE_MODEL_DOWNLOAD_WAY = "EXTRA_OFFLINE_MODEL_DOWNLOAD_WAY";
    public static final String EXTRA_SETTINGS_SOURCE = "EXTRA_SETTINGS_SOURCE";
    public static final String EXTRA_WEB_URL = "EXTRA_WEB_URL";
    public static final String MAIN_PROCESS_UPDATE_PREFERENCE = "MAIN_PROCESS_UPDATE_PREFERENCE";
    public static final String SETTINGS_SOURCE_APP = "App";
    public static final String SETTINGS_SOURCE_KEYBOARD = "keyboard";
    public static final String SETTINGS_SOURCE_MESSAGE = "message";
    public static final String SETTINGS_SOURCE_NEW = "new";
    public static final String SETTINGS_SOURCE_PRIVACY = "privacy";
    public static final String SHOW_MAIN_FRAGMENT_BACK_BUTTON = "SHOW_MAIN_FRAGMENT_BACK_BUTTON";
    private static final String TAG = "SettingsActivity";
    private static volatile long sLastPrivacyLaunchUptimeMs;
    private boolean mIntentFromSettingsApp;
    private PreferenceReceiver mPreferenceReceiver;
    private boolean requestNotificationPermissionFinish;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final SettingsActivityNext$mOnBackStackChangedListener$1 mOnBackStackChangedListener = new FragmentManager.OnBackStackChangedListener() { // from class: com.bytedance.android.doubaoime.activity.SettingsActivityNext$mOnBackStackChangedListener$1
        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            Object J2;
            Window window;
            SettingsActivityNext settingsActivityNext = SettingsActivityNext.this;
            try {
                int backStackEntryCount = settingsActivityNext.getSupportFragmentManager().getBackStackEntryCount();
                IAppGlobals.a.j("SettingsActivity", "onBackStackChanged, backStackCount: " + backStackEntryCount);
                if (backStackEntryCount == 0 && (window = settingsActivityNext.getWindow()) != null) {
                    window.setNavigationBarColor(ContextCompat.getColor(settingsActivityNext.getApplicationContext(), C0838R.color.ime_color_main_setting_bg));
                }
                J2 = kotlin.o.a;
            } catch (Throwable th) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th);
            }
            Throwable b = kotlin.h.b(J2);
            if (b != null) {
                e.a.a.a.a.v0("onBackStackChanged error:", b, "SettingsActivity");
            }
        }
    };
    private final SettingsActivityNext$mSettingsConfigListener$1 mSettingsConfigListener = new SettingsConfigNext.b() { // from class: com.bytedance.android.doubaoime.activity.SettingsActivityNext$mSettingsConfigListener$1
        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public void onReset() {
            SettingsActivityNext$mTaskServiceConnection$1 settingsActivityNext$mTaskServiceConnection$1;
            settingsActivityNext$mTaskServiceConnection$1 = SettingsActivityNext.this.mTaskServiceConnection;
            settingsActivityNext$mTaskServiceConnection$1.postTask(SettingsActivityNext$mSettingsConfigListener$1$onReset$1.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.android.input.common.SettingsConfigNext.b
        public <T> void onSettingsConfigChanged(String str, T t) {
            SettingsActivityNext$mTaskServiceConnection$1 settingsActivityNext$mTaskServiceConnection$1;
            MainFragment mainFragment;
            kotlin.s.c.l.f(str, "key");
            com.bytedance.android.input.r.j.i("SettingsActivity", "onSettingsConfigChanged, key = " + str + ", value = " + t);
            settingsActivityNext$mTaskServiceConnection$1 = SettingsActivityNext.this.mTaskServiceConnection;
            settingsActivityNext$mTaskServiceConnection$1.postTask(new SettingsActivityNext$mSettingsConfigListener$1$onSettingsConfigChanged$1(str, t));
            if (kotlin.s.c.l.a(str, SettingsActivityNext.this.getString(C0838R.string.full_base_input_mode))) {
                com.bytedance.android.input.r.j.i("SettingsActivity", "onSettingsConfigChanged, full_base_input_mode 输入模式变更");
                mainFragment = SettingsActivityNext.this.mMainFragment;
                mainFragment.r();
                kotlin.s.c.l.d(t, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) t).intValue() == 0) {
                    com.bytedance.android.input.r.j.i("SettingsActivity", "onSettingsConfigChanged, full_base_input_mode 输入模式变更，切换到完整模式");
                    com.bytedance.android.input.g.c(IAppGlobals.a.getContext());
                } else {
                    com.bytedance.android.input.r.j.i("SettingsActivity", "onSettingsConfigChanged, full_base_input_mode 输入模式变更，切换到基础打字模式");
                    com.bytedance.android.input.g.a();
                }
            }
        }
    };
    private final SettingsActivityNext$mTaskServiceConnection$1 mTaskServiceConnection = new SettingsActivityNext$mTaskServiceConnection$1(this);
    private final MainFragment mMainFragment = new MainFragment();
    private final FuzzyFragment mFuzzyFragment = new FuzzyFragment();
    private final VoiceInputSettingsFragment mVoiceInputFragment = new VoiceInputSettingsFragment();
    private final VoiceInputActionFragment mVoiceInputActionFragment = new VoiceInputActionFragment();
    private final KeyFeedbackFragment mKeyFeedbackFragment = new KeyFeedbackFragment();
    private final KeyAuxiliaryInputFragment mKeyAuxiliaryInputFragment = new KeyAuxiliaryInputFragment();
    private final InputModeFragment mInputModeFragment = new InputModeFragment();
    private final AiChatAssistantFragment mAiChatAssistantFragment = new AiChatAssistantFragment();
    private final kotlin.e mDebugSettingsFragment$delegate = kotlin.a.c(SettingsActivityNext$mDebugSettingsFragment$2.INSTANCE);
    private final AboutFragment mAboutFragment = new AboutFragment();
    private final KbdLayoutFragment mKbdLayoutFragment = new KbdLayoutFragment();
    private final ClipboardFragment mClipboardFragment = new ClipboardFragment();
    private final LexiconManagementFragment mLexiconManagementFragment = new LexiconManagementFragment();
    private final SystemPermissionFragment mSystemPermissionFragment = new SystemPermissionFragment();
    private final DesktopFragment mDesktopFragment = new DesktopFragment();
    private final VoiceInputOfflineDownloadFragment mVoiceInputOfflineDownloadFragment = new VoiceInputOfflineDownloadFragment();
    private final InputRecommendFragment mInputRecommendFragment = new InputRecommendFragment();
    private final SmartInputSettingsFragment mSmartInputSettingsFragment = new SmartInputSettingsFragment();
    private final MessageCenterFragment mMessageCenterFragment = new MessageCenterFragment();
    private final KeyCustomSymbolFragment mCustomSymbolFragment = new KeyCustomSymbolFragment();
    private final KeyMultipleInputTypeFragment mMultipleInputTypeFragment = new KeyMultipleInputTypeFragment();
    private final KeyDoubleInputFragment mDoubleSpellFragment = new KeyDoubleInputFragment();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.s.c.g gVar) {
            this();
        }
    }

    public enum FragmentType {
        MAIN,
        FUZZY,
        VOICE_INPUT,
        KEY_FEEDBACK,
        KEY_AUXILIARY_INPUT,
        INPUT_MODE,
        AI_CHAT_ASSISTANT,
        DEBUG_SETTINGS,
        ABOUT,
        KBD_LAYOUT,
        CLIPBOARD,
        LEXICON_MANAGEMENT,
        SYSTEM_PERMISSION,
        DESKTOP,
        OFFLINE_DOWNLOAD,
        INPUT_RECOMMEND,
        SMART_INPUT,
        MESSAGE_CENTER,
        CUSTOM_SYMBOL,
        MULTIPLE_INPUT_TYPE,
        DOUBLE_SPELL_PAGE,
        VOICE_INPUT_ACTION
    }

    public static final class PreferenceReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.s.c.l.f(context, "context");
            kotlin.s.c.l.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            com.bytedance.android.input.r.j.i(SettingsActivityNext.TAG, "onReceive");
            if (kotlin.s.c.l.a(intent.getAction(), SettingsActivityNext.MAIN_PROCESS_UPDATE_PREFERENCE)) {
                String stringExtra = intent.getStringExtra(DownloadConstants.PATH_KEY);
                if (stringExtra != null) {
                    SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
                    String string = IAppGlobals.a.getContext().getString(C0838R.string.asr_offline_model_path);
                    kotlin.s.c.l.e(string, "IAppGlobals.context.getS…g.asr_offline_model_path)");
                    settingsConfigNext.m(string, stringExtra);
                }
                int intExtra = intent.getIntExtra(MonitorConstants.EXTRA_DOWNLOAD_STATUS, -1);
                if (intExtra > 0) {
                    SettingsConfigNext.l(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.asr_offline_model_download_status, "IAppGlobals.context.getS…ne_model_download_status)"), Integer.valueOf(intExtra));
                }
                int intExtra2 = intent.getIntExtra("download_way", -1);
                if (intExtra2 > 0) {
                    SettingsConfigNext.l(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.asr_offline_download_way, "IAppGlobals.context.getS…asr_offline_download_way)"), Integer.valueOf(intExtra2));
                }
                e.a.a.a.a.B0(e.a.a.a.a.V("onReceive modelPath: ", stringExtra, ", downloadStatus: ", intExtra, " , modelDownloadWay: "), intExtra2, SettingsActivityNext.TAG);
            }
        }
    }

    public static final class ReportConst {
        public static final ReportConst INSTANCE = new ReportConst();
        public static final String SETTINGS_EVENT = "Input_setting";

        private ReportConst() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            FragmentType.values();
            int[] iArr = new int[22];
            try {
                FragmentType fragmentType = FragmentType.MAIN;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FragmentType fragmentType2 = FragmentType.FUZZY;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FragmentType fragmentType3 = FragmentType.VOICE_INPUT;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FragmentType fragmentType4 = FragmentType.VOICE_INPUT_ACTION;
                iArr[21] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FragmentType fragmentType5 = FragmentType.KEY_FEEDBACK;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FragmentType fragmentType6 = FragmentType.KEY_AUXILIARY_INPUT;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                FragmentType fragmentType7 = FragmentType.INPUT_MODE;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                FragmentType fragmentType8 = FragmentType.AI_CHAT_ASSISTANT;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                FragmentType fragmentType9 = FragmentType.DEBUG_SETTINGS;
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                FragmentType fragmentType10 = FragmentType.ABOUT;
                iArr[8] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                FragmentType fragmentType11 = FragmentType.KBD_LAYOUT;
                iArr[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                FragmentType fragmentType12 = FragmentType.CLIPBOARD;
                iArr[10] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                FragmentType fragmentType13 = FragmentType.LEXICON_MANAGEMENT;
                iArr[11] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                FragmentType fragmentType14 = FragmentType.SYSTEM_PERMISSION;
                iArr[12] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                FragmentType fragmentType15 = FragmentType.DESKTOP;
                iArr[13] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                FragmentType fragmentType16 = FragmentType.OFFLINE_DOWNLOAD;
                iArr[14] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                FragmentType fragmentType17 = FragmentType.INPUT_RECOMMEND;
                iArr[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                FragmentType fragmentType18 = FragmentType.SMART_INPUT;
                iArr[16] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                FragmentType fragmentType19 = FragmentType.MESSAGE_CENTER;
                iArr[17] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                FragmentType fragmentType20 = FragmentType.CUSTOM_SYMBOL;
                iArr[18] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                FragmentType fragmentType21 = FragmentType.MULTIPLE_INPUT_TYPE;
                iArr[19] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                FragmentType fragmentType22 = FragmentType.DOUBLE_SPELL_PAGE;
                iArr[20] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String getFontSizeDefaultState() {
        float f2 = getResources().getConfiguration().fontScale;
        return f2 > 1.0f ? "greaterthan" : f2 < 1.0f ? "lessthan" : "equal";
    }

    private final boolean getInstalledAppListAndCheck() {
        return false;
    }

    private final String getSettingsSource() {
        String stringExtra = getIntent().getStringExtra(EXTRA_SETTINGS_SOURCE);
        return stringExtra == null ? SETTINGS_SOURCE_APP : stringExtra;
    }

    private final void handleFragmentIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i = extras.getInt(EXTRA_OFFLINE_MODEL_DOWNLOAD_WAY, -1);
            e.a.a.a.a.k0("offline model download way: ", i, TAG);
            if (i > 0) {
                SettingsConfigNext.l(e.a.a.a.a.e(IAppGlobals.a, C0838R.string.asr_offline_download_way, "IAppGlobals.context.getS…asr_offline_download_way)"), Integer.valueOf(i));
            }
            String string = extras.getString(EXTRA_FRAGMENT_TYPE);
            if (string != null) {
                kotlin.s.c.l.e(string, "it");
                FragmentType valueOf = FragmentType.valueOf(string);
                com.bytedance.android.input.r.j.m(TAG, "open fragment: " + valueOf);
                if (valueOf != FragmentType.MAIN) {
                    if (valueOf == FragmentType.KEY_FEEDBACK) {
                        com.bytedance.android.input.r.j.i(TAG, "open key feedback from settings app.");
                        this.mIntentFromSettingsApp = true;
                    }
                    if (valueOf == FragmentType.CUSTOM_SYMBOL) {
                        Bundle bundle = new Bundle();
                        String string2 = extras.getString(EXTRA_KEY_CUSTOM_SYMBOL);
                        if (string2 != null) {
                            int hashCode = string2.hashCode();
                            if (hashCode != -2000515568) {
                                if (hashCode == 111440 && string2.equals(CUSTOM_SYMBOL_PY9)) {
                                    bundle.putInt("LAUNCH_TYPE", 1);
                                }
                            } else if (string2.equals(CUSTOM_SYMBOL_NUMBER9)) {
                                bundle.putInt("LAUNCH_TYPE", 2);
                            }
                        }
                        switchFragment(valueOf, bundle);
                        return;
                    }
                    if (valueOf == FragmentType.MULTIPLE_INPUT_TYPE) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("KEY_TARGET_PAGE", "TARGET_PAGE_DOUBLE_SPELL");
                        switchFragment(valueOf, bundle2);
                    } else {
                        if (valueOf != FragmentType.MESSAGE_CENTER) {
                            switchFragment$default(this, valueOf, null, 2, null);
                            return;
                        }
                        String stringExtra = intent.getStringExtra("EXTRA_MESSAGE_ID");
                        if (stringExtra != null) {
                            com.bytedance.android.input.fragment.message.data.f.a.n(stringExtra);
                        } else {
                            com.bytedance.android.input.r.j.m(TAG, "open message center, messageId is null");
                        }
                        switchFragment$default(this, valueOf, null, 2, null);
                        tryOpenWebActivity();
                    }
                }
            }
        }
    }

    private final void handleIntent(Intent intent) {
        boolean a = kotlin.s.c.l.a(intent.getAction(), "android.intent.action.MAIN");
        StringBuilder X = e.a.a.a.a.X("isFromLauncher: ", a, ", intent.action: ");
        X.append(intent.getAction());
        com.bytedance.android.input.r.j.m(TAG, X.toString());
        boolean booleanExtra = intent.getBooleanExtra(SHOW_MAIN_FRAGMENT_BACK_BUTTON, false);
        boolean z = a || booleanExtra;
        StringBuilder sb = new StringBuilder();
        sb.append("handleIntent finalShowState=");
        sb.append(z);
        sb.append(" showMainFragmentBack=");
        sb.append(booleanExtra);
        sb.append("  mMainFragment.arguments==null ");
        sb.append(this.mMainFragment.getArguments() == null);
        com.bytedance.android.input.r.j.m(TAG, sb.toString());
        Bundle arguments = this.mMainFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean(SHOW_MAIN_FRAGMENT_BACK_BUTTON, z);
        this.mMainFragment.setArguments(arguments);
        if (this.mMainFragment.isAdded()) {
            this.mMainFragment.A(booleanExtra);
        }
    }

    private final void handleNotificationPermission() {
        if (this.requestNotificationPermissionFinish) {
            com.bytedance.android.input.r.j.i(TAG, "handleNotificationPermissionFinish = true");
            return;
        }
        com.bytedance.android.input.r.j.i(TAG, "handleNotificationPermissionFinish = false prepare requestNotificationPermission");
        com.bytedance.android.input.fragment.message.l.a.a(this);
        this.requestNotificationPermissionFinish = true;
    }

    private final void initFragments() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.s.c.l.e(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(C0838R.id.settings_layout_content, this.mMainFragment);
        beginTransaction.commit();
    }

    private final void initUI() {
        initView();
        initFragments();
    }

    private final void initView() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(new View(this), new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(C0838R.id.settings_layout_content);
        setContentView(frameLayout);
    }

    private final boolean isAppInstalled(Context context, String str) {
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$5(SettingsActivityNext settingsActivityNext) {
        kotlin.s.c.l.f(settingsActivityNext, "this$0");
        Context applicationContext = settingsActivityNext.getApplicationContext();
        kotlin.s.c.l.e(applicationContext, "applicationContext");
        com.bytedance.android.input.keyboard.q.c(applicationContext, 0, false, 6);
        sLastPrivacyLaunchUptimeMs = System.currentTimeMillis();
    }

    private final void reportSettingsViewEvent() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", getSettingsSource());
        jSONObject.put("is_fontsize_default", getFontSizeDefaultState());
        IAppLog.a.t(ReportConst.SETTINGS_EVENT, jSONObject);
    }

    public static /* synthetic */ void switchFragment$default(SettingsActivityNext settingsActivityNext, FragmentType fragmentType, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        settingsActivityNext.switchFragment(fragmentType, bundle);
    }

    private final void tryOpenWebActivity() {
        Object J2;
        String stringExtra = getIntent().getStringExtra(EXTRA_WEB_URL);
        if (stringExtra == null) {
            com.bytedance.android.input.r.j.m(TAG, "open failed...");
            return;
        }
        try {
            String stringExtra2 = getIntent().getStringExtra("extra_title");
            if (stringExtra2 == null) {
                stringExtra2 = getString(C0838R.string.message_center_title);
            }
            kotlin.s.c.l.e(stringExtra2, "intent.getStringExtra(We…ing.message_center_title)");
            kotlin.s.c.l.f(this, "context");
            kotlin.s.c.l.f(stringExtra, "url");
            kotlin.s.c.l.f(stringExtra2, "title");
            Intent intent = new Intent(this, (Class<?>) WebviewActivity.class);
            intent.putExtra("extra_url", stringExtra);
            intent.putExtra("extra_title", stringExtra2);
            intent.putExtra("extra_need_web_link_title", false);
            intent.addFlags(268435456);
            startActivity(intent);
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.P0(b, e.a.a.a.a.M("open failed exception = "), TAG);
        }
    }

    private final void updateUI() {
        boolean z = (getResources().getConfiguration().uiMode & 48) != 32;
        kotlin.s.c.l.f(this, "<this>");
        Window window = getWindow();
        if (z) {
            window.getDecorView().setSystemUiVisibility(8448);
        } else {
            window.getDecorView().setSystemUiVisibility(256);
        }
        this.mMainFragment.r();
    }

    public final void backToPreviousFragment() {
        StringBuilder M = e.a.a.a.a.M("backStackEntryCount: ");
        M.append(getSupportFragmentManager().getBackStackEntryCount());
        com.bytedance.android.input.r.j.m(TAG, M.toString());
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate();
        }
    }

    public final boolean getIntentFromSettingsApp() {
        return this.mIntentFromSettingsApp;
    }

    public final Fragment getMDebugSettingsFragment() {
        return (Fragment) this.mDebugSettingsFragment$delegate.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityResultCaller findFragmentById = getSupportFragmentManager().findFragmentById(C0838R.id.settings_layout_content);
        if ((findFragmentById instanceof Q) && ((Q) findFragmentById).j()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        InitPeriod initPeriod = InitPeriod.MAIN_ONCREATE2SUPER;
        InitScheduler.onPeriodStart(initPeriod);
        InitScheduler.onPeriodEnd(initPeriod);
        super.onCreate(bundle);
        InitPeriod initPeriod2 = InitPeriod.MAIN_SUPER2ONCREATEEND;
        InitScheduler.onPeriodStart(initPeriod2);
        InitScheduler.onPeriodEnd(initPeriod2);
        com.bytedance.android.input.r.j.m(TAG, "onCreate");
        com.bytedance.android.input.l.c.c();
        this.mTaskServiceConnection.initialize();
        com.bytedance.android.input.keyboard.q qVar = com.bytedance.android.input.keyboard.q.a;
        Context applicationContext = getApplicationContext();
        kotlin.s.c.l.e(applicationContext, "applicationContext");
        if (com.bytedance.android.input.keyboard.q.a(applicationContext)) {
            Context applicationContext2 = getApplicationContext();
            kotlin.s.c.l.e(applicationContext2, "applicationContext");
            com.bytedance.android.input.keyboard.q.c(applicationContext2, 0, false, 6);
        }
        Intent intent = getIntent();
        kotlin.s.c.l.e(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        handleIntent(intent);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        kotlin.s.c.l.e(defaultSharedPreferences, "getDefaultSharedPreferences(this)");
        int i = defaultSharedPreferences.getInt("enable_ai_chat_assistant_all", -1);
        boolean z = defaultSharedPreferences.getBoolean("enable_ai_chat_assistant_wechat", false);
        boolean z2 = defaultSharedPreferences.getBoolean("enable_ai_chat_assistant_qq", false);
        StringBuilder sb = new StringBuilder();
        sb.append("aichat: ");
        sb.append(i);
        sb.append(", wechatValue: ");
        sb.append(z);
        sb.append(", qqValue: ");
        e.a.a.a.a.N0(sb, z2, TAG);
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        settingsConfigNext.q(defaultSharedPreferences);
        String string = getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        Application application = getApplication();
        kotlin.s.c.l.d(application, "null cannot be cast to non-null type com.bytedance.android.doubaoime.ImeApplication");
        int i2 = ((ImeApplication) application).b;
        com.bytedance.android.input.r.j.m(TAG, "InputModeInit = " + i2 + ", inputMode = " + f2);
        if (kotlin.s.c.l.a(f2, 0) && i2 == 1) {
            Application application2 = getApplication();
            kotlin.s.c.l.d(application2, "null cannot be cast to non-null type com.bytedance.android.doubaoime.ImeApplication");
            ((ImeApplication) application2).b = 0;
            InitScheduler.afterPrivacyPopupWindow();
        }
        if (kotlin.s.c.l.a(f2, 0)) {
            com.bytedance.android.input.g.c(IAppGlobals.a.getContext());
            IAppLog.a.i(APP_SETTINGS_START_EVENT);
        } else {
            com.bytedance.android.input.s.f.a.a(APP_SETTINGS_START_EVENT, null);
        }
        initUI();
        Intent intent2 = getIntent();
        kotlin.s.c.l.e(intent2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        handleFragmentIntent(intent2);
        settingsConfigNext.j(this.mSettingsConfigListener);
        com.bytedance.android.input.r.j.m(TAG, "registerReceiver");
        this.mPreferenceReceiver = new PreferenceReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(MAIN_PROCESS_UPDATE_PREFERENCE);
        registerReceiver(this.mPreferenceReceiver, intentFilter);
        try {
            com.bytedance.android.input.popup.q.f().i(getWindow().getDecorView());
        } catch (Exception e2) {
            e.a.a.a.a.o0("onCreate error:", e2, TAG);
        }
        try {
            getSupportFragmentManager().addOnBackStackChangedListener(this.mOnBackStackChangedListener);
        } catch (Throwable th) {
            com.prolificinteractive.materialcalendarview.r.J(th);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        com.bytedance.android.input.r.j.m(TAG, "onDestroy");
        try {
            com.bytedance.android.input.popup.q.f().c();
        } catch (Exception e2) {
            e.a.a.a.a.o0("onDestroy error:", e2, TAG);
        }
        this.mTaskServiceConnection.unInitialize();
        super.onDestroy();
        SettingsConfigNext.a.p(this.mSettingsConfigListener);
        try {
            getSupportFragmentManager().removeOnBackStackChangedListener(this.mOnBackStackChangedListener);
        } catch (Throwable th) {
            com.prolificinteractive.materialcalendarview.r.J(th);
        }
        PreferenceReceiver preferenceReceiver = this.mPreferenceReceiver;
        if (preferenceReceiver != null) {
            unregisterReceiver(preferenceReceiver);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.bytedance.android.input.r.j.m(TAG, "onNewIntent");
        setIntent(intent);
        if (intent != null) {
            handleIntent(intent);
            handleFragmentIntent(intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.android.input.r.j.m(TAG, "onPause");
        com.bytedance.android.input.s.d.b();
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        InitPeriod initPeriod = InitPeriod.MAIN_ONRESUME2SUPER;
        InitScheduler.onPeriodStart(initPeriod);
        InitScheduler.onPeriodEnd(initPeriod);
        super.onResume();
        InitPeriod initPeriod2 = InitPeriod.MAIN_SUPER2ONRESUMEEND;
        InitScheduler.onPeriodStart(initPeriod2);
        InitScheduler.onPeriodEnd(initPeriod2);
        com.bytedance.android.input.r.j.m(TAG, "onResume");
        reportSettingsViewEvent();
        com.bytedance.android.input.s.d.a();
        updateUI();
        com.bytedance.android.input.keyboard.q qVar = com.bytedance.android.input.keyboard.q.a;
        Context applicationContext = getApplicationContext();
        kotlin.s.c.l.e(applicationContext, "applicationContext");
        if (!com.bytedance.android.input.keyboard.q.a(applicationContext)) {
            boolean g2 = com.bytedance.android.input.common.u.c.g(getApplicationContext());
            boolean h = com.bytedance.android.input.common.u.c.h(getApplicationContext());
            if (g2 && h) {
                handleNotificationPermission();
                return;
            }
            Intent intent = new Intent(this, (Class<?>) ImeGuideActivity.class);
            intent.addFlags(536870912);
            startActivity(intent);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - sLastPrivacyLaunchUptimeMs;
        Log.i(TAG, "Privacystatement windows show timeInterval: " + currentTimeMillis);
        if (currentTimeMillis < 2000) {
            this.mMainHandler.postDelayed(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.D
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsActivityNext.onResume$lambda$5(SettingsActivityNext.this);
                }
            }, 1000L);
            return;
        }
        Context applicationContext2 = getApplicationContext();
        kotlin.s.c.l.e(applicationContext2, "applicationContext");
        com.bytedance.android.input.keyboard.q.c(applicationContext2, 0, false, 6);
        sLastPrivacyLaunchUptimeMs = System.currentTimeMillis();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.mMainFragment.isVisible()) {
            com.bytedance.android.input.r.j.i(TAG, "onWindowFocusChanged: true");
            this.mMainFragment.t();
        }
    }

    public final void openWebFragment(String str, String str2) {
        kotlin.s.c.l.f(str, "url");
        kotlin.s.c.l.f(str2, "title");
        Intent intent = new Intent(this, (Class<?>) WebviewActivity.class);
        intent.putExtra("extra_url", str);
        intent.putExtra("extra_title", str2);
        startActivity(intent);
    }

    public final void retryDownloadOfflineModel() {
        this.mTaskServiceConnection.postTask(SettingsActivityNext$retryDownloadOfflineModel$1.INSTANCE);
    }

    public final void settingsActivityActive() {
        this.mTaskServiceConnection.postTask(SettingsActivityNext$settingsActivityActive$1.INSTANCE);
    }

    public final void settingsFragmentActive(int i, boolean z) {
        this.mTaskServiceConnection.postTask(new SettingsActivityNext$settingsFragmentActive$1(i, z));
    }

    public final void switchFragment(FragmentType fragmentType, Bundle bundle) {
        kotlin.s.c.l.f(fragmentType, "fragmentType");
        switch (fragmentType) {
            case MAIN:
                switchFragment(this.mMainFragment);
                break;
            case FUZZY:
                switchFragment(this.mFuzzyFragment);
                break;
            case VOICE_INPUT:
                switchFragment(this.mVoiceInputFragment);
                break;
            case KEY_FEEDBACK:
                switchFragment(this.mKeyFeedbackFragment);
                break;
            case KEY_AUXILIARY_INPUT:
                switchFragment(this.mKeyAuxiliaryInputFragment);
                break;
            case INPUT_MODE:
                switchFragment(this.mInputModeFragment);
                break;
            case AI_CHAT_ASSISTANT:
                com.bytedance.android.input.r.j.i(TAG, "click ai chat assistant settings");
                if (!getInstalledAppListAndCheck()) {
                    com.bytedance.android.input.r.j.j(TAG, "not install wechat and qq");
                    Toast.makeText(this, "只支持在微信和QQ应用中设置", 0).show();
                    break;
                } else {
                    com.bytedance.android.input.r.j.i(TAG, "installed wechat or qq, can enter");
                    switchFragment(this.mAiChatAssistantFragment);
                    break;
                }
            case DEBUG_SETTINGS:
                Fragment mDebugSettingsFragment = getMDebugSettingsFragment();
                if (mDebugSettingsFragment != null) {
                    switchFragment(mDebugSettingsFragment);
                    break;
                }
                break;
            case ABOUT:
                switchFragment(this.mAboutFragment);
                break;
            case KBD_LAYOUT:
                switchFragment(this.mKbdLayoutFragment);
                break;
            case CLIPBOARD:
                switchFragment(this.mClipboardFragment);
                break;
            case LEXICON_MANAGEMENT:
                switchFragment(this.mLexiconManagementFragment);
                break;
            case SYSTEM_PERMISSION:
                switchFragment(this.mSystemPermissionFragment);
                break;
            case DESKTOP:
                IAppLog.a.i("setting_pc_click");
                switchFragment(this.mDesktopFragment);
                break;
            case OFFLINE_DOWNLOAD:
                switchFragment(this.mVoiceInputOfflineDownloadFragment);
                break;
            case INPUT_RECOMMEND:
                switchFragment(this.mInputRecommendFragment);
                break;
            case SMART_INPUT:
                switchFragment(this.mSmartInputSettingsFragment);
                break;
            case MESSAGE_CENTER:
                switchFragment(this.mMessageCenterFragment);
                break;
            case CUSTOM_SYMBOL:
                this.mCustomSymbolFragment.setArguments(bundle);
                switchFragment(this.mCustomSymbolFragment);
                break;
            case MULTIPLE_INPUT_TYPE:
                this.mMultipleInputTypeFragment.setArguments(bundle);
                switchFragment(this.mMultipleInputTypeFragment);
                break;
            case DOUBLE_SPELL_PAGE:
                switchFragment(this.mDoubleSpellFragment);
                break;
            case VOICE_INPUT_ACTION:
                switchFragment(this.mVoiceInputActionFragment);
                break;
        }
    }

    private final void switchFragment(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.s.c.l.e(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.setCustomAnimations(C0838R.anim.slide_in, C0838R.anim.fade_out, C0838R.anim.fade_in, C0838R.anim.slide_out);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0838R.id.settings_layout_content);
        if (findFragmentById != null) {
            beginTransaction.hide(findFragmentById);
        }
        if (fragment.isAdded()) {
            beginTransaction.show(fragment);
        } else {
            beginTransaction.add(C0838R.id.settings_layout_content, fragment);
        }
        beginTransaction.addToBackStack(null);
        beginTransaction.commit();
    }
}
