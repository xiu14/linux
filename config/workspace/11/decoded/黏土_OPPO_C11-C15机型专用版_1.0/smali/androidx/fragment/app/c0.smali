.class public final Landroidx/fragment/app/c0;
.super Landroidx/fragment/app/j0;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:Landroidx/fragment/app/l0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/l0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/c0;->a:Landroidx/fragment/app/l0;

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
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/c0;->a:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/l0;->mSavedStateRegistryController:Lw1/g;

    .line 4
    .line 5
    iget-object v1, v1, Lw1/g;->a:Lx1/a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lx1/a;->a()V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/t0;->d(Lw1/h;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Landroidx/fragment/app/l0;->mSavedFragmentState:Landroid/os/Bundle;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v2, "registryState"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :goto_0
    iget-object v0, v0, Landroidx/fragment/app/l0;->mSavedStateRegistryController:Lw1/g;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lw1/g;->a(Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method
