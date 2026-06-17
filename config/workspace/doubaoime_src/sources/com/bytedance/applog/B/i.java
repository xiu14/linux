package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i extends a {
    public String A;
    public long w;
    public String x;
    public String y;
    public int z;

    @Override // com.bytedance.applog.B.a
    protected void A(@NonNull JSONObject jSONObject) throws JSONException {
        super.A(jSONObject);
        jSONObject.put("page_key", this.y);
        jSONObject.put("refer_page_key", this.x);
        jSONObject.put("duration", this.w);
        jSONObject.put("is_back", this.z);
    }

    @Override // com.bytedance.applog.B.a
    protected JSONObject B() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.b);
        jSONObject.put("tea_event_index", this.f3731c);
        jSONObject.put("session_id", this.f3732d);
        c(jSONObject);
        if (!TextUtils.isEmpty(this.f3735g)) {
            jSONObject.put("user_unique_id", this.f3735g);
        }
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, "bav2b_page");
        jSONObject.put("is_bav", 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page_key", this.y);
        jSONObject2.put("refer_page_key", this.x);
        jSONObject2.put("is_back", this.z);
        jSONObject2.put("duration", this.w);
        jSONObject.put(com.heytap.mcssdk.constant.b.D, jSONObject2);
        jSONObject.put("datetime", this.n);
        long j = this.q;
        if (j > 0) {
            jSONObject.put("event_id", j);
        }
        return jSONObject;
    }

    public boolean C() {
        return this.w == -1;
    }

    @Override // com.bytedance.applog.B.a
    protected List<String> i() {
        List<String> i = super.i();
        ArrayList arrayList = new ArrayList(i.size());
        arrayList.addAll(i);
        arrayList.addAll(Arrays.asList("page_key", "varchar", "refer_page_key", "varchar", "duration", TypedValues.Custom.S_INT, "is_back", TypedValues.Custom.S_INT, "last_session", "varchar"));
        return arrayList;
    }

    @Override // com.bytedance.applog.B.a
    protected String k() {
        return this.y + ", " + this.w;
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    String n() {
        return "page";
    }

    @Override // com.bytedance.applog.B.a
    public int p(@NonNull Cursor cursor) {
        super.p(cursor);
        this.y = cursor.getString(18);
        this.x = cursor.getString(19);
        this.w = cursor.getLong(20);
        this.z = cursor.getInt(21);
        this.A = cursor.getString(22);
        return 23;
    }

    @Override // com.bytedance.applog.B.a
    protected a q(@NonNull JSONObject jSONObject) {
        super.q(jSONObject);
        this.y = jSONObject.optString("page_key", null);
        this.x = jSONObject.optString("refer_page_key", null);
        this.w = jSONObject.optLong("duration", 0L);
        this.z = jSONObject.optInt("is_back", 0);
        return this;
    }

    @Override // com.bytedance.applog.B.a
    protected void z(@NonNull ContentValues contentValues) {
        super.z(contentValues);
        contentValues.put("page_key", this.y);
        contentValues.put("refer_page_key", this.x);
        contentValues.put("duration", Long.valueOf(this.w));
        contentValues.put("is_back", Integer.valueOf(this.z));
        contentValues.put("last_session", this.A);
    }
}
