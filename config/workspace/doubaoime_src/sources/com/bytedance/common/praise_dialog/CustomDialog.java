package com.bytedance.common.praise_dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CustomDialog extends Activity {
    private TextView a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f4156c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4157d = "CustomDialog";

    /* renamed from: e, reason: collision with root package name */
    private boolean f4158e;

    public static void a(CustomDialog customDialog, View view) {
        f fVar;
        l.f(customDialog, "this$0");
        customDialog.f4158e = true;
        fVar = f.f4159c;
        e.b.k.b.c c2 = fVar.c();
        if (c2 != null) {
            c2.a();
        }
        customDialog.finish();
    }

    public static void b(CustomDialog customDialog, View view) {
        f fVar;
        l.f(customDialog, "this$0");
        customDialog.f4158e = true;
        fVar = f.f4159c;
        e.b.k.b.c c2 = fVar.c();
        if (c2 != null) {
            c2.d();
        }
        IAppLog.a aVar = IAppLog.a;
        JSONObject put = new JSONObject().put("type", "clickclose");
        l.e(put, "JSONObject().put(\"type\", \"clickclose\")");
        aVar.t("feedback_close_click", put);
        customDialog.finish();
    }

    public static void c(CustomDialog customDialog, View view) {
        f fVar;
        l.f(customDialog, "this$0");
        customDialog.f4158e = true;
        fVar = f.f4159c;
        e.b.k.b.c c2 = fVar.c();
        if (c2 != null) {
            c2.c();
        }
        customDialog.finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        IAppGlobals.a.j(this.f4157d, "onCreate");
        super.onCreate(bundle);
        setContentView(C0838R.layout.ime_permission_setting_praise_dialog_layout);
        TextView textView = (TextView) findViewById(C0838R.id.tv_praise_right);
        this.a = textView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.common.praise_dialog.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomDialog.c(CustomDialog.this, view);
                }
            });
        }
        TextView textView2 = (TextView) findViewById(C0838R.id.tv_praise_left);
        this.b = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.common.praise_dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomDialog.a(CustomDialog.this, view);
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(C0838R.id.close_btn);
        this.f4156c = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.common.praise_dialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomDialog.b(CustomDialog.this, view);
                }
            });
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        l.f(str, "name");
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        IAppGlobals.a.j(this.f4157d, "onCreateView");
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        f fVar;
        IAppGlobals.a.j(this.f4157d, "onDestroy");
        fVar = f.f4159c;
        e.b.k.b.c c2 = fVar.c();
        if (c2 != null) {
            c2.d();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        f fVar;
        IAppGlobals.a.j(this.f4157d, "onPause");
        if (!this.f4158e) {
            IAppLog.a aVar = IAppLog.a;
            JSONObject put = new JSONObject().put("type", "backhome");
            l.e(put, "JSONObject().put(\"type\", \"backhome\")");
            aVar.t("feedback_close_click", put);
            fVar = f.f4159c;
            e.b.k.b.c c2 = fVar.c();
            if (c2 != null) {
                c2.d();
            }
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        f fVar;
        IAppGlobals.a.j(this.f4157d, "onResume");
        fVar = f.f4159c;
        e.b.k.b.c c2 = fVar.c();
        if (c2 != null) {
            c2.b();
        }
        super.onResume();
    }
}
