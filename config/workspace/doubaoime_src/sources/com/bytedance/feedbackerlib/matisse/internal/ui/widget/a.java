package com.bytedance.feedbackerlib.matisse.internal.ui.widget;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;

/* loaded from: classes.dex */
public class a {
    private CursorAdapter a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private ListPopupWindow f4905c;

    /* renamed from: d, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f4906d;

    /* renamed from: e, reason: collision with root package name */
    private d f4907e;

    /* renamed from: com.bytedance.feedbackerlib.matisse.internal.ui.widget.a$a, reason: collision with other inner class name */
    class C0232a implements AdapterView.OnItemClickListener {
        C0232a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            a.this.g(adapterView.getContext(), i);
            if (a.this.f4906d != null) {
                a.this.f4906d.onItemSelected(adapterView, view, i, j);
            }
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            Context context = a.this.b.getContext();
            if (context != null) {
                a.this.b.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context, C0838R.drawable.feedbacker_down_arrow_new), (Drawable) null);
            }
            if (a.this.f4907e != null) {
                a.this.f4907e.a();
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(C0838R.dimen.album_item_height);
            a.this.f4905c.setHeight(a.this.a.getCount() > 6 ? dimensionPixelSize * 6 : dimensionPixelSize * a.this.a.getCount());
            a.this.f4905c.show();
            if (a.this.f4907e != null) {
                a.this.f4907e.b();
            }
            Context context = a.this.b.getContext();
            if (context != null) {
                a.this.b.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context, C0838R.drawable.feedbacker_up_arrow_new), (Drawable) null);
            }
        }
    }

    public interface d {
        void a();

        void b();
    }

    public a(@NonNull Context context, d dVar) {
        ListPopupWindow listPopupWindow = new ListPopupWindow(context, null, C0838R.attr.listPopupWindowStyle);
        this.f4905c = listPopupWindow;
        listPopupWindow.setModal(true);
        this.f4905c.setContentWidth(context.getApplicationContext() == null ? -1 : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth());
        this.f4905c.setHorizontalOffset(0);
        this.f4905c.setVerticalOffset(0);
        this.f4905c.setBackgroundDrawable(ContextCompat.getDrawable(context, C0838R.drawable.round_16_white));
        this.f4905c.setOnItemClickListener(new C0232a());
        this.f4905c.setOnDismissListener(new b());
        this.f4907e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, int i) {
        this.f4905c.dismiss();
        Cursor cursor = this.a.getCursor();
        cursor.moveToPosition(i);
        String c2 = Album.i(cursor).c();
        if (this.b.getVisibility() == 0) {
            this.b.setText(c2);
            return;
        }
        this.b.setAlpha(0.0f);
        this.b.setVisibility(0);
        this.b.setText(c2);
        this.b.animate().alpha(1.0f).setDuration(context.getResources().getInteger(R.integer.config_longAnimTime)).start();
    }

    public void h(CursorAdapter cursorAdapter) {
        this.f4905c.setAdapter(cursorAdapter);
        this.a = cursorAdapter;
    }

    public void i(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f4906d = onItemSelectedListener;
    }

    public void j(View view) {
        this.f4905c.setAnchorView(view);
    }

    public void k(TextView textView) {
        this.b = textView;
        textView.setVisibility(8);
        this.b.setOnClickListener(new c());
        TextView textView2 = this.b;
        textView2.setOnTouchListener(this.f4905c.createDragToOpenListener(textView2));
    }

    public void l(Context context, int i) {
        this.f4905c.setSelection(i);
        g(context, i);
    }
}
