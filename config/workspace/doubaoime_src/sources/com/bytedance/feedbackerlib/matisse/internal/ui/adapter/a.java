package com.bytedance.feedbackerlib.matisse.internal.ui.adapter;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.entity.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends CursorAdapter {
    private final Drawable a;
    private final com.bytedance.feedbackerlib.matisse.internal.model.a b;

    public a(Context context, Cursor cursor, boolean z, com.bytedance.feedbackerlib.matisse.internal.model.a aVar) {
        super(context, (Cursor) null, z);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{C0838R.attr.album_thumbnail_placeholder});
        this.a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.b = aVar;
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        ContentResolver contentResolver;
        int columnIndex;
        Album i = Album.i(cursor);
        ((TextView) view.findViewById(C0838R.id.album_name)).setText(i.c());
        ((TextView) view.findViewById(C0838R.id.album_media_count)).setText(String.valueOf(i.a()));
        TextView textView = (TextView) view.findViewById(C0838R.id.tv_count);
        textView.setVisibility(8);
        b.b().j.a(context.getResources().getDimensionPixelSize(C0838R.dimen.media_grid_size), (ImageView) view.findViewById(C0838R.id.album_cover), i.b());
        com.bytedance.feedbackerlib.matisse.internal.model.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        ArrayList<Item> b = aVar.b();
        if (i.f()) {
            int f2 = this.b.f();
            if (f2 > 0) {
                textView.setVisibility(0);
                textView.setText("" + f2);
                return;
            }
            return;
        }
        Iterator<Item> it2 = b.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Item next = it2.next();
            if (next != null) {
                if (TextUtils.isEmpty(next.f4856f) && next.f4853c != null && Feedbacker.getApplicationContext() != null && (contentResolver = Feedbacker.getApplicationContext().getContentResolver()) != null) {
                    Cursor query = contentResolver.query(next.f4853c, null, null, null, null);
                    try {
                        if (query.getCount() > 0 && query.moveToFirst() && (columnIndex = query.getColumnIndex("bucket_id")) >= 0) {
                            next.f4856f = query.getString(columnIndex);
                        }
                    } finally {
                        query.close();
                    }
                }
                String str = next.f4856f;
                if (str != null && str.equals(i.e())) {
                    i2++;
                }
            }
        }
        if (i2 > 0) {
            textView.setVisibility(0);
            textView.setText("" + i2);
        }
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(C0838R.layout.feedbacker_album_list_item, viewGroup, false);
    }
}
