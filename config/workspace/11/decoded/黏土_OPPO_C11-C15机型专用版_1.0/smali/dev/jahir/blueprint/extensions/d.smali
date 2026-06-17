.class public final synthetic Ldev/jahir/blueprint/extensions/d;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/l;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Ldev/jahir/blueprint/data/models/Launcher;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ldev/jahir/blueprint/data/models/Launcher;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ldev/jahir/blueprint/extensions/d;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/extensions/d;->i:Landroid/content/Context;

    iput-object p2, p0, Ldev/jahir/blueprint/extensions/d;->j:Ldev/jahir/blueprint/data/models/Launcher;

    return-void
.end method

.method public synthetic constructor <init>(Ldev/jahir/blueprint/data/models/Launcher;Landroid/content/Context;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ldev/jahir/blueprint/extensions/d;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/extensions/d;->j:Ldev/jahir/blueprint/data/models/Launcher;

    iput-object p2, p0, Ldev/jahir/blueprint/extensions/d;->i:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldev/jahir/blueprint/extensions/d;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/blueprint/extensions/d;->j:Ldev/jahir/blueprint/data/models/Launcher;

    .line 7
    .line 8
    check-cast p1, Landroid/content/DialogInterface;

    .line 9
    .line 10
    iget-object v1, p0, Ldev/jahir/blueprint/extensions/d;->i:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v1, v0, p1}, Ldev/jahir/blueprint/extensions/LaunchersKt;->f(Landroid/content/Context;Ldev/jahir/blueprint/data/models/Launcher;Landroid/content/DialogInterface;)Lp4/k;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    iget-object v0, p0, Ldev/jahir/blueprint/extensions/d;->i:Landroid/content/Context;

    .line 18
    .line 19
    check-cast p1, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 20
    .line 21
    iget-object v1, p0, Ldev/jahir/blueprint/extensions/d;->j:Ldev/jahir/blueprint/data/models/Launcher;

    .line 22
    .line 23
    invoke-static {v1, v0, p1}, Ldev/jahir/blueprint/extensions/LaunchersKt;->m(Ldev/jahir/blueprint/data/models/Launcher;Landroid/content/Context;Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

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
.end method
