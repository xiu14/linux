package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class i {
    @Deprecated
    public i() {
    }

    public f a() {
        if (this instanceof f) {
            return (f) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o b() {
        if (this instanceof o) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            com.google.gson.stream.b bVar = new com.google.gson.stream.b(stringWriter);
            bVar.P(true);
            TypeAdapters.V.c(bVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
