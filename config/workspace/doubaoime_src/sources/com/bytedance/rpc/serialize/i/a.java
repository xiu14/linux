package com.bytedance.rpc.serialize.i;

import com.bytedance.rpc.transport.e;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class a extends com.bytedance.rpc.serialize.a {
    public a(e eVar, Type type) {
        super(eVar, type);
    }

    private Parser<MessageLite> c(Class<?> cls) throws Exception {
        Parser<MessageLite> parser;
        boolean z;
        boolean z2 = true;
        try {
            parser = (Parser) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0]);
            z = false;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            parser = null;
            z = true;
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getCause());
        }
        if (z) {
            try {
                parser = (Parser) cls.getDeclaredField("PARSER").get(null);
                z2 = false;
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
            if (z2) {
                StringBuilder M = e.a.a.a.a.M("Found a protobuf message but ");
                M.append(cls.getName());
                M.append(" had no parser() method or PARSER field.");
                throw new IllegalArgumentException(M.toString());
            }
        }
        return parser;
    }

    @Override // com.bytedance.rpc.serialize.a
    protected Object b(e eVar, Type type) throws Exception {
        Parser<MessageLite> c2 = c((Class) type);
        InputStream d2 = ((com.bytedance.rpc.transport.ttnet.b) eVar).d();
        try {
            try {
                return c2.parseFrom(d2);
            } catch (InvalidProtocolBufferException e2) {
                throw new RuntimeException((Throwable) e2);
            }
        } finally {
            try {
                d2.close();
            } catch (IOException unused) {
            }
        }
    }
}
