.class public final Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;
.super Landroidx/recyclerview/widget/c1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/c1;"
    }
.end annotation


# instance fields
.field private final colorFilter:Landroid/graphics/ColorFilter;

.field private launchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lp4/f;",
            ">;"
        }
    .end annotation
.end field

.field private final onClick:Ld5/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;-><init>(Landroid/content/Context;Ld5/p;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld5/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ld5/p;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/c1;-><init>()V

    .line 4
    iput-object p2, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->onClick:Ld5/p;

    .line 5
    invoke-static {}, Ldev/jahir/blueprint/extensions/ColorFilterKt;->getBnwFilter()Landroid/graphics/ColorFilter;

    move-result-object p2

    iput-object p2, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->colorFilter:Landroid/graphics/ColorFilter;

    .line 6
    sget-object p2, Ldev/jahir/blueprint/data/models/Launcher;->Companion:Ldev/jahir/blueprint/data/models/Launcher$Companion;

    invoke-virtual {p2, p1}, Ldev/jahir/blueprint/data/models/Launcher$Companion;->getSupportedLaunchers(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->launchers:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ld5/p;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;-><init>(Landroid/content/Context;Ld5/p;)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->launchers:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final getLaunchers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp4/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->launchers:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;I)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->launchers:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp4/f;

    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->colorFilter:Landroid/graphics/ColorFilter;

    iget-object v1, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->onClick:Ld5/p;

    invoke-virtual {p1, p2, v0, v1}, Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;->bind(Lp4/f;Landroid/graphics/ColorFilter;Ld5/p;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;

    sget v0, Ldev/jahir/blueprint/R$layout;->item_launcher:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/LauncherViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final setLaunchers(Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lp4/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;->launchers:Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
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
