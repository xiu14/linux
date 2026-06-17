package com.bytedance.feedbackerlib.matisse.internal.entity;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.IncapableDialog;

/* loaded from: classes.dex */
public class a {
    private int a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f4857c;

    public a(String str) {
        this.a = 0;
        this.f4857c = str;
    }

    public static void a(Context context, a aVar) {
        if (aVar == null) {
            return;
        }
        int i = aVar.a;
        if (i == 1) {
            IncapableDialog.l(aVar.b, aVar.f4857c).show(((FragmentActivity) context).getSupportFragmentManager(), IncapableDialog.class.getName());
        } else if (i != 2) {
            Toast.makeText(context, aVar.f4857c, 0).show();
        }
    }

    public a(int i, String str, String str2) {
        this.a = 0;
        this.a = i;
        this.b = str;
        this.f4857c = str2;
    }
}
