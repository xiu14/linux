package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class gx extends Exception {
    private hg a;

    /* renamed from: a, reason: collision with other field name */
    private hh f532a;

    /* renamed from: a, reason: collision with other field name */
    private Throwable f533a;

    public gx() {
        this.a = null;
        this.f532a = null;
        this.f533a = null;
    }

    public Throwable a() {
        return this.f533a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        hg hgVar;
        hh hhVar;
        String message = super.getMessage();
        return (message != null || (hhVar = this.f532a) == null) ? (message != null || (hgVar = this.a) == null) ? message : hgVar.toString() : hhVar.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        hh hhVar = this.f532a;
        if (hhVar != null) {
            sb.append(hhVar);
        }
        hg hgVar = this.a;
        if (hgVar != null) {
            sb.append(hgVar);
        }
        if (this.f533a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f533a);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f533a != null) {
            printStream.println("Nested Exception: ");
            this.f533a.printStackTrace(printStream);
        }
    }

    public gx(String str) {
        super(str);
        this.a = null;
        this.f532a = null;
        this.f533a = null;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f533a != null) {
            printWriter.println("Nested Exception: ");
            this.f533a.printStackTrace(printWriter);
        }
    }

    public gx(Throwable th) {
        this.a = null;
        this.f532a = null;
        this.f533a = null;
        this.f533a = th;
    }

    public gx(hg hgVar) {
        this.a = null;
        this.f532a = null;
        this.f533a = null;
        this.a = hgVar;
    }

    public gx(String str, Throwable th) {
        super(str);
        this.a = null;
        this.f532a = null;
        this.f533a = null;
        this.f533a = th;
    }
}
