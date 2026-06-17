.class public final Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;
.super Landroidx/recyclerview/widget/c1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/c1;"
    }
.end annotation


# instance fields
.field private appsToRequest:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;"
        }
    .end annotation
.end field

.field private final onCheckChange:Ld5/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/p;"
        }
    .end annotation
.end field

.field private selectedApps:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;-><init>(Ld5/p;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Ld5/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/p;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/c1;-><init>()V

    .line 4
    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->onCheckChange:Ld5/p;

    .line 5
    sget-object p1, Lq4/r;->h:Lq4/r;

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Ld5/p;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;-><init>(Ld5/p;)V

    return-void
.end method


# virtual methods
.method public final changeAppState$library_release(Ldev/jahir/blueprint/data/models/RequestApp;Z)V
    .locals 3

    .line 1
    const-string v0, "app"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 v0, -0x1

    .line 14
    :goto_0
    if-gez v0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-lt v1, v2, :cond_1

    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :cond_1
    if-eqz p2, :cond_2

    .line 35
    .line 36
    iget-object p2, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iget-object p2, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :goto_2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/c1;->notifyItemChanged(I)V

    .line 48
    .line 49
    .line 50
    return-void
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

.method public final getAppsToRequest()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

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

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

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

.method public final getSelectedApps()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

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
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;I)V
    .locals 5

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ldev/jahir/blueprint/data/models/RequestApp;

    .line 3
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :cond_1
    if-ge v3, v2, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Ldev/jahir/blueprint/data/models/RequestApp;

    .line 6
    invoke-static {v4, p2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->onCheckChange:Ld5/p;

    invoke-virtual {p1, p2, v1, v0}, Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;->bind(Ldev/jahir/blueprint/data/models/RequestApp;ZLd5/p;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;

    sget v0, Ldev/jahir/blueprint/R$layout;->item_request:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/i2;)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;

    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->onViewRecycled(Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;)V
    .locals 7

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/c1;->onViewRecycled(Landroidx/recyclerview/widget/i2;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    .line 3
    invoke-static/range {v1 .. v6}, Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;->bind$default(Ldev/jahir/blueprint/ui/viewholders/RequestViewHolder;Ldev/jahir/blueprint/data/models/RequestApp;ZLd5/p;ILjava/lang/Object;)V

    return-void
.end method

.method public final setAppsToRequest(Ljava/util/List;)V
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
            "Ldev/jahir/blueprint/data/models/RequestApp;",
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
    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

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

.method public final setSelectedApps(Ljava/util/ArrayList;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/RequestApp;",
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
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->selectedApps:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final untoggle$library_release(Ldev/jahir/blueprint/data/models/RequestApp;)V
    .locals 1

    .line 1
    const-string v0, "app"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;->appsToRequest:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 p1, -0x1

    .line 14
    :goto_0
    if-gez p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/c1;->notifyItemChanged(I)V

    .line 18
    .line 19
    .line 20
    return-void
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
