package com.bytedance.android.input.common;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.bytedance.android.input.speech.x;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class e extends Thread {
    private static e a = null;
    private static String b = "";

    public static boolean a(boolean z) {
        com.bytedance.android.input.r.j.m("UpdateContactsThread", "[ImeContacts] checkChange: forceRead=" + z);
        IEnvironment.a aVar = IEnvironment.a;
        Objects.requireNonNull(aVar);
        if (!aVar.c() || KeyboardJni.getService() == null) {
            return false;
        }
        if (!d.a(KeyboardJni.getService())) {
            com.bytedance.android.input.r.j.m("UpdateContactsThread", "checkChange: no permissions");
            return false;
        }
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        if (!((Boolean) SettingsConfigNext.f(aVar2.getContext().getString(C0838R.string.enable_update_contacts))).booleanValue()) {
            com.bytedance.android.input.r.j.m("UpdateContactsThread", "[ImeContacts]  checkChange: no enable");
            return false;
        }
        if (z) {
            b();
            return true;
        }
        if (b.isEmpty()) {
            Objects.requireNonNull(aVar2);
            if (System.currentTimeMillis() - aVar2.o().getLong("update_contacts_flags_last_read_timestamp", 0L) > 14400000) {
                b();
                return true;
            }
        }
        return false;
    }

    private static synchronized void b() {
        synchronized (e.class) {
            if (a != null) {
                com.bytedance.android.input.r.j.j("UpdateContactsThread", "createReadThread: Unneeded thread reentry");
                return;
            }
            e eVar = new e();
            a = eVar;
            eVar.start();
        }
    }

    public static void c() {
        com.bytedance.android.input.r.j.m("UpdateContactsThread", "[ImeContacts] resetReadState");
        b = "";
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.o().edit().putString("update_contacts_flags_read_data_md5", "").apply();
        KeyboardJni.getKeyboardJni().contactDictBatchClear();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.o().edit().putLong("update_contacts_flags_last_read_timestamp", System.currentTimeMillis());
        com.bytedance.android.input.r.j.m("UpdateContactsThread", "runUpdateData()");
        long currentTimeMillis = System.currentTimeMillis();
        ContentResolver contentResolver = KeyboardJni.getService().getContentResolver();
        kotlin.s.c.l.f(contentResolver, "contentResolver");
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        Cursor query = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        while (true) {
            if (!(query != null && query.moveToNext())) {
                break;
            }
            query.getString(query.getColumnIndex(DBDefinition.ID));
            String string = query.getString(query.getColumnIndex("display_name"));
            stringBuffer.append(string);
            stringBuffer.append(";");
            arrayList.add(new kotlin.g(string, ""));
            com.bytedance.android.input.r.j.i("ContactsHelper", "name=" + string);
        }
        x xVar = x.a;
        x.g(false, false, arrayList, null);
        if (query != null) {
            query.close();
        }
        String stringBuffer2 = stringBuffer.toString();
        kotlin.s.c.l.e(stringBuffer2, "nameStrJoin.toString()");
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(stringBuffer2.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            b = bigInteger;
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            SharedPreferences o = aVar2.o();
            if (b != o.getString("update_contacts_flags_read_data_md5", "")) {
                o.edit().putString("update_contacts_flags_read_data_md5", b).apply();
                com.bytedance.android.input.r.j.i("UpdateContactsThread", "jni:UpdateContactsData()");
                if (KeyboardJni.getKeyboardJni().syncUpdateContactsData(stringBuffer2)) {
                    KeyboardJni.getKeyboardJni().finishUpdateContactsUIEvent();
                }
            }
            StringBuilder Q = e.a.a.a.a.Q("UpdateContacts: , start=", currentTimeMillis, ", end=");
            Q.append(currentTimeMillis2 - currentTimeMillis);
            Q.append(", cost=");
            Q.append(currentTimeMillis2);
            com.bytedance.android.input.r.j.m("UpdateContactsThread", Q.toString());
            com.bytedance.android.input.r.j.i("UpdateContactsThread", stringBuffer2);
            a = null;
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
