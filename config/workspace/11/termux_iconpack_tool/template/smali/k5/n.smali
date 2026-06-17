.class public final Lk5/n;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lk5/h;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lp4/a;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ld5/p;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk5/n;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lk5/n;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lk5/n;->c:Lp4/a;

    return-void
.end method

.method public constructor <init>(Lk5/h;Ld5/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk5/n;->a:I

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/n;->b:Ljava/lang/Object;

    iput-object p2, p0, Lk5/n;->c:Lp4/a;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lk5/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ll5/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ll5/b;-><init>(Lk5/n;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lk5/m;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lk5/m;-><init>(Lk5/n;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
