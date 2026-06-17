package com.ss.android;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
class a implements DialogInterface.OnClickListener {
    final /* synthetic */ ShowDialogActivity a;

    a(ShowDialogActivity showDialogActivity) {
        this.a = showDialogActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
