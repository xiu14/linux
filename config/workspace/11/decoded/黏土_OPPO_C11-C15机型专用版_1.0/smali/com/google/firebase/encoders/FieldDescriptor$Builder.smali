.class public final Lcom/google/firebase/encoders/FieldDescriptor$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/encoders/FieldDescriptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b:Ljava/util/HashMap;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final a()Lcom/google/firebase/encoders/FieldDescriptor;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/firebase/encoders/FieldDescriptor;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b:Ljava/util/HashMap;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    iget-object v2, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Lcom/google/firebase/encoders/FieldDescriptor;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    return-object v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final b(Ljava/lang/annotation/Annotation;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b:Ljava/util/HashMap;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/encoders/FieldDescriptor$Builder;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
