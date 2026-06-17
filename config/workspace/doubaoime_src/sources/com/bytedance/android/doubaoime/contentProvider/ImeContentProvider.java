package com.bytedance.android.doubaoime.contentProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.common.e;
import com.bytedance.android.input.i.c;
import com.bytedance.android.input.keyboard.ClipboardHistory.v;
import com.bytedance.android.input.r.j;
import java.util.Objects;

/* loaded from: classes.dex */
public class ImeContentProvider extends ContentProvider {
    private static final Handler a = new Handler(Looper.getMainLooper());
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        char c2;
        final int i;
        str.hashCode();
        int i2 = 0;
        r2 = false;
        boolean z = false;
        switch (str.hashCode()) {
            case -2082559714:
                if (str.equals("notifyInitTask")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1419073868:
                if (str.equals("clearContactsHistory")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1048821173:
                if (str.equals("setInputMode")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -160301987:
                if (str.equals("clearUsrDict")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -76108660:
                if (str.equals("isInputViewShown")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 41814712:
                if (str.equals("setPrimaryClipChangedListener")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 209030107:
                if (str.equals("getClipboardHistoryCount")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 756380369:
                if (str.equals("showFeedbackActivity")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1468009099:
                if (str.equals("clearClipboardHistory")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                Bundle bundle2 = new Bundle();
                if (KeyboardJni.getService() != null) {
                    Objects.requireNonNull(KeyboardJni.getService());
                    j.m("ImeService", "notifyInitTask~");
                    com.bytedance.android.input.k.a.a.c();
                }
                bundle2.putBoolean("result", true);
                return bundle2;
            case 1:
                Bundle bundle3 = new Bundle();
                if (KeyboardJni.getService() != null) {
                    Objects.requireNonNull(KeyboardJni.getService());
                    j.m("ImeService", "[ImeContacts] clearContactsHistory~");
                    e.c();
                }
                bundle3.putBoolean("result", true);
                return bundle3;
            case 2:
                Bundle bundle4 = new Bundle();
                i = bundle != null ? bundle.getInt("input_mode", -1) : -1;
                if (i >= 0) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    e.a.a.a.a.j0("[InputModeSync] provider setInputMode schedule inputMode=", i, "ImeContentProvider");
                    a.post(new Runnable() { // from class: com.bytedance.android.doubaoime.contentProvider.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i;
                            long j = elapsedRealtime;
                            int i4 = ImeContentProvider.b;
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            j.i("ImeContentProvider", "[InputModeSync] provider setInputMode begin inputMode=" + i3);
                            KeyboardJni.getKeyboardJni().setInputMode(i3);
                            j.i("ImeContentProvider", "[InputModeSync] provider setInputMode end inputMode=" + i3 + ", mainThreadCostMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + ", totalCostMs=" + (SystemClock.elapsedRealtime() - j));
                        }
                    });
                    bundle4.putBoolean("result", true);
                } else {
                    bundle4.putBoolean("result", false);
                }
                return bundle4;
            case 3:
                Bundle bundle5 = new Bundle();
                if (KeyboardJni.getService() != null) {
                    Objects.requireNonNull(KeyboardJni.getService());
                    j.m("ImeService", "[ImeUserDict] clearUsrDict~");
                    KeyboardJni.getKeyboardJni().ClearUsrDicts();
                }
                bundle5.putBoolean("result", true);
                return bundle5;
            case 4:
                KeyboardJni.getKeyboardJni();
                boolean isInputViewShown = KeyboardJni.getService().isInputViewShown();
                Bundle bundle6 = new Bundle();
                bundle6.putBoolean("result", isInputViewShown);
                return bundle6;
            case 5:
                Bundle bundle7 = new Bundle();
                i = bundle != null ? bundle.getInt(str2, -1) : -1;
                if (i == 1) {
                    if (KeyboardJni.getService() != null) {
                        Objects.requireNonNull(KeyboardJni.getService());
                        j.m("ImeService", "registerClipboard~");
                        c cVar = c.a;
                        c.b();
                    }
                    bundle7.putBoolean("result", true);
                } else if (i == 2) {
                    if (KeyboardJni.getService() != null) {
                        Objects.requireNonNull(KeyboardJni.getService());
                        j.m("ImeService", "unRegisterClipboard~");
                        c cVar2 = c.a;
                        c.j();
                    }
                    bundle7.putBoolean("result", true);
                } else {
                    bundle7.putBoolean("result", false);
                }
                return bundle7;
            case 6:
                Bundle bundle8 = new Bundle();
                if (KeyboardJni.getService() != null) {
                    Objects.requireNonNull(KeyboardJni.getService());
                    j.m("ImeService", "getClipboardHistoryCount~");
                    v vVar = v.a;
                    Objects.requireNonNull(v.d());
                    i2 = KeyboardJni.getKeyboardJni().getClipboardHistoryCount();
                }
                bundle8.putInt("result", i2);
                return bundle8;
            case 7:
                Bundle bundle9 = new Bundle();
                i = bundle != null ? bundle.getInt("type", -1) : -1;
                if (bundle != null && bundle.getBoolean("isFromApp", false)) {
                    z = true;
                }
                if (i >= 0) {
                    KeyboardJni.showFeedbackActivity(i, z);
                }
                bundle9.putBoolean("result", true);
                return bundle9;
            case '\b':
                Bundle bundle10 = new Bundle();
                if (KeyboardJni.getService() != null) {
                    Objects.requireNonNull(KeyboardJni.getService());
                    j.m("ImeService", "clearClipboardHistory~");
                    v vVar2 = v.a;
                    v.d().b();
                }
                bundle10.putBoolean("result", true);
                return bundle10;
            default:
                return super.call(str, str2, bundle);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return "xxxx";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
