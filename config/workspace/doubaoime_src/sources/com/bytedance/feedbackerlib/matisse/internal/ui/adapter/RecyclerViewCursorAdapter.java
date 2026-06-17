package com.bytedance.feedbackerlib.matisse.internal.ui.adapter;

import android.database.Cursor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes.dex */
public abstract class RecyclerViewCursorAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private Cursor a;
    private int b;

    RecyclerViewCursorAdapter(Cursor cursor) {
        setHasStableIds(true);
        d(null);
    }

    private boolean b(Cursor cursor) {
        return (cursor == null || cursor.isClosed()) ? false : true;
    }

    protected abstract int a(int i, Cursor cursor);

    protected abstract void c(VH vh, Cursor cursor);

    public void d(Cursor cursor) {
        if (cursor == this.a) {
            return;
        }
        if (cursor != null) {
            this.a = cursor;
            this.b = cursor.getColumnIndexOrThrow(DBDefinition.ID);
            notifyDataSetChanged();
        } else {
            notifyItemRangeRemoved(0, getItemCount());
            this.a = null;
            this.b = -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (b(this.a)) {
            return this.a.getCount();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (!b(this.a)) {
            throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
        }
        if (this.a.moveToPosition(i)) {
            return this.a.getLong(this.b);
        }
        throw new IllegalStateException(e.a.a.a.a.k("Could not move cursor to position ", i, " when trying to get an item id"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.a.moveToPosition(i)) {
            return a(i, this.a);
        }
        throw new IllegalStateException(e.a.a.a.a.k("Could not move cursor to position ", i, " when trying to get item view type."));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        if (!b(this.a)) {
            throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
        }
        if (!this.a.moveToPosition(i)) {
            throw new IllegalStateException(e.a.a.a.a.k("Could not move cursor to position ", i, " when trying to bind view holder"));
        }
        c(vh, this.a);
    }
}
