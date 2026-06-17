package com.bytedance.applog.B;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.util.k;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private final com.bytedance.applog.q.c a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, com.bytedance.applog.B.a> f3736c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.applog.B.a[] f3737d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<String> f3738e;

    /* renamed from: f, reason: collision with root package name */
    private int f3739f;

    /* renamed from: g, reason: collision with root package name */
    private int f3740g;
    private int h;
    private int i;

    private class a extends SQLiteOpenHelper {
        private long a;

        a(@Nullable Context context, @Nullable String str, @Nullable SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            this.a = 0L;
            File databasePath = context.getDatabasePath(str);
            this.a = databasePath != null ? databasePath.length() : 0L;
        }

        public int a() {
            long j = this.a;
            if (j > 0) {
                return Math.toIntExact(j / DownloadConstants.KB);
            }
            return 0;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.beginTransaction();
                Iterator it2 = b.this.f3736c.values().iterator();
                while (it2.hasNext()) {
                    String b = ((com.bytedance.applog.B.a) it2.next()).b();
                    if (b != null) {
                        sQLiteDatabase.execSQL(b);
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onUpgrade(sQLiteDatabase, i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            com.bytedance.applog.w.e k = b.this.k();
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            k.g(5, "onUpgrade: v{} -> v{}", objArr);
            try {
                sQLiteDatabase.beginTransaction();
                Iterator it2 = b.this.f3736c.values().iterator();
                while (it2.hasNext()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((com.bytedance.applog.B.a) it2.next()).n());
                }
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                try {
                    onCreate(sQLiteDatabase);
                } finally {
                }
            }
            onCreate(sQLiteDatabase);
        }
    }

    public b(com.bytedance.applog.q.c cVar, String str) {
        Cursor cursor;
        Throwable th;
        HashMap<String, com.bytedance.applog.B.a> hashMap = new HashMap<>();
        this.f3736c = hashMap;
        com.bytedance.applog.B.a[] g2 = com.bytedance.applog.B.a.g();
        this.f3737d = g2;
        this.f3738e = new HashSet();
        this.f3739f = 0;
        this.f3740g = 0;
        this.h = 0;
        this.i = 0;
        this.b = new a(cVar.l(), str, null, 55);
        this.a = cVar;
        hashMap.put("page", new i());
        hashMap.put("launch", new g());
        hashMap.put("terminate", new j());
        hashMap.put("pack", new h());
        hashMap.put("forward_eventv3", new f());
        for (com.bytedance.applog.B.a aVar : g2) {
            E(aVar);
        }
        this.f3739f = 0;
        this.f3740g = 0;
        this.h = 0;
        this.i = 0;
        Cursor cursor2 = null;
        try {
            try {
                SQLiteDatabase readableDatabase = this.b.getReadableDatabase();
                Iterator it2 = Arrays.asList(NotificationCompat.CATEGORY_EVENT, "eventv3", "event_misc").iterator();
                cursor = null;
                while (it2.hasNext()) {
                    try {
                        try {
                            cursor = readableDatabase.rawQuery("select count(1) from " + ((String) it2.next()), null);
                            if (cursor != null && cursor.moveToFirst()) {
                                this.f3739f += cursor.getInt(0);
                            }
                        } catch (Throwable unused) {
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            k().u(5, "count all events failed", th, new Object[0]);
                            this.a.h().K().q("readPiledUpEventCount failed", th);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return;
                        } catch (Throwable th3) {
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            throw th3;
                        }
                    }
                }
                cursor2 = readableDatabase.rawQuery("select _launch_count, _terminate_count, _event_v1_count, _event_v3_count, _event_misc_count, _impression_count from pack", null);
                if (cursor2 != null) {
                    this.i = cursor2.getCount();
                    while (cursor2.moveToNext()) {
                        this.f3740g += cursor2.getInt(0);
                        this.h += cursor2.getInt(1);
                        int i = this.f3739f + cursor2.getInt(2);
                        this.f3739f = i;
                        int i2 = i + cursor2.getInt(3);
                        this.f3739f = i2;
                        this.f3739f = i2 + cursor2.getInt(4);
                    }
                }
            } catch (Throwable th4) {
                cursor = cursor2;
                th = th4;
            }
            if (cursor2 != null) {
                cursor2.close();
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006a A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:40:0x0065, B:42:0x006a, B:43:0x00a1, B:45:0x00b4, B:46:0x00b7, B:48:0x007a, B:50:0x007e, B:51:0x008e, B:53:0x0092), top: B:39:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4 A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:40:0x0065, B:42:0x006a, B:43:0x00a1, B:45:0x00b4, B:46:0x00b7, B:48:0x007a, B:50:0x007e, B:51:0x008e, B:53:0x0092), top: B:39:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a A[Catch: all -> 0x00dd, TryCatch #1 {all -> 0x00dd, blocks: (B:40:0x0065, B:42:0x006a, B:43:0x00a1, B:45:0x00b4, B:46:0x00b7, B:48:0x007a, B:50:0x007e, B:51:0x008e, B:53:0x0092), top: B:39:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A(int r18, android.database.sqlite.SQLiteDatabase r19, java.lang.String r20, boolean r21, org.json.JSONArray[] r22, long[] r23, com.bytedance.applog.y.b r24) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.B.b.A(int, android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, org.json.JSONArray[], long[], com.bytedance.applog.y.b):int");
    }

    private JSONArray D(g gVar, boolean z, j jVar, i iVar, SQLiteDatabase sQLiteDatabase, com.bytedance.applog.y.b bVar, boolean z2) {
        Cursor cursor;
        String str;
        String str2;
        long j;
        int e2;
        JSONArray jSONArray = new JSONArray();
        if (bVar != null && ((e2 = bVar.e()) == 0 || (-1 != e2 && !z2))) {
            return jSONArray;
        }
        try {
            cursor = sQLiteDatabase.rawQuery(K(gVar.f3732d, z), null);
            try {
                HashMap hashMap = new HashMap(8);
                str = null;
                str2 = null;
                j = 0;
                while (cursor.moveToNext()) {
                    try {
                        iVar.p(cursor);
                        k().g(5, "queryPage: {}", iVar);
                        Integer num = (Integer) hashMap.get(iVar.y);
                        if (!iVar.C()) {
                            hashMap.put(iVar.y, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                            long j2 = iVar.w;
                            j = j2 >= 1000 ? j + j2 : j + 1000;
                            jSONArray.put(iVar.x());
                            if (!TextUtils.isEmpty(iVar.A)) {
                                str = iVar.A;
                                str2 = iVar.f3735g;
                            }
                        } else if (num != null) {
                            Integer valueOf = Integer.valueOf(num.intValue() - 1);
                            if (valueOf.intValue() > 0) {
                                hashMap.put(iVar.y, valueOf);
                            } else {
                                hashMap.remove(iVar.y);
                            }
                        } else {
                            iVar.w = 1000L;
                            j += 1000;
                            jSONArray.put(iVar.x());
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            k().u(5, "query page failed", th, new Object[0]);
                            this.a.h().K().i(StatsCountKeys.QUERY_PAGE_FAILED_COUNT, 1);
                            this.a.h().K().q("query page failed", th);
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                str2 = null;
                j = 0;
                k().u(5, "query page failed", th, new Object[0]);
                this.a.h().K().i(StatsCountKeys.QUERY_PAGE_FAILED_COUNT, 1);
                this.a.h().K().q("query page failed", th);
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        String str3 = str2;
        if (jSONArray.length() > 0) {
            long j3 = j > 1000 ? j : 1000L;
            jVar.o();
            jVar.m = this.a.h().k();
            jVar.w = j3;
            if (z) {
                jVar.f3732d = gVar.f3732d;
                jVar.u(gVar.b);
            } else {
                jVar.f3732d = UUID.randomUUID().toString();
                jVar.u(0L);
            }
            this.a.q().b(jVar, gVar.f3733e);
            jVar.f3735g = gVar.f3735g;
            jVar.x = jVar.b + j3;
            jVar.f3731c = this.a.q().k();
            jVar.y = null;
            if (!TextUtils.isEmpty(gVar.z)) {
                jVar.y = gVar.z;
            } else if (!TextUtils.isEmpty(str)) {
                jVar.y = str;
                jVar.f3735g = str3;
            }
            jVar.s = com.bytedance.android.input.k.b.a.S(this.a.h().K(), jVar);
            this.a.h().K().i(StatsCountKeys.COLLECT_TERMINATE_COUNT, 1);
            if (jVar.s > 0) {
                com.bytedance.android.input.k.b.a.H0(this.a.h().K(), EventStage.COLLECTED, jVar);
            }
            try {
                this.a.h().Q().c(-1L, jVar.f3732d, jVar.x());
            } catch (Throwable th4) {
                k().u(5, "notify session terminate failed", th4, new Object[0]);
                this.a.h().K().q("notify onSessionTerminate failed", th4);
            }
            int i = com.bytedance.applog.w.j.a;
        }
        return jSONArray;
    }

    private void E(com.bytedance.applog.B.a aVar) {
        this.f3736c.put(aVar.n(), aVar);
    }

    private void H(h hVar, SQLiteDatabase sQLiteDatabase, int i) {
        if (0 != 0) {
            try {
                sQLiteDatabase.beginTransaction();
            } catch (Throwable th) {
                try {
                    k().g(5, "delete pack data failed", th);
                    this.a.h().K().i(StatsCountKeys.DB_ERROR_COUNT, 1);
                    this.a.h().K().q("saveAndDeleteDataFromPriorityPack " + i + " failed", th);
                    if (!r0) {
                        return;
                    }
                } finally {
                    if (0 != 0) {
                        k.d(sQLiteDatabase);
                    }
                }
            }
        }
        Iterator it2 = ((ArrayList) N(hVar)).iterator();
        while (it2.hasNext()) {
            r(sQLiteDatabase, (h) it2.next(), false);
        }
        long j = hVar.B;
        if (j > 0) {
            sQLiteDatabase.execSQL(h("eventv3", j, i));
        }
        if (0 != 0) {
            sQLiteDatabase.setTransactionSuccessful();
        }
        if (0 == 0) {
        }
    }

    private String I(com.bytedance.applog.B.a aVar, String str, boolean z, int i, com.bytedance.applog.y.b bVar) {
        StringBuilder sb = new StringBuilder(e.a.a.a.a.K(e.a.a.a.a.M("SELECT * FROM "), aVar.n(), " WHERE ", "session_id"));
        if (z) {
            sb.append("='");
        } else {
            sb.append("!='");
        }
        sb.append(str);
        if (bVar != null) {
            int e2 = bVar.e();
            if (-1 == e2) {
                StringBuilder P = e.a.a.a.a.P("' AND (priority=", e2, " OR ", RemoteMessageConst.Notification.PRIORITY, ">");
                P.append(bVar.d());
                P.append(")");
                sb.append(P.toString());
            } else {
                sb.append("' AND priority=" + e2);
            }
        } else {
            sb.append("'");
        }
        sb.append(" ORDER BY _id LIMIT " + i);
        return sb.toString();
    }

    private String J(int i, com.bytedance.applog.y.b bVar) {
        StringBuilder sb = new StringBuilder("SELECT * FROM pack");
        if (bVar != null) {
            int e2 = bVar.e();
            if (-1 == e2) {
                StringBuilder P = e.a.a.a.a.P(" WHERE priority=", e2, " OR ", RemoteMessageConst.Notification.PRIORITY, ">");
                P.append(bVar.d());
                sb.append(P.toString());
            } else {
                sb.append(" WHERE priority=" + e2);
            }
        }
        sb.append(" ORDER BY _id DESC LIMIT " + i);
        return sb.toString();
    }

    private String K(String str, boolean z) {
        StringBuilder M = e.a.a.a.a.M("SELECT * FROM page WHERE session_id");
        e.a.a.a.a.K0(M, z ? "='" : "!='", str, "' ORDER BY ");
        return e.a.a.a.a.K(M, z ? "session_id," : "", "duration", " DESC LIMIT 1000");
    }

    private String L(com.bytedance.applog.B.a aVar, int i, int i2) {
        StringBuilder M = e.a.a.a.a.M("SELECT * FROM ");
        e.a.a.a.a.M0(M, aVar.n(), " WHERE ", RemoteMessageConst.Notification.PRIORITY, ContainerUtils.KEY_VALUE_DELIMITER);
        M.append(i2);
        M.append(" ORDER BY ");
        M.append(DBDefinition.ID);
        M.append(" LIMIT ");
        M.append(i);
        return M.toString();
    }

    private List<h> N(h hVar) {
        ArrayList arrayList = new ArrayList();
        if (this.a.h().Z()) {
            Objects.requireNonNull(this.a.h());
        }
        arrayList.add(hVar);
        if (!(this.a.k().w() > 0)) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.addAll(((h) it2.next()).M(this.a.k().w()));
        }
        return arrayList2;
    }

    private void O() {
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(null);
            if (i <= 0 || i > 8388608) {
                return;
            }
            declaredField.setInt(null, i * 2);
        } catch (Throwable th) {
            k().u(5, "tryIncreaseCursorWindowSize", th, new Object[0]);
        }
    }

    private JSONObject d(g gVar, JSONObject jSONObject) {
        if (TextUtils.equals(gVar.x, this.a.n().i()) && gVar.w == this.a.n().h()) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            k.b(jSONObject2, jSONObject);
            jSONObject2.put("app_version", gVar.x);
            jSONObject2.put("version_code", gVar.w);
            return jSONObject2;
        } catch (JSONException e2) {
            k().u(5, "check version failed", e2, new Object[0]);
            return jSONObject;
        }
    }

    private void f(SQLiteDatabase sQLiteDatabase, HashMap<String, JSONObject> hashMap) {
        g gVar = (g) this.f3736c.get("launch");
        if (gVar == null) {
            return;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT * FROM launch ORDER BY _id DESC LIMIT 3", null);
            for (boolean moveToLast = cursor.moveToLast(); moveToLast; moveToLast = cursor.moveToPrevious()) {
                gVar.p(cursor);
                JSONObject jSONObject = new JSONObject();
                try {
                    this.a.h().Q().a(gVar.a, gVar.f3732d, jSONObject);
                } catch (Throwable th) {
                    k().g(5, "onSessionBatchEvent failed", th);
                    this.a.h().K().q("collectImpression onSessionBatchEvent failed", th);
                }
                hashMap.put(gVar.f3732d, jSONObject);
            }
            try {
                cursor.close();
            } catch (Throwable th2) {
                k().g(5, "close cursor failed", th2);
            }
        } catch (Throwable th3) {
            try {
                k().g(5, "collect impression failed", th3);
                this.a.h().K().i(StatsCountKeys.COLLECT_IMPRESSION_ERROR_COUNT, 1);
                this.a.h().K().q("collectImpression failed", th3);
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th4) {
                        k().g(5, "close cursor failed", th4);
                    }
                }
            } catch (Throwable th5) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th6) {
                        k().g(5, "close cursor failed", th6);
                    }
                }
                throw th5;
            }
        }
    }

    private String g(String str, String str2, boolean z, long j, com.bytedance.applog.y.b bVar) {
        StringBuilder sb = new StringBuilder(e.a.a.a.a.u("DELETE FROM ", str, " WHERE ", "session_id"));
        if (z) {
            sb.append("='");
        } else {
            sb.append("!='");
        }
        sb.append(str2 + "' AND " + DBDefinition.ID + "<=" + j);
        if (bVar != null) {
            int e2 = bVar.e();
            if (-1 == e2) {
                StringBuilder P = e.a.a.a.a.P(" AND (priority=", e2, " OR ", RemoteMessageConst.Notification.PRIORITY, ">");
                P.append(bVar.d());
                P.append(")");
                sb.append(P.toString());
            } else {
                sb.append(" AND priority=" + e2);
            }
        }
        return sb.toString();
    }

    private String h(String str, long j, int i) {
        StringBuilder W = e.a.a.a.a.W("DELETE FROM ", str, " WHERE ", DBDefinition.ID, "<=");
        W.append(j);
        W.append(" AND ");
        W.append(RemoteMessageConst.Notification.PRIORITY);
        W.append(ContainerUtils.KEY_VALUE_DELIMITER);
        W.append(i);
        return W.toString();
    }

    private JSONArray j(String str, HashMap<String, JSONObject> hashMap) {
        JSONArray optJSONArray;
        JSONObject remove = hashMap.remove(str);
        JSONArray jSONArray = null;
        if (remove != null && ((optJSONArray = remove.optJSONArray("item_impression")) == null || optJSONArray.length() != 0)) {
            jSONArray = optJSONArray;
        }
        if (com.bytedance.applog.util.f.b(this.a.h().k()) && jSONArray != null) {
            com.bytedance.applog.util.f.c(this.a.h().k(), "item_impression", jSONArray);
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.applog.w.e k() {
        return this.a.h().I();
    }

    private boolean q(long[] jArr) {
        return jArr[0] > 0 || jArr[1] > 0 || jArr[2] > 0;
    }

    private void r(SQLiteDatabase sQLiteDatabase, h hVar, boolean z) {
        JSONArray jSONArray;
        if (hVar.I()) {
            k().r(5, "no need insert to db for empty pack: {}, matchSid: {}", hVar, Boolean.valueOf(z));
            return;
        }
        if (this.a.h().K().o()) {
            Iterator it2 = ((ArrayList) hVar.D()).iterator();
            while (it2.hasNext()) {
                com.bytedance.android.input.k.b.a.G0(this.a.h().K(), EventStage.PACK_INSERT_START, (com.bytedance.applog.monitor.v3.g) it2.next());
            }
        }
        long insert = sQLiteDatabase.insert("pack", null, hVar.y(null));
        if (insert < 0) {
            g gVar = hVar.C;
            if (gVar != null) {
                this.f3738e.remove(gVar.f3732d);
            }
            hVar.J();
            k().p(5, "insert to db failed, pack: {}, result: {}", hVar, Long.valueOf(insert));
            this.a.h().K().i(StatsCountKeys.INSERT_PACK_FAILED_COUNT, 1);
            this.a.h().K().q("pack insert failed for db id < 0", null);
            throw new SQLiteException("insert pack to db failed for result id < 0.");
        }
        if (this.a.h().K().o()) {
            Iterator it3 = ((ArrayList) hVar.D()).iterator();
            while (it3.hasNext()) {
                com.bytedance.android.input.k.b.a.G0(this.a.h().K(), EventStage.PACK_INSERT_END, (com.bytedance.applog.monitor.v3.g) it3.next());
            }
        }
        hVar.a = insert;
        k().c(5, "pack: {} insert to db success!", hVar, Long.valueOf(insert));
        if (hVar.E == null || (jSONArray = hVar.D) == null || jSONArray.length() <= 0) {
            return;
        }
        String str = hVar.f3732d;
        StringBuilder M = e.a.a.a.a.M("DELETE FROM page WHERE session_id");
        M.append(z ? "='" : "!='");
        M.append(str);
        M.append("'");
        sQLiteDatabase.execSQL(M.toString());
    }

    private boolean s(String str) {
        boolean z;
        if (this.f3738e.contains(str)) {
            z = false;
        } else {
            this.f3738e.add(str);
            z = true;
        }
        k().g(5, "session id:{} needLaunch:{}", str, Boolean.valueOf(z));
        return z;
    }

    private void w(JSONObject jSONObject, g gVar, h hVar, SQLiteDatabase sQLiteDatabase, JSONArray[] jSONArrayArr, long[] jArr, HashMap<String, JSONObject> hashMap, com.bytedance.applog.y.b bVar, int i) {
        boolean z;
        com.bytedance.applog.y.b bVar2;
        long[] jArr2;
        SQLiteDatabase sQLiteDatabase2;
        h hVar2;
        boolean z2;
        com.bytedance.applog.y.b bVar3;
        h hVar3;
        SQLiteDatabase sQLiteDatabase3;
        k().g(5, "packCurrentData sid:{}", gVar.f3732d);
        int A = A(0, sQLiteDatabase, gVar.f3732d, true, jSONArrayArr, jArr, bVar);
        boolean s = s(gVar.f3732d);
        JSONArray j = j(gVar.f3732d, hashMap);
        if (s || q(jArr) || j != null) {
            z = true;
            bVar2 = bVar;
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase;
            hVar2 = hVar;
            hVar.L(this.a.h().k(), jSONObject, s ? gVar : null, null, null, jSONArrayArr, jArr, j, bVar, i);
            G(hVar2, true, sQLiteDatabase2, bVar2);
        } else {
            z = true;
            bVar2 = bVar;
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase;
            hVar2 = hVar;
        }
        int i2 = A;
        while (i2 < this.f3737d.length) {
            SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase2;
            h hVar4 = hVar2;
            com.bytedance.applog.y.b bVar4 = bVar2;
            boolean z3 = z;
            i2 = A(i2, sQLiteDatabase, gVar.f3732d, true, jSONArrayArr, jArr, bVar);
            if (q(jArr2)) {
                z2 = z3;
                bVar3 = bVar4;
                hVar3 = hVar4;
                sQLiteDatabase3 = sQLiteDatabase4;
                hVar.L(this.a.h().k(), jSONObject, null, null, null, jSONArrayArr, jArr, null, bVar, i);
                G(hVar3, z2, sQLiteDatabase3, bVar3);
            } else {
                z2 = z3;
                bVar3 = bVar4;
                hVar3 = hVar4;
                sQLiteDatabase3 = sQLiteDatabase4;
            }
            bVar2 = bVar3;
            z = z2;
            jArr2 = jArr;
            SQLiteDatabase sQLiteDatabase5 = sQLiteDatabase3;
            hVar2 = hVar3;
            sQLiteDatabase2 = sQLiteDatabase5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x(org.json.JSONObject r22, com.bytedance.applog.B.g r23, com.bytedance.applog.B.h r24, com.bytedance.applog.B.i r25, com.bytedance.applog.B.j r26, android.database.sqlite.SQLiteDatabase r27, org.json.JSONArray[] r28, long[] r29, java.util.HashMap<java.lang.String, org.json.JSONObject> r30, com.bytedance.applog.y.b r31, int r32) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.B.b.x(org.json.JSONObject, com.bytedance.applog.B.g, com.bytedance.applog.B.h, com.bytedance.applog.B.i, com.bytedance.applog.B.j, android.database.sqlite.SQLiteDatabase, org.json.JSONArray[], long[], java.util.HashMap, com.bytedance.applog.y.b, int):void");
    }

    private void y(JSONObject jSONObject, g gVar, j jVar, i iVar, h hVar, SQLiteDatabase sQLiteDatabase, String str, JSONArray[] jSONArrayArr, long[] jArr, com.bytedance.applog.y.b bVar, int i) {
        com.bytedance.applog.y.b bVar2;
        long[] jArr2;
        SQLiteDatabase sQLiteDatabase2;
        h hVar2;
        boolean z;
        com.bytedance.applog.y.b bVar3;
        SQLiteDatabase sQLiteDatabase3;
        h hVar3;
        boolean z2;
        k().g(5, "packLostData exclude sid:{}", str);
        gVar.f3732d = str;
        hVar.f3732d = str;
        int A = A(0, sQLiteDatabase, str, false, jSONArrayArr, jArr, bVar);
        JSONArray D = D(gVar, false, jVar, iVar, sQLiteDatabase, bVar, q(jArr));
        gVar.y = !(D.length() > 0);
        if (q(jArr) || !gVar.y) {
            String k = this.a.h().k();
            boolean z3 = gVar.y;
            j jVar2 = !z3 ? jVar : null;
            if (z3) {
                D = null;
            }
            bVar2 = bVar;
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase;
            hVar2 = hVar;
            hVar.L(k, jSONObject, null, jVar2, D, jSONArrayArr, jArr, null, bVar, i);
            z = false;
            G(hVar2, false, sQLiteDatabase2, bVar2);
        } else {
            bVar2 = bVar;
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase;
            hVar2 = hVar;
            z = false;
        }
        int i2 = A;
        while (i2 < this.f3737d.length) {
            h hVar4 = hVar2;
            SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase2;
            com.bytedance.applog.y.b bVar4 = bVar2;
            i2 = A(i2, sQLiteDatabase, str, false, jSONArrayArr, jArr, bVar);
            if (q(jArr2)) {
                bVar3 = bVar4;
                sQLiteDatabase3 = sQLiteDatabase4;
                hVar3 = hVar4;
                z2 = z;
                hVar.L(this.a.h().k(), jSONObject, null, null, null, jSONArrayArr, jArr, null, bVar, i);
                G(hVar3, z2, sQLiteDatabase3, bVar3);
            } else {
                bVar3 = bVar4;
                sQLiteDatabase3 = sQLiteDatabase4;
                hVar3 = hVar4;
                z2 = z;
            }
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase3;
            z = z2;
            bVar2 = bVar3;
            hVar2 = hVar3;
        }
    }

    private void z(SQLiteDatabase sQLiteDatabase, JSONArray[] jSONArrayArr, long[] jArr, int i) {
        com.bytedance.applog.B.a aVar = this.f3737d[1];
        JSONArray jSONArray = new JSONArray();
        Cursor cursor = null;
        long j = 0;
        try {
            cursor = sQLiteDatabase.rawQuery(L(aVar, 200, i), null);
            for (int i2 = 0; cursor.moveToNext() && i2 <= 200; i2++) {
                aVar.p(cursor);
                jSONArray.put(aVar.x());
                long j2 = aVar.a;
                if (j2 > j) {
                    j = j2;
                }
            }
        } catch (Throwable th) {
            try {
                if (aVar instanceof e) {
                    this.a.h().K().i(StatsCountKeys.QUERY_EVENT_V3_FAILED_COUNT, 1);
                } else if (aVar instanceof c) {
                    this.a.h().K().i(StatsCountKeys.QUERY_EVENT_V1_FAILED_COUNT, 1);
                } else if (aVar instanceof d) {
                    this.a.h().K().i(StatsCountKeys.QUERY_EVENT_MISC_FAILED_COUNT, 1);
                }
                this.a.h().K().q("queryEventByPriority failed", th);
                if (th instanceof SQLiteBlobTooBigException) {
                    O();
                }
                k().u(5, "query event failed", th, new Object[0]);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        jSONArrayArr[1] = jSONArray;
        jArr[1] = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.bytedance.applog.B.f> B() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            r1 = 0
            com.bytedance.applog.B.b$a r2 = r7.b     // Catch: java.lang.Throwable -> L25
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "SELECT * FROM forward_eventv3 ORDER BY _id ASC LIMIT 1000"
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch: java.lang.Throwable -> L25
        L13:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L44
            com.bytedance.applog.B.f r2 = new com.bytedance.applog.B.f     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            r2.p(r1)     // Catch: java.lang.Throwable -> L25
            r0.add(r2)     // Catch: java.lang.Throwable -> L25
            goto L13
        L25:
            r2 = move-exception
            com.bytedance.applog.w.e r3 = r7.k()     // Catch: java.lang.Throwable -> L49
            r4 = 5
            java.lang.String r5 = "pack forward events failed"
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L49
            r3.u(r4, r5, r2, r6)     // Catch: java.lang.Throwable -> L49
            com.bytedance.applog.q.c r3 = r7.a     // Catch: java.lang.Throwable -> L49
            com.bytedance.applog.c r3 = r3.h()     // Catch: java.lang.Throwable -> L49
            com.bytedance.applog.monitor.v3.e r3 = r3.K()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "queryForwardEvents failed"
            r3.q(r4, r2)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L47
        L44:
            r1.close()     // Catch: java.lang.Throwable -> L47
        L47:
            monitor-exit(r7)
            return r0
        L49:
            r0 = move-exception
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            throw r0     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.B.b.B():java.util.List");
    }

    @NonNull
    public ArrayList<h> C(int i, com.bytedance.applog.y.b bVar) {
        h hVar = (h) this.f3736c.get("pack");
        Cursor cursor = null;
        try {
            cursor = this.b.getWritableDatabase().rawQuery(J(i, bVar), null);
            ArrayList<h> arrayList = new ArrayList<>();
            while (cursor.moveToNext()) {
                hVar = (h) hVar.clone();
                hVar.p(cursor);
                arrayList.add(hVar);
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                boolean z = th instanceof SQLiteBlobTooBigException;
                k().u(5, "query pack failed", th, new Object[0]);
                this.a.h().K().i(StatsCountKeys.DB_ERROR_COUNT, 1);
                this.a.h().K().q("query pack failed", th);
                if (z) {
                    O();
                }
                return new ArrayList<>();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    public void F(@NonNull ArrayList<com.bytedance.applog.B.a> arrayList) {
        ArrayList arrayList2 = new ArrayList(4);
        ArrayList arrayList3 = new ArrayList(4);
        ArrayList arrayList4 = new ArrayList(4);
        try {
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            Iterator<com.bytedance.applog.B.a> it2 = arrayList.iterator();
            ContentValues contentValues = null;
            while (it2.hasNext()) {
                com.bytedance.applog.B.a next = it2.next();
                if (TextUtils.isEmpty(next.m)) {
                    next.m = this.a.h().k();
                }
                if (next.s > 0) {
                    com.bytedance.android.input.k.b.a.H0(this.a.h().K(), EventStage.DB_INSERT_START, next);
                }
                String n = next.n();
                contentValues = next.y(contentValues);
                long insert = writableDatabase.insert(n, null, contentValues);
                next.a = insert;
                boolean z = insert >= 0;
                if (next.s > 0) {
                    com.bytedance.android.input.k.b.a.H0(this.a.h().K(), z ? EventStage.DB_SAVE_END : EventStage.DB_SAVE_FAILED, next);
                }
                if (!z) {
                    this.a.h().K().i(StatsCountKeys.DB_ERROR_COUNT, 1);
                }
                if (next instanceof c) {
                    arrayList3.add(next);
                    if (!z) {
                        this.a.h().K().i(StatsCountKeys.INSERT_EVENT_V1_FAILED_COUNT, 1);
                    }
                } else if (next instanceof e) {
                    arrayList3.add(next);
                    if (!z) {
                        this.a.h().K().i(StatsCountKeys.INSERT_EVENT_V3_FAILED_COUNT, 1);
                    }
                } else if (next instanceof d) {
                    arrayList3.add(next);
                    if (!z) {
                        this.a.h().K().i(StatsCountKeys.INSERT_EVENT_MISC_FAILED_COUNT, 1);
                    }
                } else if (next instanceof g) {
                    arrayList2.add((g) next);
                    if (!z) {
                        this.a.h().K().i(StatsCountKeys.INSERT_SESSION_FAILED_COUNT, 1);
                    }
                } else if (next instanceof j) {
                    arrayList4.add((j) next);
                    if (!z) {
                        this.a.h().K().i(StatsCountKeys.INSERT_SESSION_FAILED_COUNT, 1);
                    }
                } else if ((next instanceof i) && !z) {
                    this.a.h().K().i(StatsCountKeys.INSERT_PAGE_FAILED_COUNT, 1);
                }
            }
            int i = com.bytedance.applog.w.j.a;
        } catch (Throwable th) {
            k().u(5, "save db failed", th, new Object[0]);
            this.a.h().K().i(StatsCountKeys.DB_ERROR_COUNT, 1);
            this.a.h().K().q("save base data list failed", th);
        }
        t(arrayList3);
        try {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                g gVar = (g) it3.next();
                this.a.h().Q().b(gVar.a, gVar.f3732d);
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                j jVar = (j) it4.next();
                this.a.h().Q().c(jVar.a, jVar.f3732d, jVar.x());
            }
        } catch (Throwable th2) {
            k().u(5, "onSessionStart failed", th2, new Object[0]);
            this.a.h().K().q("notify onSessionStart or onSessionTerminate failed", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(com.bytedance.applog.B.h r17, boolean r18, android.database.sqlite.SQLiteDatabase r19, com.bytedance.applog.y.b r20) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r9 = 0
            r10 = 1
            if (r19 != 0) goto L17
            com.bytedance.applog.B.b$a r1 = r8.b     // Catch: java.lang.Throwable -> L11
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L11
            r11 = r1
            r12 = r10
            goto L1a
        L11:
            r0 = move-exception
            r11 = r19
            r12 = r9
            goto L90
        L17:
            r11 = r19
            r12 = r9
        L1a:
            if (r12 == 0) goto L1f
            r11.beginTransaction()     // Catch: java.lang.Throwable -> L8f
        L1f:
            java.util.List r1 = r16.N(r17)     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L8f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8f
        L29:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8f
            com.bytedance.applog.B.h r2 = (com.bytedance.applog.B.h) r2     // Catch: java.lang.Throwable -> L8f
            r13 = r18
            r8.r(r11, r2, r13)     // Catch: java.lang.Throwable -> L8f
            goto L29
        L3b:
            r13 = r18
            long r5 = r0.z     // Catch: java.lang.Throwable -> L8f
            r14 = 0
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 <= 0) goto L56
            java.lang.String r2 = "event"
            java.lang.String r3 = r0.f3732d     // Catch: java.lang.Throwable -> L8f
            r1 = r16
            r4 = r18
            r7 = r20
            java.lang.String r1 = r1.g(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L8f
            r11.execSQL(r1)     // Catch: java.lang.Throwable -> L8f
        L56:
            long r5 = r0.B     // Catch: java.lang.Throwable -> L8f
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 <= 0) goto L6d
            java.lang.String r2 = "eventv3"
            java.lang.String r3 = r0.f3732d     // Catch: java.lang.Throwable -> L8f
            r1 = r16
            r4 = r18
            r7 = r20
            java.lang.String r1 = r1.g(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L8f
            r11.execSQL(r1)     // Catch: java.lang.Throwable -> L8f
        L6d:
            long r5 = r0.M     // Catch: java.lang.Throwable -> L8f
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 <= 0) goto L84
            java.lang.String r2 = "event_misc"
            java.lang.String r3 = r0.f3732d     // Catch: java.lang.Throwable -> L8f
            r1 = r16
            r4 = r18
            r7 = r20
            java.lang.String r0 = r1.g(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L8f
            r11.execSQL(r0)     // Catch: java.lang.Throwable -> L8f
        L84:
            if (r12 == 0) goto L89
            r11.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L8f
        L89:
            if (r12 == 0) goto Lbf
        L8b:
            com.bytedance.applog.util.k.d(r11)
            goto Lbf
        L8f:
            r0 = move-exception
        L90:
            com.bytedance.applog.w.e r1 = r16.k()     // Catch: java.lang.Throwable -> Lc0
            r2 = 5
            java.lang.String r3 = "delete pack data failed"
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> Lc0
            r4[r9] = r0     // Catch: java.lang.Throwable -> Lc0
            r1.g(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc0
            com.bytedance.applog.q.c r1 = r8.a     // Catch: java.lang.Throwable -> Lc0
            com.bytedance.applog.c r1 = r1.h()     // Catch: java.lang.Throwable -> Lc0
            com.bytedance.applog.monitor.v3.e r1 = r1.K()     // Catch: java.lang.Throwable -> Lc0
            com.bytedance.applog.monitor.v3.StatsCountKeys r2 = com.bytedance.applog.monitor.v3.StatsCountKeys.DB_ERROR_COUNT     // Catch: java.lang.Throwable -> Lc0
            r1.i(r2, r10)     // Catch: java.lang.Throwable -> Lc0
            com.bytedance.applog.q.c r1 = r8.a     // Catch: java.lang.Throwable -> Lc0
            com.bytedance.applog.c r1 = r1.h()     // Catch: java.lang.Throwable -> Lc0
            com.bytedance.applog.monitor.v3.e r1 = r1.K()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "saveAndDeleteDataFromPack failed"
            r1.q(r2, r0)     // Catch: java.lang.Throwable -> Lc0
            if (r12 == 0) goto Lbf
            goto L8b
        Lbf:
            return
        Lc0:
            r0 = move-exception
            if (r12 == 0) goto Lc6
            com.bytedance.applog.util.k.d(r11)
        Lc6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.B.b.G(com.bytedance.applog.B.h, boolean, android.database.sqlite.SQLiteDatabase, com.bytedance.applog.y.b):void");
    }

    public void M(List<h> list, List<h> list2) {
        k().g(5, "setResult: del -> {}, fail -> {}", list, list2);
        Iterator<h> it2 = list2.iterator();
        ArrayList arrayList = new ArrayList();
        com.bytedance.applog.C.b N = this.a.h().N();
        while (it2.hasNext()) {
            h next = it2.next();
            long b = N.b();
            if (b <= 0 || Math.abs(System.currentTimeMillis() - next.b) < b) {
                int a2 = N.a();
                if (a2 >= 0 && next.x >= a2) {
                    list.add(next);
                    arrayList.add(next);
                    it2.remove();
                }
            } else {
                list.add(next);
                arrayList.add(next);
                it2.remove();
            }
        }
        try {
            SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
            for (h hVar : list) {
                int delete = writableDatabase.delete("pack", "_id = ?", new String[]{String.valueOf(hVar.a)});
                if (delete <= 0) {
                    k().p(5, "delete from db failed, pack: {}, rows: {}", hVar, Integer.valueOf(delete));
                    this.a.h().K().i(StatsCountKeys.DB_ERROR_COUNT, 1);
                    this.a.h().G().a("DB_DELETE_LOG_FAILED", "fail delete pack:" + hVar.a);
                    this.a.h().K().q("delete pack failed for zero", null);
                }
            }
            for (h hVar2 : list2) {
                long j = hVar2.a;
                int i = hVar2.x + 1;
                hVar2.x = i;
                writableDatabase.execSQL("UPDATE pack SET _fail=" + i + " WHERE " + DBDefinition.ID + ContainerUtils.KEY_VALUE_DELIMITER + j);
            }
        } catch (Throwable th) {
            k().u(5, "set result failed", th, new Object[0]);
            this.a.h().K().i(StatsCountKeys.DB_ERROR_COUNT, 1);
            this.a.h().G().b("DB_DELETE_LOG_ERROR", th);
            this.a.h().K().q("handle pack send result failed", th);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((h) it3.next()).J();
        }
    }

    public void e() {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        try {
            sQLiteDatabase = this.b.getWritableDatabase();
        } catch (Throwable th2) {
            sQLiteDatabase = null;
            th = th2;
        }
        try {
            sQLiteDatabase.beginTransaction();
            Iterator<com.bytedance.applog.B.a> it2 = this.f3736c.values().iterator();
            while (it2.hasNext()) {
                sQLiteDatabase.delete(it2.next().n(), null, null);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Throwable th3) {
            th = th3;
            try {
                k().u(5, "clear tables failed", th, new Object[0]);
                this.a.h().K().i(StatsCountKeys.DB_ERROR_COUNT, 1);
                this.a.h().K().q("clearAllTables failed", th);
            } finally {
                k.d(sQLiteDatabase);
            }
        }
    }

    public void i(List<f> list) {
        Iterator<f> it2 = list.iterator();
        long j = 0;
        while (it2.hasNext()) {
            long j2 = it2.next().a;
            if (j2 > j) {
                j = j2;
            }
        }
        try {
            this.b.getWritableDatabase().delete("forward_eventv3", "_id <= ?", new String[]{String.valueOf(j)});
        } catch (Throwable th) {
            k().u(5, "delete forward events failed", th, new Object[0]);
            this.a.h().K().q("deleteForwardEvents failed", th);
        }
    }

    public int l() {
        return this.b.a();
    }

    public int m() {
        return this.f3739f;
    }

    public int n() {
        return this.f3740g;
    }

    public int o() {
        return this.i;
    }

    public int p() {
        return this.h;
    }

    public void t(List<com.bytedance.applog.B.a> list) {
        if (this.a.h().w().a(0)) {
            return;
        }
        for (com.bytedance.applog.B.a aVar : list) {
            try {
                if (NotificationCompat.CATEGORY_EVENT.equals(aVar.n())) {
                    c cVar = (c) aVar;
                    this.a.h().w().b(0, cVar.w, cVar.x, cVar.y, cVar.A, cVar.B, cVar.z);
                } else if ("eventv3".equals(aVar.n())) {
                    e eVar = (e) aVar;
                    this.a.h().w().c(0, eVar.y, eVar.w);
                } else if ("event_misc".equals(aVar.n())) {
                    d dVar = (d) aVar;
                    this.a.h().w().d(0, dVar.C(), dVar.j());
                }
            } catch (Throwable th) {
                k().u(5, "notify event observer before store failed", th, new Object[0]);
                this.a.h().K().q("notify event observer failed", th);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:3|4|5|6|7|8|9|(14:11|12|(2:139|140)(1:14)|15|(9:17|18|20|21|22|23|(5:(1:26)(1:69)|27|28|29|30)(3:70|71|72)|(3:35|36|37)(2:32|33)|34)|81|82|83|84|(3:86|(9:89|90|91|92|93|94|95|96|87)|102)|104|105|106|107)|(3:122|123|(9:125|126|127|128|110|115|116|117|45))|109|110|115|116|117|45) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01de, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e0, code lost:
    
        k().u(r14, "close cursor failed", r0, new java.lang.Object[r15]);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void u(org.json.JSONObject r28, com.bytedance.applog.y.b r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.B.b.u(org.json.JSONObject, com.bytedance.applog.y.b, int, boolean):void");
    }

    public synchronized void v(JSONObject jSONObject, com.bytedance.applog.y.b bVar, int i) {
        char c2 = 1;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            JSONArray[] jSONArrayArr = new JSONArray[3];
            long[] jArr = new long[3];
            sQLiteDatabase = this.b.getWritableDatabase();
            sQLiteDatabase.beginTransaction();
            int i2 = 200;
            int i3 = 200;
            while (i3 >= i2) {
                z(sQLiteDatabase, jSONArrayArr, jArr, bVar.e());
                int length = jSONArrayArr[c2].length();
                if (length == 0) {
                    break;
                }
                h hVar = new h();
                hVar.L(this.a.h().k(), jSONObject, null, null, null, jSONArrayArr, jArr, null, bVar, i);
                H(hVar, sQLiteDatabase, bVar.e());
                i3 = length;
                i2 = i2;
                c2 = 1;
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
            } finally {
            }
        }
    }
}
