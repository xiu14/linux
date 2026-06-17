.class public final Ldev/jahir/frames/ui/adapters/CollectionsAdapter;
.super Landroidx/recyclerview/widget/c1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/c1;"
    }
.end annotation


# instance fields
.field private collections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ldev/jahir/frames/data/models/Collection;",
            ">;"
        }
    .end annotation
.end field

.field private final onClick:Ld5/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;-><init>(Ld5/l;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Ld5/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/c1;-><init>()V

    .line 4
    iput-object p1, p0, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->onClick:Ld5/l;

    .line 5
    sget-object p1, Lq4/r;->h:Lq4/r;

    iput-object p1, p0, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->collections:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ld5/l;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;-><init>(Ld5/l;)V

    return-void
.end method


# virtual methods
.method public final getCollections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Collection;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->collections:Ljava/util/List;

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
    iget-object v0, p0, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->collections:Ljava/util/List;

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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;I)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->onBindViewHolder(Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->collections:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ldev/jahir/frames/data/models/Collection;

    iget-object v0, p0, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->onClick:Ld5/l;

    invoke-virtual {p1, p2, v0}, Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;->bind(Ldev/jahir/frames/data/models/Collection;Ld5/l;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "getContext(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Ldev/jahir/frames/R$bool;->enable_filled_collection_preview:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->boolean$default(Landroid/content/Context;IZILjava/lang/Object;)Z

    move-result p2

    .line 3
    new-instance v0, Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;

    if-eqz p2, :cond_0

    .line 4
    sget p2, Ldev/jahir/frames/R$layout;->item_collection_filled:I

    goto :goto_0

    .line 5
    :cond_0
    sget p2, Ldev/jahir/frames/R$layout;->item_collection:I

    .line 6
    :goto_0
    invoke-static {p1, p2, v1, v2, v3}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ldev/jahir/frames/ui/viewholders/CollectionViewHolder;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public final setCollections(Ljava/util/List;)V
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
            "Ldev/jahir/frames/data/models/Collection;",
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
    iput-object p1, p0, Ldev/jahir/frames/ui/adapters/CollectionsAdapter;->collections:Ljava/util/List;

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
