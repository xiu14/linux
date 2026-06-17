.class public final synthetic Ldev/jahir/frames/ui/activities/base/j;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/l;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILdev/jahir/frames/ui/adapters/AboutAdapter;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ldev/jahir/frames/ui/activities/base/j;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ldev/jahir/frames/ui/activities/base/j;->i:I

    iput-object p2, p0, Ldev/jahir/frames/ui/activities/base/j;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ldev/jahir/frames/ui/activities/base/j;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/jahir/frames/ui/activities/base/j;->j:Ljava/lang/Object;

    iput p2, p0, Ldev/jahir/frames/ui/activities/base/j;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/activities/base/j;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/j;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ldev/jahir/frames/ui/adapters/AboutAdapter;

    .line 9
    .line 10
    check-cast p1, Landroid/content/Context;

    .line 11
    .line 12
    iget v1, p0, Ldev/jahir/frames/ui/activities/base/j;->i:I

    .line 13
    .line 14
    invoke-static {v1, v0, p1}, Ldev/jahir/frames/ui/adapters/AboutAdapter;->a(ILdev/jahir/frames/ui/adapters/AboutAdapter;Landroid/content/Context;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/j;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;

    .line 22
    .line 23
    iget v1, p0, Ldev/jahir/frames/ui/activities/base/j;->i:I

    .line 24
    .line 25
    check-cast p1, Ll2/c0;

    .line 26
    .line 27
    invoke-static {v0, v1, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->s(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;ILl2/c0;)Lp4/k;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 34
    .line 35
    .line 36
    .line 37
.end method
