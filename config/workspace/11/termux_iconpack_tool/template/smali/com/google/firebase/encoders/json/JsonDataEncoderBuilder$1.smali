.class Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/firebase/encoders/DataEncoder;


# instance fields
.field public final synthetic a:Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;


# direct methods
.method public constructor <init>(Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder$1;->a:Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.method public final a(Ljava/lang/Object;Ljava/io/BufferedWriter;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/google/firebase/encoders/json/JsonValueObjectEncoderContext;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder$1;->a:Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v3, v1, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;->b:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v4, v1, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;->c:Lcom/google/firebase/encoders/json/a;

    .line 10
    .line 11
    iget-boolean v5, v1, Lcom/google/firebase/encoders/json/JsonDataEncoderBuilder;->d:Z

    .line 12
    .line 13
    move-object v1, p2

    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/encoders/json/JsonValueObjectEncoderContext;-><init>(Ljava/io/BufferedWriter;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/google/firebase/encoders/json/a;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/google/firebase/encoders/json/JsonValueObjectEncoderContext;->e(Ljava/lang/Object;)Lcom/google/firebase/encoders/json/JsonValueObjectEncoderContext;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/firebase/encoders/json/JsonValueObjectEncoderContext;->g()V

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, Lcom/google/firebase/encoders/json/JsonValueObjectEncoderContext;->b:Landroid/util/JsonWriter;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/util/JsonWriter;->flush()V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method
