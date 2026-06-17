.class public final La3/c;
.super Lj6/q;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic i:I

.field public j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lj6/i0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, La3/c;->i:I

    invoke-direct {p0, p1}, Lj6/q;-><init>(Lj6/i0;)V

    return-void
.end method

.method public constructor <init>(Ll6/y;Lj6/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La3/c;->i:I

    .line 2
    iput-object p1, p0, La3/c;->j:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lj6/q;-><init>(Lj6/i0;)V

    return-void
.end method


# virtual methods
.method public final U(Lj6/i;J)J
    .locals 1

    .line 1
    iget v0, p0, La3/c;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lj6/q;->U(Lj6/i;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-wide p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    iget-object p2, p0, La3/c;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Ll6/y;

    .line 15
    .line 16
    iput-object p1, p2, Ll6/y;->k:Ljava/io/IOException;

    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    :try_start_1
    invoke-super {p0, p1, p2, p3}, Lj6/q;->U(Lj6/i;J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 23
    return-wide p1

    .line 24
    :catch_1
    move-exception p1

    .line 25
    iput-object p1, p0, La3/c;->j:Ljava/lang/Object;

    .line 26
    .line 27
    throw p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
