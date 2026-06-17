package com.ss.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes2.dex */
public class ShowDialogActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.activity_show_dialog);
        int i = com.ss.android.b.a.a;
        throw new IllegalStateException("not init TTAccount config");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (TextUtils.equals(intent.getStringExtra(NotificationCompat.CATEGORY_EVENT), "event_dialog")) {
            String stringExtra = intent.getStringExtra("title");
            String stringExtra2 = intent.getStringExtra("message");
            new AlertDialog.Builder(this).setTitle(stringExtra).setMessage(stringExtra2 + "\nPlease confirm that account adk is initialized correctly.").setPositiveButton("ok", new a(this)).setCancelable(false).show();
        }
    }
}
