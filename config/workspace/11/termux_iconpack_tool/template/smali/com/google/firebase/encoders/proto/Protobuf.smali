.class public interface abstract annotation Lcom/google/firebase/encoders/proto/Protobuf;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime Lcom/google/firebase/encoders/annotations/ExtraProperty;
.end annotation

.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/google/firebase/encoders/proto/Protobuf;
        intEncoding = .enum Lcom/google/firebase/encoders/proto/Protobuf$IntEncoding;->h:Lcom/google/firebase/encoders/proto/Protobuf$IntEncoding;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/encoders/proto/Protobuf$IntEncoding;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Lcom/google/firebase/encoders/proto/Protobuf$IntEncoding;
.end method

.method public abstract tag()I
.end method
